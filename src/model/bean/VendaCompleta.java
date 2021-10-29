package model.bean;

public class VendaCompleta {
    
    
    private int produto_id;
    private int venda_id;
    private String cod_interno;
    private double preco_unitario;
    private int quantidade;
    private double subtotal;
    private String promo;
    private String metodoPagamento;
    private String vendedor;
    private String data;
    private String descricao;
    private double desconto;

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORS">
    public VendaCompleta() {
    }
    
    public VendaCompleta(int produto_id, int venda_id, String cod_interno, double preco_unitario, int quantidade, double subtotal, String promo, String metodoPagamento, String vendedor, String data, String descricao, double desconto) {
        this.produto_id = produto_id;
        this.venda_id = venda_id;
        this.cod_interno = cod_interno;
        this.preco_unitario = preco_unitario;
        this.quantidade = quantidade;
        this.subtotal = subtotal;
        this.promo = promo;
        this.metodoPagamento = metodoPagamento;
        this.vendedor = vendedor;
        this.data = data;
        this.descricao = descricao;
        this.desconto = desconto;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GETTERS AND SETTERS">
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
    
    public String getCod_interno() {
        return cod_interno;
    }
    
    public void setCod_interno(String cod_interno) {
        this.cod_interno = cod_interno;
    }
    
    public double getPreco_unitario() {
        return preco_unitario;
    }
    
    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getSubtotal() {
        return subtotal;
    }
    
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    public String getPromo() {
        return promo;
    }
    
    public void setPromo(String promo) {
        this.promo = promo;
    }
    
    public String getMetodoPagamento() {
        return metodoPagamento;
    }
    
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    
    public String getVendedor() {
        return vendedor;
    }
    
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
//</editor-fold>

    
      
    
    
}
