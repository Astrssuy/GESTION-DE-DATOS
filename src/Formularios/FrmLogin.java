/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tarea4_2.ConexionSQL;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;

/**
 *
 * @author robin
 */
public class FrmLogin extends javax.swing.JFrame {


    

    /**
     * 
     * Creates new form FrmLogin
     */
    public FrmLogin() {
        initComponents();

        this.setLocationRelativeTo(null);
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
        txtUsuario = new javax.swing.JTextField();
        Jcontra = new javax.swing.JPasswordField();
        LOGIN = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        chkMostrarpassword = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(51, 51, 51));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 210, 30));

        Jcontra.setBackground(new java.awt.Color(51, 51, 51));
        Jcontra.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Jcontra.setForeground(new java.awt.Color(255, 255, 255));
        Jcontra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jcontra.setBorder(null);
        Jcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcontraActionPerformed(evt);
            }
        });
        jPanel1.add(Jcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 210, 30));

        LOGIN.setBackground(new java.awt.Color(23, 24, 30));
        LOGIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N
        LOGIN.setToolTipText("");
        LOGIN.setBorder(null);
        LOGIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGINMouseClicked(evt);
            }
        });
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        jPanel1.add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 180, 30));

        jButton2.setBackground(new java.awt.Color(23, 24, 30));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Create a account (1).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 240, 30));

        chkMostrarpassword.setForeground(new java.awt.Color(255, 255, 255));
        chkMostrarpassword.setText("Mostrar password");
        chkMostrarpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(chkMostrarpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/baseline_lock_white_48dp.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/baseline_account_circle_white_48dp.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 50, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 3, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Login");

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel7.setText("Usuario / Logeo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sphere (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 210, 180));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 210, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 210, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sphere.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 100, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
            FrmRegistros FrmRegistros=new FrmRegistros();
            FrmRegistros.setVisible(true);
            dispose();
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
       
        
        
   // TODO add your handling code here:
    }//GEN-LAST:event_LOGINActionPerformed

    private void JcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcontraActionPerformed

    private void LOGINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGINMouseClicked


        ingresar();









        // TODO add your handling code here:
    }//GEN-LAST:event_LOGINMouseClicked

    private void chkMostrarpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMostrarpasswordActionPerformed




    
        if(chkMostrarpassword.isSelected()){
            Jcontra.setEchoChar((char)0);
            
        }else{
            Jcontra.setEchoChar('*');
        
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_chkMostrarpasswordActionPerformed

    /**
     * @param args the command line arguments
     */

    
    /*public Connection conexion(){
    Connection conectar=null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios","root","");
            
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error de conexion " + e.getMessage());
        }
        return conectar;
    }
    
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void ingresar(){
        
        
        Connection con1=null;
        PreparedStatement pst = null;
        ResultSet rs= null;
        
        String User =txtUsuario.getText();
        String Pass =Jcontra.getText();
        
        
        if (User.equals("") |Pass.equals("")){
            JOptionPane.showMessageDialog(null,"Uno o mas campos estan vacios, por favor llenarlos");
            
            
            
            
            
            
            
            
            
            
         }else{
            try {
                ConexionSQL ConexionSQL= new ConexionSQL();
                
               con1=ConexionSQL.conexion();
               
               
               String SQL="select Usuarios, Contra from usuarios where Usuarios='" + User + "' and Contra='"+ Pass +"'";
               
               pst=(PreparedStatement) con1.prepareStatement(SQL);
                     
               rs = pst.executeQuery();
               if (rs.next()) {
                   
            FrmPanel FrmPanel=new FrmPanel();
            FrmPanel.setVisible(true);
            dispose();
                   
                   
                   
               }else{
                   
                   
                   JOptionPane.showMessageDialog(null,"Usuario o password incorrectos. Vuelva a intentarlo de nuevo");
               
                   
                   
                   
               }
                       
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Error inesperado" + e.getMessage());
                
                
                
                
            }
            
            }
        
        }
    
    
    
    
    
    /*public void ValidarAdmin(){
        int resultado=0;

        
        try {
            String usuario=txtUsuario.getText();
            String contra1=String.valueOf(Jcontra.getText());
            String SQL="SELECT * FROM usuarios WHERE Usuario='" +usuario+"' and Contr='"+contra1+"' ";
            
            
            
            
            Statement st=(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(SQL);
            
            if (rs.next()){
                
                resultado=1;
                if (resultado==1){
                
                   FrmPanel FrmPanel=new FrmPanel();
                   FrmPanel.setVisible(true);
                   this.dispose();
                
                }
                
            }else{
                
                JOptionPane.showMessageDialog(null,"Error de usuario y passworrd");
            }
            
           
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al conectar al conectar a base de datos");
        }
    
    }
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Jcontra;
    private javax.swing.JButton LOGIN;
    private javax.swing.JCheckBox chkMostrarpassword;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private Connection getConection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
