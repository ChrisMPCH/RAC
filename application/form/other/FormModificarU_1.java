package rac.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import cjb.ci.CtrlInterfaz;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import raven.toast.Notifications;

/**
 *
 * @author RAC
 */
public class FormModificarU_1 extends javax.swing.JPanel
{

    FormConnectBD obj = new FormConnectBD();
    Connection conect = obj.conector();

    public FormModificarU_1(String text)
    {
        initComponents();

    }

    public FormModificarU_1()
    {
        initComponents();
        CtrlInterfaz.habilita(false, nombre, a_paterno, a_materno, genero, tipo, correo, no_control);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        a_materno = new javax.swing.JTextField();
        GeneroLabel = new javax.swing.JLabel();
        genero = new javax.swing.JComboBox<>();
        UsuariosTitle = new javax.swing.JLabel();
        TipoLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        id_usuario = new javax.swing.JTextField();
        CorreoLabel = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        NoCLabel = new javax.swing.JLabel();
        ApatLabel = new javax.swing.JLabel();
        no_control = new javax.swing.JTextField();
        a_paterno = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        AmatLabel = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        GeneroLabel.setText("Genero:");

        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion", "M", "F" }));

        UsuariosTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UsuariosTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuariosTitle.setText("Usuarios");

        TipoLabel.setText("Tipo:");

        IDLabel.setText("ID Usuario:");

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion", "Alumno", "Docente" }));

        CorreoLabel.setText("Correo:");

        NoCLabel.setText("Numero de Control:");

        ApatLabel.setText("Apellido Paterno:");

        Aceptar.setText("Eliminar");
        Aceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AceptarActionPerformed(evt);
            }
        });

        AmatLabel.setText("Apellido Materno:");

        NombreLabel.setText("Nombre:");

        Cancelar.setText("Limpiar");
        Cancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CancelarActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NoCLabel)
                                .addComponent(CorreoLabel)
                                .addComponent(TipoLabel)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ApatLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AmatLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(NombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(GeneroLabel))
                            .addComponent(IDLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addComponent(a_paterno)
                            .addComponent(a_materno)
                            .addComponent(tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(correo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(no_control, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id_usuario))))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UsuariosTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UsuariosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApatLabel)
                    .addComponent(a_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmatLabel)
                    .addComponent(a_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GeneroLabel)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoLabel)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoLabel)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoCLabel)
                    .addComponent(no_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(Cancelar))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AceptarActionPerformed
    {//GEN-HEADEREND:event_AceptarActionPerformed
        try
        {
            // Prepara la sentencia SQL para eliminar los registros en Historial4 relacionados con el usuario
            PreparedStatement eliminarHistorial = conect.prepareStatement("DELETE FROM Historial4 WHERE id_usuario = ?");
            eliminarHistorial.setInt(1, Integer.parseInt(id_usuario.getText()));
            eliminarHistorial.executeUpdate();

            // Prepara la sentencia SQL para eliminar el usuario
            PreparedStatement eliminarUsuario = conect.prepareStatement("DELETE FROM Usuarios4 WHERE id_usuario = ?");
            eliminarUsuario.setInt(1, Integer.parseInt(id_usuario.getText()));
            int filasEliminadas = eliminarUsuario.executeUpdate();

            // Verifica si se eliminó correctamente al menos una fila
            if (filasEliminadas > 0)
            {
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Usuario eliminado correctamente");
                CancelarActionPerformed(evt);
            } else
            {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "No se encontró ningún usuario con el ID especificado");
            }

        } catch (NumberFormatException e)
        {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "El ID de usuario debe ser un número válido");
        } catch (SQLException e)
        {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error al eliminar el usuario: " + e.getMessage());
        } catch (Exception e)
        {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error inesperado al eliminar el usuario: " + e.getMessage());
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CancelarActionPerformed
    {//GEN-HEADEREND:event_CancelarActionPerformed
        id_usuario.setText("");
        nombre.setText("");
        a_paterno.setText("");
        a_materno.setText("");
        genero.setSelectedIndex(0);
        tipo.setSelectedIndex(0);
        correo.setText("");
        no_control.setText("");
        CtrlInterfaz.habilita(false, nombre, a_paterno, a_materno, genero, tipo, correo, no_control);
    }//GEN-LAST:event_CancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        try
        {
            String buscarQuery = "SELECT COUNT(*) FROM usuarios4 WHERE id_usuario = ?";
            PreparedStatement buscar = conect.prepareStatement(buscarQuery);
            buscar.setInt(1, Integer.parseInt(id_usuario.getText()));

            ResultSet rs = buscar.executeQuery();
            rs.next(); // Mover el cursor a la primera fila

            int i = rs.getInt(1);
            if (i == 0)
            {
                // Usuario no encontrado
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "El usuario con ID " + id_usuario.getText() + " no existe");
            } else
            {
                buscarQuery = "SELECT nombre, a_paterno, a_materno, genero, tipo, correo, no_control FROM Usuarios4 WHERE id_usuario = ?";
                buscar = conect.prepareStatement(buscarQuery);
                buscar.setInt(1, Integer.parseInt(id_usuario.getText()));
                rs = buscar.executeQuery();

                if (rs.next())
                {
                    // Asignar los valores a los campos de entrada
                    nombre.setText(rs.getString("nombre"));
                    a_paterno.setText(rs.getString("a_paterno"));
                    a_materno.setText(rs.getString("a_materno"));
                    genero.setSelectedItem(rs.getString("genero"));
                    tipo.setSelectedItem(rs.getString("tipo"));
                    correo.setText(rs.getString("correo"));
                    no_control.setText(rs.getString("no_control"));
                }
            }

        } catch (Exception e)
        {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error al buscar el usuario: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel AmatLabel;
    private javax.swing.JLabel ApatLabel;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel CorreoLabel;
    private javax.swing.JLabel GeneroLabel;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JLabel NoCLabel;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JLabel TipoLabel;
    private javax.swing.JLabel UsuariosTitle;
    private javax.swing.JTextField a_materno;
    private javax.swing.JTextField a_paterno;
    private javax.swing.JTextField correo;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JTextField id_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField no_control;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
