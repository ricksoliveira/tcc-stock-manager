package model.bean;

public class Venda_Produto {
    
    // ID
    private int produto_id;
    private int venda_id;
    
    private int quantidade;
    private double preco_unitario;
    private double subtotal;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Venda_Produto() {
    }
    
    public Venda_Produto(int produto_id, int venda_id, int quantidade, double preco_unitario, double subtotal) {
        this.produto_id = produto_id;
        this.venda_id = venda_id;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
        this.subtotal = subtotal;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getProduto_id() {
        return produto_id;
    }
    
    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }
    
    public int getVenda_id() {
        return venda_id;
    }
    
    public void setVenda_id(int venda_id) {
        this.venda_id = venda_id;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getPreco_unitario() {
        return preco_unitario;
    }
    
    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }
    
    public double getSubtotal() {
        return subtotal;
    }
    
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
//</editor-fold>
    
    
    
}
