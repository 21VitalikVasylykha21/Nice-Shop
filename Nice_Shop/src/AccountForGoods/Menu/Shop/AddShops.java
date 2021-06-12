package AccountForGoods.Menu.Shop;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vitalik
 */
public class AddShops extends javax.swing.JFrame {

    int count = 0;

    public AddShops() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("src\\icon\\Shop.png");
        this.setIconImage(img.getImage());
        this.setVisible(true);
        this.setTitle("Nice Shop: Додати магазин");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblNameShop = new javax.swing.JLabel();
        TxtNameShop = new javax.swing.JTextField();
        lblCountShop = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblNameCashRegister = new javax.swing.JTable();
        BtnAddCashRegister = new javax.swing.JButton();
        BtnCreateCashRegister = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblNameShop.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LblNameShop.setText("Назва магазину:");

        TxtNameShop.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblCountShop.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCountShop.setText("Кількість касирів:");

        TblNameCashRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TblNameCashRegister.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№", "Імя касира", "Ставка за годину", "Працює за касою:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblNameCashRegister);

        BtnAddCashRegister.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnAddCashRegister.setText("Додати касира");
        BtnAddCashRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddCashRegisterActionPerformed(evt);
            }
        });

        BtnCreateCashRegister.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnCreateCashRegister.setText("Створити магазин");
        BtnCreateCashRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateCashRegisterActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Відминити");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAddCashRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCreateCashRegister))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblNameShop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNameShop)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(lblCountShop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNameShop)
                    .addComponent(TxtNameShop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCountShop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnAddCashRegister)
                        .addComponent(BtnCreateCashRegister)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddCashRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddCashRegisterActionPerformed
        DefaultTableModel model = (DefaultTableModel) TblNameCashRegister.getModel();
        count++;
        model.addRow(new Object[]{"" + count, "", 0, ""});
    }//GEN-LAST:event_BtnAddCashRegisterActionPerformed

    private void BtnCreateCashRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateCashRegisterActionPerformed
        if (TblNameCashRegister.getRowCount() == 0) {
            //Помилка користувач не увівв дані ніякі в категорії
        } else {
            Path path = Paths.get("Магазини");
            if (!Files.exists(path)) {
                File Shop = new File("Магазини");
                Shop.mkdir();
            }
            File Storage = new File("Магазини\\" + TxtNameShop.getText());
            try {
                if (Storage.mkdir()) {
                    File Doods = new File("Магазини\\" + TxtNameShop.getText() + "\\На прилавках");
                    Doods.mkdir();
                    DefaultTableModel model = (DefaultTableModel) TblNameCashRegister.getModel();
                    for (int i = 0; i < model.getRowCount(); i++) {
                        try {
                            AccountForGoods.Menu.Shops d = new  AccountForGoods.Menu.Shops();
                             d.AddCashier(model.getValueAt(i, 1).toString(), 
                                     Double.parseDouble(model.getValueAt(i, 2).toString()), 
                                     model.getValueAt(i, 3).toString(),
                                     "Магазини\\" + TxtNameShop.getText());

                        } catch (Exception e) {
                            System.out.println("error" + e);
                        }
                    }

                } else {
                    System.out.println("Directory is not created");
                }
            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }
        this.setVisible(false);
        AccountForGoods.Menu.Menu m = new AccountForGoods.Menu.Menu();
        m.setVisible(true);
    }//GEN-LAST:event_BtnCreateCashRegisterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        AccountForGoods.Menu.Menu m = new AccountForGoods.Menu.Menu();
        m.setVisible(true);
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
            java.util.logging.Logger.getLogger(AddShops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddShops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddShops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddShops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddShops().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddCashRegister;
    private javax.swing.JButton BtnCreateCashRegister;
    private javax.swing.JLabel LblNameShop;
    private javax.swing.JTable TblNameCashRegister;
    private javax.swing.JTextField TxtNameShop;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCountShop;
    // End of variables declaration//GEN-END:variables
}