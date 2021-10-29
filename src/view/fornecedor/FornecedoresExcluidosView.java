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
public class FornecedoresExcluidosView extends javax.swing.JFrame {

    /**
     * Creates new form TestDBView
     */
    public FornecedoresExcluidosView() throws SQLException {
        initComponents();
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/bricks.png"));
        this.setIconImage(logo.getImage());
        this.setTitle("Gerenciador de Estoque");
        
        setResizable(false);
        this.readDeletedTable();
    }
    
    public void readDeletedTable() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.listDeletedFornecedors()){
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
    
    public void readDeletedSearchTableByNomeFantasia(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY NOME FANTASIA">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByNomeFantasia(name)){
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
    
    public void readDeletedSearchTableById(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY ID">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorById(id)){
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
    
    public void readDeletedSearchTableByRazaoSocial(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY RAZAO SOCIAL">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByRazaoSocial(name)){
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
    
    public void readDeletedSearchTableByEndereco(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY ENDERECO">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByEndereco(name)){
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
    
    public void readDeletedSearchTableByNumero(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY NUMERO">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByNumero(id)){
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
    
    public void readDeletedSearchTableByComplemento(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY COMPLEMENTO">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByComplemento(name)){
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
    
    public void readDeletedSearchTableByBairro(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY BAIRRO">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByBairro(name)){
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
    
    public void readDeletedSearchTableByCidade(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY CIDADE">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByCidade(name)){
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
    
    public void readDeletedSearchTableByEstado(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY ESTADO">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByEstado(name)){
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
    
    public void readDeletedSearchTableByCep(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY CEP">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByCep(name)){
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
    
    public void readDeletedSearchTableByCpf(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY CPF">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByCpf(name)){
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
    
    public void readDeletedSearchTableByCnpj(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY CNPJ">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByCnpj(name)){
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
    
    public void readDeletedSearchTableByEmail(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY EMAIL">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByEmail(name)){
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
    
    public void readDeletedSearchTableByTelefone1(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY TELEFONE 1">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByTelefone1(name)){
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
    
    public void readDeletedSearchTableByTelefone2(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY TELEFONE 2">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByTelefone2(name)){
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
    
    public void readDeletedSearchTableByInscMunicipal(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY INSC MUNICIPAL">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByInscMunicipal(name)){
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
    
    public void readDeletedSearchTableByInscEstadual(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY INSC ESTADUAL">
        DefaultTableModel model = (DefaultTableModel) fornecedorExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        FornecedorDAO DAO = new FornecedorDAO();
        
        for(Fornecedor p : DAO.searchDeletedFornecedorByInscEstadual(name)){
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
        fornecedorExcluidoTable = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonToHome = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        buttonFornecedor = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeSelecionadoTxt = new javax.swing.JLabel();
        emailSelecionadoTxt = new javax.swing.JLabel();
        buttonDeletar = new javax.swing.JButton();
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
        titulo.setText("FORNECEDORES EXCLUÍDOS");

        fornecedorExcluidoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Fantasia", "Razão Social", "Endereço", "Número", "Complemento", "Bairro", "Cidade", "Estado", "CEP", "CPF", "CNPJ", "Email", "Telefone 1", "Telefone 2", "Inscrição Municipal", "Inscrição Estadual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fornecedorExcluidoTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fornecedorExcluidoTable.setShowGrid(false);
        fornecedorExcluidoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fornecedorExcluidoTableMouseClicked(evt);
            }
        });
        fornecedorExcluidoTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fornecedorExcluidoTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(fornecedorExcluidoTable);
        if (fornecedorExcluidoTable.getColumnModel().getColumnCount() > 0) {
            fornecedorExcluidoTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            fornecedorExcluidoTable.getColumnModel().getColumn(4).setPreferredWidth(45);
            fornecedorExcluidoTable.getColumnModel().getColumn(8).setPreferredWidth(40);
        }

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

        buttonFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow_left.png"))); // NOI18N
        buttonFornecedor.setText("Voltar para Fornecedores");
        buttonFornecedor.setFocusable(false);
        buttonFornecedor.setMargin(new java.awt.Insets(3, 14, 3, 14));
        buttonFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFornecedorActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonFornecedor);
        jToolBar1.add(jSeparator3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Nome Fantasia:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Email:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("FORNECEDOR SELECIONADO");

        nomeSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N

        emailSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N

        buttonDeletar.setBackground(new java.awt.Color(255, 87, 0));
        buttonDeletar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/database_refresh.png"))); // NOI18N
        buttonDeletar.setText("RESTAURAR");
        buttonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1596, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonDeletar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nomeSelecionadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(325, 325, 325))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeSelecionadoTxt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailSelecionadoTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(buttonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel3.setBackground(new java.awt.Color(180, 205, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Buscar por");

        cbAtributos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ID", "Nome Fantasia", "Razão Social", "Endereço", "Número", "Complemento", "Bairro", "Cidade", "Estado", "CEP", "CPF", "CNPJ", "Email", "Telefone 1", "Telefone 2", "Inscrição Municipal", "Inscrição Estadual" }));
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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fornecedorExcluidoTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fornecedorExcluidoTableKeyReleased
        if(fornecedorExcluidoTable.getSelectedRow() != -1){
            nomeSelecionadoTxt.setText(fornecedorExcluidoTable.getValueAt(fornecedorExcluidoTable.getSelectedRow(), 1).toString());
            emailSelecionadoTxt.setText(fornecedorExcluidoTable.getValueAt(fornecedorExcluidoTable.getSelectedRow(), 12).toString());
        }
    }//GEN-LAST:event_fornecedorExcluidoTableKeyReleased

    private void fornecedorExcluidoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fornecedorExcluidoTableMouseClicked
        if(fornecedorExcluidoTable.getSelectedRow() != -1){
            nomeSelecionadoTxt.setText(fornecedorExcluidoTable.getValueAt(fornecedorExcluidoTable.getSelectedRow(), 1).toString());
            emailSelecionadoTxt.setText(fornecedorExcluidoTable.getValueAt(fornecedorExcluidoTable.getSelectedRow(), 12).toString());
        }
    }//GEN-LAST:event_fornecedorExcluidoTableMouseClicked

    private void buttonToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonToHomeActionPerformed
        try {
            HomeDashboardView homeView = new HomeDashboardView();
            homeView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedoresExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonToHomeActionPerformed

    private void buttonFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFornecedorActionPerformed
        try {
            FornecedoresView fornecedoresView = new FornecedoresView();
            fornecedoresView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(HomeDashboardView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonFornecedorActionPerformed

    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed

        if(fornecedorExcluidoTable.getSelectedRow() != -1){
            
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja restaurar este fornecedor?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                try {
                    Fornecedor fornecedor = new Fornecedor();
                    FornecedorDAO fornecedorDAO = new FornecedorDAO();

                    fornecedor.setFornecedor_id((int) fornecedorExcluidoTable.getValueAt(fornecedorExcluidoTable.getSelectedRow(), 0));
                    fornecedorDAO.restoreFornecedor(fornecedor);

                    nomeSelecionadoTxt.setText("");
                    emailSelecionadoTxt.setText("");

                    this.readDeletedTable();

                } catch (SQLException ex) {
                    Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro sem usuário selecionado!\nPor favor selecione um usuario para excluir.");
        }
    }//GEN-LAST:event_buttonDeletarActionPerformed

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
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByNomeFantasia(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("ID")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableById(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Razão Social")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByRazaoSocial(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Endereço")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByEndereco(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Número")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByNumero(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Complemento")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByComplemento(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Bairro")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByBairro(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Cidade")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByCidade(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Estado")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByEstado(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("CEP")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByCep(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("CPF")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByCpf(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("CNPJ")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByCnpj(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Email")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByEmail(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Telefone 1")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByTelefone1(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Telefone 2")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByTelefone2(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Inscrição Municipal")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByInscMunicipal(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Inscrição Estadual")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByInscEstadual(searchFieldTxt.getText());
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
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByNomeFantasia(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("ID")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableById(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Razão Social")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByRazaoSocial(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Endereço")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByEndereco(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Número")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByNumero(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Complemento")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByComplemento(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Bairro")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByBairro(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Cidade")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByCidade(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Estado")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByEstado(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("CEP")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByCep(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("CPF")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByCpf(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("CNPJ")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByCnpj(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Email")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByEmail(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Telefone 1")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByTelefone1(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Telefone 2")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByTelefone2(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Inscrição Municipal")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByInscMunicipal(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Inscrição Estadual")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByInscEstadual(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(FornecedoresView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonSearchKeyPressed

    }//GEN-LAST:event_buttonSearchKeyPressed

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
            java.util.logging.Logger.getLogger(FornecedoresExcluidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FornecedoresExcluidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FornecedoresExcluidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FornecedoresExcluidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new FornecedoresExcluidosView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FornecedoresExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonFornecedor;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonToHome;
    private javax.swing.JComboBox<Object> cbAtributos;
    private javax.swing.JLabel emailSelecionadoTxt;
    private javax.swing.JTable fornecedorExcluidoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel nomeSelecionadoTxt;
    private javax.swing.JTextField searchFieldTxt;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
