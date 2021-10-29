package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Promo;

public class PromoDAO {
    
    public void createPromo(Promo promo) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="CREATE PROMO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO promo (nome, valor_desconto) VALUES (?, ?)");
            stmt.setString(1, promo.getNome());
            stmt.setDouble(2, promo.getValor_desconto());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Promo salva com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar promo: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<Promo> listAllPromos() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ ALL PROMOS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Promo> promos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM promo WHERE promo_id > 0");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Promo promo = new Promo();
                promo.setPromo_id(rs.getInt("promo_id"));
                promo.setNome(rs.getString("nome"));
                promo.setValor_desconto(rs.getDouble("valor_desconto"));
                promos.add(promo);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de promogorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return promos;
//</editor-fold>
    }
    
    public List<Promo> listDeletedPromos() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ DELETED PROMOS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Promo> promos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM promo WHERE promo_id < 0");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Promo promo = new Promo();
                promo.setPromo_id(rs.getInt("promo_id"));
                promo.setNome(rs.getString("nome"));
                promo.setValor_desconto(rs.getDouble("valor_desconto"));
                promos.add(promo);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de promogorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return promos;
//</editor-fold>
    }
    
    public void updatePromo(Promo promo) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="UPDATE PROMO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE promo SET nome = ?, valor_desconto = ? WHERE promo_id = ?");
            stmt.setString(1, promo.getNome());
            stmt.setDouble(2, promo.getValor_desconto());
            stmt.setInt(3, promo.getPromo_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Promo atualizada com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar promo: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public void deletePromo(Promo promo) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="DELETE PROMO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            int newId = promo.getPromo_id() * -1;
            
            stmt = con.prepareStatement("UPDATE promo SET promo_id = ? WHERE promo_id = ?");
            stmt.setInt(1, newId);
            stmt.setInt(2, promo.getPromo_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Promo excluída com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir promo: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<Promo> searchPromoByName(String name) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PROMO BY NAME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Promo> promos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM promo WHERE nome LIKE ? and promo_id > 0");
            stmt.setString(1, "%" + name + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Promo promo = new Promo();
                promo.setPromo_id(rs.getInt("promo_id"));
                promo.setNome(rs.getString("nome"));
                promo.setValor_desconto(rs.getDouble("valor_desconto"));
                
                promos.add(promo);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de promções: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return promos;
//</editor-fold>
    }
    
    public List<Promo> searchPromoById(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PROMO BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Promo> promos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM promo WHERE promo_id = ? and promo_id > 0");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Promo promo = new Promo();
                promo.setPromo_id(rs.getInt("promo_id"));
                promo.setNome(rs.getString("nome"));
                promo.setValor_desconto(rs.getDouble("valor_desconto"));
                
                promos.add(promo);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return promos;
//</editor-fold>
    }
    
    public List<Promo> searchDeletedPromoByName(String name) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PROMO BY NAME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Promo> promos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM promo WHERE nome LIKE ? and promo_id < 0");
            stmt.setString(1, "%" + name + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Promo promo = new Promo();
                promo.setPromo_id(rs.getInt("promo_id"));
                promo.setNome(rs.getString("nome"));
                promo.setValor_desconto(rs.getDouble("valor_desconto"));
                
                promos.add(promo);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return promos;
//</editor-fold>
    }
    
    public List<Promo> searchDeletedPromoById(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PROMO BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Promo> promos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM promo WHERE promo_id = ? and promo_id < 0");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Promo promo = new Promo();
                promo.setPromo_id(rs.getInt("promo_id"));
                promo.setNome(rs.getString("nome"));
                promo.setValor_desconto(rs.getDouble("valor_desconto"));
                
                promos.add(promo);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return promos;
//</editor-fold>
    }
    
    public void restorePromo(Promo cate) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="RESTAURAR PROMO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            int newId = cate.getPromo_id() * -1;
            
            stmt = con.prepareStatement("UPDATE promo SET promo_id = ? WHERE promo_id = ?");
            stmt.setInt(1, newId);
            stmt.setInt(2, cate.getPromo_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Promo restaurada com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao restaurar promo: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public String getName(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET NOME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Promo promo = new Promo();
        
        try{
            stmt = con.prepareStatement("SELECT nome FROM promo WHERE promo_id = ?");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                promo.setNome(rs.getString("nome"));
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return promo.getNome();
    
//</editor-fold>
    }
    
    public double getValorDesconto(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PROMO BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        double valor = 0.0;
        
        try{
            stmt = con.prepareStatement("SELECT valor_desconto FROM promo WHERE promo_id = ?");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                valor = rs.getDouble("valor_desconto");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return valor;
//</editor-fold>
    }
    
}
