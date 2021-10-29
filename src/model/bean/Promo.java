package model.bean;

public class Promo {
    
    // ID
    private int promo_id;
    
    private String nome;
    private double valor_desconto;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Promo() {
    }
    
    public Promo(int promo_id, String nome, double valor_desconto) {
        this.promo_id = promo_id;
        this.nome = nome;
        this.valor_desconto = valor_desconto;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getPromo_id() {
        return promo_id;
    }
    
    public void setPromo_id(int promo_id) {
        this.promo_id = promo_id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getValor_desconto() {
        return valor_desconto;
    }
    
    public void setValor_desconto(double valor_desconto) {
        this.valor_desconto = valor_desconto;
    }
//</editor-fold>

    @Override
    public String toString() {
        return this.getPromo_id() + "  -  " + this.getNome() + "  -  " + this.getValor_desconto();
    }
    
    
    
}
