package rac.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import raven.toast.Notifications;
import jssc.SerialPort;
import jssc.SerialPortException;

/**
 *
 * @author RAC
 */
public class FormRegistrarU extends javax.swing.JPanel
{

    FormConnectBD obj = new FormConnectBD();
    Connection conect = obj.conector();

    public FormRegistrarU()
    {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        correo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        NoCLabel = new javax.swing.JLabel();
        ApatLabel = new javax.swing.JLabel();
        no_control = new javax.swing.JTextField();
        a_paterno = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        AmatLabel = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        a_materno = new javax.swing.JTextField();
        GeneroLabel = new javax.swing.JLabel();
        genero = new javax.swing.JComboBox<>();
        UsuariosTitle = new javax.swing.JLabel();
        TipoLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        id_usuario = new javax.swing.JTextField();
        CorreoLabel = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();

        NoCLabel.setText("Numero de Control:");

        ApatLabel.setText("Apellido Paterno:");

        a_paterno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                a_paternoActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AceptarActionPerformed(evt);
            }
        });

        AmatLabel.setText("Apellido Materno:");

        Cancelar.setText("Limpiar");
        Cancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CancelarActionPerformed(evt);
            }
        });

        GeneroLabel.setText("Genero:");

        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion", "M", "F" }));

        UsuariosTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UsuariosTitle.setText("Usuarios");

        TipoLabel.setText("Tipo:");

        IDLabel.setText("ID Usuario:");

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion", "Alumno", "Docente" }));

        CorreoLabel.setText("Correo:");

        NombreLabel.setText("Nombre:");

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
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(NombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(IDLabel))))
                            .addComponent(GeneroLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a_paterno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a_materno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genero, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_usuario)
                            .addComponent(correo)
                            .addComponent(no_control)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(UsuariosTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Aceptar)
                        .addGap(27, 27, 27)
                        .addComponent(Cancelar)))
                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(UsuariosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
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

    private void a_paternoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_a_paternoActionPerformed
    {//GEN-HEADEREND:event_a_paternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_paternoActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AceptarActionPerformed
    {//GEN-HEADEREND:event_AceptarActionPerformed
        try
        {
            SerialPort serialPort = new SerialPort("COM7");
            try
            {
                //Abrir el puerto serial
                serialPort.openPort();

                //Configurar los parámetros del puerto serial
                serialPort.setParams(SerialPort.BAUDRATE_9600,
                        SerialPort.DATABITS_8,
                        SerialPort.STOPBITS_1,
                        SerialPort.PARITY_NONE);

                System.out.println("Puerto serial abierto y configurado.");

                //Variables para recibir los datos del RFID
                StringBuilder receivedDataBuilder = new StringBuilder();
                boolean dataComplete = false;

                //Leer los datos del puerto serial
                while (!dataComplete)
                {
                    //Esperar hasta que se reciban datos
                    while (serialPort.getInputBufferBytesCount() == 0)
                    {
                        Thread.sleep(300); //Esperar
                    }

                    //Leer los bytes disponibles
                    byte[] buffer = serialPort.readBytes();

                    //Verificar si se recibieron datos
                    if (buffer != null)
                    {
                        String receivedData = new String(buffer).trim(); //Eliminar espacios en blanco

                        //Acumular los datos recibidos
                        receivedDataBuilder.append(receivedData);

                        //Verificar si se ha recibido toda la información
                        if (receivedDataBuilder.length() >= 8)
                        { // Espera hasta recibir al menos 8 caracteres
                            dataComplete = true;
                        }
                    }
                }
                // Procesar los datos recibidos completos
                String receivedData = receivedDataBuilder.toString();

                // Insertar en la base de datos
                PreparedStatement guardar = conect.prepareStatement("INSERT INTO Usuarios4 (id_usuario, nombre, a_paterno, a_materno, no_control, RFID_llave, tipo, correo, genero) VALUES (?,?,?,?,?,?,?,?,?)");
                guardar.setString(1, id_usuario.getText());
                guardar.setString(2, nombre.getText());
                guardar.setString(3, a_paterno.getText());
                guardar.setString(4, a_materno.getText());
                guardar.setString(5, no_control.getText());
                guardar.setString(6, receivedData);
                guardar.setString(7, tipo.getSelectedItem().toString());
                guardar.setString(8, correo.getText());
                guardar.setString(9, genero.getSelectedItem().toString());
                guardar.executeUpdate();

                // Mostrar notificación de éxito
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Usuario registrado");
            } catch (SerialPortException | InterruptedException ex)
            {
                System.out.println("Error Serial/Interruptor: " + ex.getMessage());
            } finally
            {
                try
                {
                    // Cerrar el puerto serial
                    if (serialPort.isOpened())
                    {
                        serialPort.closePort();
                        System.out.println("Puerto serial cerrado.");
                    }
                } catch (SerialPortException ex)
                {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error al cerrar el puerto serial: " + ex.getMessage());
                }
            }

        } catch (Exception e)
        {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error al registrar el usuario: " + e.getMessage());
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
    private javax.swing.JTextField no_control;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
