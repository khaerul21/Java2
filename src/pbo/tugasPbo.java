/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbo;

import com.config.MyConfig;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author Hp
 */
public class tugasPbo extends javax.swing.JFrame {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_sisfo";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";
    
    
    
    public void clear(){
        box_namaBarang.setText("");
        box_hargaBarang.setText("");
        box_jumlahBarang.setText("");
        box_namaBarang.requestFocus();
    }
    
    public void insertData(){
        int index = jTable1.getRowCount();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
            index += 1,
            box_namaBarang.getText(),
            box_hargaBarang.getText(),
            box_jumlahBarang.getText()
    });
    }

    /**
     * Creates new form tugasPbo
     */
    public tugasPbo() {
        try{
        
        initComponents();
        connection = DriverManager.getConnection(DB_URL, DB_USER , DB_PASS);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection: Gagal");
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
        Labelnama = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        box_namaBarang = new javax.swing.JTextField();
        box_hargaBarang = new javax.swing.JTextField();
        box_jumlahBarang = new javax.swing.JTextField();
        Tambah = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Total = new javax.swing.JLabel();
        Tunai = new javax.swing.JLabel();
        Kembali = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Hitung = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 0, 153));

        Labelnama.setBackground(new java.awt.Color(51, 51, 51));
        Labelnama.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Labelnama.setForeground(new java.awt.Color(51, 51, 51));
        Labelnama.setText("E7 STORE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(Labelnama, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Labelnama, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 51, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nama Barang");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Harga Barang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Jumlah Barang");

        box_namaBarang.setBackground(new java.awt.Color(153, 255, 255));
        box_namaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_namaBarangActionPerformed(evt);
            }
        });

        box_hargaBarang.setBackground(new java.awt.Color(153, 255, 255));

        box_jumlahBarang.setBackground(new java.awt.Color(153, 255, 255));

        Tambah.setBackground(new java.awt.Color(153, 153, 153));
        Tambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        Edit.setBackground(new java.awt.Color(51, 51, 255));
        Edit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(255, 255, 0));
        Delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(255, 0, 0));
        Clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 51, 153));

        Total.setBackground(new java.awt.Color(255, 255, 255));
        Total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Total.setForeground(new java.awt.Color(255, 255, 255));
        Total.setText("Total");

        Tunai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tunai.setForeground(new java.awt.Color(255, 255, 255));
        Tunai.setText("Tunai");

        Kembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Kembali.setForeground(new java.awt.Color(255, 255, 255));
        Kembali.setText("Kembali");

        jTextField4.setBackground(new java.awt.Color(153, 255, 255));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.setText("Rp.");

        jTextField5.setBackground(new java.awt.Color(153, 255, 255));

        jTextField6.setBackground(new java.awt.Color(153, 255, 255));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField6.setText("Rp.");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        Hitung.setBackground(new java.awt.Color(0, 204, 255));
        Hitung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });

        Simpan.setBackground(new java.awt.Color(0, 204, 255));
        Simpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Hitung)
                .addGap(18, 18, 18)
                .addComponent(Simpan))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Total)
                    .addComponent(Tunai)
                    .addComponent(Kembali))
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Total)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tunai)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kembali)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hitung)
                    .addComponent(Simpan))
                .addGap(51, 51, 51))
        );

        jPanel4.setBackground(new java.awt.Color(255, 51, 153));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Harga", "Jumlah"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_jumlahBarang)
                            .addComponent(box_hargaBarang)
                            .addComponent(box_namaBarang)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tambah)
                        .addGap(18, 18, 18)
                        .addComponent(Edit)
                        .addGap(18, 18, 18)
                        .addComponent(Delete)
                        .addGap(18, 18, 18)
                        .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(box_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(box_hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(box_jumlahBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tambah)
                            .addComponent(Edit)
                            .addComponent(Delete)
                            .addComponent(Clear))
                        .addGap(14, 14, 14)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_namaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_namaBarangActionPerformed
        // TODO add your handling code here:
        String tunai = jTextField5.getText();
        jTextField5.setText(tunai);
       
    }//GEN-LAST:event_box_namaBarangActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
        if (box_namaBarang.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama barang belum di input");
            box_namaBarang.requestFocus();
        } else if (box_hargaBarang.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Harga barang belum di input");
            box_hargaBarang.requestFocus();
        } else if (box_jumlahBarang.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Jumlah barang belum di input");
            box_jumlahBarang.requestFocus();
        } else{
            insertData();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
            clear();
        }
    }//GEN-LAST:event_TambahActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
         int jumlahRowData = jTable1.getRowCount();
        int indexDataSelect = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        if (jumlahRowData == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        } else {
            if (indexDataSelect != -1) {
                model.removeRow(indexDataSelect);
            } else {
                JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin di hapus");
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        int jumlahRowData = jTable1.getRowCount();
        int indexDataSelect = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        if (jumlahRowData == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        } else {
            if (indexDataSelect != -1) {
                if (Edit.getText() == "Edit"){
                Tambah.setEnabled(false);
                Delete.setEnabled(false);
                Edit.setText("Update");

                box_namaBarang.setText(model.getValueAt(indexDataSelect, 1).toString());
                box_hargaBarang.setText(model.getValueAt(indexDataSelect, 2).toString());
                box_jumlahBarang.setText(model.getValueAt(indexDataSelect, 3).toString());
            } else {
                Tambah.setEnabled(true);
                Delete.setEnabled(true);
                Edit.setText("Edit");

                model.setValueAt(box_namaBarang.getText().toString(), indexDataSelect, 1);
                model.setValueAt(box_hargaBarang.getText().toString(), indexDataSelect, 2);
                model.setValueAt(box_jumlahBarang.getText().toString(), indexDataSelect, 3);

                clear();           
                }
            } else {
                JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin di edit");
            }
        } 
    }//GEN-LAST:event_EditActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_ClearActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
         int jumlahRowData = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int totalHarga = 0;
        int inputTunai = 0;

        String tunai = jTextField5.getText();
        if (!tunai.isEmpty()) {
            try {
                inputTunai = Integer.parseInt(tunai);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input tunai tidak valid. Harap masukkan angka");
                return; // Menghentikan eksekusi lebih lanjut jika input tidak valid
            }
        } else {
            JOptionPane.showMessageDialog(null, "Input tunai kosong. Harap masukkan angka");
            return; // Menghentikan eksekusi lebih lanjut jika input kosong
        }

        for (int i = 0; i < jumlahRowData; i++) {
            int hargaBarang = Integer.parseInt(model.getValueAt(i, 2).toString());
            int jumlahBarang = Integer.parseInt(model.getValueAt(i, 3).toString());

            int subTotal = hargaBarang * jumlahBarang;
            totalHarga += subTotal;
        }

        String total = String.valueOf(totalHarga);
        jTextField4.setText(total);

        if (inputTunai < totalHarga) {
            JOptionPane.showMessageDialog(null, "Tunai harus lebih besar atau sama dengan total harga");
            jTextField6.setText("");
            return; // Menghentikan eksekusi lebih lanjut jika tunai kurang dari total harga
        } else {
            int kembalian = inputTunai - totalHarga;
            String kembali = String.valueOf(kembalian);
            jTextField6.setText(kembali);
            JOptionPane.showMessageDialog(null, "Berhasil menghitung");
        }
    
    }//GEN-LAST:event_HitungActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
         int jumlahRowData = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        if (jumlahRowData == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        } else {
            for (int i = 0; i < jumlahRowData; i++) {
                String namaBarang = model.getValueAt(i, 1).toString();
                int hargaBarang = Integer.parseInt(model.getValueAt(i, 2).toString());
                int jumlahBarang = Integer.parseInt(model.getValueAt(i, 3).toString());

               MyConfig.insertData(namaBarang, hargaBarang, jumlahBarang);
            }

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke dalam database");
        }
    }//GEN-LAST:event_SimpanActionPerformed

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
            java.util.logging.Logger.getLogger(tugasPbo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tugasPbo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tugasPbo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tugasPbo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tugasPbo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hitung;
    private javax.swing.JLabel Kembali;
    private javax.swing.JLabel Labelnama;
    private javax.swing.JButton Simpan;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Tunai;
    private javax.swing.JTextField box_hargaBarang;
    private javax.swing.JTextField box_jumlahBarang;
    private javax.swing.JTextField box_namaBarang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}