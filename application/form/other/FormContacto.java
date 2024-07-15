package rac.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;

/**
 *
 * @author RAC
 */
public class FormContacto extends javax.swing.JPanel {

    public FormContacto(String text) {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        lb.setText(text);
    }

    public FormContacto()
    {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        
        Texto1.setText("<html>RAC es una empresa especializada en soluciones tecnológicas que emplea interfaces gráficas desarrolladas en Java Swing. Nuestro propósito es proporcionar herramientas efectivas para la gestión de información, garantizando la eficiencia y la accesibilidad a través de nuestras aplicaciones.</html>");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lb = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Texto1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelPdf = new rac.application.form.PanelLogin();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Acerca de RAC");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Version: 1.0");

        Texto1.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        Texto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto1.setToolTipText("");
        Texto1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rac/icon/png/RACBannerC.png"))); // NOI18N

        panelPdf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("racRFIDAC@gmail.com");
        panelPdf.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Contáctanos:");
        panelPdf.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("+52 729 158 9593");
        panelPdf.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rac/icon/png/Tel.png"))); // NOI18N
        panelPdf.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 50, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rac/icon/png/Correo.png"))); // NOI18N
        panelPdf.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(panelPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lb;
    private rac.application.form.PanelLogin panelPdf;
    // End of variables declaration//GEN-END:variables
}
