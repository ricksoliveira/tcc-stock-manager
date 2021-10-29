package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Venda;

public class VendaDAO {
    
    public void createVenda(Venda venda) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="CREATE VENDA">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO venda (promo, metodo_pagamento, vendedor, data) VALUES (?, ?, ?, ?)");
            stmt.setInt(1, venda.getPromo());
            stmt.setInt(2, venda.getMetodo_pagamento());
            stmt.setInt(3, venda.getVendedor());
            stmt.setString(4, venda.getData());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Venda salva com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar venda: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public Venda returnLastVenda() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="RETURN LAST VENDA">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Venda venda = new Venda();
        
        try {
            
            stmt = con.prepareStatement("SELECT * FROM venda order by 1 desc limit 1");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                venda.setVenda_id(rs.getInt("venda_id"));
                venda.setPromo(rs.getInt("promo"));
                venda.setMetodo_pagamento(rs.getInt("metodo_pagamento"));
                venda.setVendedor(rs.getInt("vendedor"));
                venda.setData(rs.getString("data"));
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar venda: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return venda;
//</editor-fold>
    }
    
    public void cancelVenda() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="CANCEL VENDA">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Venda venda = new Venda();
        int id;
        
        try {
            
            stmt = con.prepareStatement("SELECT venda_id FROM venda order by 1 desc limit 1");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                venda.setVenda_id(rs.getInt("venda_id"));
            }
            
            id = venda.getVenda_id();
            
            stmt = con.prepareStatement("DELETE FROM venda where venda_id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("ALTER TABLE venda AUTO_INCREMENT = ?");
            stmt.setInt(1, id);
            stmt.execute();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar venda: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
//</editor-fold>
    }
    
    public List<Venda> listAllVendas() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ ALL VENDAS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Venda> vendas = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM venda WHERE venda_id > 0");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Venda venda = new Venda();
                venda.setVenda_id(rs.getInt("venda_id"));
                venda.setPromo(rs.getInt("promo"));
                venda.setMetodo_pagamento(rs.getInt("metodo_pagamento"));
                venda.setVendedor(rs.getInt("vendedor"));
                venda.setData(rs.getString("data"));
                vendas.add(venda);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de promogorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return vendas;
//</editor-fold>
    }
    
    
}
