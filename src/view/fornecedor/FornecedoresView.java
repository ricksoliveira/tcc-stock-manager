/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.fornecedor;

import view.HomeDashboardView;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Fornecedor;
import model.dao.FornecedorDAO;

/**
 *
 * @author h2ose
 */
public class FornecedoresView extends javax.swing.JFrame {

    /**
     * Creates new form TestDBView
     */
    public FornecedoresView() throws SQLException {
        initComponents();
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/bricks.png"));
        this.setIconImage(logo.getImage());
        this.setTitle("Gerenciador de Estoque");
        
        setResizable(false);
        this.readTable();
    }
    
    public void readTable() throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.listAllFornecedors()){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
    }
    
    public void readSearchTableByNomeFantasia(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY NOME FANTASIA">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByNomeFantasia(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableById(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY ID">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorById(id)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByRazaoSocial(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY RAZAO SOCIAL">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByRazaoSocial(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByEndereco(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY ENDERECO">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByEndereco(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByNumero(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY NUMERO">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByNumero(id)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByComplemento(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY COMPLEMENTO">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByComplemento(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByBairro(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY BAIRRO">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByBairro(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByCidade(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY CIDADE">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByCidade(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByEstado(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY ESTADO">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByEstado(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByCep(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY CEP">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByCep(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByCpf(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY CPF">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByCpf(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByCnpj(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY CNPJ">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByCnpj(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByEmail(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY EMAIL">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByEmail(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByTelefone1(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY TELEFONE 1">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByTelefone1(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByTelefone2(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY TELEFONE 2">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByTelefone2(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByInscMunicipal(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY INSC MUNICIPAL">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByInscMunicipal(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
            });
        }
//</editor-fold>
    }
    
    public void readSearchTableByInscEstadual(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY INSC ESTADUAL">
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchFornecedorByInscEstadual(name)){
            model.addRow(new Object[]{
                p.getFornecedor_id(),
                p.getNome_fantasia(),
                p.getRazao_social(),
                p.getEndereco(),
                p.getNumero(),
                p.getComplemento(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getCpf(),
                p.getCnpj(),
                p.getEmail(),
                p.getTelefone_1(),
                p.getTelefone_2(),
                p.getInsc_municipal(),
                p.getInsc_estadual()
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fornecedorTable = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonToHome = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        buttonNovoFornecedor = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        buttonFornecedoresExcluidos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeSelecionadoTxt = new javax.swing.JTextField();
        emailSelecionadoTxt = new javax.swing.JTextField();
        telefone1SelecionadoTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        enderecoSelecionadoTxt = new javax.swing.JTextField();
        cidadeSelecionadoTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        estadoSelecionadoTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbAtributos = new javax.swing.JComboBox<>();
        searchFieldTxt = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1596, 706));

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("FORNECEDORES");

        fornecedorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Fantasia", "Raz??o Social", "Endere??o", "N??mero", "Complemento", "Bairro", "Cidade", "Estado", "CEP", "CPF", "CNPJ", "Email", "Telefone 1", "Telefone 2", "Inscri????o Municipal", "Inscri????o Estadual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fornecedorTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fornecedorTable.setShowGrid(false);
        fornecedorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fornecedorTableMouseClicked(evt);
            }
        });
        fornecedorTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fornecedorTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(fornecedorTable);
        if (fornecedorTable.getColumnModel().getColumnCount() > 0) {
            fornecedorTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            fornecedorTable.getColumnModel().getColumn(4).setPreferredWidth(45);
            fornecedorTable.getColumnModel().getColumn(8).setPreferredWidth(40);
        }

        jToolBar1.setBackground(new java.awt.Color(180, 205, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.add(jSeparator2);

        buttonToHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        buttonToHome.setText("In??cio");
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

        buttonNovoFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lorry_add.png"))); // NOI18N
        buttonNovoFornecedor.setText("Novo Fornecedor");
        buttonNovoFornecedor.setFocusable(false);
        buttonNovoFornecedor.setMargin(new java.awt.Insets(3, 14, 3, 14));
        buttonNovoFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonNovoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoFornecedorActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonNovoFornecedor);
        jToolBar1.add(jSeparator3);

        buttonFornecedoresExcluidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lorry_delete.png"))); // NOI18N
        buttonFornecedoresExcluidos.setText("Fornecedores Exclu??dos");
        buttonFornecedoresExcluidos.setFocusable(false);
        buttonFornecedoresExcluidos.setMargin(new java.awt.Insets(3, 14, 3, 14));
        buttonFornecedoresExcluidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonFornecedoresExcluidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFornecedoresExcluidosActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonFornecedoresExcluidos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Nome Fantasia:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Email:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("FORNECEDOR SELECIONADO");

        nomeSelecionadoTxt.setEditable(false);
        nomeSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        nomeSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nomeSelecionadoTxt.setFocusable(false);
        nomeSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeSelecionadoTxtActionPerformed(evt);
            }
        });

        emailSelecionadoTxt.setEditable(false);
        emailSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        emailSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailSelecionadoTxt.setFocusable(false);
        emailSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailSelecionadoTxtActionPerformed(evt);
            }
        });

        telefone1SelecionadoTxt.setEditable(false);
        telefone1SelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        telefone1SelecionadoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefone1SelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        telefone1SelecionadoTxt.setFocusable(false);
        telefone1SelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone1SelecionadoTxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Telefone 1:");

        enderecoSelecionadoTxt.setEditable(false);
        enderecoSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        enderecoSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enderecoSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        enderecoSelecionadoTxt.setFocusable(false);
        enderecoSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoSelecionadoTxtActionPerformed(evt);
            }
        });

        cidadeSelecionadoTxt.setEditable(false);
        cidadeSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        cidadeSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cidadeSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cidadeSelecionadoTxt.setFocusable(false);
        cidadeSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeSelecionadoTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Estado:");

        estadoSelecionadoTxt.setEditable(false);
        estadoSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        estadoSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estadoSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        estadoSelecionadoTxt.setFocusable(false);
        estadoSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoSelecionadoTxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Endere??o:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Cidade:");

        buttonEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lorry_error.png"))); // NOI18N
        buttonEditar.setText("EDITAR");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonExcluir.setBackground(new java.awt.Color(255, 87, 0));
        buttonExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exclamation.png"))); // NOI18N
        buttonExcluir.setText("EXCLUIR");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1596, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefone1SelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enderecoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidadeSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estadoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)))
                        .addGap(150, 150, 150)
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(buttonExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nomeSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(emailSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(telefone1SelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(enderecoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cidadeSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(estadoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(180, 205, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Buscar por");

        cbAtributos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ID", "Nome Fantasia", "Raz??o Social", "Endere??o", "N??mero", "Complemento", "Bairro", "Cidade", "Estado", "CEP", "CPF", "CNPJ", "Email", "Telefone 1", "Telefone 2", "Inscri????o Municipal", "Inscri????o Estadual" }));
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(439, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSearch)
                .addGap(421, 421, 421))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1596, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fornecedorTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fornecedorTableKeyReleased
        if(fornecedorTable.getSelectedRow() != -1){
            nomeSelecionadoTxt.setText(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 1).toString());
            emailSelecionadoTxt.setText(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 12).toString());
            enderecoSelecionadoTxt.setText(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 3).toString());
            cidadeSelecionadoTxt.setText(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 7).toString());
            estadoSelecionadoTxt.setText(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 8).toString());
            telefone1SelecionadoTxt.setText(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 13).toString());
        }
    }//GEN-LAST:event_fornecedorTableKeyReleased

    private void fornecedorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fornecedorTableMouseClicked
        if(fornecedorTable.getSelectedRow() != -1){
            nomeSelecionadoTxt.setText(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 1).toString());
            emailSelecionadoTxt.setText(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 12).toString());
            enderecoSelecionadoTxt.setText(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 3).toString());
            cidadeSelecionadoTxt.setText(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 7).toString());
            estadoSelecionadoTxt.setText(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 8).toString());
            telefone1SelecionadoTxt.setText(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 13).toString());
        }
    }//GEN-LAST:event_fornecedorTableMouseClicked

    private void buttonToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonToHomeActionPerformed
        try {
            HomeDashboardView homeView = new HomeDashboardView();
            homeView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonToHomeActionPerformed

    private void buttonNovoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoFornecedorActionPerformed
        try {
            NovoFornecedorView fornecedorTestDBView = new NovoFornecedorView();
            fornecedorTestDBView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(HomeDashboardView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonNovoFornecedorActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        try {
            
            Fornecedor fornecedor = new Fornecedor();
            
            fornecedor.setFornecedor_id((int) fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 0));
            fornecedor.setNome_fantasia(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 1).toString());
            fornecedor.setRazao_social(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 2).toString());
            fornecedor.setEndereco(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 3).toString());
            fornecedor.setNumero(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 4).toString());
            fornecedor.setComplemento(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 5).toString());
            fornecedor.setBairro(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 6).toString());
            fornecedor.setCidade(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 7).toString());
            fornecedor.setEstado(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 8).toString());
            fornecedor.setCep(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 9).toString());
            fornecedor.setEmail(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 12).toString());

            if(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 10) == null){
                fornecedor.setCpf("");
            }
            else{
                fornecedor.setCpf(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 10).toString());
            }


            if(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 11) == null){
                fornecedor.setCnpj("");
            }
            else{
                fornecedor.setCnpj(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 11).toString());
            }


            if(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 13) == null){
                fornecedor.setTelefone_1("");
            }
            else{
                fornecedor.setTelefone_1(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 13).toString());
            }


            if(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 14) == null){
                fornecedor.setTelefone_2("");
            }
            else{
                fornecedor.setTelefone_2(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 14).toString());
            }

            if(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 15) == null){
                fornecedor.setInsc_estadual("");
            }
            else{
                fornecedor.setInsc_estadual(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 15).toString());
            }

            if(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 16) == null){
                fornecedor.setInsc_municipal("");
            }
            else{
                fornecedor.setInsc_municipal(fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 16).toString());
            }
            
            
            EditarFornecedorView editarFornecedorView = new EditarFornecedorView(fornecedor);
            editarFornecedorView.setVisible(true);
            
            this.dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(HomeDashboardView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonFornecedoresExcluidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFornecedoresExcluidosActionPerformed
        try {
            FornecedoresExcluidosView fornecedoresExcluidosView = new FornecedoresExcluidosView();
            fornecedoresExcluidosView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(HomeDashboardView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonFornecedoresExcluidosActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        if(fornecedorTable.getSelectedRow() != -1){
            
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este fornecedor?", "Aten????o", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                try {
                    Fornecedor fornecedor = new Fornecedor();
                    FornecedorDAO fornecedorDAO = new FornecedorDAO();

                    fornecedor.setFornecedor_id((int) fornecedorTable.getValueAt(fornecedorTable.getSelectedRow(), 0));
                    fornecedorDAO.deleteFornecedor(fornecedor);

                    nomeSelecionadoTxt.setText("");
                    emailSelecionadoTxt.setText("");
                    enderecoSelecionadoTxt.setText("");
                    cidadeSelecionadoTxt.setText("");
                    estadoSelecionadoTxt.setText("");
                    telefone1SelecionadoTxt.setText("");

                    this.readTable();

                } catch (SQLException ex) {
                    Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro sem usu??rio selecionado!\nPor favor selecione um fornecedor para excluir.");
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void cbAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAtributosActionPerformed

    }//GEN-LAST:event_cbAtributosActionPerformed

    private void searchFieldTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldTxtKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(cbAtributos.getSelectedItem().equals(" ")){
                JOptionPane.showMessageDialog(null, "Erro! Por favor selecione uma usuario para pesquisar.");
            }
            else{
                if(cbAtributos.getSelectedItem().equals("Nome Fantasia")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByNomeFantasia(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("ID")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableById(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Raz??o Social")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByRazaoSocial(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Endere??o")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByEndereco(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("N??mero")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByNumero(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Complemento")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByComplemento(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Bairro")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByBairro(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Cidade")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByCidade(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Estado")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByEstado(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("CEP")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByCep(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("CPF")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByCpf(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("CNPJ")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByCnpj(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Email")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByEmail(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Telefone 1")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByTelefone1(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Telefone 2")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByTelefone2(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Inscri????o Municipal")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByInscMunicipal(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Inscri????o Estadual")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByInscEstadual(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

            }
        }
    }//GEN-LAST:event_searchFieldTxtKeyPressed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed

        if(cbAtributos.getSelectedItem().equals(" ")){
            JOptionPane.showMessageDialog(null, "Erro! Por favor selecione uma usuario para pesquisar.");
        }
        else{
            if(cbAtributos.getSelectedItem().equals("Nome Fantasia")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByNomeFantasia(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("ID")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableById(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Raz??o Social")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByRazaoSocial(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Endere??o")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByEndereco(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("N??mero")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByNumero(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Complemento")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByComplemento(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Bairro")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByBairro(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Cidade")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByCidade(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Estado")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByEstado(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("CEP")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByCep(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("CPF")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByCpf(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("CNPJ")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByCnpj(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Email")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByEmail(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Telefone 1")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByTelefone1(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Telefone 2")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByTelefone2(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Inscri????o Municipal")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByInscMunicipal(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Inscri????o Estadual")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByInscEstadual(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonSearchKeyPressed

    }//GEN-LAST:event_buttonSearchKeyPressed

    private void nomeSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeSelecionadoTxtActionPerformed

    private void emailSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailSelecionadoTxtActionPerformed

    private void telefone1SelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone1SelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone1SelecionadoTxtActionPerformed

    private void enderecoSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoSelecionadoTxtActionPerformed

    private void cidadeSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeSelecionadoTxtActionPerformed

    private void estadoSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoSelecionadoTxtActionPerformed

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
            java.util.logging.Logger.getLogger(FornecedoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FornecedoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FornecedoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FornecedoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FornecedoresView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFornecedoresExcluidos;
    private javax.swing.JButton buttonNovoFornecedor;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonToHome;
    private javax.swing.JComboBox<Object> cbAtributos;
    private javax.swing.JTextField cidadeSelecionadoTxt;
    private javax.swing.JTextField codigoSelecionadoTxt;
    private javax.swing.JTextField emailSelecionadoTxt;
    private javax.swing.JTextField enderecoSelecionadoTxt;
    private javax.swing.JTextField estadoSelecionadoTxt;
    private javax.swing.JTable fornecedorTable;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField nomeSelecionadoTxt;
    private javax.swing.JTextField searchFieldTxt;
    private javax.swing.JTextField telefone1SelecionadoTxt;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
