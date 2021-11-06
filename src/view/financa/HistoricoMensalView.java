package view.financa;

import controller.FinancaController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Financa;
import model.dao.FinancaDAO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import view.HomeDashboardView;

/**
 *
 * @author h2ose
 */
public class HistoricoMensalView extends javax.swing.JFrame {

    /**
     * Creates new form Temp
     */
    public HistoricoMensalView() throws SQLException {
        initComponents();
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/bricks.png"));
        this.setIconImage(logo.getImage());
        this.setTitle("Gerenciador de Estoque");
        
        this.readAcumumlativoTable();
        this.readMensalTable();
    }
    
    public void readAcumumlativoTable() throws SQLException{ 
        //<editor-fold defaultstate="collapsed" desc="READ FINANÇAS ACUMULATIVAS">
        DefaultTableModel model = (DefaultTableModel) financaAcumulativaTable.getModel();
        
        model.setNumRows(0);
        
        FinancaDAO financaDAO = new FinancaDAO();
        
        for(Financa f : financaDAO.listAllFinancas()){
            model.addRow(new Object[]{
                f.getMes(),
                f.getAno(),
                String.format("%,.2f", f.getFaturamento_bruto()),
                String.format("%,.2f", f.getDescontos()),
                String.format("%,.2f", f.getFaturamento_liquido()),
                String.format("%,.2f", f.getCmv()),
                String.format("%,.2f", f.getLucro()),
                String.format("%,.1f", f.getMargem_lucro()),
                String.format("%,.2f", f.getCusto_total_estoque()),
                f.getQuantidade_estoque(),
                f.getNumero_categorias()
            });
        }
//</editor-fold>
    }
    
    public void readMensalTable() throws SQLException{ 
        //<editor-fold defaultstate="collapsed" desc="READ FINANÇAS MENSAIS">
        DefaultTableModel model = (DefaultTableModel) financaMensalTable.getModel();
        
        model.setNumRows(0);
        
        FinancaController financaController = new FinancaController();
        
        for(Financa f : financaController.listMonthlyFinance()){
            model.addRow(new Object[]{
                f.getMes(),
                f.getAno(),
                String.format("%,.2f", f.getFaturamento_bruto()),
                String.format("%,.2f", f.getDescontos()),
                String.format("%,.2f", f.getFaturamento_liquido()),
                String.format("%,.2f", f.getCmv()),
                String.format("%,.2f", f.getLucro()),
                String.format("%,.1f", f.getMargem_lucro()),
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
        jSeparator1 = new javax.swing.JToolBar.Separator();
        buttonHome = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonVoltar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        buttonRelatorioAcumulativo = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        financaAcumulativaTable = new javax.swing.JTable();
        titulo1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        financaMensalTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jToolBar1.setBackground(new java.awt.Color(180, 205, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator1);

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        buttonHome.setText("Início");
        buttonHome.setFocusable(false);
        buttonHome.setMargin(new java.awt.Insets(3, 14, 3, 14));
        buttonHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonHome);
        jToolBar1.add(jSeparator2);

        buttonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow_left.png"))); // NOI18N
        buttonVoltar.setText("Voltar para Finanças");
        buttonVoltar.setFocusable(false);
        buttonVoltar.setMargin(new java.awt.Insets(3, 14, 3, 14));
        buttonVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonVoltar);
        jToolBar1.add(jSeparator3);

        buttonRelatorioAcumulativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        buttonRelatorioAcumulativo.setText("Relatório Acumulativo");
        buttonRelatorioAcumulativo.setFocusable(false);
        buttonRelatorioAcumulativo.setMargin(new java.awt.Insets(3, 14, 3, 14));
        buttonRelatorioAcumulativo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonRelatorioAcumulativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRelatorioAcumulativoActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonRelatorioAcumulativo);
        jToolBar1.add(jSeparator4);

        jButton2.setText("relatorio 2");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMargin(new java.awt.Insets(3, 14, 3, 14));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator5);

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("FINANÇAS DE CADA MÊS");

        financaAcumulativaTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        financaAcumulativaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mês", "Ano", "Fatur. Bruto", "Descontos", "Fatur. Líquido", "CMV", "Lucro", "Margem", "Custo Estoque", "Qntde Estoque", "Nº Categorias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(financaAcumulativaTable);
        if (financaAcumulativaTable.getColumnModel().getColumnCount() > 0) {
            financaAcumulativaTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            financaAcumulativaTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            financaAcumulativaTable.getColumnModel().getColumn(7).setPreferredWidth(20);
            financaAcumulativaTable.getColumnModel().getColumn(10).setPreferredWidth(40);
        }

        titulo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("FINANÇAS ACUMULADAS");

        financaMensalTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        financaMensalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mês", "Ano", "Fatur. Bruto", "Descontos", "Fatur. Líquido", "CMV", "Lucro", "Margem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(financaMensalTable);
        if (financaMensalTable.getColumnModel().getColumnCount() > 0) {
            financaMensalTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            financaMensalTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            financaMensalTable.getColumnModel().getColumn(7).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1206, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1206, Short.MAX_VALUE)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1206, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(180, 205, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        try {
            HomeDashboardView homeView = new HomeDashboardView();
            homeView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoMensalView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        try {
            FinancaView productDashboardView = new FinancaView();
            productDashboardView.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoMensalView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonRelatorioAcumulativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRelatorioAcumulativoActionPerformed
        
        if(financaAcumulativaTable.getSelectedRow() != -1){
            
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja gerar o relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                try {
                    FinancaDAO financaDAO = new FinancaDAO();
                    int mes = (int) financaAcumulativaTable.getValueAt(financaAcumulativaTable.getSelectedRow(), 0);
                    int ano = (int) financaAcumulativaTable.getValueAt(financaAcumulativaTable.getSelectedRow(), 1);

                    JasperPrint jpPrint = financaDAO.getReport(mes, ano);

                    JasperViewer jasperViewer = new JasperViewer(jpPrint, false);

                    jasperViewer.setAlwaysOnTop(true);
                    jasperViewer.setResizable(false);
                    jasperViewer.setSize(1000, 1000);
                    jasperViewer.setVisible(true);
                    


                } catch (SQLException ex) {
                    Logger.getLogger(HistoricoMensalView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (JRException ex) {
                    Logger.getLogger(HistoricoMensalView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor selecione um mês.");
        }
        
    }//GEN-LAST:event_buttonRelatorioAcumulativoActionPerformed

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
            java.util.logging.Logger.getLogger(HistoricoMensalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoricoMensalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoricoMensalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoricoMensalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HistoricoMensalView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(HistoricoMensalView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonRelatorioAcumulativo;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTable financaAcumulativaTable;
    private javax.swing.JTable financaMensalTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
