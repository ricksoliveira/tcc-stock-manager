/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.produto;

import view.HomeDashboardView;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Produto;
import model.dao.ProdutoDAO;

/**
 *
 * @author h2ose
 */
public class ProdutosExcluidosView extends javax.swing.JFrame {

    /**
     * Creates new form ProdutosView
     */
    public ProdutosExcluidosView() throws SQLException {
        initComponents();
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/bricks.png"));
        this.setIconImage(logo.getImage());
        this.setTitle("Gerenciador de Estoque");
        
        setResizable(false);
        this.readDeletedTable();
    }
    
    public void readDeletedTable() throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) produtoExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.listDeletedProdutos()){
            model.addRow(new Object[]{
                p.getProduto_id(),
                p.getFornecedor(),
                p.getCategoria(),
                p.getCod_interno(),
                p.getDescricao(),
                p.getEspecificacoes(),
                p.getDimensoes(),
                p.getCondicao(),
                p.getPreco_compra(),
                p.getQuantidade(),
                p.getPreco_unitario(),
                p.getData_insercao()
            });
        }
    }
    
    public void readSearchDeletedTableById(int id) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY ID">
        DefaultTableModel model = (DefaultTableModel) produtoExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchDeletedProdutoById(id)){
            model.addRow(new Object[]{
                p.getProduto_id(),
                p.getFornecedor(),
                p.getCategoria(),
                p.getCod_interno(),
                p.getDescricao(),
                p.getEspecificacoes(),
                p.getDimensoes(),
                p.getCondicao(),
                p.getPreco_compra(),
                p.getQuantidade(),
                p.getPreco_unitario(),
                p.getData_insercao()
            });
        }
//</editor-fold>
    }
    
    public void readSearchDeletedTableByCodigoInterno(String nome) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY CODIGO INTERNO">
        DefaultTableModel model = (DefaultTableModel) produtoExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchDeletedProdutoByCodigoInterno(nome)){
            model.addRow(new Object[]{
                p.getProduto_id(),
                p.getFornecedor(),
                p.getCategoria(),
                p.getCod_interno(),
                p.getDescricao(),
                p.getEspecificacoes(),
                p.getDimensoes(),
                p.getCondicao(),
                p.getPreco_compra(),
                p.getQuantidade(),
                p.getPreco_unitario(),
                p.getData_insercao()
            });
        }
//</editor-fold>
    }
    
    public void readSearchDeletedTableByDescricao(String nome) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY DESCRICAO">
        DefaultTableModel model = (DefaultTableModel) produtoExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchDeletedProdutoByDescricao(nome)){
            model.addRow(new Object[]{
                p.getProduto_id(),
                p.getFornecedor(),
                p.getCategoria(),
                p.getCod_interno(),
                p.getDescricao(),
                p.getEspecificacoes(),
                p.getDimensoes(),
                p.getCondicao(),
                p.getPreco_compra(),
                p.getQuantidade(),
                p.getPreco_unitario(),
                p.getData_insercao()
            });
        }
//</editor-fold>
    }
    
    public void readSearchDeletedTableByEspecificacoes(String nome) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY ESPECIFICAÇÕES">
        DefaultTableModel model = (DefaultTableModel) produtoExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchDeletedProdutoByEspecificacoes(nome)){
            model.addRow(new Object[]{
                p.getProduto_id(),
                p.getFornecedor(),
                p.getCategoria(),
                p.getCod_interno(),
                p.getDescricao(),
                p.getEspecificacoes(),
                p.getDimensoes(),
                p.getCondicao(),
                p.getPreco_compra(),
                p.getQuantidade(),
                p.getPreco_unitario(),
                p.getData_insercao()
            });
        }
//</editor-fold>
    }
    
    public void readSearchDeletedTableByDimensoes(String nome) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY DIMENSOES">
        DefaultTableModel model = (DefaultTableModel) produtoExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchDeletedProdutoByDimensoes(nome)){
            model.addRow(new Object[]{
                p.getProduto_id(),
                p.getFornecedor(),
                p.getCategoria(),
                p.getCod_interno(),
                p.getDescricao(),
                p.getEspecificacoes(),
                p.getDimensoes(),
                p.getCondicao(),
                p.getPreco_compra(),
                p.getQuantidade(),
                p.getPreco_unitario(),
                p.getData_insercao()
            });
        }
//</editor-fold>
    }
    
    public void readSearchDeletedTableByQuantidade(int qtde) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY QUANTIDADE">
        DefaultTableModel model = (DefaultTableModel) produtoExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchDeletedProdutoByQuantidade(qtde)){
            model.addRow(new Object[]{
                p.getProduto_id(),
                p.getFornecedor(),
                p.getCategoria(),
                p.getCod_interno(),
                p.getDescricao(),
                p.getEspecificacoes(),
                p.getDimensoes(),
                p.getCondicao(),
                p.getPreco_compra(),
                p.getQuantidade(),
                p.getPreco_unitario(),
                p.getData_insercao()
            });
        }
//</editor-fold>
    }
    
    public void readSearchDeletedTableByCondicao(String nome) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY CONDICAO">
        DefaultTableModel model = (DefaultTableModel) produtoExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchDeletedProdutoByCondicao(nome)){
            model.addRow(new Object[]{
                p.getProduto_id(),
                p.getFornecedor(),
                p.getCategoria(),
                p.getCod_interno(),
                p.getDescricao(),
                p.getEspecificacoes(),
                p.getDimensoes(),
                p.getCondicao(),
                p.getPreco_compra(),
                p.getQuantidade(),
                p.getPreco_unitario(),
                p.getData_insercao()
            });
        }
//</editor-fold>
    }
    
    public void readSearchDeletedTableByDataInsercao(String nome) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY DATA DE INSERÇÃO">
        DefaultTableModel model = (DefaultTableModel) produtoExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchDeletedProdutoByDataInsercao(nome)){
            model.addRow(new Object[]{
                p.getProduto_id(),
                p.getFornecedor(),
                p.getCategoria(),
                p.getCod_interno(),
                p.getDescricao(),
                p.getEspecificacoes(),
                p.getDimensoes(),
                p.getCondicao(),
                p.getPreco_compra(),
                p.getQuantidade(),
                p.getPreco_unitario(),
                p.getData_insercao()
            });
        }
//</editor-fold>
    }
    
    public void readSearchDeletedTableByPrecoUnitario(double preco) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY PREÇO UNITARIO">
        DefaultTableModel model = (DefaultTableModel) produtoExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchDeletedProdutoByPrecoUnitario(preco)){
            model.addRow(new Object[]{
                p.getProduto_id(),
                p.getFornecedor(),
                p.getCategoria(),
                p.getCod_interno(),
                p.getDescricao(),
                p.getEspecificacoes(),
                p.getDimensoes(),
                p.getCondicao(),
                p.getPreco_compra(),
                p.getQuantidade(),
                p.getPreco_unitario(),
                p.getData_insercao()
            });
        }
//</editor-fold>
    }
    
    public void readSearchDeletedTableByPrecoCompra(double preco) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY PREÇO DE COMPRA">
        DefaultTableModel model = (DefaultTableModel) produtoExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchDeletedProdutoByPrecoCompra(preco)){
            model.addRow(new Object[]{
                p.getProduto_id(),
                p.getFornecedor(),
                p.getCategoria(),
                p.getCod_interno(),
                p.getDescricao(),
                p.getEspecificacoes(),
                p.getDimensoes(),
                p.getCondicao(),
                p.getPreco_compra(),
                p.getQuantidade(),
                p.getPreco_unitario(),
                p.getData_insercao()
            });
        }
//</editor-fold>
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonToHome = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtoExcluidoTable = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigoSelecionadoTxt = new javax.swing.JLabel();
        descricaoSelecionadoTxt = new javax.swing.JLabel();
        condicaoSelecionadoTxt = new javax.swing.JLabel();
        buttonDeletar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precoSelecionadoTxt = new javax.swing.JLabel();
        quantidadeSelecionadoTxt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbAtributos = new javax.swing.JComboBox<>();
        searchFieldTxt = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(180, 205, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.add(jSeparator2);

        buttonToHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        buttonToHome.setText("Início");
        buttonToHome.setFocusable(false);
        buttonToHome.setMargin(new java.awt.Insets(3, 14, 3, 14));
        buttonToHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonToHomeActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonToHome);
        jToolBar1.add(jSeparator1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow_left.png"))); // NOI18N
        jButton1.setText("Voltar para Produtos");
        jButton1.setFocusable(false);
        jButton1.setMargin(new java.awt.Insets(3, 14, 3, 14));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        produtoExcluidoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fornecedor", "Categoria", "Código Interno", "Descrição", "Especificações", "Dimensões", "Condição", "Preço Compra", "Qntde", "Preço Unitário", "Data Inserção"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtoExcluidoTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        produtoExcluidoTable.setShowGrid(false);
        produtoExcluidoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtoExcluidoTableMouseClicked(evt);
            }
        });
        produtoExcluidoTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                produtoExcluidoTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                produtoExcluidoTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(produtoExcluidoTable);
        if (produtoExcluidoTable.getColumnModel().getColumnCount() > 0) {
            produtoExcluidoTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            produtoExcluidoTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            produtoExcluidoTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            produtoExcluidoTable.getColumnModel().getColumn(8).setPreferredWidth(50);
            produtoExcluidoTable.getColumnModel().getColumn(9).setPreferredWidth(20);
            produtoExcluidoTable.getColumnModel().getColumn(10).setPreferredWidth(50);
        }

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("PRODUTOS EXCLUÍDOS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("PRODUTO SELECIONADO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Código Interno:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Descrição:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Condição:");

        codigoSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N

        descricaoSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N

        condicaoSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N

        buttonDeletar.setBackground(new java.awt.Color(255, 87, 0));
        buttonDeletar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/database_refresh.png"))); // NOI18N
        buttonDeletar.setText("RESTAURAR");
        buttonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Preço Unitário:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Quantidade:");

        precoSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N

        quantidadeSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(condicaoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(639, 639, 639))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricaoSelecionadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                            .addComponent(codigoSelecionadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantidadeSelecionadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(precoSelecionadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(214, 214, 214)
                        .addComponent(buttonDeletar)
                        .addGap(38, 38, 38))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(codigoSelecionadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(precoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(descricaoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(quantidadeSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(condicaoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(180, 205, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Buscar por");

        cbAtributos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ID", "Fornecedor", "Categoria", "Código Interno", "Descrição", "Especificações", "Dimensões", "Condição", "Preço de Compra", "Quantidade", "Preço Unitário", "Data de Inserção" }));
        cbAtributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAtributosActionPerformed(evt);
            }
        });

        searchFieldTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldTxtKeyPressed(evt);
            }
        });

        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        buttonSearch.setText("Buscar");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        buttonSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonSearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAtributos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSearch)
                .addGap(257, 257, 257))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonToHomeActionPerformed
        try {
            HomeDashboardView homeView = new HomeDashboardView();
            homeView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonToHomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ProdutosView produtosView = new ProdutosView();
            produtosView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void produtoExcluidoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtoExcluidoTableMouseClicked
        if(produtoExcluidoTable.getSelectedRow() != -1){
            codigoSelecionadoTxt.setText(produtoExcluidoTable.getValueAt(produtoExcluidoTable.getSelectedRow(), 3).toString());
            descricaoSelecionadoTxt.setText(produtoExcluidoTable.getValueAt(produtoExcluidoTable.getSelectedRow(), 4).toString());
            quantidadeSelecionadoTxt.setText(produtoExcluidoTable.getValueAt(produtoExcluidoTable.getSelectedRow(), 7).toString());
            condicaoSelecionadoTxt.setText(produtoExcluidoTable.getValueAt(produtoExcluidoTable.getSelectedRow(), 8).toString());
            precoSelecionadoTxt.setText(produtoExcluidoTable.getValueAt(produtoExcluidoTable.getSelectedRow(), 9).toString());
        }
    }//GEN-LAST:event_produtoExcluidoTableMouseClicked

    private void produtoExcluidoTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtoExcluidoTableKeyReleased
        if(produtoExcluidoTable.getSelectedRow() != -1){
            codigoSelecionadoTxt.setText(produtoExcluidoTable.getValueAt(produtoExcluidoTable.getSelectedRow(), 3).toString());
            descricaoSelecionadoTxt.setText(produtoExcluidoTable.getValueAt(produtoExcluidoTable.getSelectedRow(), 4).toString());
            quantidadeSelecionadoTxt.setText(produtoExcluidoTable.getValueAt(produtoExcluidoTable.getSelectedRow(), 7).toString());
            condicaoSelecionadoTxt.setText(produtoExcluidoTable.getValueAt(produtoExcluidoTable.getSelectedRow(), 8).toString());
            precoSelecionadoTxt.setText(produtoExcluidoTable.getValueAt(produtoExcluidoTable.getSelectedRow(), 9).toString());
        }
    }//GEN-LAST:event_produtoExcluidoTableKeyReleased

    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed

        if(produtoExcluidoTable.getSelectedRow() != -1){
            
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja restaurar este produto?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                try {
                    Produto produto = new Produto();
                    ProdutoDAO produtoDAO = new ProdutoDAO();

                    produto.setProduto_id((int) produtoExcluidoTable.getValueAt(produtoExcluidoTable.getSelectedRow(), 0));
                    produtoDAO.restoreProduto(produto);

                    this.readDeletedTable();

                } catch (SQLException ex) {
                    Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro sem produto selecionado!\nPor favor selecione um produto para excluir.");
        }

    }//GEN-LAST:event_buttonDeletarActionPerformed

    private void cbAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAtributosActionPerformed

    }//GEN-LAST:event_cbAtributosActionPerformed

    private void searchFieldTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldTxtKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(cbAtributos.getSelectedItem().equals(" ")){
                JOptionPane.showMessageDialog(null, "Erro! Por favor selecione um campo para pesquisar.");
            }
            else{
                if(cbAtributos.getSelectedItem().equals("ID")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchDeletedTableById(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Código Interno")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchDeletedTableByCodigoInterno(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Descrição")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchDeletedTableByDescricao(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Especificações")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchDeletedTableByEspecificacoes(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Dimensões")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchDeletedTableByDimensoes(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Quantidade")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchDeletedTableByQuantidade(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Condição")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchDeletedTableByCondicao(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Preço Unitário")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchDeletedTableByPrecoUnitario(Double.parseDouble(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Data de Inserção")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchDeletedTableByDataInsercao(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Preço de Compra")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchDeletedTableByPrecoCompra(Double.parseDouble(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                
            }
        }
    }//GEN-LAST:event_searchFieldTxtKeyPressed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed

        if(cbAtributos.getSelectedItem().equals(" ")){
            JOptionPane.showMessageDialog(null, "Erro! Por favor selecione um campo para pesquisar.");
        }
        else{
            if(cbAtributos.getSelectedItem().equals("ID")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchDeletedTableById(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Código Interno")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchDeletedTableByCodigoInterno(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Descrição")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchDeletedTableByDescricao(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Especificações")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchDeletedTableByEspecificacoes(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Dimensões")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchDeletedTableByDimensoes(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Quantidade")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchDeletedTableByQuantidade(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Condição")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchDeletedTableByCondicao(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Preço Unitário")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchDeletedTableByPrecoUnitario(Double.parseDouble(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Data de Inserção")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchDeletedTableByDataInsercao(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Preço de Compra")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchDeletedTableByPrecoCompra(Double.parseDouble(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonSearchKeyPressed

    }//GEN-LAST:event_buttonSearchKeyPressed

    private void produtoExcluidoTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtoExcluidoTableKeyPressed
        
    }//GEN-LAST:event_produtoExcluidoTableKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdutosExcluidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutosExcluidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutosExcluidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutosExcluidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProdutosExcluidosView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonToHome;
    private javax.swing.JComboBox<Object> cbAtributos;
    private javax.swing.JLabel codigoSelecionadoTxt;
    private javax.swing.JLabel condicaoSelecionadoTxt;
    private javax.swing.JLabel descricaoSelecionadoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel precoSelecionadoTxt;
    private javax.swing.JTable produtoExcluidoTable;
    private javax.swing.JLabel quantidadeSelecionadoTxt;
    private javax.swing.JTextField searchFieldTxt;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
