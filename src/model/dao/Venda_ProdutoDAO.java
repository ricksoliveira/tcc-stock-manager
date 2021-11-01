package model.dao;

import java.sql.Connection;
import model.bean.Venda_Produto;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.VendaCompleta;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class Venda_ProdutoDAO {
    
    public void createVendaProduto(Venda_Produto venda_Produto) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="CREATE VENDA_PRODUTO">
        Connection con;
        con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO venda_produto (produto_id, venda_id, quantidade, preco_unitario, subtotal) "
                                        + "VALUES (?, ?, ?, ?, ?)");
            stmt.setInt(1, venda_Produto.getProduto_id());
            stmt.setInt(2, venda_Produto.getVenda_id());
            stmt.setInt(3, venda_Produto.getQuantidade());
            stmt.setDouble(4, venda_Produto.getPreco_unitario());
            stmt.setDouble(5, venda_Produto.getSubtotal());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar venda_produto: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
//</editor-fold>
    }
    
    public List<VendaCompleta> listAllCompleteVendas() throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="READ ALL COMPLETE VENDAS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<VendaCompleta> vendasCompletas = new ArrayList<>();
        
        try{
            
            
            stmt = con.prepareStatement("SELECT vp.venda_id, vp.produto_id, "
                                            + "p.cod_interno, p.descricao, vp.preco_unitario, vp.quantidade, "
                                            + "(vp.preco_unitario * vp.quantidade) as 'subtotal', "
                                            + "promo.nome as 'promocao', mp.nome as 'pagamento', "
                                            + "u.nome as 'vendedor', v.data "
                                        + "FROM venda AS v "
                                            + "JOIN venda_produto AS vp "
                                                + "ON v.venda_id = vp.venda_id "
                                            + "JOIN produto AS p "
                                                + "ON vp.produto_id = p.produto_id "
                                            + "JOIN metodo_pagamento AS mp "
                                                + "ON mp.metodo_pagamento_id = v.metodo_pagamento "
                                            + "JOIN usuario AS u "
                                                + "ON u.usuario_id = v.vendedor "
                                            + "JOIN promo AS promo "
                                                + "ON promo.promo_id = v.promo "
                                        + "WHERE v.venda_id > 0 "
                                        + "ORDER BY vp.venda_id, vp.produto_id");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaCompleta vendaCompleta = new VendaCompleta();
                vendaCompleta.setProduto_id(rs.getInt("produto_id"));
                vendaCompleta.setVenda_id(rs.getInt("venda_id"));
                vendaCompleta.setCod_interno(rs.getString("cod_interno"));
                vendaCompleta.setDescricao(rs.getString("descricao"));
                vendaCompleta.setPreco_unitario(rs.getDouble("preco_unitario"));
                vendaCompleta.setQuantidade(rs.getInt("quantidade"));
                vendaCompleta.setSubtotal(rs.getDouble("subtotal"));
                vendaCompleta.setPromo(rs.getString("promocao"));
                vendaCompleta.setMetodoPagamento(rs.getString("pagamento"));
                vendaCompleta.setVendedor(rs.getString("vendedor"));
                vendaCompleta.setData(rs.getString("data"));
                vendasCompletas.add(vendaCompleta); 
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de af: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return vendasCompletas;
//</editor-fold>
    }
    
    
    public List<VendaCompleta> searchVendaCompletaByVendaId(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH VENDA COMPLETA BY VENDA ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<VendaCompleta> vendasCompletas = new ArrayList<>();
        
        try{
            
            stmt = con.prepareStatement("SELECT vp.produto_id, vp.venda_id, "
                                            + "p.cod_interno, p.descricao, vp.preco_unitario, vp.quantidade, "
                                            + "(vp.preco_unitario * vp.quantidade) as 'subtotal', "
                                            + "promo.nome as 'promocao', mp.nome as 'pagamento', "
                                            + "u.nome as 'vendedor', v.data "
                                        + "FROM venda AS v "
                                            + "JOIN venda_produto AS vp "
                                                + "ON v.venda_id = vp.venda_id "
                                            + "JOIN produto AS p "
                                                + "ON vp.produto_id = p.produto_id "
                                            + "JOIN metodo_pagamento AS mp "
                                                + "ON mp.metodo_pagamento_id = v.metodo_pagamento "
                                            + "JOIN usuario AS u "
                                                + "ON u.usuario_id = v.vendedor "
                                            + "JOIN promo AS promo "
                                                + "ON promo.promo_id = v.promo "
                                        + "WHERE v.venda_id = ? AND v.venda_id > 0 "
                                        + "ORDER BY vp.venda_id, vp.produto_id");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaCompleta vendaCompleta = new VendaCompleta();
                vendaCompleta.setVenda_id(rs.getInt("venda_id"));
                vendaCompleta.setProduto_id(rs.getInt("produto_id"));
                vendaCompleta.setCod_interno(rs.getString("cod_interno"));
                vendaCompleta.setDescricao(rs.getString("descricao"));
                vendaCompleta.setPreco_unitario(rs.getDouble("preco_unitario"));
                vendaCompleta.setQuantidade(rs.getInt("quantidade"));
                vendaCompleta.setSubtotal(rs.getDouble("subtotal"));
                vendaCompleta.setPromo(rs.getString("promocao"));
                vendaCompleta.setMetodoPagamento(rs.getString("pagamento"));
                vendaCompleta.setVendedor(rs.getString("vendedor"));
                vendaCompleta.setData(rs.getString("data"));
                vendasCompletas.add(vendaCompleta);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return vendasCompletas;
//</editor-fold>
    }
    
    public List<VendaCompleta> searchVendaCompletaByProdutoId(int id) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH VENDA COMPLETA BY PRODUTO ID">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<VendaCompleta> vendasCompletas = new ArrayList<>();
        
        try{
            
            stmt = con.prepareStatement("SELECT vp.venda_id, vp.produto_id, "
                                            + "p.cod_interno, p.descricao, vp.preco_unitario, vp.quantidade, "
                                            + "(vp.preco_unitario * vp.quantidade) as 'subtotal', "
                                            + "promo.nome as 'promocao', mp.nome as 'pagamento', "
                                            + "u.nome as 'vendedor', v.data "
                                        + "FROM venda AS v "
                                            + "JOIN venda_produto AS vp "
                                                + "ON v.venda_id = vp.venda_id "
                                            + "JOIN produto AS p "
                                                + "ON vp.produto_id = p.produto_id "
                                            + "JOIN metodo_pagamento AS mp "
                                                + "ON mp.metodo_pagamento_id = v.metodo_pagamento "
                                            + "JOIN usuario AS u "
                                                + "ON u.usuario_id = v.vendedor "
                                            + "JOIN promo AS promo "
                                                + "ON promo.promo_id = v.promo "
                                        + "WHERE vp.produto_id = ? AND v.venda_id > 0 "
                                        + "ORDER BY vp.venda_id, vp.produto_id");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaCompleta vendaCompleta = new VendaCompleta();
                vendaCompleta.setVenda_id(rs.getInt("venda_id"));
                vendaCompleta.setProduto_id(rs.getInt("produto_id"));
                vendaCompleta.setCod_interno(rs.getString("cod_interno"));
                vendaCompleta.setDescricao(rs.getString("descricao"));
                vendaCompleta.setPreco_unitario(rs.getDouble("preco_unitario"));
                vendaCompleta.setQuantidade(rs.getInt("quantidade"));
                vendaCompleta.setSubtotal(rs.getDouble("subtotal"));
                vendaCompleta.setPromo(rs.getString("promocao"));
                vendaCompleta.setMetodoPagamento(rs.getString("pagamento"));
                vendaCompleta.setVendedor(rs.getString("vendedor"));
                vendaCompleta.setData(rs.getString("data"));
                vendasCompletas.add(vendaCompleta);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return vendasCompletas;
//</editor-fold>
    }
    
    public List<VendaCompleta> searchVendaCompletaByCodigoInterno(String codigo) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH VENDA COMPLETA BY CODIGO INTERNO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<VendaCompleta> vendasCompletas = new ArrayList<>();
        
        try{
            
            stmt = con.prepareStatement("SELECT vp.venda_id, vp.produto_id, "
                                            + "p.cod_interno, p.descricao, vp.preco_unitario, vp.quantidade, "
                                            + "(vp.preco_unitario * vp.quantidade) as 'subtotal', "
                                            + "promo.nome as 'promocao', mp.nome as 'pagamento', "
                                            + "u.nome as 'vendedor', v.data "
                                        + "FROM venda AS v "
                                            + "JOIN venda_produto AS vp "
                                                + "ON v.venda_id = vp.venda_id "
                                            + "JOIN produto AS p "
                                                + "ON vp.produto_id = p.produto_id "
                                            + "JOIN metodo_pagamento AS mp "
                                                + "ON mp.metodo_pagamento_id = v.metodo_pagamento "
                                            + "JOIN usuario AS u "
                                                + "ON u.usuario_id = v.vendedor "
                                            + "JOIN promo AS promo "
                                                + "ON promo.promo_id = v.promo "
                                        + "WHERE p.cod_interno LIKE ? AND v.venda_id > 0 "
                                        + "ORDER BY vp.venda_id, vp.produto_id");
            stmt.setString(1, "%" + codigo + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaCompleta vendaCompleta = new VendaCompleta();
                vendaCompleta.setVenda_id(rs.getInt("venda_id"));
                vendaCompleta.setProduto_id(rs.getInt("produto_id"));
                vendaCompleta.setCod_interno(rs.getString("cod_interno"));
                vendaCompleta.setDescricao(rs.getString("descricao"));
                vendaCompleta.setPreco_unitario(rs.getDouble("preco_unitario"));
                vendaCompleta.setQuantidade(rs.getInt("quantidade"));
                vendaCompleta.setSubtotal(rs.getDouble("subtotal"));
                vendaCompleta.setPromo(rs.getString("promocao"));
                vendaCompleta.setMetodoPagamento(rs.getString("pagamento"));
                vendaCompleta.setVendedor(rs.getString("vendedor"));
                vendaCompleta.setData(rs.getString("data"));
                vendasCompletas.add(vendaCompleta);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return vendasCompletas;
//</editor-fold>
    }
    
    public List<VendaCompleta> searchVendaCompletaByPromocao(String promo) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH VENDA COMPLETA BY PROMOCAO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<VendaCompleta> vendasCompletas = new ArrayList<>();
        
        try{
            
            stmt = con.prepareStatement("SELECT vp.venda_id, vp.produto_id, "
                                            + "p.cod_interno, p.descricao, vp.preco_unitario, vp.quantidade, "
                                            + "(vp.preco_unitario * vp.quantidade) as 'subtotal', "
                                            + "promo.nome as 'promocao', mp.nome as 'pagamento', "
                                            + "u.nome as 'vendedor', v.data "
                                        + "FROM venda AS v "
                                            + "JOIN venda_produto AS vp "
                                                + "ON v.venda_id = vp.venda_id "
                                            + "JOIN produto AS p "
                                                + "ON vp.produto_id = p.produto_id "
                                            + "JOIN metodo_pagamento AS mp "
                                                + "ON mp.metodo_pagamento_id = v.metodo_pagamento "
                                            + "JOIN usuario AS u "
                                                + "ON u.usuario_id = v.vendedor "
                                            + "JOIN promo AS promo "
                                                + "ON promo.promo_id = v.promo "
                                        + "WHERE promo.nome LIKE ? AND v.venda_id > 0 "
                                        + "ORDER BY vp.venda_id, vp.produto_id");
            stmt.setString(1, "%" + promo + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaCompleta vendaCompleta = new VendaCompleta();
                vendaCompleta.setVenda_id(rs.getInt("venda_id"));
                vendaCompleta.setProduto_id(rs.getInt("produto_id"));
                vendaCompleta.setCod_interno(rs.getString("cod_interno"));
                vendaCompleta.setDescricao(rs.getString("descricao"));
                vendaCompleta.setPreco_unitario(rs.getDouble("preco_unitario"));
                vendaCompleta.setQuantidade(rs.getInt("quantidade"));
                vendaCompleta.setSubtotal(rs.getDouble("subtotal"));
                vendaCompleta.setPromo(rs.getString("promocao"));
                vendaCompleta.setMetodoPagamento(rs.getString("pagamento"));
                vendaCompleta.setVendedor(rs.getString("vendedor"));
                vendaCompleta.setData(rs.getString("data"));
                vendasCompletas.add(vendaCompleta);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return vendasCompletas;
//</editor-fold>
    }
    
    public List<VendaCompleta> searchVendaCompletaByPagamento(String pagamento) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH VENDA COMPLETA BY PAGAMENTO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<VendaCompleta> vendasCompletas = new ArrayList<>();
        
        try{
            
            stmt = con.prepareStatement("SELECT vp.venda_id, vp.produto_id, "
                                            + "p.cod_interno, p.descricao, vp.preco_unitario, vp.quantidade, "
                                            + "(vp.preco_unitario * vp.quantidade) as 'subtotal', "
                                            + "promo.nome as 'promocao', mp.nome as 'pagamento', "
                                            + "u.nome as 'vendedor', v.data "
                                        + "FROM venda AS v "
                                            + "JOIN venda_produto AS vp "
                                                + "ON v.venda_id = vp.venda_id "
                                            + "JOIN produto AS p "
                                                + "ON vp.produto_id = p.produto_id "
                                            + "JOIN metodo_pagamento AS mp "
                                                + "ON mp.metodo_pagamento_id = v.metodo_pagamento "
                                            + "JOIN usuario AS u "
                                                + "ON u.usuario_id = v.vendedor "
                                            + "JOIN promo AS promo "
                                                + "ON promo.promo_id = v.promo "
                                        + "WHERE mp.nome LIKE ? AND v.venda_id > 0 "
                                        + "ORDER BY vp.venda_id, vp.produto_id");
            stmt.setString(1, "%" + pagamento + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaCompleta vendaCompleta = new VendaCompleta();
                vendaCompleta.setVenda_id(rs.getInt("venda_id"));
                vendaCompleta.setProduto_id(rs.getInt("produto_id"));
                vendaCompleta.setCod_interno(rs.getString("cod_interno"));
                vendaCompleta.setDescricao(rs.getString("descricao"));
                vendaCompleta.setPreco_unitario(rs.getDouble("preco_unitario"));
                vendaCompleta.setQuantidade(rs.getInt("quantidade"));
                vendaCompleta.setSubtotal(rs.getDouble("subtotal"));
                vendaCompleta.setPromo(rs.getString("promocao"));
                vendaCompleta.setMetodoPagamento(rs.getString("pagamento"));
                vendaCompleta.setVendedor(rs.getString("vendedor"));
                vendaCompleta.setData(rs.getString("data"));
                vendasCompletas.add(vendaCompleta);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return vendasCompletas;
//</editor-fold>
    }
    
    public List<VendaCompleta> searchVendaCompletaByVendedor(String vendedor) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH VENDA COMPLETA BY VENDEDOR">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<VendaCompleta> vendasCompletas = new ArrayList<>();
        
        try{
            
            stmt = con.prepareStatement("SELECT vp.venda_id, vp.produto_id, "
                                            + "p.cod_interno, p.descricao, vp.preco_unitario, vp.quantidade, "
                                            + "(vp.preco_unitario * vp.quantidade) as 'subtotal', "
                                            + "promo.nome as 'promocao', mp.nome as 'pagamento', "
                                            + "u.nome as 'vendedor', v.data "
                                        + "FROM venda AS v "
                                            + "JOIN venda_produto AS vp "
                                                + "ON v.venda_id = vp.venda_id "
                                            + "JOIN produto AS p "
                                                + "ON vp.produto_id = p.produto_id "
                                            + "JOIN metodo_pagamento AS mp "
                                                + "ON mp.metodo_pagamento_id = v.metodo_pagamento "
                                            + "JOIN usuario AS u "
                                                + "ON u.usuario_id = v.vendedor "
                                            + "JOIN promo AS promo "
                                                + "ON promo.promo_id = v.promo "
                                        + "WHERE u.nome LIKE ? AND v.venda_id > 0 "
                                        + "ORDER BY vp.venda_id, vp.produto_id");
            stmt.setString(1, "%" + vendedor + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaCompleta vendaCompleta = new VendaCompleta();
                vendaCompleta.setVenda_id(rs.getInt("venda_id"));
                vendaCompleta.setProduto_id(rs.getInt("produto_id"));
                vendaCompleta.setCod_interno(rs.getString("cod_interno"));
                vendaCompleta.setDescricao(rs.getString("descricao"));
                vendaCompleta.setPreco_unitario(rs.getDouble("preco_unitario"));
                vendaCompleta.setQuantidade(rs.getInt("quantidade"));
                vendaCompleta.setSubtotal(rs.getDouble("subtotal"));
                vendaCompleta.setPromo(rs.getString("promocao"));
                vendaCompleta.setMetodoPagamento(rs.getString("pagamento"));
                vendaCompleta.setVendedor(rs.getString("vendedor"));
                vendaCompleta.setData(rs.getString("data"));
                vendasCompletas.add(vendaCompleta);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return vendasCompletas;
//</editor-fold>
    }
    
    public List<VendaCompleta> searchVendaCompletaByData(String data1, String data2) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc="SEARCH VENDA COMPLETA BY DATA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<VendaCompleta> vendasCompletas = new ArrayList<>();
        
        try{
            
            stmt = con.prepareStatement("SELECT vp.venda_id, vp.produto_id, "
                                            + "p.cod_interno, p.descricao, vp.preco_unitario, vp.quantidade, "
                                            + "(vp.preco_unitario * vp.quantidade) as 'subtotal', "
                                            + "promo.nome as 'promocao', mp.nome as 'pagamento', "
                                            + "u.nome as 'vendedor', v.data "
                                        + "FROM venda AS v "
                                            + "JOIN venda_produto AS vp "
                                                + "ON v.venda_id = vp.venda_id "
                                            + "JOIN produto AS p "
                                                + "ON vp.produto_id = p.produto_id "
                                            + "JOIN metodo_pagamento AS mp "
                                                + "ON mp.metodo_pagamento_id = v.metodo_pagamento "
                                            + "JOIN usuario AS u "
                                                + "ON u.usuario_id = v.vendedor "
                                            + "JOIN promo AS promo "
                                                + "ON promo.promo_id = v.promo "
                                        + "WHERE v.data BETWEEN ? AND ? "
                                        + "ORDER BY vp.venda_id, vp.produto_id");
            stmt.setString(1, data1);
            stmt.setString(2, data2);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaCompleta vendaCompleta = new VendaCompleta();
                vendaCompleta.setVenda_id(rs.getInt("venda_id"));
                vendaCompleta.setProduto_id(rs.getInt("produto_id"));
                vendaCompleta.setCod_interno(rs.getString("cod_interno"));
                vendaCompleta.setDescricao(rs.getString("descricao"));
                vendaCompleta.setPreco_unitario(rs.getDouble("preco_unitario"));
                vendaCompleta.setQuantidade(rs.getInt("quantidade"));
                vendaCompleta.setSubtotal(rs.getDouble("subtotal"));
                vendaCompleta.setPromo(rs.getString("promocao"));
                vendaCompleta.setMetodoPagamento(rs.getString("pagamento"));
                vendaCompleta.setVendedor(rs.getString("vendedor"));
                vendaCompleta.setData(rs.getString("data"));
                vendasCompletas.add(vendaCompleta);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return vendasCompletas;
//</editor-fold>
    }
    
    
    public int getTotalProdutos(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET TOTAL DE PRODUTOS DA VENDA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int total = 0;
        
        try{
            
            stmt = con.prepareStatement("SELECT sum(quantidade) AS 'quantidade' "
                                        + "FROM venda_produto "
                                        + "WHERE venda_id = ?");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                total = rs.getInt("quantidade");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return total;
//</editor-fold>
    }
    
    public int getTotalDistinctProdutos(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET TOTAL DE PRODUTOS DISTINTOS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int total = 0;
        
        try{
            
            stmt = con.prepareStatement("SELECT count(distinct produto_id) AS 'distinct_quantidade' "
                                        + "FROM venda_produto "
                                        + "WHERE venda_id = ?");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                total = rs.getInt("distinct_quantidade");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return total;
//</editor-fold>
    }
    
    
    public double getTotalParcialSingleVenda(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET TOTAL PARCIAL DE UMA UNICA VENDA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        double total = 0.0;
        
        try{
            
            stmt = con.prepareStatement("SELECT vp.produto_id, vp.preco_unitario, sum(vp.quantidade) AS 'quantidade', vp.subtotal "
                                        + "FROM venda_produto AS vp "
                                        + "WHERE venda_id = ? "
                                        + "GROUP BY produto_id "
                                        + "ORDER BY produto_id ASC");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                total += rs.getInt("subtotal");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return total;
//</editor-fold>
    }
    
    
    public JasperPrint getReport(int id) throws SQLException, JRException{
        //<editor-fold defaultstate="collapsed" desc="GET VALOR TOTAL DA VENDA">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<VendaCompleta> vendasCompletas = new ArrayList<>();
        
        JasperPrint jpPrint = null;
        
        try{
            
            stmt = con.prepareStatement("select promo.valor_desconto, vp.venda_id, vp.produto_id,"
                                            + "p.cod_interno, p.descricao, vp.preco_unitario, vp.quantidade,"
                                            + "(vp.preco_unitario * vp.quantidade) as 'subtotal', promo.nome as 'promocao',"
                                            + "mp.nome as 'pagamento', u.nome as 'vendedor', v.data "
                                        + "from venda as v "
                                        + "join venda_produto as vp "
                                        + "on v.venda_id = vp.venda_id "
                                        + "join produto as p "
                                        + "on vp.produto_id = p.produto_id "
                                        + "join metodo_pagamento as mp "
                                        + "on mp.metodo_pagamento_id = v.metodo_pagamento "
                                        + "join usuario as u "
                                        + "on u.usuario_id = v.vendedor "
                                        + "join promo as promo "
                                        + "on promo.promo_id = v.promo "
                                        + "where v.venda_id = ? and v.venda_id > 0 "
                                        + "order by venda_id, produto_id");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            JRResultSetDataSource resultDs = new JRResultSetDataSource(rs);
            
            jpPrint = JasperFillManager.fillReport("RelatorioVenda.jasper", null, resultDs);
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return jpPrint;
//</editor-fold>
    }
    
    public double getTotalParcialAllVendas() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET VALOR TOTAL PARCIAL DE TODAS AS VENDAS">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        double totalP = 0.0;
        
        try{
            
            stmt = con.prepareStatement("SELECT SUM(subtotal) AS 'total_parcial' FROM venda_produto");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                totalP = rs.getDouble("total_parcial");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return totalP;
//</editor-fold>
    }
    
    public double getTotalDescontoDado() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET VALOR TOTAL DE DESCONTO DADO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        double totalD = 0.0;
        
        try{
            
            stmt = con.prepareStatement("SELECT (SUM(vp.subtotal) * p.valor_desconto) AS 'total_desconto' "
                                        + "FROM venda_produto AS vp "
                                        + "JOIN venda AS v "
                                        + "ON v.venda_id = vp.venda_id "
                                        + "JOIN promo AS p "
                                        + "ON p.promo_id = v.promo");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                totalD = rs.getDouble("total_desconto");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de Vendas: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return totalD;
//</editor-fold>
    }
    
    public double getFaturamentoTotal() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET FATURAMENTO TOTAL">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        double total = 0.0;
        
        try{
            stmt = con.prepareStatement("SELECT (SUM(vp.subtotal) - (sum(vp.subtotal) * p.valor_desconto)) AS 'faturamento' "
                                        + "FROM venda_produto AS vp "
                                        + "JOIN venda AS v "
                                        + "ON v.venda_id = vp.venda_id "
                                        + "JOIN promo AS p "
                                        + "ON p.promo_id = v.promo ");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                total = rs.getDouble("faturamento");
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
    
    
    public double getCustoMercadoriaVendida() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET CMV">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        double cmv = 0.0;
        
        try{
            stmt = con.prepareStatement("SELECT SUM(vp.quantidade * p.preco_compra) AS 'cmv' "
                                        + "FROM venda_produto AS vp "
                                        + "JOIN produto AS p "
                                        + "ON p.produto_id = vp.produto_id");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                cmv = rs.getDouble("cmv");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return cmv;
//</editor-fold>
    }
    
    public double getLucro() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="GET LUCRO">
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        double lucro = 0.0;
        
        try{
            stmt = con.prepareStatement("SELECT ((sum(vp.subtotal) - (sum(vp.subtotal) * pr.valor_desconto)) - sum(vp.quantidade * p.preco_compra)) AS 'lucro' "
                                        + "FROM venda_produto AS vp "
                                        + "JOIN produto AS p "
                                        + "ON p.produto_id = vp.produto_id "
                                        + "JOIN venda AS v "
                                        + "ON v.venda_id = vp.venda_id "
                                        + "JOIN promo AS pr "
                                        + "ON pr.promo_id = v.promo");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                lucro = rs.getDouble("lucro");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao exibir lista de produtos: " + e);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return lucro;
//</editor-fold>
    }
    
}
