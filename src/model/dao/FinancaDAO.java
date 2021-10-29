package model.dao;

import model.bean.Financa;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FinancaDAO {
    
    public void createFinanca(Financa financa) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="CREATE FINANÇA MENSAL">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO financa (mes, ano, faturamento_bruto, "
                                        + "descontos, faturamento_liquido, cmv, lucro, margem_lucro, "
                                        + "custo_total_estoque, quantidade_estoque, numero_categorias) "
                                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setInt(1, financa.getMes());
            stmt.setInt(2, financa.getAno());
            stmt.setDouble(3, financa.getFaturamento_bruto());
            stmt.setDouble(4, financa.getDescontos());
            stmt.setDouble(5, financa.getFaturamento_liquido());
            stmt.setDouble(6, financa.getCmv());
            stmt.setDouble(7, financa.getLucro());
            stmt.setDouble(8, financa.getMargem_lucro());
            stmt.setDouble(9, financa.getCusto_total_estoque());
            stmt.setInt(10, financa.getQuantidade_estoque());
            stmt.setInt(11, financa.getNumero_categorias());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Finança mensal lançada com sucesso!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar finança mensal: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<Financa> listAllFinancas() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ ALL FINANÇAS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Financa> financas = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM financa ORDER BY ano ASC, mes ASC");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Financa financa = new Financa();
                
                financa.setMes(rs.getInt("mes"));
                financa.setAno(rs.getInt("ano"));
                financa.setFaturamento_bruto(rs.getDouble("faturamento_bruto"));
                financa.setDescontos(rs.getDouble("descontos"));
                financa.setFaturamento_liquido(rs.getDouble("faturamento_liquido"));
                financa.setCmv(rs.getDouble("cmv"));
                financa.setLucro(rs.getDouble("lucro"));
                financa.setMargem_lucro(rs.getDouble("margem_lucro"));
                financa.setCusto_total_estoque(rs.getDouble("custo_total_estoque"));
                financa.setQuantidade_estoque(rs.getInt("quantidade_estoque"));
                financa.setNumero_categorias(rs.getInt("numero_categorias"));
                
                financas.add(financa);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de finanças: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return financas;
//</editor-fold>
    }
    
    public boolean authFinanca(int mes, int ano) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="AUTH FINANÇA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean auth = false;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM financa WHERE mes = ? AND ano = ?");
            stmt.setInt(1, mes);
            stmt.setInt(2, ano);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                auth = true;
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao autenticar produto: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return auth;
//</editor-fold>
    }
    
}
