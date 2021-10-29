package controller;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.QuantidadePorVenda;

public class ProdutoController {
    
    public List<QuantidadePorVenda> getQuantidadeItensVenda(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="GET QUANTIDADE DE ITENS POR VENDA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<QuantidadePorVenda> quantidades = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT produto_id, sum(quantidade) AS 'quantidade' "
                                        + "FROM venda_produto "
                                        + "WHERE venda_id = ? "
                                        + "GROUP BY produto_id "
                                        + "ORDER BY produto_id ASC");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                QuantidadePorVenda quantidade = new QuantidadePorVenda();
                quantidade.setProduto_id(rs.getInt("produto_id"));
                quantidade.setQuantidade(rs.getInt("quantidade"));
                quantidades.add(quantidade);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de quantidades: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return quantidades;
//</editor-fold>
    }
    
    public void updateQuantidadeProduto(int quantidade, int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="UPDATE QUANTIDADE POS VENDA">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE produto "
                                        + "SET quantidade = (quantidade - ?) "
                                        + "WHERE produto_id = ?");
            stmt.setInt(1, quantidade);
            stmt.setInt(2, id);
            
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
}
