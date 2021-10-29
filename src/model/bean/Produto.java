package model.bean;

public class Produto {
    
    // ID
    private int produto_id;
    
    // FK
    private int fornecedor;
    private int categoria;
    
    private String cod_interno;
    private String descricao;
    private String especificacoes;
    private String dimensoes;
    private int quantidade;
    private String condicao;
    private double preco_compra;
    private double preco_unitario;
    private String data_insercao;
    private String status;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Produto() {
    }
    
    public Produto(int produto_id, int fornecedor, int categoria, String cod_interno, String descricao, String especificacoes, String dimensoes, int quantidade, String condicao, double preco_compra, double preco_unitario, String data_insercao, String status) {
        this.produto_id = produto_id;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
        this.cod_interno = cod_interno;
        this.descricao = descricao;
        this.especificacoes = especificacoes;
        this.dimensoes = dimensoes;
        this.quantidade = quantidade;
        this.condicao = condicao;
        this.preco_compra = preco_compra;
        this.preco_unitario = preco_unitario;
        this.data_insercao = data_insercao;
        this.status = status;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getProduto_id() {
        return produto_id;
    }
    
    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }
    
    public int getFornecedor() {
        return fornecedor;
    }
    
    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public int getCategoria() {
        return categoria;
    }
    
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    public String getCod_interno() {
        return cod_interno;
    }
    
    public void setCod_interno(String cod_interno) {
        this.cod_interno = cod_interno;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getEspecificacoes() {
        return especificacoes;
    }
    
    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }
    
    public String getDimensoes() {
        return dimensoes;
    }
    
    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getCondicao() {
        return condicao;
    }
    
    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
    public double getPreco_unitario() {
        return preco_unitario;
    }
    
    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }
    
    public String getData_insercao() {
        return data_insercao;
    }
    
    public void setData_insercao(String data_insercao) {
        this.data_insercao = data_insercao;
    }
    
    public double getPreco_compra() {
        return preco_compra;
    }

    public void setPreco_compra(double preco_compra) {
        this.preco_compra = preco_compra;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
//</editor-fold>

    
    
}
