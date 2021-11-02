/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.produto;

import view.HomeDashboardView;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.bean.Produto;
import model.dao.ProdutoDAO;

/**
 *
 * @author h2ose
 */
public class ProdutosView extends javax.swing.JFrame {

    /**
     * Creates new form ProdutosView
     */
    public ProdutosView() throws SQLException {
        initComponents();
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/bricks.png"));
        this.setIconImage(logo.getImage());
        this.setTitle("Gerenciador de Estoque");
        
        setResizable(false);
        this.readTable();
    }
    
    public void readTable() throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.listAllProdutos()){
            
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            } catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readSearchTableById(int id) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY ID">
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchProdutoById(id)){
            
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readSearchTableByFornecedor(int id) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY FORNECEDOR">
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchProdutoByFornecedor(id)){
            
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readSearchTableByCategoria(int id) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY FORNECEDOR">
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchProdutoByCategoria(id)){
            
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readSearchTableByCodigoInterno(String nome) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY CODIGO INTERNO">
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchProdutoByCodigoInterno(nome)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readSearchTableByDescricao(String nome) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY DESCRICAO">
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchProdutoByDescricao(nome)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readSearchTableByEspecificacoes(String nome) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY ESPECIFICAÇÕES">
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchProdutoByEspecificacoes(nome)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readSearchTableByDimensoes(String nome) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY DIMENSOES">
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchProdutoByDimensoes(nome)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readSearchTableByQuantidade(int qtde) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY QUANTIDADE">
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchProdutoByQuantidade(qtde)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readSearchTableByCondicao(String nome) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY CONDICAO">
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchProdutoByCondicao(nome)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readSearchTableByDataInsercao(String nome) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY DATA DE INSERÇÃO">
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchProdutoByDataInsercao(nome)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readSearchTableByPrecoUnitario(double preco) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY PREÇO UNITARIO">
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchProdutoByPrecoUnitario(preco)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readSearchTableByPrecoCompra(double preco) throws SQLException{       
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY PREÇO DE COMPRA">
        DefaultTableModel model = (DefaultTableModel) produtoTable.getModel();
        
        model.setNumRows(0);
        
        ProdutoDAO DAO = new ProdutoDAO();
        
        for(Produto p : DAO.searchProdutoByPrecoCompra(preco)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_insercao());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
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
                    dateToShow
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        jSeparator3 = new javax.swing.JToolBar.Separator();
        buttonToUsuariosExcluidos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtoTable = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonEditar = new javax.swing.JButton();
        buttonDeletar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        descricaoSelecionadoTxt = new javax.swing.JTextField();
        codigoSelecionadoTxt = new javax.swing.JTextField();
        condicaoSelecionadoTxt = new javax.swing.JTextField();
        precoSelecionadoTxt = new javax.swing.JTextField();
        quantidadeSelecionadoTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        precoCompraSelecionadoTxt = new javax.swing.JTextField();
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brick_add.png"))); // NOI18N
        jButton1.setText("Novo Produto");
        jButton1.setFocusable(false);
        jButton1.setMargin(new java.awt.Insets(3, 14, 3, 14));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator3);

        buttonToUsuariosExcluidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brick_delete.png"))); // NOI18N
        buttonToUsuariosExcluidos.setText("Produtos Excluídos");
        buttonToUsuariosExcluidos.setFocusable(false);
        buttonToUsuariosExcluidos.setMargin(new java.awt.Insets(3, 14, 3, 14));
        buttonToUsuariosExcluidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonToUsuariosExcluidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonToUsuariosExcluidosActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonToUsuariosExcluidos);

        produtoTable.setModel(new javax.swing.table.DefaultTableModel(
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
        produtoTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        produtoTable.setShowGrid(false);
        produtoTable.setShowVerticalLines(false);
        produtoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtoTableMouseClicked(evt);
            }
        });
        produtoTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                produtoTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                produtoTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(produtoTable);
        if (produtoTable.getColumnModel().getColumnCount() > 0) {
            produtoTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            produtoTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            produtoTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            produtoTable.getColumnModel().getColumn(8).setPreferredWidth(50);
            produtoTable.getColumnModel().getColumn(9).setPreferredWidth(20);
            produtoTable.getColumnModel().getColumn(10).setPreferredWidth(50);
        }

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("PRODUTOS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("PRODUTO SELECIONADO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Código Interno:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Descrição:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Condição:");

        buttonEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brick_edit.png"))); // NOI18N
        buttonEditar.setText("EDITAR");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonDeletar.setBackground(new java.awt.Color(255, 87, 0));
        buttonDeletar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exclamation.png"))); // NOI18N
        buttonDeletar.setText("EXCLUIR");
        buttonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Preço Unitário:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Quantidade:");

        descricaoSelecionadoTxt.setEditable(false);
        descricaoSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        descricaoSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descricaoSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        descricaoSelecionadoTxt.setFocusable(false);
        descricaoSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoSelecionadoTxtActionPerformed(evt);
            }
        });

        codigoSelecionadoTxt.setEditable(false);
        codigoSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        codigoSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codigoSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        codigoSelecionadoTxt.setFocusable(false);
        codigoSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoSelecionadoTxtActionPerformed(evt);
            }
        });

        condicaoSelecionadoTxt.setEditable(false);
        condicaoSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        condicaoSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        condicaoSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        condicaoSelecionadoTxt.setFocusable(false);
        condicaoSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condicaoSelecionadoTxtActionPerformed(evt);
            }
        });

        precoSelecionadoTxt.setEditable(false);
        precoSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        precoSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        precoSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precoSelecionadoTxt.setFocusable(false);
        precoSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoSelecionadoTxtActionPerformed(evt);
            }
        });

        quantidadeSelecionadoTxt.setEditable(false);
        quantidadeSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        quantidadeSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quantidadeSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantidadeSelecionadoTxt.setFocusable(false);
        quantidadeSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeSelecionadoTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Preço de Compra:");

        precoCompraSelecionadoTxt.setEditable(false);
        precoCompraSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        precoCompraSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        precoCompraSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precoCompraSelecionadoTxt.setFocusable(false);
        precoCompraSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoCompraSelecionadoTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(condicaoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(precoCompraSelecionadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(quantidadeSelecionadoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precoSelecionadoTxt, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(107, 107, 107)
                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(buttonDeletar)
                .addGap(38, 38, 38))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(precoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(codigoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantidadeSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(precoCompraSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(condicaoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
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
                .addComponent(cbAtributos, 0, 224, Short.MAX_VALUE)
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
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1296, Short.MAX_VALUE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonToHomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            NovoProdutoView novoProdutoView = new NovoProdutoView();
            novoProdutoView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonToUsuariosExcluidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonToUsuariosExcluidosActionPerformed
        try {
            ProdutosExcluidosView produtosExcluidosView = new ProdutosExcluidosView();
            produtosExcluidosView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonToUsuariosExcluidosActionPerformed

    private void produtoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtoTableMouseClicked
        if(produtoTable.getSelectedRow() != -1){
            codigoSelecionadoTxt.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 3).toString());
            descricaoSelecionadoTxt.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 4).toString());
            condicaoSelecionadoTxt.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 7).toString());
            quantidadeSelecionadoTxt.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 9).toString());
            precoSelecionadoTxt.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 10).toString());
            precoCompraSelecionadoTxt.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 8).toString());
        }
    }//GEN-LAST:event_produtoTableMouseClicked

    private void produtoTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtoTableKeyReleased
        if(produtoTable.getSelectedRow() != -1){
            codigoSelecionadoTxt.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 3).toString());
            descricaoSelecionadoTxt.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 4).toString());
            condicaoSelecionadoTxt.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 7).toString());
            quantidadeSelecionadoTxt.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 9).toString());
            precoSelecionadoTxt.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 10).toString());
            precoCompraSelecionadoTxt.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 8).toString());
        }
    }//GEN-LAST:event_produtoTableKeyReleased

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed

        try {
            Produto produto = new Produto();
            
            produto.setProduto_id((int) produtoTable.getValueAt(produtoTable.getSelectedRow(), 0));
            produto.setFornecedor((int) produtoTable.getValueAt(produtoTable.getSelectedRow(), 1));
            produto.setCategoria((int) produtoTable.getValueAt(produtoTable.getSelectedRow(), 2));
            produto.setCod_interno(produtoTable.getValueAt(produtoTable.getSelectedRow(), 3).toString());
            produto.setDescricao(produtoTable.getValueAt(produtoTable.getSelectedRow(), 4).toString());
            produto.setEspecificacoes(produtoTable.getValueAt(produtoTable.getSelectedRow(), 5).toString());
            produto.setCondicao(produtoTable.getValueAt(produtoTable.getSelectedRow(), 7).toString());
            produto.setPreco_compra((double) produtoTable.getValueAt(produtoTable.getSelectedRow(), 8));
            produto.setQuantidade((int) produtoTable.getValueAt(produtoTable.getSelectedRow(), 9));
            produto.setPreco_unitario((double) produtoTable.getValueAt(produtoTable.getSelectedRow(), 10));
            produto.setData_insercao(produtoTable.getValueAt(produtoTable.getSelectedRow(), 11).toString());
            
            
            if(produtoTable.getValueAt(produtoTable.getSelectedRow(), 6) == null){
                produto.setDimensoes("");
            }
            else{
                produto.setDimensoes(produtoTable.getValueAt(produtoTable.getSelectedRow(), 6).toString());
            }
            
            EditarProdutoView editarprodutoView = new EditarProdutoView(produto);
            editarprodutoView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed

        if(produtoTable.getSelectedRow() != -1){
            
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este produto?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                try {
                    Produto produto = new Produto();
                    ProdutoDAO produtoDAO = new ProdutoDAO();

                    produto.setProduto_id((int) produtoTable.getValueAt(produtoTable.getSelectedRow(), 0));
                    produtoDAO.deleteProduto(produto);

                    this.readTable();

                } catch (SQLException ex) {
                    Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
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
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableById(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Fornecedor")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByFornecedor(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Categoria")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByCategoria(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Código Interno")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByCodigoInterno(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Descrição")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByDescricao(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Especificações")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByEspecificacoes(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Dimensões")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByDimensoes(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Quantidade")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByQuantidade(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Condição")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByCondicao(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Preço Unitário")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByPrecoUnitario(Double.parseDouble(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Data de Inserção")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByDataInsercao(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Preço de Compra")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByPrecoCompra(Double.parseDouble(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
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
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableById(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Fornecedor")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByFornecedor(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Categoria")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByCategoria(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Código Interno")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByCodigoInterno(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Descrição")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByDescricao(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Especificações")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByEspecificacoes(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Dimensões")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByDimensoes(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Quantidade")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByQuantidade(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Condição")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByCondicao(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Preço Unitário")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByPrecoUnitario(Double.parseDouble(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Data de Inserção")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByDataInsercao(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Preço de Compra")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByPrecoCompra(Double.parseDouble(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonSearchKeyPressed

    }//GEN-LAST:event_buttonSearchKeyPressed

    private void produtoTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtoTableKeyPressed
        
    }//GEN-LAST:event_produtoTableKeyPressed

    private void descricaoSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoSelecionadoTxtActionPerformed

    private void codigoSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoSelecionadoTxtActionPerformed

    private void condicaoSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condicaoSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_condicaoSelecionadoTxtActionPerformed

    private void precoSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoSelecionadoTxtActionPerformed

    private void quantidadeSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeSelecionadoTxtActionPerformed

    private void precoCompraSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoCompraSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoCompraSelecionadoTxtActionPerformed

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
            java.util.logging.Logger.getLogger(ProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProdutosView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutosView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonToHome;
    private javax.swing.JButton buttonToUsuariosExcluidos;
    private javax.swing.JComboBox<Object> cbAtributos;
    private javax.swing.JTextField codigoSelecionadoTxt;
    private javax.swing.JTextField condicaoSelecionadoTxt;
    private javax.swing.JTextField descricaoSelecionadoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField precoCompraSelecionadoTxt;
    private javax.swing.JTextField precoSelecionadoTxt;
    private javax.swing.JTable produtoTable;
    private javax.swing.JTextField quantidadeSelecionadoTxt;
    private javax.swing.JTextField searchFieldTxt;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
