package model.bean;

public class Categoria {
    
    // ID
    private int categoria_id;
    
    private String nome;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Categoria() {
    }
    
    public Categoria(int categoria_id, String nome) {
        this.categoria_id = categoria_id;
        this.nome = nome;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getCategoria_id() {
        return categoria_id;
    }
    
    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
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
        return this.getCategoria_id() + " - " + this.getNome();
    }
    
     
}
