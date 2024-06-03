/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.*;
import Entities.*;
import DAL.*;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class UserUI extends javax.swing.JFrame {

    
    DefaultTableModel model;
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    public UserUI() {
        initComponents();
        
        show_Tour();
        show_TourDaDat();
    }

    //show table
    public void show_Tour(){
        model = (DefaultTableModel) tbTourUser.getModel();
        tbTourUser.setModel(TourBLL.show());
        
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tbTourUser.setDefaultRenderer(Object.class, renderer);
    }
    public void show_TourDaDat(){
        if(TourDaDatDAL.show(DangNhapUI.username)!=null){
            model = (DefaultTableModel) tbTourDaDat.getModel();
            tbTourDaDat.setModel(TourDaDatBLL.show(DangNhapUI.username));
        }
   
        renderer.setHorizontalAlignment( JLabel.CENTER );      
    }
    
    //show row
    public void show_Row(){
        int i = tbTourUser.getSelectedRow();
        txtTenTourUser.setText((String)(tbTourUser.getValueAt(i,1)));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        userInfo = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbTourUser = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtSearchTour = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnResetTB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTenTourUser = new javax.swing.JTextField();
        btnDatTour = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbTourDaDat = new javax.swing.JTable();
        btnXoaTour = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 216, 253));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 106, 122), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 81));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 38, 66));
        jLabel1.setText("Công ty Du lịch HOA SEN");

        jLabel25.setBackground(new java.awt.Color(153, 255, 255));

        btnLogOut.setText("Đăng xuất");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        userInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/employee.jpg"))); // NOI18N
        userInfo.setText("User");
        userInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userInfo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        userInfo.setMaximumSize(new java.awt.Dimension(40, 40));
        userInfo.setMinimumSize(new java.awt.Dimension(40, 40));
        userInfo.setPreferredSize(new java.awt.Dimension(40, 40));
        userInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogOut)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnLogOut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(userInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 51));

        tbTourUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã tour", "Tên tour", "Thời gian", "Địa điểm", "Mã xe", "Mã khách sạn"
            }
        ));
        tbTourUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTourUserMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbTourUser);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.jpg"))); // NOI18N
        btnSearch.setActionCommand("Search");
        btnSearch.setMaximumSize(new java.awt.Dimension(30, 30));
        btnSearch.setMinimumSize(new java.awt.Dimension(30, 30));
        btnSearch.setPreferredSize(new java.awt.Dimension(30, 30));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearchTour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tìm kiếm:");

        btnResetTB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetIcon (1).png"))); // NOI18N
        btnResetTB.setMaximumSize(new java.awt.Dimension(30, 30));
        btnResetTB.setMinimumSize(new java.awt.Dimension(30, 30));
        btnResetTB.setPreferredSize(new java.awt.Dimension(30, 30));
        btnResetTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetTBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tên Tour:");

        txtTenTourUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnDatTour.setBackground(new java.awt.Color(255, 255, 153));
        btnDatTour.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDatTour.setForeground(new java.awt.Color(0, 0, 255));
        btnDatTour.setText("Đặt tour");
        btnDatTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatTourActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN TOUR HIỆN HÀNH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenTourUser, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDatTour))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchTour, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnResetTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtSearchTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenTourUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnDatTour, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tour", jPanel2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOUR ĐÃ ĐẶT");

        tbTourDaDat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã tour", "Tên tour", "Thời gian", "Địa điểm", "Giá vé", "Tên du khách"
            }
        ));
        tbTourDaDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTourDaDatMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbTourDaDat);

        btnXoaTour.setBackground(new java.awt.Color(255, 255, 153));
        btnXoaTour.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaTour.setForeground(new java.awt.Color(0, 0, 255));
        btnXoaTour.setText("Xóa Tour");
        btnXoaTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(btnXoaTour))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnXoaTour, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tour đã đặt", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        AutomaticallyClosedMsgBox(2000, "Đang đăng xuất.\nXin hãy đợi...");
        this.dispose();
        DangNhapUI dn = new DangNhapUI("Quản lý du lịch");
        dn.showWindow();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void userInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInfoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ThongTinUserUI dn = new ThongTinUserUI();
        dn.showWindow();
    }//GEN-LAST:event_userInfoActionPerformed

    private void btnDatTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatTourActionPerformed
//        this.dispose();
//        DatTourUI dn = new DatTourUI();
//        dn.showWindow();
        try{
            Tour s = TourDAL.GetTour(txtTenTourUser.getText());
            this.dispose();
            DatTourUI dn = new DatTourUI(DangNhapUI.username,s);
            dn.showWindow();  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Có lỗi: "+e);
        }
    }//GEN-LAST:event_btnDatTourActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) tbTourUser.getModel();
        model.setRowCount(0);
        int i=1;
        for(Tour item:TourDAL.show()){
            if(item.getTenTour().toLowerCase().contains(txtSearchTour.getText())){
                model.addRow(new Object[]{
                    i++,
                    item.getMaTour(),
                    item.getTenTour(),
                    item.getThoiGian(),
                    item.getDiaDiem(),
                    item.getMaXe(),
                    item.getMaKS(),
                });
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetTBActionPerformed
        // TODO add your handling code here:
        show_Tour();
    }//GEN-LAST:event_btnResetTBActionPerformed

    private void tbTourUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTourUserMouseClicked
        show_Row();
    }//GEN-LAST:event_tbTourUserMouseClicked

    private void tbTourDaDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTourDaDatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTourDaDatMouseClicked

    private void btnXoaTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTourActionPerformed
        try{
            int i = tbTourDaDat.getSelectedRow();
            if(i == -1){
                JOptionPane.showMessageDialog(rootPane,"Hãy chọn một dòng để xóa");
            } else if(TourDaDatDAL.show(DangNhapUI.username).isEmpty()){
                JOptionPane.showMessageDialog(rootPane,"Không có tour đã đặt để xóa");
            }
            else{
                TourDaDat delTour = TourDaDatDAL.show(DangNhapUI.username).get(i);
                int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?", "Thông báo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    TourDaDatDAL.delete(TourDaDatDAL.show(DangNhapUI.username), delTour);
                    model = (DefaultTableModel) tbTourDaDat.getModel();
                    model.setRowCount(0);
                    show_TourDaDat();
                } 
                
            }
            
        }
        catch(IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnXoaTourActionPerformed

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
            java.util.logging.Logger.getLogger(UserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserUI().setVisible(true);
            }
        });
    }

    public void AutomaticallyClosedMsgBox(long time, String text) {
        JOptionPane jop = new JOptionPane();
        jop.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        jop.setMessage(text);
        JDialog dialog = jop.createDialog(null, "Thông báo");

        // Set timer
        new Thread(() -> {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            dialog.dispose();
        }).start();

        dialog.setVisible(true);
    }
    
    public void showWindow() {
        this.setSize(1000, 713);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatTour;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnResetTB;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnXoaTour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbTourDaDat;
    private javax.swing.JTable tbTourUser;
    private javax.swing.JTextField txtSearchTour;
    private javax.swing.JTextField txtTenTourUser;
    private javax.swing.JButton userInfo;
    // End of variables declaration//GEN-END:variables
}
