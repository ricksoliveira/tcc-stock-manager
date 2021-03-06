/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.usuario;

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
import javax.swing.table.DefaultTableModel;
import model.bean.Usuario;
import model.dao.UsuarioDAO;

/**
 *
 * @author h2ose
 */
public class UsuariosExcluidosView extends javax.swing.JFrame {

    /**
     * Creates new form TestDBView
     */
    public UsuariosExcluidosView() throws SQLException {
        initComponents();
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/bricks.png"));
        this.setIconImage(logo.getImage());
        this.setTitle("Gerenciador de Estoque");
        
        setResizable(false);
        this.readDeletedTable();
    }
    
    public void readDeletedTable() throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED USUARIOS">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        
        model.setNumRows(0);
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario p : usuarioDAO.listDeletedUsuarios()){
            
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(p.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    p.getUsuario_id(),
                    p.getNome(),
                    p.getSobrenome(),
                    dateToShow,
                    p.getCpf(),
                    p.getEmail(),
                    p.getTelefone(),
                    p.getEndereco(),
                    p.getBairro(),
                    p.getCidade(),
                    p.getEstado(),
                    p.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readDeletedSearchTableByName(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY NAME">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchDeletedUsuarioByName(name)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(c.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    c.getUsuario_id(),
                    c.getNome(),
                    c.getSobrenome(),
                    dateToShow,
                    c.getCpf(),
                    c.getEmail(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getCidade(),
                    c.getEstado(),
                    c.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readDeletedSearchTableById(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY ID">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchDeletedUsuarioById(id)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(c.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    c.getUsuario_id(),
                    c.getNome(),
                    c.getSobrenome(),
                    dateToShow,
                    c.getCpf(),
                    c.getEmail(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getCidade(),
                    c.getEstado(),
                    c.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readDeletedSearchTableBySurname(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY SOBRENOME">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchDeletedUsuarioBySurname(name)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(c.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    c.getUsuario_id(),
                    c.getNome(),
                    c.getSobrenome(),
                    dateToShow,
                    c.getCpf(),
                    c.getEmail(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getCidade(),
                    c.getEstado(),
                    c.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readDeletedSearchTableByBirthday(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY NASCIMENTO">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchDeletedUsuarioByBirthday(name)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(c.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    c.getUsuario_id(),
                    c.getNome(),
                    c.getSobrenome(),
                    dateToShow,
                    c.getCpf(),
                    c.getEmail(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getCidade(),
                    c.getEstado(),
                    c.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readDeletedSearchTableByCpf(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY CPF">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchDeletedUsuarioByCpf(name)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(c.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    c.getUsuario_id(),
                    c.getNome(),
                    c.getSobrenome(),
                    dateToShow,
                    c.getCpf(),
                    c.getEmail(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getCidade(),
                    c.getEstado(),
                    c.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readDeletedSearchTableByEmail(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY EMAIL">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchDeletedUsuarioByEmail(name)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(c.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    c.getUsuario_id(),
                    c.getNome(),
                    c.getSobrenome(),
                    dateToShow,
                    c.getCpf(),
                    c.getEmail(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getCidade(),
                    c.getEstado(),
                    c.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readDeletedSearchTableByTelefone(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY TELEFONE">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchDeletedUsuarioByTelefone(name)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(c.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    c.getUsuario_id(),
                    c.getNome(),
                    c.getSobrenome(),
                    dateToShow,
                    c.getCpf(),
                    c.getEmail(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getCidade(),
                    c.getEstado(),
                    c.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readDeletedSearchTableByEndereco(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY ENDERE??O">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchDeletedUsuarioByEndereco(name)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(c.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    c.getUsuario_id(),
                    c.getNome(),
                    c.getSobrenome(),
                    dateToShow,
                    c.getCpf(),
                    c.getEmail(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getCidade(),
                    c.getEstado(),
                    c.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readDeletedSearchTableByBairro(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY BAIRRO">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchDeletedUsuarioByBairro(name)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(c.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    c.getUsuario_id(),
                    c.getNome(),
                    c.getSobrenome(),
                    dateToShow,
                    c.getCpf(),
                    c.getEmail(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getCidade(),
                    c.getEstado(),
                    c.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readDeletedSearchTableByCidade(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETEDBY CIDADE">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchDeletedUsuarioByCidade(name)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(c.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    c.getUsuario_id(),
                    c.getNome(),
                    c.getSobrenome(),
                    dateToShow,
                    c.getCpf(),
                    c.getEmail(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getCidade(),
                    c.getEstado(),
                    c.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readDeletedSearchTableByEstado(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY ESTADO">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchDeletedUsuarioByEstado(name)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(c.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    c.getUsuario_id(),
                    c.getNome(),
                    c.getSobrenome(),
                    dateToShow,
                    c.getCpf(),
                    c.getEmail(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getCidade(),
                    c.getEstado(),
                    c.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readDeletedSearchTableByCep(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ DELETED BY CEP">
        DefaultTableModel model = (DefaultTableModel) usuarioExcluidoTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchDeletedUsuarioByCep(name)){
            try {
                SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
                Date dateFromDb = dateForm.parse(c.getData_nascimento());
                SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/yyyy");
                String dateToShow = dateForm2.format(dateFromDb);
                
                model.addRow(new Object[]{
                    c.getUsuario_id(),
                    c.getNome(),
                    c.getSobrenome(),
                    dateToShow,
                    c.getCpf(),
                    c.getEmail(),
                    c.getTelefone(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getCidade(),
                    c.getEstado(),
                    c.getCep()
                });
            }
//</editor-fold>
            catch (ParseException ex) {
                Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuarioExcluidoTable = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonToHome = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jLabel9 = new javax.swing.JLabel();
        sobrenomeSelecionadoTxt = new javax.swing.JTextField();
        cidadeSelecionadoTxt = new javax.swing.JTextField();
        nomeSelecionadoTxt = new javax.swing.JTextField();
        enderecoSelecionadoTxt = new javax.swing.JTextField();
        telefoneSelecionadoTxt = new javax.swing.JTextField();
        estadoSelecionadoTxt = new javax.swing.JTextField();
        emailSelecionadoTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonDeletar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbAtributos = new javax.swing.JComboBox<>();
        searchFieldTxt = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();

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

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("USU??RIOS EXCLU??DOS");

        usuarioExcluidoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome", "Nascimento", "CPF", "Email", "Telefone", "Endere??o", "Bairro", "Cidade", "Estado", "CEP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usuarioExcluidoTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuarioExcluidoTable.setShowGrid(false);
        usuarioExcluidoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioExcluidoTableMouseClicked(evt);
            }
        });
        usuarioExcluidoTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuarioExcluidoTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(usuarioExcluidoTable);
        if (usuarioExcluidoTable.getColumnModel().getColumnCount() > 0) {
            usuarioExcluidoTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            usuarioExcluidoTable.getColumnModel().getColumn(10).setPreferredWidth(20);
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow_left.png"))); // NOI18N
        jButton1.setText("Voltar para Usu??rios");
        jButton1.setFocusable(false);
        jButton1.setMargin(new java.awt.Insets(3, 14, 3, 14));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator4);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Estado:");

        sobrenomeSelecionadoTxt.setEditable(false);
        sobrenomeSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        sobrenomeSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sobrenomeSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        sobrenomeSelecionadoTxt.setFocusable(false);
        sobrenomeSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobrenomeSelecionadoTxtActionPerformed(evt);
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

        telefoneSelecionadoTxt.setEditable(false);
        telefoneSelecionadoTxt.setBackground(new java.awt.Color(202, 202, 211));
        telefoneSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefoneSelecionadoTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        telefoneSelecionadoTxt.setFocusable(false);
        telefoneSelecionadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneSelecionadoTxtActionPerformed(evt);
            }
        });

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Telefone:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Endere??o:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("USU??RIO SELECIONADO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Cidade:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Sobrenome:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Email:");

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
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1398, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefoneSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nomeSelecionadoTxt)
                                .addComponent(sobrenomeSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enderecoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidadeSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDeletar)
                .addGap(176, 176, 176))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nomeSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(sobrenomeSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(enderecoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(cidadeSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(estadoSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(telefoneSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1398, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(180, 205, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Buscar por");

        cbAtributos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ID", "Nome", "Sobrenome", "Nascimento", "CPF", "Email", "Telefone", "Endere??o", "Bairro", "Cidade", "Estado", "CEP" }));
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAtributos, 0, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSearch)
                .addGap(367, 367, 367))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioExcluidoTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioExcluidoTableKeyReleased
        if(usuarioExcluidoTable.getSelectedRow() != -1){
            nomeSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 1).toString());
            sobrenomeSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 2).toString());
            emailSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 5).toString());
            telefoneSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 6).toString());
            enderecoSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 7).toString());
            cidadeSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 9).toString());
            estadoSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 10).toString());
        }
    }//GEN-LAST:event_usuarioExcluidoTableKeyReleased

    private void usuarioExcluidoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioExcluidoTableMouseClicked
        if(usuarioExcluidoTable.getSelectedRow() != -1){
            nomeSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 1).toString());
            sobrenomeSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 2).toString());
            emailSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 5).toString());
            telefoneSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 6).toString());
            enderecoSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 7).toString());
            cidadeSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 9).toString());
            estadoSelecionadoTxt.setText(usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 10).toString());
        }
    }//GEN-LAST:event_usuarioExcluidoTableMouseClicked

    private void buttonToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonToHomeActionPerformed
        try {
            HomeDashboardView homeView = new HomeDashboardView();
            homeView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonToHomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            UsuariosView usuariosView = new UsuariosView();
            usuariosView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(HomeDashboardView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed

        if(usuarioExcluidoTable.getSelectedRow() != -1){
            
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja restaurar este usu??rio?", "Aten????o", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                try {
                    Usuario usuario = new Usuario();
                    UsuarioDAO usuarioDAO = new UsuarioDAO();

                    usuario.setUsuario_id((int) usuarioExcluidoTable.getValueAt(usuarioExcluidoTable.getSelectedRow(), 0));
                    usuarioDAO.restoreUsuario(usuario);

                    nomeSelecionadoTxt.setText("");
                    sobrenomeSelecionadoTxt.setText("");
                    emailSelecionadoTxt.setText("");

                    this.readDeletedTable();

                } catch (SQLException ex) {
                    Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro sem usu??rio selecionado!\nPor favor selecione um usuario para excluir.");
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
                if(cbAtributos.getSelectedItem().equals("Nome")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByName(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("ID")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableById(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Sobrenome")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableBySurname(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Nascimento")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByBirthday(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("CPF")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByCpf(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Email")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByEmail(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Telefone")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByTelefone(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Endere??o")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByEndereco(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Bairro")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByBairro(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Cidade")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByCidade(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Estado")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByEstado(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("CEP")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readDeletedTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readDeletedSearchTableByCep(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
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
            if(cbAtributos.getSelectedItem().equals("Nome")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByName(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("ID")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableById(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Sobrenome")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableBySurname(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Nascimento")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByBirthday(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("CPF")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByCpf(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Email")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByEmail(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Telefone")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByTelefone(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Endere??o")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByEndereco(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Bairro")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByBairro(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Cidade")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByCidade(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("Estado")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByEstado(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            else if(cbAtributos.getSelectedItem().equals("CEP")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readDeletedTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readDeletedSearchTableByCep(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonSearchKeyPressed

    }//GEN-LAST:event_buttonSearchKeyPressed

    private void sobrenomeSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenomeSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobrenomeSelecionadoTxtActionPerformed

    private void cidadeSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeSelecionadoTxtActionPerformed

    private void nomeSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeSelecionadoTxtActionPerformed

    private void enderecoSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoSelecionadoTxtActionPerformed

    private void telefoneSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneSelecionadoTxtActionPerformed

    private void estadoSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoSelecionadoTxtActionPerformed

    private void emailSelecionadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailSelecionadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailSelecionadoTxtActionPerformed

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
            java.util.logging.Logger.getLogger(UsuariosExcluidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosExcluidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosExcluidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosExcluidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new UsuariosExcluidosView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UsuariosExcluidosView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonToHome;
    private javax.swing.JComboBox<Object> cbAtributos;
    private javax.swing.JTextField cidadeSelecionadoTxt;
    private javax.swing.JTextField emailSelecionadoTxt;
    private javax.swing.JTextField enderecoSelecionadoTxt;
    private javax.swing.JTextField estadoSelecionadoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField nomeSelecionadoTxt;
    private javax.swing.JTextField searchFieldTxt;
    private javax.swing.JTextField sobrenomeSelecionadoTxt;
    private javax.swing.JTextField telefoneSelecionadoTxt;
    private javax.swing.JLabel titulo;
    private javax.swing.JTable usuarioExcluidoTable;
    // End of variables declaration//GEN-END:variables
}
