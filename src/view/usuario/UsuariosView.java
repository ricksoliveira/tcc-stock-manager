/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.usuario;

import view.HomeDashboardView;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
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
public class UsuariosView extends javax.swing.JFrame {

    /**
     * Creates new form TestDBView
     */
    public UsuariosView() throws SQLException {
        initComponents();
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/bricks.png"));
        this.setIconImage(logo.getImage());
        this.setTitle("Gerenciador de Estoque");

        setResizable(false);
        this.readTable();
    }
    
    public void readTable() throws SQLException{ 
        //<editor-fold defaultstate="collapsed" desc="READ USUARIOS">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        
        model.setNumRows(0);
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario p : usuarioDAO.listAllUsuarios()){
            model.addRow(new Object[]{
                p.getUsuario_id(),
                p.getNome(),
                p.getSobrenome(),
                p.getData_nascimento(),
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
    }
    
    public void readSearchTableByName(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ BY NAME">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchUsuarioByName(name)){
            model.addRow(new Object[]{
                c.getUsuario_id(),
                c.getNome(),
                c.getSobrenome(),
                c.getData_nascimento(),
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
    }
    
    public void readSearchTableById(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ BY ID">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchUsuarioById(id)){
            model.addRow(new Object[]{
                c.getUsuario_id(),
                c.getNome(),
                c.getSobrenome(),
                c.getData_nascimento(),
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
    }
    
    public void readSearchTableBySurname(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ BY SOBRENOME">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchUsuarioBySurname(name)){
            model.addRow(new Object[]{
                c.getUsuario_id(),
                c.getNome(),
                c.getSobrenome(),
                c.getData_nascimento(),
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
    }
    
    public void readSearchTableByBirthday(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ BY NASCIMENTO">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchUsuarioByBirthday(name)){
            model.addRow(new Object[]{
                c.getUsuario_id(),
                c.getNome(),
                c.getSobrenome(),
                c.getData_nascimento(),
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
    }
    
    public void readSearchTableByCpf(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ BY CPF">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchUsuarioByCpf(name)){
            model.addRow(new Object[]{
                c.getUsuario_id(),
                c.getNome(),
                c.getSobrenome(),
                c.getData_nascimento(),
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
    }
    
    public void readSearchTableByEmail(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ BY EMAIL">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchUsuarioByEmail(name)){
            model.addRow(new Object[]{
                c.getUsuario_id(),
                c.getNome(),
                c.getSobrenome(),
                c.getData_nascimento(),
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
    }
    
    public void readSearchTableByTelefone(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ BY TELEFONE">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchUsuarioByTelefone(name)){
            model.addRow(new Object[]{
                c.getUsuario_id(),
                c.getNome(),
                c.getSobrenome(),
                c.getData_nascimento(),
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
    }
    
    public void readSearchTableByEndereco(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ BY ENDEREÇO">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchUsuarioByEndereco(name)){
            model.addRow(new Object[]{
                c.getUsuario_id(),
                c.getNome(),
                c.getSobrenome(),
                c.getData_nascimento(),
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
    }
    
    public void readSearchTableByBairro(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ BY BAIRRO">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchUsuarioByBairro(name)){
            model.addRow(new Object[]{
                c.getUsuario_id(),
                c.getNome(),
                c.getSobrenome(),
                c.getData_nascimento(),
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
    }
    
    public void readSearchTableByCidade(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ BY CIDADE">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchUsuarioByCidade(name)){
            model.addRow(new Object[]{
                c.getUsuario_id(),
                c.getNome(),
                c.getSobrenome(),
                c.getData_nascimento(),
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
    }
    
    public void readSearchTableByEstado(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ BY ESTADO">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchUsuarioByEstado(name)){
            model.addRow(new Object[]{
                c.getUsuario_id(),
                c.getNome(),
                c.getSobrenome(),
                c.getData_nascimento(),
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
    }
    
    public void readSearchTableByCep(String name) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ BY CEP">
        DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();
        model.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        for(Usuario c : usuarioDAO.searchUsuarioByCep(name)){
            model.addRow(new Object[]{
                c.getUsuario_id(),
                c.getNome(),
                c.getSobrenome(),
                c.getData_nascimento(),
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
        usuarioTable = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonToHome = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        buttonToUsuariosExcluidos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomeSelecionadoTxt = new javax.swing.JLabel();
        sobrenomeSelecionadoTxt = new javax.swing.JLabel();
        emailSelecionadoTxt = new javax.swing.JLabel();
        buttonEditar = new javax.swing.JButton();
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
        titulo.setText("USUÁRIOS");

        usuarioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome", "Nascimento", "CPF", "Email", "Telefone", "Endereço", "Bairro", "Cidade", "Estado", "CEP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usuarioTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuarioTable.setShowGrid(false);
        usuarioTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioTableMouseClicked(evt);
            }
        });
        usuarioTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuarioTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(usuarioTable);
        if (usuarioTable.getColumnModel().getColumnCount() > 0) {
            usuarioTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            usuarioTable.getColumnModel().getColumn(10).setPreferredWidth(20);
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        jButton1.setText("Novo Usuário");
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

        buttonToUsuariosExcluidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_delete.png"))); // NOI18N
        buttonToUsuariosExcluidos.setText("Usuários Excluídos");
        buttonToUsuariosExcluidos.setFocusable(false);
        buttonToUsuariosExcluidos.setMargin(new java.awt.Insets(3, 14, 3, 14));
        buttonToUsuariosExcluidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonToUsuariosExcluidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonToUsuariosExcluidosActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonToUsuariosExcluidos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("USUÁRIO SELECIONADO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Sobrenome:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Email:");

        nomeSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N

        sobrenomeSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N

        emailSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N

        buttonEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_edit.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1398, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)
                        .addGap(220, 220, 220))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(buttonDeletar))
                            .addComponent(nomeSelecionadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sobrenomeSelecionadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailSelecionadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(371, 371, 371))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeSelecionadoTxt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sobrenomeSelecionadoTxt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emailSelecionadoTxt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(180, 205, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Buscar por");

        cbAtributos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ID", "Nome", "Sobrenome", "Nascimento", "CPF", "Email", "Telefone", "Endereço", "Bairro", "Cidade", "Estado", "CEP" }));
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
                .addGap(362, 362, 362)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAtributos, 0, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSearch)
                .addGap(354, 354, 354))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioTableKeyReleased
        if(usuarioTable.getSelectedRow() != -1){
            nomeSelecionadoTxt.setText(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 1).toString());
            sobrenomeSelecionadoTxt.setText(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 2).toString());
            emailSelecionadoTxt.setText(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_usuarioTableKeyReleased

    private void usuarioTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioTableMouseClicked
        if(usuarioTable.getSelectedRow() != -1){
            nomeSelecionadoTxt.setText(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 1).toString());
            sobrenomeSelecionadoTxt.setText(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 2).toString());
            emailSelecionadoTxt.setText(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_usuarioTableMouseClicked

    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed
        
        if(usuarioTable.getSelectedRow() != -1){
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este usuário?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                try {
                    Usuario usuario = new Usuario();
                    UsuarioDAO usuarioDAO = new UsuarioDAO();

                    usuario.setUsuario_id((int) usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 0));
                    usuarioDAO.deleteUsuario(usuario);

                    nomeSelecionadoTxt.setText("");
                    sobrenomeSelecionadoTxt.setText("");
                    emailSelecionadoTxt.setText("");

                    this.readTable();

                } catch (SQLException ex) {
                    Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro sem usuário selecionado!\nPor favor selecione um usuario para excluir.");
        }
        
    }//GEN-LAST:event_buttonDeletarActionPerformed

    private void buttonToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonToHomeActionPerformed
        try {
            HomeDashboardView homeView = new HomeDashboardView();
            homeView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonToHomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            NovoUsuarioView usuarioTestDBView = new NovoUsuarioView();
            usuarioTestDBView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(HomeDashboardView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        
        try {
            Usuario usuario = new Usuario();
            
            usuario.setUsuario_id((int) usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 0));
            usuario.setNome(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 1).toString());
            usuario.setSobrenome(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 2).toString());
            usuario.setData_nascimento(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 3).toString());
            usuario.setCpf(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 4).toString());
            usuario.setEmail(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 5).toString());
            usuario.setTelefone(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 6).toString());
            usuario.setEndereco(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 7).toString());
            usuario.setBairro(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 8).toString());
            usuario.setCidade(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 9).toString());
            usuario.setEstado(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 10).toString());
            usuario.setCep(usuarioTable.getValueAt(usuarioTable.getSelectedRow(), 11).toString());
            
            EditarUsuarioView editarUsuarioView = new EditarUsuarioView(usuario);
            editarUsuarioView.setVisible(true);
            
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonToUsuariosExcluidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonToUsuariosExcluidosActionPerformed
        try {
            UsuariosExcluidosView usuariosExcluidosView = new UsuariosExcluidosView();
            usuariosExcluidosView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(HomeDashboardView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonToUsuariosExcluidosActionPerformed

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
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByName(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("ID")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableById(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Sobrenome")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableBySurname(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Nascimento")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByBirthday(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("CPF")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByCpf(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Email")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByEmail(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Telefone")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByTelefone(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Endereço")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByEndereco(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Bairro")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByBairro(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Cidade")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByCidade(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("Estado")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByEstado(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                else if(cbAtributos.getSelectedItem().equals("CEP")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readSearchTableByCep(searchFieldTxt.getText());
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
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByName(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("ID")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableById(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Sobrenome")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableBySurname(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Nascimento")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByBirthday(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("CPF")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByCpf(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Email")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByEmail(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Telefone")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByTelefone(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Endereço")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByEndereco(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Bairro")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByBairro(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Cidade")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByCidade(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("Estado")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByEstado(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            else if(cbAtributos.getSelectedItem().equals("CEP")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readSearchTableByCep(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new UsuariosView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UsuariosView.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel emailSelecionadoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JLabel sobrenomeSelecionadoTxt;
    private javax.swing.JLabel titulo;
    private javax.swing.JTable usuarioTable;
    // End of variables declaration//GEN-END:variables
}
