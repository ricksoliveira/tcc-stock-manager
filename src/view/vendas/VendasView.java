/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.vendas;

import com.sun.jdi.connect.spi.Connection;
import connection.ConnectionFactory;
import view.HomeDashboardView;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Promo;
import model.bean.VendaCompleta;
import model.dao.PromoDAO;
import model.dao.Venda_ProdutoDAO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author h2ose
 */
public class VendasView extends javax.swing.JFrame {

    /**
     * Creates new form TestDBView
     */
    
    private boolean x = false;
    private boolean y = false;
    
    public VendasView() throws SQLException {
        initComponents();
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/bricks.png"));
        this.setIconImage(logo.getImage());
        this.setTitle("Gerenciador de Estoque");
        
        setResizable(false);
        this.readCompleteVendasTable();
    }
    
    public void readCompleteVendasTable() throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) completeVendasTable.getModel();
        
        model.setRowCount(0);
        
        Venda_ProdutoDAO venda_ProdutoDAO = new Venda_ProdutoDAO();
        
        for(VendaCompleta vc : venda_ProdutoDAO.listAllCompleteVendas()){
            model.addRow(new Object[]{
                vc.getVenda_id(),
                vc.getProduto_id(),
                vc.getCod_interno(),
                vc.getPreco_unitario(),
                vc.getQuantidade(),
                vc.getSubtotal(),
                vc.getPromo(),
                vc.getMetodoPagamento(),
                vc.getVendedor(),
                vc.getData()
            });
        }
        
    }
    
    public void readCompleteVendasTableByVendaId(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY VENDA ID">
        
        DefaultTableModel model = (DefaultTableModel) completeVendasTable.getModel();
        
        model.setRowCount(0);
        
        Venda_ProdutoDAO venda_ProdutoDAO = new Venda_ProdutoDAO();
        
        for(VendaCompleta vc : venda_ProdutoDAO.searchVendaCompletaByVendaId(id)){
            model.addRow(new Object[]{
                vc.getVenda_id(),
                vc.getProduto_id(),
                vc.getCod_interno(),
                vc.getPreco_unitario(),
                vc.getQuantidade(),
                vc.getSubtotal(),
                vc.getPromo(),
                vc.getMetodoPagamento(),
                vc.getVendedor(),
                vc.getData()
            });
        }
        
//</editor-fold>
    }
    
    public void readCompleteVendasTableByProdutoId(int id) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY PRODUTO ID">
        
        DefaultTableModel model = (DefaultTableModel) completeVendasTable.getModel();
        
        model.setRowCount(0);
        
        Venda_ProdutoDAO venda_ProdutoDAO = new Venda_ProdutoDAO();
        
        for(VendaCompleta vc : venda_ProdutoDAO.searchVendaCompletaByProdutoId(id)){
            model.addRow(new Object[]{
                vc.getVenda_id(),
                vc.getProduto_id(),
                vc.getCod_interno(),
                vc.getPreco_unitario(),
                vc.getQuantidade(),
                vc.getSubtotal(),
                vc.getPromo(),
                vc.getMetodoPagamento(),
                vc.getVendedor(),
                vc.getData()
            });
        }
        
//</editor-fold>
    }
    
    public void readCompleteVendasTableByCodigoInterno(String codigo) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY CODIGO INTERNO">
        
        DefaultTableModel model = (DefaultTableModel) completeVendasTable.getModel();
        
        model.setRowCount(0);
        
        Venda_ProdutoDAO venda_ProdutoDAO = new Venda_ProdutoDAO();
        
        for(VendaCompleta vc : venda_ProdutoDAO.searchVendaCompletaByCodigoInterno(codigo)){
            model.addRow(new Object[]{
                vc.getVenda_id(),
                vc.getProduto_id(),
                vc.getCod_interno(),
                vc.getPreco_unitario(),
                vc.getQuantidade(),
                vc.getSubtotal(),
                vc.getPromo(),
                vc.getMetodoPagamento(),
                vc.getVendedor(),
                vc.getData()
            });
        }
        
//</editor-fold>
    }
    
    public void readCompleteVendasTableByPromocao(String promo) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY PROMOÇÃO">
        
        DefaultTableModel model = (DefaultTableModel) completeVendasTable.getModel();
        
        model.setRowCount(0);
        
        Venda_ProdutoDAO venda_ProdutoDAO = new Venda_ProdutoDAO();
        
        for(VendaCompleta vc : venda_ProdutoDAO.searchVendaCompletaByPromocao(promo)){
            model.addRow(new Object[]{
                vc.getVenda_id(),
                vc.getProduto_id(),
                vc.getCod_interno(),
                vc.getPreco_unitario(),
                vc.getQuantidade(),
                vc.getSubtotal(),
                vc.getPromo(),
                vc.getMetodoPagamento(),
                vc.getVendedor(),
                vc.getData()
            });
        }
        
//</editor-fold>
    }
    
    public void readCompleteVendasTableByPagamento(String pagamento) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY PAGAMENTO">
        
        DefaultTableModel model = (DefaultTableModel) completeVendasTable.getModel();
        
        model.setRowCount(0);
        
        Venda_ProdutoDAO venda_ProdutoDAO = new Venda_ProdutoDAO();
        
        for(VendaCompleta vc : venda_ProdutoDAO.searchVendaCompletaByPagamento(pagamento)){
            model.addRow(new Object[]{
                vc.getVenda_id(),
                vc.getProduto_id(),
                vc.getCod_interno(),
                vc.getPreco_unitario(),
                vc.getQuantidade(),
                vc.getSubtotal(),
                vc.getPromo(),
                vc.getMetodoPagamento(),
                vc.getVendedor(),
                vc.getData()
            });
        }
        
//</editor-fold>
    }
    
    public void readCompleteVendasTableByVendedor(String vendedor) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY VENDEDOR">
        
        DefaultTableModel model = (DefaultTableModel) completeVendasTable.getModel();
        
        model.setRowCount(0);
        
        Venda_ProdutoDAO venda_ProdutoDAO = new Venda_ProdutoDAO();
        
        for(VendaCompleta vc : venda_ProdutoDAO.searchVendaCompletaByVendedor(vendedor)){
            model.addRow(new Object[]{
                vc.getVenda_id(),
                vc.getProduto_id(),
                vc.getCod_interno(),
                vc.getPreco_unitario(),
                vc.getQuantidade(),
                vc.getSubtotal(),
                vc.getPromo(),
                vc.getMetodoPagamento(),
                vc.getVendedor(),
                vc.getData()
            });
        }
        
//</editor-fold>
    }
    
    public void readCompleteVendasTableByData(String data) throws SQLException{
        //<editor-fold defaultstate="collapsed" desc="READ TABLE BY DATA">
        
        DefaultTableModel model = (DefaultTableModel) completeVendasTable.getModel();
        
        model.setRowCount(0);
        
        Venda_ProdutoDAO venda_ProdutoDAO = new Venda_ProdutoDAO();
        
        for(VendaCompleta vc : venda_ProdutoDAO.searchVendaCompletaByData(data)){
            model.addRow(new Object[]{
                vc.getVenda_id(),
                vc.getProduto_id(),
                vc.getCod_interno(),
                vc.getPreco_unitario(),
                vc.getQuantidade(),
                vc.getSubtotal(),
                vc.getPromo(),
                vc.getMetodoPagamento(),
                vc.getVendedor(),
                vc.getData()
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
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        completeVendasTable = new javax.swing.JTable();
        buttonDeletar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonToHome = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        buttonRelatorio = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        vendaIdSelecionadoTxt = new javax.swing.JLabel();
        vendedorSelecionadoTxt = new javax.swing.JLabel();
        numTotalProdutosTxt = new javax.swing.JLabel();
        numUnicosProdutosTxt = new javax.swing.JLabel();
        valorTotalTxt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        buttonSearch = new javax.swing.JButton();
        searchFieldTxt = new javax.swing.JTextField();
        cbAtributos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("VENDAS");

        completeVendasTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        completeVendasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Venda ID", "Produto ID", "Código Produto", "Preço Unitário", "Qntde", "Subtotal", "Promoção", "Método Paga/to", "Vendedor", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        completeVendasTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        completeVendasTable.setShowGrid(false);
        completeVendasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                completeVendasTableMouseClicked(evt);
            }
        });
        completeVendasTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                completeVendasTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(completeVendasTable);
        if (completeVendasTable.getColumnModel().getColumnCount() > 0) {
            completeVendasTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            completeVendasTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            completeVendasTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            completeVendasTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            completeVendasTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            completeVendasTable.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        buttonDeletar.setBackground(new java.awt.Color(255, 87, 0));
        buttonDeletar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exclamation.png"))); // NOI18N
        buttonDeletar.setText("INATIVAR");
        buttonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarActionPerformed(evt);
            }
        });

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

        buttonRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        buttonRelatorio.setText("Relatório de Venda");
        buttonRelatorio.setFocusable(false);
        buttonRelatorio.setMargin(new java.awt.Insets(3, 14, 3, 14));
        buttonRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRelatorioActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonRelatorio);
        jToolBar1.add(jSeparator3);

        jButton2.setText("excel");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator4);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Valor total:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("VENDA SELECIONADA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Vendedor:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Venda ID:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nº de produtos únicos:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nº total de produtos:");

        vendaIdSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        vendaIdSelecionadoTxt.setText("-");

        vendedorSelecionadoTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        vendedorSelecionadoTxt.setText("-");

        numTotalProdutosTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        numTotalProdutosTxt.setText("-");

        numUnicosProdutosTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        numUnicosProdutosTxt.setText("-");

        valorTotalTxt.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        valorTotalTxt.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vendaIdSelecionadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vendedorSelecionadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numTotalProdutosTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numUnicosProdutosTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(valorTotalTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(668, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDeletar)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(vendaIdSelecionadoTxt))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(vendedorSelecionadoTxt))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(numTotalProdutosTxt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(numUnicosProdutosTxt))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(valorTotalTxt))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(180, 205, 255));

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

        searchFieldTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldTxtKeyPressed(evt);
            }
        });

        cbAtributos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Venda ID", "Produto ID", "Código do Produto", "Promoção", "Método de Pagamento", "Vendedor", "Data" }));
        cbAtributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAtributosActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Buscar por");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void completeVendasTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_completeVendasTableKeyReleased
        if(completeVendasTable.getSelectedRow() != -1){
            try {
                vendaIdSelecionadoTxt.setText(completeVendasTable.getValueAt(completeVendasTable.getSelectedRow(), 0).toString());
                vendedorSelecionadoTxt.setText(completeVendasTable.getValueAt(completeVendasTable.getSelectedRow(), 8).toString());
                
                Venda_ProdutoDAO venda_ProdutoDAO = new Venda_ProdutoDAO();
                int totalProdutos = venda_ProdutoDAO.getTotalProdutos(Integer.parseInt(vendaIdSelecionadoTxt.getText()));
                numTotalProdutosTxt.setText(String.valueOf(totalProdutos));
                
                int totalDistintos = venda_ProdutoDAO.getTotalDistinctProdutos(Integer.parseInt(vendaIdSelecionadoTxt.getText()));
                numUnicosProdutosTxt.setText(String.valueOf(totalDistintos));
                
                double totalValor = venda_ProdutoDAO.getTotalParcialSingleVenda(Integer.parseInt(vendaIdSelecionadoTxt.getText()));
                valorTotalTxt.setText("R$  " + String.valueOf(totalValor));
                
            } catch (SQLException ex) {
                Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_completeVendasTableKeyReleased

    private void completeVendasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completeVendasTableMouseClicked
        if(completeVendasTable.getSelectedRow() != -1){
           try {
                vendaIdSelecionadoTxt.setText(completeVendasTable.getValueAt(completeVendasTable.getSelectedRow(), 0).toString());
                vendedorSelecionadoTxt.setText(completeVendasTable.getValueAt(completeVendasTable.getSelectedRow(), 8).toString());
                
                Venda_ProdutoDAO venda_ProdutoDAO = new Venda_ProdutoDAO();
                int totalProdutos = venda_ProdutoDAO.getTotalProdutos(Integer.parseInt(vendaIdSelecionadoTxt.getText()));
                numTotalProdutosTxt.setText(String.valueOf(totalProdutos));
                
                int totalDistintos = venda_ProdutoDAO.getTotalDistinctProdutos(Integer.parseInt(vendaIdSelecionadoTxt.getText()));
                numUnicosProdutosTxt.setText(String.valueOf(totalDistintos));
                
                double totalValor = venda_ProdutoDAO.getTotalParcialSingleVenda(Integer.parseInt(vendaIdSelecionadoTxt.getText()));
                valorTotalTxt.setText("R$  " + String.valueOf(totalValor));
                
            } catch (SQLException ex) {
                Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_completeVendasTableMouseClicked

    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed
        
        if(completeVendasTable.getSelectedRow() != -1){
            
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja inativar esta venda?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "voce clicou SIM");
            }
            else{
                JOptionPane.showMessageDialog(null, "voce clicou NAO");
            }
        }
        
    }//GEN-LAST:event_buttonDeletarActionPerformed

    private void buttonToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonToHomeActionPerformed
        try {
            HomeDashboardView homeView = new HomeDashboardView();
            homeView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonToHomeActionPerformed

    private void cbAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAtributosActionPerformed

    }//GEN-LAST:event_cbAtributosActionPerformed

    private void searchFieldTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldTxtKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            if(cbAtributos.getSelectedItem().equals(" ")){
                JOptionPane.showMessageDialog(null, "Erro! Por favor selecione um campo para JOppesquisar.");
            }
            else{
                if(cbAtributos.getSelectedItem().equals("Venda ID")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readCompleteVendasTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readCompleteVendasTableByVendaId(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Produto ID")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readCompleteVendasTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readCompleteVendasTableByProdutoId(Integer.parseInt(searchFieldTxt.getText()));
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Código do Produto")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readCompleteVendasTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readCompleteVendasTableByCodigoInterno(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Promoção")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readCompleteVendasTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readCompleteVendasTableByPromocao(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Método de Pagamento")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readCompleteVendasTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readCompleteVendasTableByPagamento(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Vendedor")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readCompleteVendasTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readCompleteVendasTableByVendedor(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if(cbAtributos.getSelectedItem().equals("Data")){
                    if(searchFieldTxt.getText().equals("")){
                        try {
                            this.readCompleteVendasTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        try {
                            this.readCompleteVendasTableByData(searchFieldTxt.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
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
            if(cbAtributos.getSelectedItem().equals("Venda ID")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readCompleteVendasTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readCompleteVendasTableByVendaId(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Produto ID")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readCompleteVendasTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readCompleteVendasTableByProdutoId(Integer.parseInt(searchFieldTxt.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Código do Produto")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readCompleteVendasTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readCompleteVendasTableByCodigoInterno(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Promoção")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readCompleteVendasTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readCompleteVendasTableByPromocao(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Método de Pagamento")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readCompleteVendasTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readCompleteVendasTableByPagamento(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Vendedor")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readCompleteVendasTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readCompleteVendasTableByVendedor(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(cbAtributos.getSelectedItem().equals("Data")){
                if(searchFieldTxt.getText().equals("")){
                    try {
                        this.readCompleteVendasTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    try {
                        this.readCompleteVendasTableByData(searchFieldTxt.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonSearchKeyPressed

    }//GEN-LAST:event_buttonSearchKeyPressed

    private void buttonRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRelatorioActionPerformed
        
        if(completeVendasTable.getSelectedRow() != -1){
            
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja gerar o relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                try {
                    Venda_ProdutoDAO venda_ProdutoDAO = new Venda_ProdutoDAO();
                    int id = (int) completeVendasTable.getValueAt(completeVendasTable.getSelectedRow(), 0);

                    JasperPrint jpPrint = venda_ProdutoDAO.getReport(id);

                    JasperViewer jasperViewer = new JasperViewer(jpPrint, false);

                    jasperViewer.setAlwaysOnTop(true);
                    jasperViewer.setResizable(false);
                    jasperViewer.setSize(1000, 1000);
                    jasperViewer.setVisible(true);
                    


                } catch (SQLException ex) {
                    Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (JRException ex) {
                    Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor selecione uma venda.");
        }
        
        
    }//GEN-LAST:event_buttonRelatorioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        JFileChooser jfileChooser = new JFileChooser();
        jfileChooser.setDialogTitle("especifique");
        int userSelection = jfileChooser.showSaveDialog(this);
        
        if(userSelection == JFileChooser.APPROVE_OPTION){
            File fileToSave = jfileChooser.getSelectedFile();
            try{
                FileWriter fw = new FileWriter(fileToSave);
                BufferedWriter bw = new BufferedWriter(fw);
                
                
                for (int k = 0; k < completeVendasTable.getColumnCount(); k++) {
                    String cell = completeVendasTable.getColumnName(k).toString() + ", ";
                    bw.write(cell);
                }
                
                bw.newLine();
                
                for (int i = 0; i < completeVendasTable.getRowCount(); i++) {
                    for (int j = 0; j < completeVendasTable.getColumnCount(); j++) {
                        String cell = completeVendasTable.getValueAt(i, j).toString() + ", ";
                        bw.write(cell);
                    }
                    bw.newLine();
                }
                bw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VendasView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VendasView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonRelatorio;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonToHome;
    private javax.swing.JComboBox<Object> cbAtributos;
    private javax.swing.JTable completeVendasTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel numTotalProdutosTxt;
    private javax.swing.JLabel numUnicosProdutosTxt;
    private javax.swing.JTextField searchFieldTxt;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel valorTotalTxt;
    private javax.swing.JLabel vendaIdSelecionadoTxt;
    private javax.swing.JLabel vendedorSelecionadoTxt;
    // End of variables declaration//GEN-END:variables
}
