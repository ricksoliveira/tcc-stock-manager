package controller;

import java.util.ArrayList;
import java.util.List;
import model.bean.Financa;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FinancaController {
    
    public List<Financa> listMonthlyFinance() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="CALCULAR FINANÇA MENSAL">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Financa> financas = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM financa ORDER BY ano ASC, mes ASC LIMIT 1");
            rs = stmt.executeQuery();
            Financa financaTemp = new Financa();
            
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
                
                financaTemp.setMes(rs.getInt("mes"));
                financaTemp.setAno(rs.getInt("ano"));
                financaTemp.setFaturamento_bruto(rs.getDouble("faturamento_bruto"));
                financaTemp.setDescontos(rs.getDouble("descontos"));
                financaTemp.setFaturamento_liquido(rs.getDouble("faturamento_liquido"));
                financaTemp.setCmv(rs.getDouble("cmv"));
                financaTemp.setLucro(rs.getDouble("lucro"));
                financaTemp.setMargem_lucro(rs.getDouble("margem_lucro"));
                financaTemp.setCusto_total_estoque(rs.getDouble("custo_total_estoque"));
                financaTemp.setQuantidade_estoque(rs.getInt("quantidade_estoque"));
                financaTemp.setNumero_categorias(rs.getInt("numero_categorias"));
                
                financas.add(financa);
            }
            
            stmt = con.prepareStatement("SELECT * FROM financa ORDER BY ano ASC, mes ASC LIMIT 9999 OFFSET 1");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Financa financa = new Financa();
                
                financa.setMes(rs.getInt("mes"));
                financa.setAno(rs.getInt("ano"));
                financa.setFaturamento_bruto(rs.getDouble("faturamento_bruto") - financaTemp.getFaturamento_bruto());
                financa.setDescontos(rs.getDouble("descontos") - financaTemp.getDescontos());
                financa.setFaturamento_liquido(rs.getDouble("faturamento_liquido") - financaTemp.getFaturamento_liquido());
                financa.setCmv(rs.getDouble("cmv") - financaTemp.getCmv());
                financa.setLucro(rs.getDouble("lucro") - financaTemp.getLucro());
                financa.setMargem_lucro((financa.getLucro() / financa.getFaturamento_liquido()) * 100.0);
                financa.setCusto_total_estoque(rs.getDouble("custo_total_estoque"));
                financa.setQuantidade_estoque(rs.getInt("quantidade_estoque"));
                financa.setNumero_categorias(rs.getInt("numero_categorias"));
                
                financaTemp.setMes(rs.getInt("mes"));
                financaTemp.setAno(rs.getInt("ano"));
                financaTemp.setFaturamento_bruto(rs.getDouble("faturamento_bruto"));
                financaTemp.setDescontos(rs.getDouble("descontos"));
                financaTemp.setFaturamento_liquido(rs.getDouble("faturamento_liquido"));
                financaTemp.setCmv(rs.getDouble("cmv"));
                financaTemp.setLucro(rs.getDouble("lucro"));
                financaTemp.setMargem_lucro(rs.getDouble("margem_lucro"));
                financaTemp.setCusto_total_estoque(rs.getDouble("custo_total_estoque"));
                financaTemp.setQuantidade_estoque(rs.getInt("quantidade_estoque"));
                financaTemp.setNumero_categorias(rs.getInt("numero_categorias"));
                
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
    
}
