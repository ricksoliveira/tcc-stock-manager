package model.bean;

public class Usuario {
    
    // ID
    private int usuario_id;
    
    private String nome;
    private String sobrenome;
    private String data_nascimento;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Usuario(int usuario_id, String nome, String sobrenome, String data_nascimento, String cpf, String email, String telefone, String endereco, String bairro, String cidade, String estado, String cep) {
        this.usuario_id = usuario_id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    
    public Usuario() {
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getUsuario_id() {
        return usuario_id;
    }
    
    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getData_nascimento() {
        return data_nascimento;
    }
    
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getBairro() {
        return bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getCep() {
        return cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
//</editor-fold>

    @Override
    public String toString() {
        return this.getUsuario_id() + "  -  " + this.getNome() + " " + this.getSobrenome();
    }
    
    
    
}
