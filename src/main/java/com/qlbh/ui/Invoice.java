/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlbh.ui;

import com.qlbh.dao.DELIVERYDAO;
import com.qlbh.dao.QLDHDAO;
import com.qlbh.dao.QLKHODAO;
import com.qlbh.dao.RECEIPTDAO;
import com.qlbh.entity.DELIVERY;
import com.qlbh.entity.INVENTORY;
import com.qlbh.entity.QLDH;
import com.qlbh.entity.RECEIPT;
import com.qlbh.utils.MsgBox;
import com.qlbh.utils.XImage;
import com.qlbh.utils.getInfo;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form NewOrder
     */
    public Invoice() {
        initComponents();
        this.setIconImage(XImage.getAppIcon());
        this.setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //setLocation(DEFAULT_CURSOR, 195);
        this.setLocationRelativeTo(null);
        printInvoice();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_Invoice_Payment = new javax.swing.JTextField();
        lbl_Invoice_total = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_Invoice_balance = new javax.swing.JLabel();
        lbl_Invoice_balance1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_Invoice_OrderID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Invoice = new javax.swing.JTextArea();
        btn_NewOrderDetail_add = new com.k33ptoo.components.KButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_OrderDetail = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRINT INVOICE");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("TOTAL:");

        lbl_Invoice_total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Invoice_total.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Invoice_total.setText("TOTAL");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("PAYMENT:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("BALANCE:");

        lbl_Invoice_balance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Invoice_balance.setText("TOTAL");

        lbl_Invoice_balance1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_Invoice_balance1.setText("ITEMS");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ORDER ID:");

        lbl_Invoice_OrderID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Invoice_OrderID.setText("TOTAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Invoice_balance1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Invoice_balance)
                            .addComponent(txt_Invoice_Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Invoice_OrderID)
                            .addComponent(lbl_Invoice_total))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Invoice_OrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Invoice_total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Invoice_Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Invoice_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lbl_Invoice_balance1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        txt_Invoice.setColumns(20);
        txt_Invoice.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txt_Invoice.setRows(5);
        jScrollPane1.setViewportView(txt_Invoice);

        btn_NewOrderDetail_add.setText("PRINT");
        btn_NewOrderDetail_add.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_NewOrderDetail_add.setkEndColor(new java.awt.Color(0, 112, 192));
        btn_NewOrderDetail_add.setkHoverEndColor(new java.awt.Color(0, 30, 153));
        btn_NewOrderDetail_add.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_NewOrderDetail_add.setkHoverStartColor(new java.awt.Color(0, 30, 153));
        btn_NewOrderDetail_add.setkPressedColor(new java.awt.Color(153, 153, 153));
        btn_NewOrderDetail_add.setkStartColor(new java.awt.Color(0, 79, 174));
        btn_NewOrderDetail_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewOrderDetail_addActionPerformed(evt);
            }
        });

        tbl_OrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""},
                {"", "", "", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "QTY", "PRICE"
            }
        ));
        tbl_OrderDetail.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_OrderDetail.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tbl_OrderDetail.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tbl_OrderDetail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tbl_OrderDetail.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tbl_OrderDetail.setRowHeight(35);
        jScrollPane8.setViewportView(tbl_OrderDetail);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(btn_NewOrderDetail_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(505, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_NewOrderDetail_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NewOrderDetail_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewOrderDetail_addActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_NewOrderDetail_addActionPerformed

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn_NewOrderDetail_add;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lbl_Invoice_OrderID;
    private javax.swing.JLabel lbl_Invoice_balance;
    private javax.swing.JLabel lbl_Invoice_balance1;
    private javax.swing.JLabel lbl_Invoice_total;
    private rojerusan.RSTableMetro tbl_OrderDetail;
    private javax.swing.JTextArea txt_Invoice;
    private javax.swing.JTextField txt_Invoice_Payment;
    // End of variables declaration//GEN-END:variables

    QLDHDAO qldhdao = new QLDHDAO();
    DELIVERYDAO delidao = new DELIVERYDAO();
    QLKHODAO qlkhodao = new QLKHODAO();
    RECEIPTDAO receiptdao = new RECEIPTDAO();
    double payment = 0;

    public void fillToForm() {
        RECEIPT receipt = getInfo.receipt;
        if (receipt != null) {
            lbl_Invoice_OrderID.setText(receipt.getMADH());
            lbl_Invoice_total.setText(String.valueOf(receiptdao.getTotal(receipt.getMADH())));
            lbl_Invoice_balance.setText(String.valueOf(receiptdao.getTotal(receipt.getMADH())));
            fillTableItems();
        }
    }

    private void fillTableItems() {
        DefaultTableModel model = (DefaultTableModel) tbl_OrderDetail.getModel();
        model.setRowCount(0);
        try {
            List<Object[]> list = receiptdao.getOrderTableByKeyword(lbl_Invoice_OrderID.getText());
            for (Object[] row : list) {
                if (row[3] != null) {
                    model.addRow(new Object[]{row[3], row[4], row[6], row[7]});
                }
            }

        } catch (Exception e) {

        }
    }
    
    private boolean validateForm() {
        String Error = "";
        if (txt_Invoice_Payment.getText().equals("")) {
            Error += "Price must not null! \n";
        } else {
            try {
                payment = Double.parseDouble(txt_Invoice_Payment.getText());
                if (payment < 0) {
                    Error += "Price must be greater than 0! \n";
                }
            } catch (Exception e) {
                Error += "Price must be number! \n";
            }
        }
        if (!Error.equals("")) {
            JOptionPane.showMessageDialog(this, Error, "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void printInvoice(){
        txt_Invoice.setText(txt_Invoice.getText()+"\n  =======================================\n\n");
        txt_Invoice.setText(txt_Invoice.getText()+"              CUSTOMER INVOICE             \n\n");
        txt_Invoice.setText(txt_Invoice.getText()+"\n  =======================================\n\n");
    }
}
