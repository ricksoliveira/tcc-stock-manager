package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.MetodoPagamento;

public class MetodoPagamentoDAO {
   
    public void createMetodoPagamento(MetodoPagamento cate) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="CREATE METODO DE PAGAMENTO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO metodo_pagamento (nome) VALUES (?)");
            stmt.setString(1, cate.getNome());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Metodode Pagamento salvo com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Metodo de Pagamento: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<MetodoPagamento> listAllMetodoPagamentos() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ ALL METODO DE PAGAMENTOS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<MetodoPagamento> metodoPagamentos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM metodo_pagamento WHERE metodo_pagamento_id > 0");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                MetodoPagamento metodoPagamento = new MetodoPagamento();
                metodoPagamento.setMetodo_pagamento_id(rs.getInt("metodo_pagamento_id"));
                metodoPagamento.setNome(rs.getString("nome"));
                
                metodoPagamentos.add(metodoPagamento);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de metodos de pagamento: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return metodoPagamentos;
//</editor-fold>
    }
    
    public List<MetodoPagamento> listDeletedMetodoPagamentos() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ DELETED METODO DE PAGAMENTOS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<MetodoPagamento> metodoPagamentos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM metodo_pagamento WHERE metodo_pagamento_id < 0");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                MetodoPagamento metodoPagamento = new MetodoPagamento();
                metodoPagamento.setMetodo_pagamento_id(rs.getInt("metodo_pagamento_id"));
                metodoPagamento.setNome(rs.getString("nome"));
                
                metodoPagamentos.add(metodoPagamento);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de metodo de pagamento: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return metodoPagamentos;
//</editor-fold>
    }
    
    public void updateMetodoPagamento(MetodoPagamento cate) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="UPDATE METODO DE PAGAMENTO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE metodo_pagamento SET nome = ? WHERE metodo_pagamento_id = ?");
            stmt.setString(1, cate.getNome());
            stmt.setInt(2, cate.getMetodo_pagamento_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Metodo de Pagamento atualizado com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Metodo de Pagamento: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public void deleteMetodoPagamento(MetodoPagamento cate) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="DELETE METODO DE PAGAMENTO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            int newId = cate.getMetodo_pagamento_id() * -1;
            
            stmt = con.prepareStatement("UPDATE metodo_pagamento SET metodo_pagamento_id = ? WHERE metodo_pagamento_id = ?");
            stmt.setInt(1, newId);
            stmt.setInt(2, cate.getMetodo_pagamento_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Metodo de Pagamento excluído com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Metodo de Pagamento: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<MetodoPagamento> searchMetodoPagamentoByName(String name) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH METODO DE PAGAMENTO BY NAME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<MetodoPagamento> metodo_pagamentos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM metodo_pagamento WHERE nome LIKE ? and metodo_pagamento_id > 0");
            stmt.setString(1, "%" + name + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                MetodoPagamento metodo_pagamento = new MetodoPagamento();
                metodo_pagamento.setMetodo_pagamento_id(rs.getInt("metodo_pagamento_id"));
                metodo_pagamento.setNome(rs.getString("nome"));
                
                metodo_pagamentos.add(metodo_pagamento);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return metodo_pagamentos;
//</editor-fold>
    }
    
    public List<MetodoPagamento> searchMetodoPagamentoById(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH METODO DE PAGAMENTO BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<MetodoPagamento> metodo_pagamentos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM metodo_pagamento WHERE metodo_pagamento_id = ? and metodo_pagamento_id > 0");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                MetodoPagamento metodo_pagamento = new MetodoPagamento();
                metodo_pagamento.setMetodo_pagamento_id(rs.getInt("metodo_pagamento_id"));
                metodo_pagamento.setNome(rs.getString("nome"));
                
                metodo_pagamentos.add(metodo_pagamento);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return metodo_pagamentos;
//</editor-fold>
    }
    
    public List<MetodoPagamento> searchDeletedMetodoPagamentoByName(String name) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED METODO DE PAGAMENTO BY NAME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<MetodoPagamento> metodo_pagamentos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM metodo_pagamento WHERE nome LIKE ? and metodo_pagamento_id < 0");
            stmt.setString(1, "%" + name + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                MetodoPagamento metodo_pagamento = new MetodoPagamento();
                metodo_pagamento.setMetodo_pagamento_id(rs.getInt("metodo_pagamento_id"));
                metodo_pagamento.setNome(rs.getString("nome"));
                
                metodo_pagamentos.add(metodo_pagamento);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return metodo_pagamentos;
//</editor-fold>
    }
    
    public List<MetodoPagamento> searchDeletedMetodoPagamentoById(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED METODO DE PAGAMENTO BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<MetodoPagamento> metodo_pagamentos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM metodo_pagamento WHERE metodo_pagamento_id = ? and metodo_pagamento_id < 0");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                MetodoPagamento metodo_pagamento = new MetodoPagamento();
                metodo_pagamento.setMetodo_pagamento_id(rs.getInt("metodo_pagamento_id"));
                metodo_pagamento.setNome(rs.getString("nome"));
                
                metodo_pagamentos.add(metodo_pagamento);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de categorais: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return metodo_pagamentos;
//</editor-fold>
    }
    
    public void restoreMetodoPagamento(MetodoPagamento cate) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="RESTAURAR METODO DE PAGAMENTO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            int newId = cate.getMetodo_pagamento_id() * -1;
            
            stmt = con.prepareStatement("UPDATE metodo_pagamento SET metodo_pagamento_id = ? WHERE metodo_pagamento_id = ?");
            stmt.setInt(1, newId);
            stmt.setInt(2, cate.getMetodo_pagamento_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "MetodoPagamento restaurada com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao restaurar metodo_pagamento: " + e);
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
        
        MetodoPagamento metodoPagamento = new MetodoPagamento();
        
        try{
            stmt = con.prepareStatement("SELECT nome FROM metodo_pagamento WHERE metodo_pagamento_id = ?");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                metodoPagamento.setNome(rs.getString("nome"));
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return metodoPagamento.getNome();
    
//</editor-fold>
    }
    
}
