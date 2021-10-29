package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Fornecedor;

public class FornecedorDAO {
    
    public void createFornecedor(Fornecedor fornecedor) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="CREATE FORNECEDOR">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO fornecedor (nome_fantasia, razao_social, endereco, numero, complemento, bairro, cidade, estado, cep, cpf, cnpj, email, telefone_1, telefone_2, insc_municipal, insc_estadual)"
                                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, fornecedor.getNome_fantasia());
            stmt.setString(2, fornecedor.getRazao_social());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.setString(4, fornecedor.getNumero());
            stmt.setString(5, fornecedor.getComplemento());
            stmt.setString(6, fornecedor.getBairro());
            stmt.setString(7, fornecedor.getCidade());
            stmt.setString(8, fornecedor.getEstado());
            stmt.setString(9, fornecedor.getCep());
            stmt.setString(10, fornecedor.getCpf());
            stmt.setString(11, fornecedor.getCnpj());
            stmt.setString(12, fornecedor.getEmail());
            stmt.setString(13, fornecedor.getTelefone_1());
            stmt.setString(14, fornecedor.getTelefone_2());
            stmt.setString(15, fornecedor.getInsc_municipal());
            stmt.setString(16, fornecedor.getInsc_estadual());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor salvo com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar fornecedor: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<Fornecedor> listAllFornecedors() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ ALL FORNECEDORS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE fornecedor_id > 0");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                
                
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedores: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> listDeletedFornecedors() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ DELETED FORNECEDORS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE fornecedor_id < 0");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedores: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public void updateFornecedor(Fornecedor fornecedor) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="UPDATE FORNECEDOR">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE fornecedor "
                                        + "SET nome_fantasia = ?, razao_social = ?, endereco = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, "
                                        + "estado = ?, cep = ?, cpf = ?, cnpj = ?, email = ?, telefone_1 = ?, telefone_2 = ?, insc_municipal = ?, insc_estadual = ? "
                                        + "WHERE fornecedor_id = ?");
            stmt.setString(1, fornecedor.getNome_fantasia());
            stmt.setString(2, fornecedor.getRazao_social());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.setString(4, fornecedor.getNumero());
            stmt.setString(5, fornecedor.getComplemento());
            stmt.setString(6, fornecedor.getBairro());
            stmt.setString(7, fornecedor.getCidade());
            stmt.setString(8, fornecedor.getEstado());
            stmt.setString(9, fornecedor.getCep());
            stmt.setString(10, fornecedor.getCpf());
            stmt.setString(11, fornecedor.getCnpj());
            stmt.setString(12, fornecedor.getEmail());
            stmt.setString(13, fornecedor.getTelefone_1());
            stmt.setString(14, fornecedor.getTelefone_2());
            stmt.setString(15, fornecedor.getInsc_municipal());
            stmt.setString(16, fornecedor.getInsc_estadual());
            stmt.setInt(17, fornecedor.getFornecedor_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor atualizado com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar fornecedor: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public void deleteFornecedor(Fornecedor fornecedor) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="DELETE FORNECEDOR">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            int newId = fornecedor.getFornecedor_id() * -1;
            
            stmt = con.prepareStatement("UPDATE fornecedor SET fornecedor_id = ? WHERE fornecedor_id = ?");
            stmt.setInt(1, newId);
            stmt.setInt(2, fornecedor.getFornecedor_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor excluído com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir fornecedor: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public void restoreFornecedor(Fornecedor fornecedor) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="RESTORE FORNECEDOR">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            int newId = fornecedor.getFornecedor_id() * -1;
            
            stmt = con.prepareStatement("UPDATE fornecedor SET fornecedor_id = ? WHERE fornecedor_id = ?");
            stmt.setInt(1, newId);
            stmt.setInt(2, fornecedor.getFornecedor_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor restaurado com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao restaurar fornecedor: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorById(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE fornecedor_id = ? and fornecedor_id < 0");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByNomeFantasia(String nomeFantasia) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY NOME FANTASIA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE nome_fantasia LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + nomeFantasia + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByRazaoSocial(String razaoSocial) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY RAZAO SOCIAL">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE razao_social LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + razaoSocial + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByEndereco(String endereco) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY ENDERECO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE endereco LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + endereco + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByNumero(int num) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY NUMERO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE numero LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + num + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByComplemento(String complemento) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY COMPLEMENTO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE complemento LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + complemento + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByBairro(String bairro) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY BAIRRO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE bairro LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + bairro + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByCidade(String cidade) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY CIDADE">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE cidade LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + cidade + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByEstado(String estado) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY ESTADO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE estado LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + estado + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByCep(String cep) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY CEP">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE cep LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + cep + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByCpf(String cpf) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY CPF">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE cpf LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + cpf + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByCnpj(String cnpj) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY CNPJ">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE cnpj LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + cnpj + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByEmail(String email) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY EMAIL">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE email LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + email + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByTelefone1(String telefone1) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY TELEFONE 1">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE telefone_1 LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + telefone1 + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByTelefone2(String telefone2) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY TELEFONE 2">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE telefone_2 LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + telefone2 + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByInscMunicipal(String inscMunicipal) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY INSC MUNICIPAL">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE insc_municipal LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + inscMunicipal + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchDeletedFornecedorByInscEstadual(String inscEstadual) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED FORNECEDOR BY INSC ESTADUAL">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE insc_estadual LIKE ? and fornecedor_id < 0");
            stmt.setString(1, "%" + inscEstadual + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorById(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE fornecedor_id = ? and fornecedor_id > 0");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByNomeFantasia(String nomeFantasia) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY NOME FANTASIA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE nome_fantasia LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + nomeFantasia + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByRazaoSocial(String razaoSocial) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY RAZAO SOCIAL">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE razao_social LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + razaoSocial + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByEndereco(String endereco) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY ENDERECO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE endereco LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + endereco + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByNumero(int num) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY NUMERO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE numero LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + num + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByComplemento(String complemento) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY COMPLEMENTO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE complemento LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + complemento + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByBairro(String bairro) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY BAIRRO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE bairro LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + bairro + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByCidade(String cidade) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY CIDADE">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE cidade LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + cidade + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByEstado(String estado) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY ESTADO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE estado LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + estado + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByCep(String cep) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY CEP">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE cep LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + cep + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByCpf(String cpf) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY CPF">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE cpf LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + cpf + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByCnpj(String cnpj) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY CNPJ">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE cnpj LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + cnpj + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByEmail(String email) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY EMAIL">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE email LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + email + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByTelefone1(String telefone1) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY TELEFONE 1">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE telefone_1 LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + telefone1 + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByTelefone2(String telefone2) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY TELEFONE 2">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE telefone_2 LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + telefone2 + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByInscMunicipal(String inscMunicipal) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY INSC MUNICIPAL">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE insc_municipal LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + inscMunicipal + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    public List<Fornecedor> searchFornecedorByInscEstadual(String inscEstadual) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH FORNECEDOR BY INSC ESTADUAL">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedors = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE insc_estadual LIKE ? and fornecedor_id > 0");
            stmt.setString(1, "%" + inscEstadual + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setFornecedor_id(rs.getInt("fornecedor_id"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone_1(rs.getString("telefone_1"));
                fornecedor.setTelefone_2(rs.getString("telefone_2"));
                fornecedor.setInsc_municipal(rs.getString("insc_municipal"));
                fornecedor.setInsc_estadual(rs.getString("insc_estadual"));
                fornecedors.add(fornecedor);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de fornecedors: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedors;
//</editor-fold>
    }
    
    
}
