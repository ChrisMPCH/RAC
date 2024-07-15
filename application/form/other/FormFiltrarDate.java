package rac.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import com.mysql.jdbc.Connection;
import com.raven.datechooser.DateBetween;
import com.raven.datechooser.DateChooser;
import com.raven.datechooser.listener.DateChooserAction;
import com.raven.datechooser.listener.DateChooserAdapter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import raven.toast.Notifications;

/**
 *
 * @author RAC
 */
public class FormFiltrarDate extends javax.swing.JPanel
{

    FormConnectBD obj = new FormConnectBD();
    Connection conect = obj.conector();
    private DateChooser chDate = new DateChooser();

    public FormFiltrarDate(String text)
    {
        initComponents();
        joinHistorialUsuarioMostrar();
        chDate.setTextField(calendario);
        chDate.setDateSelectionMode(DateChooser.DateSelectionMode.BETWEEN_DATE_SELECTED);
        chDate.setLabelCurrentDayVisible(false); //Quitar lo del Hoy en calandario

        // Agrega un listener para detectar cambios en el rango de fechas seleccionado en el componente DateChooser
        chDate.addActionDateChooserListener(new DateChooserAdapter()
        {
            @Override
            public void dateBetweenChanged(DateBetween date, DateChooserAction action)
            {
                // Formato para convertir las fechas seleccionadas a cadena en formato 'yyyy-MM-dd'
                SimpleDateFormat baseFormato = new SimpleDateFormat("yyyy-MM-dd");

                // Obtiene la fecha inicial del rango seleccionado y la convierte a formato 'yyyy-MM-dd'
                String fechaA = baseFormato.format(date.getFromDate());

                // Obtiene la fecha final del rango seleccionado y la convierte a formato 'yyyy-MM-dd'
                String fechaB = baseFormato.format(date.getToDate());

                // Llama al método 'filtroFechas' para filtrar los registros según el rango de fechas seleccionado
                filtroFechas(fechaA, fechaB);
            }
        });
    }

    public FormFiltrarDate()
    {
        initComponents();
        joinHistorialUsuarioMostrar();
        chDate.setTextField(calendario);
        chDate.setDateSelectionMode(DateChooser.DateSelectionMode.BETWEEN_DATE_SELECTED);
        chDate.setLabelCurrentDayVisible(false); //Quitar lo del Hoy en calandario

        // Agrega un listener para detectar cambios en el rango de fechas seleccionado en el componente DateChooser
        chDate.addActionDateChooserListener(new DateChooserAdapter()
        {
            @Override
            public void dateBetweenChanged(DateBetween date, DateChooserAction action)
            {
                // Formato para convertir las fechas seleccionadas a cadena en formato 'yyyy-MM-dd'
                SimpleDateFormat baseFormato = new SimpleDateFormat("yyyy-MM-dd");

                // Obtiene la fecha inicial del rango seleccionado y la convierte a formato 'yyyy-MM-dd'
                String fechaA = baseFormato.format(date.getFromDate());

                // Obtiene la fecha final del rango seleccionado y la convierte a formato 'yyyy-MM-dd'
                String fechaB = baseFormato.format(date.getToDate());

                // Llama al método 'filtroFechas' para filtrar los registros según el rango de fechas seleccionado
                filtroFechas(fechaA, fechaB);
            }
        });
    }

    public void filtroFechas(String fechaA, String fechaB)
    {
        DefaultTableModel baseUser = new DefaultTableModel();
        baseUser.addColumn("ID");
        baseUser.addColumn("NOMBRE");
        baseUser.addColumn("NO CONTROL");
        baseUser.addColumn("FECHA ENTRADA");
        baseUser.addColumn("FECHA SALIDA");
        tableHistory.setModel(baseUser);

        String[] datos = new String[5];

        try
        {
            // Prepara la consulta SQL utilizando PreparedStatement
            String sql = "SELECT "
                    + "h.id_historial, "
                    + "CONCAT(u.nombre, ' ', u.a_paterno, ' ', u.a_materno) AS nombre_completo, "
                    + "u.no_control, "
                    + "h.fecha_entrada, "
                    + "h.fecha_salida "
                    + "FROM Historial4 h "
                    + "JOIN Usuarios4 u ON h.id_usuario = u.id_usuario "
                    + "WHERE h.fecha_entrada BETWEEN ? AND ?";

            PreparedStatement stmt = conect.prepareStatement(sql);
            stmt.setString(1, fechaA);
            stmt.setString(2, fechaB);

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next())
            {
                datos[0] = resultado.getString("id_historial");
                datos[1] = resultado.getString("nombre_completo");
                datos[2] = resultado.getString("no_control");
                datos[3] = resultado.getString("fecha_entrada");
                datos[4] = resultado.getString("fecha_salida");
                baseUser.addRow(datos);
            }
            tableHistory.setModel(baseUser);

        } catch (SQLException e)
        {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error al ejecutar la consulta: " + e.getMessage());
        }
    }

    public void joinHistorialUsuarioMostrar()
    {
        DefaultTableModel baseUser = new DefaultTableModel();
        baseUser.addColumn("ID");
        baseUser.addColumn("NOMBRE");
        baseUser.addColumn("NO CONTROL");
        baseUser.addColumn("FECHA ENTRADA");
        baseUser.addColumn("FECHA SALIDA");
        tableHistory.setModel(baseUser);

        String[] datos = new String[5]; // Solo necesitamos 5 columnas

        try
        {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT "
                    + "h.id_historial, "
                    + "CONCAT(u.nombre, ' ', u.a_paterno, ' ', u.a_materno) AS nombre_completo, "
                    + "u.no_control, "
                    + "h.fecha_entrada, "
                    + "h.fecha_salida "
                    + "FROM Historial4 h JOIN Usuarios4 u ON h.id_usuario = u.id_usuario");

            while (resultado.next())
            { // Mientras se encuentren valores
                datos[0] = resultado.getString("id_historial");
                datos[1] = resultado.getString("nombre_completo");
                datos[2] = resultado.getString("no_control");
                datos[3] = resultado.getString("fecha_entrada");
                datos[4] = resultado.getString("fecha_salida");

                baseUser.addRow(datos);
            }
            tableHistory.setModel(baseUser);

        } catch (Exception e)
        {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error al buscar el usuario: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHistory = new javax.swing.JTable();
        calendario = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Historial de Entradas");

        tableHistory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableHistory);

        calendario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                calendarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void calendarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calendarioActionPerformed
    {//GEN-HEADEREND:event_calendarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calendarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField calendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHistory;
    // End of variables declaration//GEN-END:variables
}
