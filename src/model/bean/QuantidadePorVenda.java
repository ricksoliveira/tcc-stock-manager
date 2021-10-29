package model.bean;

public class QuantidadePorVenda {
    
    private int produto_id;
    private int quantidade;

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORS">
    public QuantidadePorVenda() {
    }
    
    public QuantidadePorVenda(int produto_id, int quantidade) {
        this.produto_id = produto_id;
        this.quantidade = quantidade;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GETTERS AND SETTERS">
    public int getProduto_id() {
        return produto_id;
    }
    
    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "produto id: " + this.getProduto_id() + " - " + "quantidade: " + this.getQuantidade() + "\n";
    }
    
    
}
