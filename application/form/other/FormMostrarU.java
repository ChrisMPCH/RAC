package rac.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import raven.toast.Notifications;

/**
 *
 * @author RAC
 */
public class FormMostrarU extends javax.swing.JPanel
{

    FormConnectBD obj = new FormConnectBD();
    Connection conect = obj.conector();

    public FormMostrarU()
    {
        initComponents();
        usuariosMostrar(tablaUser);
    }

    public void usuariosMostrar(JTable t)
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
        t.setModel(baseUser);

        String[] datos = new String[9];

        try
        {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM USUARIOS4");

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
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error al mostrar usuarios: " + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUser = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios");

        tablaUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {},
                {},
                {},
                {}
            },
            new String []
            {

            }
        ));
        jScrollPane1.setViewportView(tablaUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUser;
    // End of variables declaration//GEN-END:variables
}
