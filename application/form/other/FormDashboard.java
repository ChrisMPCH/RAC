package rac.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import rac.application.Application;
import raven.toast.Notifications;

/**
 *
 * @author RAC
 */
public class FormDashboard extends javax.swing.JPanel {

    public FormDashboard() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        
        Texto1.setText("<html>RAC es una empresa especializada en soluciones tecnológicas que emplea interfaces gráficas desarrolladas en Java Swing.</html>");
        Texto2.setText("<html>Registro de Usuarios en la aplicación RAC está diseñada para permitir la inscripción de nuevos usuarios en el sistema, ya sean alumnos o docentes. Este proceso asegura que todos los usuarios tengan acceso autorizado mediante el uso de llaveros RFID.</html>");
        Texto3.setText("<html> Registra las entradas y salidas de los usuarios de manera segura y eficiente mediante el uso de tecnología RFID (Radio Frequency Identification). Esta característica asegura un acceso controlado a las instalaciones, garantizando que solo los usuarios autorizados puedan ingresar.</html>");



       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lb = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        Imagen1 = new javax.swing.JLabel();
        Imagen2 = new javax.swing.JLabel();
        Imagen3 = new javax.swing.JLabel();
        Titulo3 = new javax.swing.JLabel();
        Titulo4 = new javax.swing.JLabel();
        Texto1 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        Texto3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Dashboard");
        add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 24, 159, 27));

        Titulo1.setFont(new java.awt.Font("Corbel", 0, 30)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(153, 153, 153));
        Titulo1.setText("Bienvenido RFID ACCESS CONTROL");
        Titulo1.setToolTipText("");
        add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 465, -1));

        Titulo2.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(153, 153, 153));
        Titulo2.setText("Acceso RFID");
        add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, -1, 30));

        Imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rac/icon/png/Acceso.png"))); // NOI18N
        add(Imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 200, 200));

        Imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rac/icon/png/quiensomos.png"))); // NOI18N
        add(Imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 200, 200));

        Imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rac/icon/png/Registro.png"))); // NOI18N
        add(Imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 200, 200));

        Titulo3.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        Titulo3.setForeground(new java.awt.Color(153, 153, 153));
        Titulo3.setText("¿Quiénes somos?");
        add(Titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, 30));

        Titulo4.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        Titulo4.setForeground(new java.awt.Color(153, 153, 153));
        Titulo4.setText("Registrar Usuarios");
        add(Titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, 30));

        Texto1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        Texto1.setForeground(new java.awt.Color(153, 153, 153));
        add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 280, 70));

        Texto2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        Texto2.setForeground(new java.awt.Color(153, 153, 153));
        add(Texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 280, 120));

        Texto3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        Texto3.setForeground(new java.awt.Color(153, 153, 153));
        add(Texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 280, 140));

        jButton3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jButton3.setText("Ver más");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 650, 80, 30));

        jButton2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jButton2.setText("Ver más");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 650, 80, 30));

        jButton1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jButton1.setText("Ver más");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 650, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rac/icon/png/PanelDash.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rac/icon/png/PanelDash.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rac/icon/png/PanelDash.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Application.showForm(new FormRFID());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Application.showForm(new FormContacto());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Application.showForm(new FormRegistrarU());
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen1;
    private javax.swing.JLabel Imagen2;
    private javax.swing.JLabel Imagen3;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JLabel Texto3;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel Titulo4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
