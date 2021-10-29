package model.bean;

public class Venda {
    
    // ID
    private int venda_id;
    
    // FK
    private int promo;
    private int metodo_pagamento;
    private int vendedor;

    private String data;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Venda() {
    }
    
    public Venda(int venda_id, int promo, int metodo_pagamento, int vendedor, String data) {
        this.venda_id = venda_id;
        this.promo = promo;
        this.metodo_pagamento = metodo_pagamento;
        this.vendedor = vendedor;
        this.data = data;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getVenda_id() {
        return venda_id;
    }
    
    public void setVenda_id(int venda_id) {
        this.venda_id = venda_id;
    }
    
    public int getPromo() {
        return promo;
    }
    
    public void setPromo(int promo) {
        this.promo = promo;
    }
    
    public int getMetodo_pagamento() {
        return metodo_pagamento;
    }
    
    public void setMetodo_pagamento(int metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }
    
    public int getVendedor() {
        return vendedor;
    }
    
    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
//</editor-fold>

    
    
}
