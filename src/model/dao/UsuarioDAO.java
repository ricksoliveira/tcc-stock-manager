package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Usuario;

public class UsuarioDAO {
    
    public void createUsuario(Usuario usuario) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="CREATE USUARIO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO usuario (nome, sobrenome, data_nascimento, cpf, email, telefone, endereco, bairro, cidade, estado, cep)"
                                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSobrenome());
            stmt.setString(3, usuario.getData_nascimento());
            stmt.setString(4, usuario.getCpf());
            stmt.setString(5, usuario.getEmail());
            stmt.setString(6, usuario.getTelefone());
            stmt.setString(7, usuario.getEndereco());
            stmt.setString(8, usuario.getBairro());
            stmt.setString(9, usuario.getCidade());
            stmt.setString(10, usuario.getEstado());
            stmt.setString(11, usuario.getCep());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario salvo com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar usuario: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<Usuario> listAllUsuarios() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ ALL USUARIOS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE usuario_id > 0");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> listDeletedUsuarios() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ DELETED USUARIOS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE usuario_id < 0");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public void updateUsuario(Usuario usuario) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="UPDATE USUARIO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE usuario "
                                        + "SET nome = ?, sobrenome = ?, data_nascimento = ?, cpf = ?, email = ?, telefone = ?, endereco = ?, "
                                        + "bairro = ?, cidade = ?, estado = ?, cep = ? "
                                        + "WHERE usuario_id = ?");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSobrenome());
            stmt.setString(3, usuario.getData_nascimento());
            stmt.setString(4, usuario.getCpf());
            stmt.setString(5, usuario.getEmail());
            stmt.setString(6, usuario.getTelefone());
            stmt.setString(7, usuario.getEndereco());
            stmt.setString(8, usuario.getBairro());
            stmt.setString(9, usuario.getCidade());
            stmt.setString(10, usuario.getEstado());
            stmt.setString(11, usuario.getCep());
            stmt.setInt(12, usuario.getUsuario_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar usuario: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public void deleteUsuario(Usuario usuario) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="DELETE USUARIO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            int newId = usuario.getUsuario_id() * -1;
            
            stmt = con.prepareStatement("UPDATE usuario SET usuario_id = ? WHERE usuario_id = ?");
            stmt.setInt(1, newId);
            stmt.setInt(2, usuario.getUsuario_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario excluído com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuario: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public void restoreUsuario(Usuario usuario) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="RESTORE USUARIO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            int newId = usuario.getUsuario_id() * -1;
            
            stmt = con.prepareStatement("UPDATE usuario SET usuario_id = ? WHERE usuario_id = ?");
            stmt.setInt(1, newId);
            stmt.setInt(2, usuario.getUsuario_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario restaurado com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao restaurar usuario: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<Usuario> searchDeletedUsuarioById(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED USUARIO BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE usuario_id = ? and usuario_id < 0");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchDeletedUsuarioByName(String name) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED USUARIO BY NAME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE nome LIKE ? and usuario_id < 0");
            stmt.setString(1, "%" + name + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchDeletedUsuarioBySurname(String surname) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED USUARIO BY SOBRENOME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE sobrenome LIKE ? and usuario_id < 0");
            stmt.setString(1, "%" + surname + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchDeletedUsuarioByBirthday(String birthday) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED USUARIO BY NASCIMENTO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE data_nascimento LIKE ? and usuario_id < 0");
            stmt.setString(1, "%" + birthday + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchDeletedUsuarioByCpf(String cpf) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED USUARIO BY CPF">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE cpf LIKE ? and usuario_id < 0");
            stmt.setString(1, "%" + cpf + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchDeletedUsuarioByEmail(String email) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED USUARIO BY EMAIL">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE email LIKE ? and usuario_id < 0");
            stmt.setString(1, "%" + email + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchDeletedUsuarioByTelefone(String telefone) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED USUARIO BY TELEFONE">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE telefone LIKE ? and usuario_id < 0");
            stmt.setString(1, "%" + telefone + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchDeletedUsuarioByEndereco(String endereco) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED USUARIO BY ENDEREÇO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE endereco LIKE ? and usuario_id < 0");
            stmt.setString(1, "%" + endereco + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchDeletedUsuarioByBairro(String bairro) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED USUARIO BY BAIRRO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE bairro LIKE ? and usuario_id < 0");
            stmt.setString(1, "%" + bairro + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchDeletedUsuarioByCidade(String cidade) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED USUARIO BY CIDADE">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE cidade LIKE ? and usuario_id < 0");
            stmt.setString(1, "%" + cidade + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchDeletedUsuarioByEstado(String estado) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED USUARIO BY ESTADO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE estado LIKE ? and usuario_id < 0");
            stmt.setString(1, "%" + estado + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchDeletedUsuarioByCep(String cep) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED USUARIO BY CEP">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE cep LIKE ? and usuario_id < 0");
            stmt.setString(1, "%" + cep + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchUsuarioById(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH USUARIO BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE usuario_id = ? and usuario_id > 0");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchUsuarioByName(String name) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH USUARIO BY NAME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE nome LIKE ? and usuario_id > 0");
            stmt.setString(1, "%" + name + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchUsuarioBySurname(String surname) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH USUARIO BY SOBRENOME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE sobrenome LIKE ? and usuario_id > 0");
            stmt.setString(1, "%" + surname + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchUsuarioByBirthday(String birthday) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH USUARIO BY NASCIMENTO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE data_nascimento LIKE ? and usuario_id > 0");
            stmt.setString(1, "%" + birthday + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchUsuarioByCpf(String cpf) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH USUARIO BY CPF">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE cpf LIKE ? and usuario_id > 0");
            stmt.setString(1, "%" + cpf + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchUsuarioByEmail(String email) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH USUARIO BY EMAIL">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE email LIKE ? and usuario_id > 0");
            stmt.setString(1, "%" + email + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchUsuarioByTelefone(String telefone) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH USUARIO BY TELEFONE">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE telefone LIKE ? and usuario_id > 0");
            stmt.setString(1, "%" + telefone + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchUsuarioByEndereco(String endereco) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH USUARIO BY ENDEREÇO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE endereco LIKE ? and usuario_id > 0");
            stmt.setString(1, "%" + endereco + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchUsuarioByBairro(String bairro) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH USUARIO BY BAIRRO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE bairro LIKE ? and usuario_id > 0");
            stmt.setString(1, "%" + bairro + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchUsuarioByCidade(String cidade) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH USUARIO BY CIDADE">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE cidade LIKE ? and usuario_id > 0");
            stmt.setString(1, "%" + cidade + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchUsuarioByEstado(String estado) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH USUARIO BY ESTADO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE estado LIKE ? and usuario_id > 0");
            stmt.setString(1, "%" + estado + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public List<Usuario> searchUsuarioByCep(String cep) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH USUARIO BY CEP">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE cep LIKE ? and usuario_id > 0");
            stmt.setString(1, "%" + cep + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCep(rs.getString("cep"));
                usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
//</editor-fold>
    }
    
    public String getName(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET NAME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Usuario usuario = new Usuario();
        
        try{
            stmt = con.prepareStatement("SELECT nome FROM usuario WHERE usuario_id = ?");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                usuario.setNome(rs.getString("nome"));
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuario.getNome();
    
//</editor-fold>
    }
    
    public String getSurname(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET SURNAME">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Usuario usuario = new Usuario();
        
        try{
            stmt = con.prepareStatement("SELECT sobrenome FROM usuario WHERE usuario_id = ?");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                usuario.setSobrenome(rs.getString("sobrenome"));
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de usuarios: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuario.getSobrenome();
    
//</editor-fold>
    }
    
    
}
