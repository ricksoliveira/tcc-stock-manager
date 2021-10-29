package model.bean;

public class Financa {
    
    
    // ID
    private int mes;
    private int ano;
    
    private double faturamento_bruto;
    private double descontos;
    private double faturamento_liquido;
    private double cmv;
    private double lucro;
    private double margem_lucro;
    private double custo_total_estoque;
    private int quantidade_estoque;
    private int numero_categorias;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Financa() {
    }
    
    public Financa(int mes, int ano, double faturamento_bruto, double descontos, double faturamento_liquido, double cmv, double lucro, double margem_lucro, double custo_total_estoque, int quantidade_estoque, int numero_categorias) {
        this.mes = mes;
        this.ano = ano;
        this.faturamento_bruto = faturamento_bruto;
        this.descontos = descontos;
        this.faturamento_liquido = faturamento_liquido;
        this.cmv = cmv;
        this.lucro = lucro;
        this.margem_lucro = margem_lucro;
        this.custo_total_estoque = custo_total_estoque;
        this.quantidade_estoque = quantidade_estoque;
        this.numero_categorias = numero_categorias;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getMes() {
        return mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public double getFaturamento_bruto() {
        return faturamento_bruto;
    }
    
    public void setFaturamento_bruto(double faturamento_bruto) {
        this.faturamento_bruto = faturamento_bruto;
    }
    
    public double getDescontos() {
        return descontos;
    }
    
    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }
    
    public double getFaturamento_liquido() {
        return faturamento_liquido;
    }
    
    public void setFaturamento_liquido(double faturamento_liquido) {
        this.faturamento_liquido = faturamento_liquido;
    }
    
    public double getCmv() {
        return cmv;
    }
    
    public void setCmv(double cmv) {
        this.cmv = cmv;
    }
    
    public double getLucro() {
        return lucro;
    }
    
    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
    
    public double getMargem_lucro() {
        return margem_lucro;
    }
    
    public void setMargem_lucro(double margem_lucro) {
        this.margem_lucro = margem_lucro;
    }
    
    public double getCusto_total_estoque() {
        return custo_total_estoque;
    }
    
    public void setCusto_total_estoque(double custo_total_estoque) {
        this.custo_total_estoque = custo_total_estoque;
    }
    
    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }
    
    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }
    
    public int getNumero_categorias() {
        return numero_categorias;
    }
    
    public void setNumero_categorias(int numero_categorias) {
        this.numero_categorias = numero_categorias;
    }
//</editor-fold>
    
    
    
}
