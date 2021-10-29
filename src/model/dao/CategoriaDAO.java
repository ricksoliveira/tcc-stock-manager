package model.dao;

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
import model.bean.Categoria;

public class CategoriaDAO {
    
    public void createCategoria(Categoria cate) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="CREATE CATEGORIA">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO categoria (nome) VALUES (?)");
            stmt.setString(1, cate.getNome());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Categoria salva com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar categoria: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<Categoria> listAllCategorias() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ ALL CATEGORIAS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Categoria> categorias = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM categoria WHERE categoria_id > 0");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setCategoria_id(rs.getInt("categoria_id"));
                categoria.setNome(rs.getString("nome"));
                
                categorias.add(categoria);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return categorias;
//</editor-fold>
    }
    
    public List<Categoria> listDeletedCategorias() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ DELETED CATEGORIAS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Categoria> categorias = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM categoria WHERE categoria_id < 0");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setCategoria_id(rs.getInt("categoria_id"));
                categoria.setNome(rs.getString("nome"));
                
                categorias.add(categoria);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return categorias;
//</editor-fold>
    }
    
    public void updateCategoria(Categoria cate) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="UPDATE CATEGORIA">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE categoria SET nome = ? WHERE categoria_id = ?");
            stmt.setString(1, cate.getNome());
            stmt.setInt(2, cate.getCategoria_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Categoria atualizada com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar categoria: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public void deleteCategoria(Categoria cate) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="DELETE CATEGORIA">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            int newId = cate.getCategoria_id() * -1;
            
            stmt = con.prepareStatement("UPDATE categoria SET categoria_id = ? WHERE categoria_id = ?");
            stmt.setInt(1, newId);
            stmt.setInt(2, cate.getCategoria_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Categoria excluída com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir categoria: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<Categoria> searchCategoriaByName(String name) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH CATEGORIA BY NAME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Categoria> categorias = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM categoria WHERE nome LIKE ? and categoria_id > 0");
            stmt.setString(1, "%" + name + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setCategoria_id(rs.getInt("categoria_id"));
                categoria.setNome(rs.getString("nome"));
                
                categorias.add(categoria);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return categorias;
//</editor-fold>
    }
    
    public List<Categoria> searchCategoriaById(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH CATEGORIA BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Categoria> categorias = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM categoria WHERE categoria_id = ? and categoria_id > 0");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setCategoria_id(rs.getInt("categoria_id"));
                categoria.setNome(rs.getString("nome"));
                
                categorias.add(categoria);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return categorias;
//</editor-fold>
    }
    
    public List<Categoria> searchDeletedCategoriaByName(String name) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED CATEGORIA BY NAME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Categoria> categorias = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM categoria WHERE nome LIKE ? and categoria_id < 0");
            stmt.setString(1, "%" + name + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setCategoria_id(rs.getInt("categoria_id"));
                categoria.setNome(rs.getString("nome"));
                
                categorias.add(categoria);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return categorias;
//</editor-fold>
    }
    
    public List<Categoria> searchDeletedCategoriaById(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED CATEGORIA BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Categoria> categorias = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM categoria WHERE categoria_id = ? and categoria_id < 0");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setCategoria_id(rs.getInt("categoria_id"));
                categoria.setNome(rs.getString("nome"));
                
                categorias.add(categoria);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return categorias;
//</editor-fold>
    }
    
    public void restoreCategoria(Categoria cate) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="RESTAURAR CATEGORIA">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            int newId = cate.getCategoria_id() * -1;
            
            stmt = con.prepareStatement("UPDATE categoria SET categoria_id = ? WHERE categoria_id = ?");
            stmt.setInt(1, newId);
            stmt.setInt(2, cate.getCategoria_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Categoria restaurada com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao restaurar categoria: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public int quantidadeCategorias() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="GET QUANTIDADE DE CATEGORIAS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int quantidade = 0;
        
        try{
            stmt = con.prepareStatement("SELECT COUNT(categoria_id) AS 'quantidade' FROM categoria WHERE categoria_id > 0;");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                quantidade = rs.getInt("quantidade");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir quantidade de categorias: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return quantidade;
//</editor-fold>
    }
    
}
