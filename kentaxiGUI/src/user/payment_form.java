/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import config.dbConnector;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sofia
 */
public class payment_form extends javax.swing.JFrame {

    /**
     * Creates new form payment_form
     */
    public payment_form() {
        initComponents();
        displayData();
        data_load1();
    }
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT * FROM customer");
            tb.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
       
        }
        
    }
    
     public void data_load1(){

        dbConnector dbc = new dbConnector();
        
        try{
            
            String query = ("SELECT * FROM taxi_information WHERE status ='Available' ");
            ResultSet rs = dbc.getData(query);
            Vector v = new Vector();
            
            while (rs.next()){
            v.add(rs.getString("bname"));
            
            DefaultComboBoxModel com = new DefaultComboBoxModel (v);
            taxi_info.setModel(com);
        
        }
            
        }catch(SQLException e){
            System.out.println(e);
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        deletebtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        addbtn = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        license_no = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        taxi_info = new javax.swing.JComboBox<>();
        fn = new javax.swing.JTextField();
        jid = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        st = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        returnd = new com.toedter.calendar.JDateChooser();
        borrow = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        infos = new javax.swing.JLabel();
        idtaxi = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        paystat = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 10, 200, 32);

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(420, 60, 670, 460);

        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletebtnMouseExited(evt);
            }
        });

        jLabel5.setText("Delete");

        javax.swing.GroupLayout deletebtnLayout = new javax.swing.GroupLayout(deletebtn);
        deletebtn.setLayout(deletebtnLayout);
        deletebtnLayout.setHorizontalGroup(
            deletebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletebtnLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        deletebtnLayout.setVerticalGroup(
            deletebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletebtnLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(deletebtn);
        deletebtn.setBounds(850, 570, 130, 60);

        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbtnMouseExited(evt);
            }
        });

        jLabel12.setText("ADD");

        javax.swing.GroupLayout addbtnLayout = new javax.swing.GroupLayout(addbtn);
        addbtn.setLayout(addbtnLayout);
        addbtnLayout.setHorizontalGroup(
            addbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addbtnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel12)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        addbtnLayout.setVerticalGroup(
            addbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addbtnLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(addbtn);
        addbtn.setBounds(550, 570, 140, 60);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(970, 10, 110, 30);

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PLEASE FILL UP THE FORM");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(100, 10, 210, 54);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 180, 73, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("License No. ");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 230, 100, 30);
        jPanel2.add(ln);
        ln.setBounds(160, 180, 233, 40);
        jPanel2.add(license_no);
        license_no.setBounds(160, 230, 232, 38);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Borrowed");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 280, 86, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Taxi ID");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 380, 71, 40);

        taxi_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxi_infoActionPerformed(evt);
            }
        });
        jPanel2.add(taxi_info);
        taxi_info.setBounds(160, 430, 233, 38);
        jPanel2.add(fn);
        fn.setBounds(160, 130, 233, 40);

        jid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jid.setText("ID");
        jPanel2.add(jid);
        jid.setBounds(130, 70, 60, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Payment Status");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 530, 130, 40);

        st.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved" }));
        st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stActionPerformed(evt);
            }
        });
        jPanel2.add(st);
        st.setBounds(160, 580, 233, 38);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("First Name");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(20, 130, 74, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Customer ID :");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(20, 70, 98, 40);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(300, 60, 90, 40);
        jPanel2.add(returnd);
        returnd.setBounds(160, 330, 230, 40);
        jPanel2.add(borrow);
        borrow.setBounds(160, 280, 230, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Taxi Info");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 430, 62, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Plate No.");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(20, 480, 62, 40);

        infos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        infos.setForeground(new java.awt.Color(255, 255, 255));
        infos.setText("Plate No.");
        jPanel2.add(infos);
        infos.setBounds(160, 480, 230, 40);

        idtaxi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idtaxi.setForeground(new java.awt.Color(255, 255, 255));
        idtaxi.setText("ID taxi");
        jPanel2.add(idtaxi);
        idtaxi.setBounds(160, 380, 80, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Returned");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 330, 71, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Status");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(20, 580, 45, 40);

        paystat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unpaid", "Paid", " " }));
        jPanel2.add(paystat);
        paystat.setBounds(160, 530, 230, 40);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Yellow And Black Professional Cyber Monday Facebook Post.png"))); // NOI18N
        jPanel2.add(jLabel20);
        jLabel20.setBounds(0, 0, 940, 650);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 10, 410, 650);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Yellow And Black Professional Cyber Monday Facebook Post.png"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(0, 0, 940, 670);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Yellow And Black Professional Cyber Monday Facebook Post.png"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(160, 0, 940, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        // TODO add your handling code here:

        int r = tb.getSelectedRow();

        String id = tb.getValueAt(r, 0).toString();
        String firstname = tb.getValueAt(r, 1).toString();
        String lastname = tb.getValueAt(r, 2).toString();
        String license = tb.getValueAt(r, 3).toString();
        String borrows = tb.getValueAt(r, 4).toString();
        String returned = tb.getValueAt(r, 5).toString();
        String taxi = tb.getValueAt(r, 6).toString();
        String taxiplate = tb.getValueAt(r, 7).toString();
        String payment_stat = tb.getValueAt(r,8).toString();
        String stat = tb.getValueAt(r, 9).toString();

        jid.setText(id);
        fn.setText(firstname);
        ln.setText(lastname);
        license_no.setText(license);
        borrow.setToolTipText(borrows);
        returnd.setToolTipText(returned);
        taxi_info.setSelectedItem(taxi);
        paystat.setSelectedItem(payment_stat);
        infos.setText(taxiplate);
        st.setSelectedItem(stat);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date borrowedDate = sdf.parse(borrows);
                    Date returnedDate = sdf.parse(returned);
                    borrow.setDate(borrowedDate);
                    returnd.setDate(returnedDate);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Error parsing date: " + ex.getMessage());
                }

    }//GEN-LAST:event_tbMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
        
         String userid = jid.getText();
         
         dbConnector dbc = new dbConnector();
        
        try{
            if(dbc.deleteData("DELETE FROM customer WHERE id = '"+userid+"' ")){
                
                dbc.insertData("UPDATE taxi_information SET status ='Available' ");
            
                JOptionPane.showMessageDialog(null, "Data Deleted");
            }
              
            
        } catch (Exception e){
            
            System.out.println(e);

        }
        jid.setText("");
        fn.setText("");
        ln.setText("");
        license_no.setText("");
        taxi_info.setSelectedItem("");
        st.setSelectedItem("");
        borrow.setDate(null);
        returnd.setDate(null);
        displayData();
    }//GEN-LAST:event_deletebtnMouseClicked

    private void deletebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseEntered
        // TODO add your handling code here:

        deletebtn.setBackground(Color.RED);
    }//GEN-LAST:event_deletebtnMouseEntered

    private void deletebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseExited
        // TODO add your handling code here:

        deletebtn.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_deletebtnMouseExited

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        // TODO add your handling code here:

        if(license_no.getText().isEmpty() || fn.getText().isEmpty() || ln.getText().isEmpty() || license_no.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "You need to Fill up all the details");
        } else {
            
            try {
                // Get the selected dates
                java.util.Date borrowedDate = borrow.getDate();
                java.util.Date returnedDate = returnd.getDate();

                // Format the dates
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String formattedBorrowedDate = sdf.format(borrowedDate);
                String formattedReturnedDate = sdf.format(returnedDate);

                
            dbConnector dbc = new dbConnector();

            if(dbc.insertData("INSERT INTO customer (firstname, lastname, license, borrowed, returned, taxi, taxiplateno, pay_status, status) "
                    + "VALUES ('"+fn.getText()+"', '"+ln.getText()+"', '"+license_no.getText()+"', "
                            + "'"+formattedBorrowedDate+"', '"+formattedReturnedDate+"', '"+taxi_info.getSelectedItem()+"', '"+infos.getText()+"', "
                                    + " '"+paystat.getSelectedItem()+"', '"+st.getSelectedItem()+"') ")){
                if (dbc.insertData("UPDATE taxi_information SET status = 'Rented' WHERE id = '" + idtaxi.getText() + "'")) {
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                this.dispose();
                payment_form pay = new payment_form();
                pay.setVisible(true);
                } else {
                JOptionPane.showMessageDialog(null, "Failed to update taxi status");
            }

            }else{
                JOptionPane.showMessageDialog(null, "NO INTERNET GAME");
            }

            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }

            jid.setText("");
            fn.setText("");
            ln.setText("");
            license_no.setText("");
            taxi_info.setSelectedItem("");
            infos.setText("");
            st.setSelectedItem("");
            borrow.setDate(null);
            returnd.setDate(null);

            displayData();
            data_load1();
        }
    }//GEN-LAST:event_addbtnMouseClicked

    private void addbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseEntered
        // TODO add your handling code here:

        addbtn.setBackground(Color.GREEN);
    }//GEN-LAST:event_addbtnMouseEntered

    private void addbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseExited
        // TODO add your handling code here:
        addbtn.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_addbtnMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       userDashboard log = new userDashboard();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        jid.setText("");
        fn.setText("");
        ln.setText("");
        license_no.setText("");
        taxi_info.setSelectedItem("");
        st.setSelectedItem("");
        borrow.setDate(null);
        returnd.setDate(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void taxi_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxi_infoActionPerformed
        // TODO add your handling code here:
        
         String names = taxi_info.getSelectedItem().toString();

        dbConnector dbc = new dbConnector();

        try{

            String query =("SELECT plateno,id FROM taxi_information WHERE bname ='"+names+"' AND status ='Available' ");
            ResultSet rss = dbc.getData(query);

            if (rss.next()){
                infos.setText(rss.getString("plateno"));
                idtaxi.setText(rss.getString("id"));

            }

        }catch(SQLException e){

            System.out.println(e);

        }
        
    }//GEN-LAST:event_taxi_infoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        
        displayData();
        data_load1();   
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(payment_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addbtn;
    private com.toedter.calendar.JDateChooser borrow;
    private javax.swing.JPanel deletebtn;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel idtaxi;
    private javax.swing.JLabel infos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jid;
    private javax.swing.JTextField license_no;
    private javax.swing.JTextField ln;
    private javax.swing.JComboBox<String> paystat;
    private com.toedter.calendar.JDateChooser returnd;
    private javax.swing.JComboBox<String> st;
    private javax.swing.JComboBox<String> taxi_info;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
}
