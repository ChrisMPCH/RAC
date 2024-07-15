package rac.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import cjb.ci.CtrlInterfaz;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import jssc.SerialPort;
import jssc.SerialPortException;
import rac.application.Application;
import raven.toast.Notifications;

/**
 *
 * @author RAC
 */
public class FormRFID extends javax.swing.JPanel
{

    FormConnectBD obj = new FormConnectBD();
    Connection conect = obj.conector();

    public FormRFID()
    {
        initComponents();
        startSerialPortReader();
        CtrlInterfaz.habilita(false, nombre, id, am, ap, nControl);
    }

    private void startSerialPortReader()
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                bienvenido();
            }
        }).start();
    }

    public void bienvenido()
    {
        SerialPort serialPort = new SerialPort("COM7");
        try
        {
            // Abrir el puerto serial
            serialPort.openPort();

            // Configurar los parámetros del puerto serial
            serialPort.setParams(SerialPort.BAUDRATE_9600,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);

            System.out.println("Puerto serial abierto y configurado.");

            // Leer los datos del puerto serial
            while (true)
            {
                if (serialPort.getInputBufferBytesCount() > 0)
                {
                    byte[] buffer = serialPort.readBytes(); //Leer todos los bytes disponibles
                    if (buffer != null)
                    {
                        String rfid = new String(buffer).trim(); //Eliminar espacios en blanco
                        try
                        {
                            PreparedStatement leer = conect.prepareStatement("SELECT id_usuario, nombre, a_paterno, a_materno, no_control FROM USUARIOS4 WHERE RFID_llave = ?");

                            // Establecer el valor del parámetro
                            leer.setString(1, rfid);
                            System.out.println(rfid);

                            // Ejecutar la consulta
                            ResultSet resultado = leer.executeQuery();

                            // Configura el parámetro para la consulta
                            if (resultado.next())
                            {
                                // Mover el cursor a la primera fila y luego acceder a los datos
                                id.setText(resultado.getString("id_usuario"));
                                nombre.setText(resultado.getString("nombre"));
                                ap.setText(resultado.getString("a_paterno"));
                                am.setText(resultado.getString("a_materno"));
                                nControl.setText(resultado.getString("no_control"));

                                guardarHistorial(resultado.getString("id_usuario"), rfid);
                            } else
                            {
                                // Si no se encuentra el registro
                                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "No se encontró el usuario");
                            }
                        } catch (SQLException ex)
                        {
                            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error SQL: " + ex.getMessage());
                        }
                    }
                }
                Thread.sleep(300); //Evitar error de leida del RFID
            }
        } catch (SerialPortException | InterruptedException ex)
        {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Error Serial/Interruptor: " + ex.getMessage());
        } finally
        {
            try
            {
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
    }

    private int buscarRegistroRepetido(String rfid) throws SQLException
    {
        PreparedStatement leer = conect.prepareStatement("SELECT h.id_historial "
                + "FROM Historial4 h "
                + "JOIN Usuarios4 u ON h.id_usuario = u.id_usuario "
                + "WHERE (u.RFID_llave = ?) AND (h.fecha_entrada = h.fecha_salida)");

        //Establecer el valor del parámetro
        leer.setString(1, rfid);
        ResultSet resultado = leer.executeQuery();
        if (resultado.next())
        {
            return resultado.getInt("id_historial");
        } else
        {
            return 0;
        }
    }

    private void guardarHistorial(String id_U, String rfid) throws SQLException
    {
        if (buscarRegistroRepetido(rfid) == 0)
        {
            Statement unpincheQuery = conect.createStatement();
            ResultSet resultado = unpincheQuery.executeQuery("SELECT id_historial FROM historial4 ORDER BY id_historial DESC LIMIT 1;");
            int id_H = 0;
            if (resultado.next())
            {
                int registros = resultado.getInt("id_historial");
                id_H = registros;
                id_H += 1;
            }

            PreparedStatement guardar = conect.prepareStatement("INSERT INTO Historial4 (id_historial, fecha_entrada, fecha_salida, id_usuario) VALUES (?,?,?,?)");
            LocalDateTime fechaA = LocalDateTime.now();
            guardar.setString(1, String.valueOf(id_H)); //Cambiar a string
            guardar.setString(2, fechaA.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            guardar.setString(3, fechaA.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            guardar.setString(4, id_U);
            guardar.executeUpdate();

            // Mostrar notificación de éxito
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Inicio del registro en historial");
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Bienvenido");
        } else
        {
            PreparedStatement actualizar = conect.prepareStatement("UPDATE Historial4 SET fecha_salida = ? WHERE id_usuario = ? and id_historial = ?");
            LocalDateTime fechaA = LocalDateTime.now();

            actualizar.setString(1, fechaA.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            actualizar.setString(2, id_U);
            actualizar.setString(3, String.valueOf(buscarRegistroRepetido(rfid)));
            actualizar.executeUpdate();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Final del registro en historial");
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Hasta pronto");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        am = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        nControl = new javax.swing.JTextField();
        ap = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de entrada/salida");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Apellido Paterno:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Apellido Materno:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Numero de Control:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ap, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nControl, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField am;
    private javax.swing.JTextField ap;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nControl;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
