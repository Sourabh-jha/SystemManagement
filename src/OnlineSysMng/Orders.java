/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineSysMng;

import java.awt.event.WindowEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.function.Function;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author romi
 */
public class Orders extends javax.swing.JFrame {

    /**
     * Creates new form Orders
     */
    public Orders() {
        initComponents();
        this.setSize(1200,675);
        Show_Info_In_Table();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jtxtAssistantId = new javax.swing.JTextField();
        jtxtOrdNo = new javax.swing.JTextField();
        jtxtSupplierId1 = new javax.swing.JTextField();
        jbtnbck = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtQuantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_AddDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Chiller", 0, 100)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORDERS...");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 30, 410, 100);

        jLabel3.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Assistant_Id");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(650, 130, 170, 40);

        jLabel4.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(710, 360, 110, 50);

        jLabel6.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Ord_Date");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(700, 430, 130, 40);

        jLabel7.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Supplier_Id");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(670, 490, 160, 40);

        jLabel10.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Component");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(680, 180, 140, 40);

        jComboBox1.setFont(new java.awt.Font("Chiller", 2, 36)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monitor", "CPU", "Keyboard", "Mouse", "UPS" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(840, 180, 310, 40);

        jtxtAssistantId.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jtxtAssistantId.setForeground(new java.awt.Color(153, 153, 153));
        jtxtAssistantId.setText("Enter Assistant_Id here...");
        jtxtAssistantId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtAssistantIdMouseClicked(evt);
            }
        });
        jPanel1.add(jtxtAssistantId);
        jtxtAssistantId.setBounds(840, 120, 310, 40);

        jtxtOrdNo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jtxtOrdNo.setForeground(new java.awt.Color(153, 153, 153));
        jtxtOrdNo.setText("Enter Order Id here...");
        jtxtOrdNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtOrdNoMouseClicked(evt);
            }
        });
        jPanel1.add(jtxtOrdNo);
        jtxtOrdNo.setBounds(840, 300, 310, 40);

        jtxtSupplierId1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jtxtSupplierId1.setForeground(new java.awt.Color(153, 153, 153));
        jtxtSupplierId1.setText("Enter Supplier_Id here...");
        jtxtSupplierId1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtSupplierId1MouseClicked(evt);
            }
        });
        jPanel1.add(jtxtSupplierId1);
        jtxtSupplierId1.setBounds(840, 490, 310, 40);

        jbtnbck.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N
        jbtnbck.setForeground(new java.awt.Color(255, 255, 255));
        jbtnbck.setText("BACK");
        jbtnbck.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        jbtnbck.setContentAreaFilled(false);
        jbtnbck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbckActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnbck);
        jbtnbck.setBounds(1020, 20, 150, 40);

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(840, 430, 310, 40);

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 255, 255));
        jButton1.setText("PLACE_ORDER");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 0), 1, true));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(650, 590, 170, 40);

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CHECK QUANTITY");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(840, 240, 220, 40);

        jTextField1.setFont(new java.awt.Font("Chiller", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("2");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(1090, 240, 60, 40);

        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 2, true));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(640, 580, 190, 60);

        jLabel5.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Ord_Id");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(720, 310, 100, 40);

        jtxtQuantity.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jtxtQuantity.setForeground(new java.awt.Color(153, 153, 153));
        jtxtQuantity.setText("Enter Quantity here...");
        jtxtQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtQuantityMouseClicked(evt);
            }
        });
        jPanel1.add(jtxtQuantity);
        jtxtQuantity.setBounds(840, 360, 310, 40);

        jLabel8.setForeground(new java.awt.Color(80, 197, 77));
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(111, 200, 52), 3, true));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(610, 80, 560, 570);

        txt_AddDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        jPanel1.add(txt_AddDate);
        txt_AddDate.setBounds(600, 90, 560, 570);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lab_No", "System_No", "Component", "Assistant_Id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 190, 480, 310);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OnlineSysMng/8qWrlox.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1215, 709));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Connection con=getConnection();
            PreparedStatement ps=null;
            ResultSet rs=null;
            CallableStatement cs;
            cs=con.prepareCall("{ Call Quantities(?,?)}");
            cs.setString("comp", (String) jComboBox1.getSelectedItem());
            cs.setString("Assis",jtxtAssistantId.getText());
            cs.executeUpdate();
            JOptionPane.showMessageDialog(null,"Connected To Stored Procedure");
            ps=con.prepareStatement("Select * from quant");
            rs=ps.executeQuery();
            while(rs.next()){
                jTextField1.setText(rs.getString("Quantityy"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Not Connected");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection con=getConnection();
           // PreparedStatement  ps=con.prepareStatement("INSERT INTO orders(Ord_time) VALUES(NOW())");
            PreparedStatement ps=con.prepareStatement("INSERT INTO Orders(Order_Id,Lab_Assistant_Id,Ord_Date,Component,Supplier_id,Quantity)"+"values(?,?,?,?,?,?)");
            ps.setString(1,jtxtOrdNo.getText());
            ps.setString(2,jtxtAssistantId.getText());
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String addDate=dateFormat.format(jDateChooser1.getDate());
            ps.setString(3,addDate);
            ps.setString(4, (String) jComboBox1.getSelectedItem());
            ps.setString(5,jtxtSupplierId1.getText());
            ps.setString(6,jtxtQuantity.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Inserted");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        jDateChooser1.setDate(null);
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jbtnbckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbckActionPerformed
        systemExit();
        this.hide();
        MainPage1 mp1=new MainPage1();
        mp1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnbckActionPerformed

    private void jtxtSupplierId1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtSupplierId1MouseClicked
        jtxtSupplierId1.setText(null);
    }//GEN-LAST:event_jtxtSupplierId1MouseClicked

    private void jtxtOrdNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtOrdNoMouseClicked
        jtxtOrdNo.setText(null);
    }//GEN-LAST:event_jtxtOrdNoMouseClicked

    private void jtxtAssistantIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtAssistantIdMouseClicked
        jtxtAssistantId.setText(null);
    }//GEN-LAST:event_jtxtAssistantIdMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jtxtQuantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtQuantityMouseClicked
        jtxtQuantity.setText(null);
    }//GEN-LAST:event_jtxtQuantityMouseClicked

    public ArrayList<Table> getTableList()
    {
        ArrayList<Table> tableList = new ArrayList<Table>();
        Connection con = getConnection();
        String query = "SELECT Lab_No,System_No,Component,Lab_Assistant_Id FROM Not_Working ";
        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement();
            rs=st.executeQuery(query);
            Table table;
            while(rs.next())
            {
                table = new Table(rs.getInt("Lab_No"),rs.getInt("System_No"),rs.getString("Component"),rs.getInt("Lab_Assistant_Id"));
                tableList.add(table);
            }
        } catch (SQLException ex) {
            //e.printStackTrace();
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tableList;
    }
    
    public void Show_Info_In_Table()
    {
        ArrayList<Table> list = getTableList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[4];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getLabNo();
            row[1]=list.get(i).getSystemNo();
            row[2]=list.get(i).getComponent();
            row[3]=list.get(i).getAssistantId();
            model.addRow(row);
        }
    }
    /**
     * @param args the command line arguments
     */
    public Connection getConnection()
    {
        
        Connection con=null;
        try { 
            con=DriverManager.getConnection("jdbc:mysql://localhost/system_mgmnt","root","");
            //JOptionPane.showMessageDialog(null,"Connected");
            return con;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(MainPage1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Not Connected");
            return null;
        }
        
    }
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
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnbck;
    private javax.swing.JTextField jtxtAssistantId;
    private javax.swing.JTextField jtxtOrdNo;
    private javax.swing.JTextField jtxtQuantity;
    private javax.swing.JTextField jtxtSupplierId1;
    private javax.swing.JLabel txt_AddDate;
    // End of variables declaration//GEN-END:variables
private void systemExit()
    {
        WindowEvent winClosing=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
}
