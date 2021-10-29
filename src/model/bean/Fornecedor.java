package model.bean;

public class Fornecedor {
    
    // ID
    private int fornecedor_id;
    
    private String nome_fantasia;
    private String razao_social;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String cpf;
    private String cnpj;
    private String email;
    private String telefone_1;
    private String telefone_2;
    private String insc_municipal;
    private String insc_estadual;

    
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Fornecedor() {
    }
    
    public Fornecedor(int fornecedor_id, String nome_fantasia, String razao_social, String endereco, String numero, String complemento, String bairro, String cidade, String estado, String cep, String cpf, String cnpj, String email, String telefone_1, String telefone_2, String insc_municipal, String insc_estadual) {
        this.fornecedor_id = fornecedor_id;
        this.nome_fantasia = nome_fantasia;
        this.razao_social = razao_social;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone_1 = telefone_1;
        this.telefone_2 = telefone_2;
        this.insc_municipal = insc_municipal;
        this.insc_estadual = insc_estadual;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getFornecedor_id() {
        return fornecedor_id;
    }
    
    public void setFornecedor_id(int fornecedor_id) {
        this.fornecedor_id = fornecedor_id;
    }
    
    public String getNome_fantasia() {
        return nome_fantasia;
    }
    
    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }
    
    public String getRazao_social() {
        return razao_social;
    }
    
    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getComplemento() {
        return complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
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
    
    public String getCep() {
        return cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefone_1() {
        return telefone_1;
    }
    
    public void setTelefone_1(String telefone_1) {
        this.telefone_1 = telefone_1;
    }
    
    public String getTelefone_2() {
        return telefone_2;
    }
    
    public void setTelefone_2(String telefone_2) {
        this.telefone_2 = telefone_2;
    }
    
    public String getInsc_municipal() {
        return insc_municipal;
    }
    
    public void setInsc_municipal(String insc_municipal) {
        this.insc_municipal = insc_municipal;
    }
    
    public String getInsc_estadual() {
        return insc_estadual;
    }
    
    public void setInsc_estadual(String insc_estadual) {
        this.insc_estadual = insc_estadual;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
//</editor-fold>

    @Override
    public String toString() {
        return this.getFornecedor_id() + " - " + this.getNome_fantasia();
    }

    
}
