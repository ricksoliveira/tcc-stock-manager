package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Produto;

public class ProdutoDAO {
    
    public void createProduto(Produto produto) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="CREATE PRODUTO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        String status = "A";
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO produto (fornecedor, categoria, cod_interno, descricao, especificacoes, dimensoes, condicao, preco_compra, quantidade, preco_unitario, data_insercao, status)"
                                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setInt(1, produto.getFornecedor());
            stmt.setInt(2, produto.getCategoria());
            stmt.setString(3, produto.getCod_interno());
            stmt.setString(4, produto.getDescricao());
            stmt.setString(5, produto.getEspecificacoes());
            stmt.setString(6, produto.getDimensoes());
            stmt.setString(7, produto.getCondicao());
            stmt.setDouble(8, produto.getPreco_compra());
            stmt.setInt(9, produto.getQuantidade());
            stmt.setDouble(10, produto.getPreco_unitario());
            stmt.setString(11, produto.getData_insercao());
            stmt.setString(12, status);
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar produto: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<Produto> listAllProdutos() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ ALL PRODUTOS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE status = 'A'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public void updateProduto(Produto produto) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="UPDATE PRODUTO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE produto "
                                        + "SET fornecedor = ?, categoria = ?, cod_interno = ?, descricao = ?, especificacoes = ?, "
                                        + "dimensoes = ?, condicao = ?, preco_compra = ?, quantidade = ?, preco_unitario = ?"
                                        + "WHERE produto_id = ?");
            stmt.setInt(1, produto.getFornecedor());
            stmt.setInt(2, produto.getCategoria());
            stmt.setString(3, produto.getCod_interno());
            stmt.setString(4, produto.getDescricao());
            stmt.setString(5, produto.getEspecificacoes());
            stmt.setString(6, produto.getDimensoes());
            stmt.setString(7, produto.getCondicao());
            stmt.setDouble(8, produto.getPreco_compra());
            stmt.setInt(9, produto.getQuantidade());
            stmt.setDouble(10, produto.getPreco_unitario());
            stmt.setInt(11, produto.getProduto_id());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public void deleteProduto(Produto produto) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="DELETE PRODUTO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            String status = "I";
            
            stmt = con.prepareStatement("UPDATE produto SET status = ? WHERE produto_id = ?");
            stmt.setString(1, status);
            stmt.setInt(2, produto.getProduto_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir produto: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public void restoreProduto(Produto produto) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="RESTORE PRODUTO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            String status = "A";
            
            stmt = con.prepareStatement("UPDATE produto SET status = ? WHERE produto_id = ?");
            stmt.setString(1, status);
            stmt.setInt(2, produto.getProduto_id());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto restaurado com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao restaurar produto: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<Produto> searchProdutoById(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PRODUTO BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE produto_id = ? AND status = 'A'");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchProdutoByFornecedor(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PRODUTO BY FORNECEDOR">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE fornecedor = ? AND status = 'A'");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchProdutoByCategoria(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PRODUTO BY CATEGORIA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE categoria = ? AND status = 'A'");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchProdutoByCodigoInterno(String codigo) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PRODUTO BY CODIGO INTERNO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE cod_interno LIKE ? AND status = 'A'");
            stmt.setString(1, "%" + codigo + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchProdutoByDescricao(String descricao) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PRODUTO BY DESCRICAO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE descricao LIKE ? AND status = 'A'");
            stmt.setString(1, "%" + descricao + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchProdutoByEspecificacoes(String especificacoes) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PRODUTO BY ESPECIFICACOES">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE especificacoes LIKE ? AND status = 'A'");
            stmt.setString(1, "%" + especificacoes + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchProdutoByDimensoes(String dimensoes) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PRODUTO BY DIMENSOES">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE dimensoes LIKE ? AND status = 'A'");
            stmt.setString(1, "%" + dimensoes + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchProdutoByQuantidade(int quantidade) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PRODUTO BY QUANTIDADE">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE quantidade LIKE ? AND status = 'A'");
            stmt.setString(1, "%" + quantidade + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchProdutoByCondicao(String condicao) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PRODUTO BY CONDICAO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE condicao LIKE ? AND status = 'A'");
            stmt.setString(1, "%" + condicao + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchProdutoByPrecoUnitario(double preco) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PRODUTO BY PREÇO UNITARIO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE preco_unitario LIKE ? AND status = 'A'");
            stmt.setString(1, "%" + preco + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchProdutoByDataInsercao(String data) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH PRODUTO BY DATA INSERÇÃO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE data_insercao LIKE ? AND status = 'A'");
            stmt.setString(1, "%" + data + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchProdutoByPrecoCompra(double preco) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY PREÇO DE COMPRA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE preco_compra LIKE ? AND status = 'A'");
            stmt.setString(1, "%" + preco + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> listDeletedProdutos() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ DELETED PRODUTOS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE status = 'I'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchDeletedProdutoById(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE produto_id = ? AND status = 'I'");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchDeletedProdutoByFornecedor(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY FORNECEDOR">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE fornecedor = ? AND status = 'I'");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchDeletedProdutoByCategoria(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY CATEGORIA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE categoria = ? AND status = 'I'");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchDeletedProdutoByCodigoInterno(String codigo) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY CODIGO INTERNO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE cod_interno LIKE ? AND status = 'I'");
            stmt.setString(1, "%" + codigo + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchDeletedProdutoByDescricao(String descricao) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY DESCRICAO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE descricao LIKE ? AND status = 'I'");
            stmt.setString(1, "%" + descricao + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchDeletedProdutoByEspecificacoes(String especificacoes) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY ESPECIFICACOES">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE especificacoes LIKE ? AND status = 'I'");
            stmt.setString(1, "%" + especificacoes + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchDeletedProdutoByDimensoes(String dimensoes) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY DIMENSOES">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE dimensoes LIKE ? AND status = 'I'");
            stmt.setString(1, "%" + dimensoes + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchDeletedProdutoByQuantidade(int quantidade) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY QUANTIDADE">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE quantidade LIKE ? AND status = 'I'");
            stmt.setString(1, "%" + quantidade + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchDeletedProdutoByCondicao(String condicao) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY CONDICAO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE condicao LIKE ? AND status = 'I'");
            stmt.setString(1, "%" + condicao + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchDeletedProdutoByPrecoUnitario(double preco) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY PREÇO UNITARIO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE preco_unitario LIKE ? AND status = 'I'");
            stmt.setString(1, "%" + preco + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchDeletedProdutoByPrecoCompra(double preco) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY PREÇO DE COMPRA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE preco_compra LIKE ? AND status = 'I'");
            stmt.setString(1, "%" + preco + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public List<Produto> searchDeletedProdutoByDataInsercao(String data) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH DELETED PRODUTO BY DATA INSERÇÃO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE data_insercao LIKE ? AND status = 'I'");
            stmt.setString(1, "%" + data + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public boolean authProduto(String codigo) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="AUTH PRODUTO BY CODIGO INTERNO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean auth = false;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE cod_interno = ? AND status = 'A'");
            stmt.setString(1, codigo);
            
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
    
    public Produto getProdutoByCodigoInterno(String codigo) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="GET PRODUTO BY CODIGO INTERNO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Produto produto = new Produto();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE cod_interno = ? AND status = 'A'");
            stmt.setString(1, codigo);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produto;
//</editor-fold>
    }
    
    
    public int getTotalQuantity() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET TOTAL QUANTIDADE PRODUTO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int total = 0;
        
        try{
            stmt = con.prepareStatement("SELECT SUM(quantidade) AS 'quantidade' FROM produto WHERE status = 'A'");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                total = rs.getInt("quantidade");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return total;
//</editor-fold>
    }
    
    public int getTotalQuantityInativo() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET TOTAL QUANTIDADE PRODUTOS INATIVOS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int total = 0;
        
        try{
            stmt = con.prepareStatement("SELECT SUM(quantidade) AS 'quantidade' FROM produto WHERE status = 'I'");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                total = rs.getInt("quantidade");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return total;
//</editor-fold>
    }
    
    public List<Produto> getProdutoAcabando(int quantidade) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="GET PRODUTO PROXIMO DE ACABAR">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM produto WHERE quantidade < ? AND status = 'A' ORDER BY quantidade ASC");
            stmt.setInt(1, quantidade);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setProduto_id(rs.getInt("produto_id"));
                produto.setFornecedor(rs.getInt("fornecedor"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setCod_interno(rs.getString("cod_interno"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEspecificacoes(rs.getString("especificacoes"));
                produto.setDimensoes(rs.getString("dimensoes"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCondicao(rs.getString("condicao"));
                produto.setPreco_unitario(rs.getDouble("preco_unitario"));
                produto.setData_insercao(rs.getString("data_insercao"));
                produto.setPreco_compra(rs.getDouble("preco_compra"));
                produtos.add(produto);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
//</editor-fold>
    }
    
    public int getTotalByCategoria(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET TOTAL QUANTIDADE POR CATEGORIA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int total = 0;
        
        try{
            stmt = con.prepareStatement("SELECT SUM(quantidade) AS 'quantidade' FROM produto WHERE categoria = ? AND status = 'A'");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                total = rs.getInt("quantidade");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return total;
//</editor-fold>
    }
    
    public int getTotalDistinct() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET QUANTIDADE PRODUTOS DIFERENTES">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int total = 0;
        
        try{
            stmt = con.prepareStatement("SELECT COUNT(DISTINCT cod_interno) AS 'quantidade' FROM produto WHERE status = 'A'");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                total = rs.getInt("quantidade");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return total;
//</editor-fold>
    }
    
    public int getTotalDistinctInativo() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET QUANTIDADE PRODUTOS DIFERENTES INATIVOS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int total = 0;
        
        try{
            stmt = con.prepareStatement("SELECT COUNT(DISTINCT cod_interno) AS 'quantidade' FROM produto WHERE status = 'I'");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                total = rs.getInt("quantidade");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return total;
//</editor-fold>
    }
    
    public double getTotalProductCost() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET VALOR TOTAL DO ESTOQUE">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        double total = 0.0;
        
        try{
            stmt = con.prepareStatement("SELECT sum(preco_compra * quantidade) as 'quantidade' FROM produto WHERE status = 'A'");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                total = rs.getDouble("quantidade");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return total;
//</editor-fold>
    }
    
    public double getTotalProductCostInativo() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET VALOR TOTAL DO ESTOQUE INATIVO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        double total = 0.0;
        
        try{
            stmt = con.prepareStatement("SELECT sum(preco_compra * quantidade) as 'quantidade' FROM produto WHERE status = 'I'");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                total = rs.getDouble("quantidade");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return total;
//</editor-fold>
    }
    
    public int getTotalInativosByCategoria(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET TOTAL QUANTIDADE DE INATIVOS POR CATEGORIA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int total = 0;
        
        try{
            stmt = con.prepareStatement("SELECT SUM(quantidade) AS 'quantidade' FROM produto WHERE categoria = ? AND status = 'I'");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                total = rs.getInt("quantidade");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return total;
//</editor-fold>
    }
    
}
