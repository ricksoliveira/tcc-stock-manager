package model.bean;

public class MetodoPagamento {
    
    // ID
    private int metodo_pagamento_id;
    
    private String nome;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public MetodoPagamento() {
    }
    
    public MetodoPagamento(int metodo_pagamento_id, String nome) {
        this.metodo_pagamento_id = metodo_pagamento_id;
        this.nome = nome;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getMetodo_pagamento_id() {
        return metodo_pagamento_id;
    }
    
    public void setMetodo_pagamento_id(int metodo_pagamento_id) {
        this.metodo_pagamento_id = metodo_pagamento_id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
//</editor-fold>

    @Override
    public String toString() {
        return this.getMetodo_pagamento_id() + "  -  " + this.getNome();
    }
    
}
