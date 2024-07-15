package rac.application.form.other;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import raven.toast.Notifications;

/**
 *
 * @author RAC
 */
public class FormFiltrosU extends javax.swing.JPanel
{

    FormConnectBD obj = new FormConnectBD();
    Connection conect = obj.conector();

    public FormFiltrosU()
    {
        initComponents();
        FormMostrarU u = new FormMostrarU();
        u.usuariosMostrar(tablaUser);
        Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "Seleccione una opcion");
    }

    public void usuariosMostrar(int comboOption, String valor)
    {
        DefaultTableModel baseUser = new DefaultTableModel();
        baseUser.addColumn("ID");
        baseUser.addColumn("NOMBRE");
        baseUser.addColumn("APELLIDO M");
        baseUser.addColumn("APELLIDO P");
        baseUser.addColumn("NO CONTROL");
        baseUser.addColumn("RFID");
        baseUser.addColumn("TIPO");
        baseUser.addColumn("CORREO");
        baseUser.addColumn("GENERO");
        tablaUser.setModel(baseUser);

        String codigoSQL = null;

        switch (comboOption + 1)
        {
            case 1:
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "Seleccione una opcion");
                break;
            case 2:
                codigoSQL = "SELECT * FROM USUARIOS4 WHERE id_usuario = '" + valor + "'";
                break;
            case 3:
                codigoSQL = "SELECT * FROM USUARIOS4 WHERE nombre = '" + valor + "'";
                break;
            case 4:
                codigoSQL = "SELECT * FROM USUARIOS4 WHERE a_paterno = '" + valor + "'";
                break;
            case 5:
                codigoSQL = "SELECT * FROM USUARIOS4 WHERE a_materno = '" + valor + "'";
                break;
            case 6:
                codigoSQL = "SELECT * FROM USUARIOS4 WHERE no_control = '" + valor + "'";
                break;
            case 7:
                codigoSQL = "SELECT * FROM USUARIOS4 WHERE tipo = '" + valor + "'";
                break;
            case 8:
                codigoSQL = "SELECT * FROM USUARIOS4 WHERE genero = '" + valor + "'";
                break;
            default:
                throw new AssertionError();
        }

        String[] datos = new String[9];

        try
        {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery(codigoSQL);

            while (resultado.next())//Mientas se encuentren valores
            {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                datos[7] = resultado.getString(8);
                datos[8] = resultado.getString(9);
                baseUser.addRow(datos);
            }
            tablaUser.setModel(baseUser);

        } catch (Exception e)
        {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error al ejecutar la consulta: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUser = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        comOption = new javax.swing.JComboBox<>();
        busqueda = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tablaUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUser);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por:"));

        comOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "ID Usuario", "Nombre", "Apellido P", "Apellido A", "No Control", "Tipo", "Genero" }));
        comOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comOptionActionPerformed(evt);
            }
        });

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(comOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comOptionActionPerformed
    {//GEN-HEADEREND:event_comOptionActionPerformed

    }//GEN-LAST:event_comOptionActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buscarActionPerformed
    {//GEN-HEADEREND:event_buscarActionPerformed
        usuariosMostrar(comOption.getSelectedIndex(), busqueda.getText());
    }//GEN-LAST:event_buscarActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_busquedaActionPerformed
    {//GEN-HEADEREND:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JComboBox<String> comOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUser;
    // End of variables declaration//GEN-END:variables
}
