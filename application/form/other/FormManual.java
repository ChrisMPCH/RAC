package rac.application.form.other;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

import com.formdev.flatlaf.FlatClientProperties;

/**
 *
 * @author RAC
 */
public class FormManual extends javax.swing.JPanel {

    public FormManual(String text) {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        lb.setText(text);
    }

    public FormManual()
    {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        
        Texto1.setText("<html>La aplicación RAC está diseñada para proporcionar una gestión integral y eficiente de las entradas y salidas de los usuarios mediante tecnología RFID. Siguiendo las instrucciones de este manual, podrás aprovechar al máximo todas las funcionalidades disponibles para mantener un control preciso y detallado de las asistencias en tu organización. \n" +
                        "\n" +
                        "<br><br>Si encuentras algún problema o tienes dudas sobre el uso de nuestro Menú, puedes acceder a la sección de \"Open File\" en la esquina inferior de esta ventana: </html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lb = new javax.swing.JLabel();
        panelPdf = new rac.application.form.PanelLogin();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelTexto = new rac.application.form.PanelLogin();
        Texto1 = new javax.swing.JLabel();

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Manual de uso");

        panelPdf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Open File");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        panelPdf.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rac/icon/png/pdf.png"))); // NOI18N
        panelPdf.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rac/icon/png/Manual.png"))); // NOI18N

        panelTexto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Texto1.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        Texto1.setToolTipText("");
        Texto1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelTexto.add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 800, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            File file = new File ("C:\\Users\\crism\\OneDrive\\Escritorio\\RAC1.4\\Manual\\ManualdeUsuario_RAC.pdf"); 
            
            if (file.exists())
            {
                if (Desktop.isDesktopSupported())
                {
                    Desktop.getDesktop().open(file);
                } else { 
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT, "Not Supported");
                }
                
            } else
            {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, "El archivo no existe");
            }
            
                    
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Texto1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb;
    private rac.application.form.PanelLogin panelPdf;
    private rac.application.form.PanelLogin panelTexto;
    // End of variables declaration//GEN-END:variables
}
