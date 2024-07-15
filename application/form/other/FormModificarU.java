package rac.application.form.other;

import cjb.ci.CtrlInterfaz;
import com.formdev.flatlaf.FlatClientProperties;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import raven.toast.Notifications;

/**
 *
 * @author RAC
 */
public class FormModificarU extends javax.swing.JPanel
{

    FormConnectBD obj = new FormConnectBD();
    Connection conect = obj.conector();

    public FormModificarU(String text)
    {
        initComponents();
    }

    public FormModificarU()
    {
        initComponents();
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

        UsuariosTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UsuariosTitle.setText("Usuarios");

        TipoLabel.setText("Tipo:");

        IDLabel.setText("ID Usuario:");

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion", "Alumno", "Docente" }));

        id_usuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                id_usuarioActionPerformed(evt);
            }
        });

        CorreoLabel.setText("Correo:");

        NoCLabel.setText("Numero de Control:");

        ApatLabel.setText("Apellido Paterno:");

        a_paterno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                a_paternoActionPerformed(evt);
            }
        });

        Aceptar.setText("Modificar");
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
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a_paterno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a_materno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genero, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(correo)
                            .addComponent(no_control)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(UsuariosTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(Aceptar)
                                .addGap(27, 27, 27)
                                .addComponent(Cancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(IDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(UsuariosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void id_usuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_id_usuarioActionPerformed
    {//GEN-HEADEREND:event_id_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_usuarioActionPerformed

    private void a_paternoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_a_paternoActionPerformed
    {//GEN-HEADEREND:event_a_paternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_paternoActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AceptarActionPerformed
    {//GEN-HEADEREND:event_AceptarActionPerformed
        // Usuario encontrado modificando
        try
        {
            // Prepara la sentencia SQL
            PreparedStatement modificar = conect.prepareStatement("UPDATE Usuarios4 SET nombre = ?, a_paterno = ?, a_materno = ?, no_control = ?, tipo = ?, correo = ?, genero = ? WHERE id_usuario = ?");
            
            // Establece los parámetros para la actualización
            modificar.setString(1, nombre.getText());
            modificar.setString(2, a_paterno.getText());
            modificar.setString(3, a_materno.getText());
            modificar.setString(4, no_control.getText());
            modificar.setString(5, tipo.getSelectedItem().toString());
            modificar.setString(6, correo.getText());
            modificar.setString(7, genero.getSelectedItem().toString());
            modificar.setString(8, id_usuario.getText());

            // Ejecuta la actualización
            int modificarF = modificar.executeUpdate();

            // Verifica si se actualizó al menos una fila
            if (modificarF > 0)
            {
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Usuario actualizado correctamente");
            } else
            {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "No se encontró ningún usuario con el ID especificado");
            }

        } catch (Exception e)
        {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error al actualizar el usuario: " + e.getMessage());
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
    }//GEN-LAST:event_CancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        //Buscar Usuario
        try
        {
            PreparedStatement buscar = conect.prepareStatement("SELECT COUNT(*) FROM Usuarios4 WHERE id_usuario = ?");
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
                CtrlInterfaz.habilita(false, id_usuario);
                buscar = conect.prepareStatement("SELECT nombre, a_paterno, a_materno, genero, tipo, correo, no_control FROM Usuarios4 WHERE id_usuario = ?");
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
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error al buscar el usuario: " + e);
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
