
package CRUD;


import Conexion.conexion;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class Ventas extends javax.swing.JFrame {
    conexion con = new conexion();
    Connection conect;
    DefaultTableModel modelVentas;
    
    public Ventas() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelVentas = (DefaultTableModel) Table.getModel();
        cargarVentas(); // Cargar datos en la tabla al iniciar
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtCantidadDisponible = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Date = new com.toedter.calendar.JDateChooser();
        txtmonto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnventa = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18))); // NOI18N

        jLabel1.setText("Articulo");

        jLabel2.setText("Precio");

        txtPrecio.setEnabled(false);

        jLabel3.setText("Cantidad");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        txtCantidadDisponible.setEnabled(false);

        jLabel4.setText("Cantidad disponible");

        Date.setDateFormatString("yyyy/MM/dd");

        txtmonto.setEnabled(false);
        txtmonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmontoActionPerformed(evt);
            }
        });

        jButton1.setText("Monto facturado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(231, 231, 231)
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(txtCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnventa.setBackground(new java.awt.Color(204, 204, 204));
        btnventa.setText("Venta");
        btnventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnventaActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Articulo mas vendido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Max");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Min");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setText("Promedio de ventas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnventa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(80, 80, 80)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnventa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Articulo", "Precio", "Cantidad", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnventaActionPerformed
        // TODO add your handling code here:
          procesarVenta();
    }//GEN-LAST:event_btnventaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         calcularMontoFacturado();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtmontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmontoActionPerformed
        // TODO add your handling code here:
         

    }//GEN-LAST:event_txtmontoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        calcularCantidadArticulosVendidos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        calcularPromedioVentas();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        calcularTipoArticuloMasVendido();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        calcularTipoArticuloMenosVendido();
    }//GEN-LAST:event_jButton4ActionPerformed
private void calcularCantidadArticulosVendidos() {
    String sql = "SELECT SUM(cantidad) AS total_cantidad FROM ventas";
    ResultSet rs = null;
    Statement st = null;

    try {
        if (conect == null || conect.isClosed()) {
            conect = con.getConnection();
        }

        st = conect.createStatement();
        rs = st.executeQuery(sql);

        if (rs.next()) {
            int totalCantidad = rs.getInt("total_cantidad");
            JOptionPane.showMessageDialog(null, "Cantidad total de artículos vendidos: " + totalCantidad);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al calcular la cantidad de artículos vendidos: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + ex.getMessage());
        }
    }
}

private void calcularTipoArticuloMasVendido() {
    String sql = "SELECT articulo, SUM(cantidad) AS total_cantidad FROM ventas GROUP BY articulo ORDER BY total_cantidad DESC LIMIT 1";
    ResultSet rs = null;
    Statement st = null;

    try {
        if (conect == null || conect.isClosed()) {
            conect = con.getConnection();
        }

        st = conect.createStatement();
        rs = st.executeQuery(sql);

        if (rs.next()) {
            String articulo = rs.getString("articulo");
            int totalCantidad = rs.getInt("total_cantidad");
            JOptionPane.showMessageDialog(null, "Tipo de artículo más vendido: " + articulo + " con " + totalCantidad + " unidades.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al calcular el tipo de artículo más vendido: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + ex.getMessage());
        }
    }
}

private void calcularTipoArticuloMenosVendido() {
    String sql = "SELECT articulo, SUM(cantidad) AS total_cantidad FROM ventas GROUP BY articulo ORDER BY total_cantidad ASC LIMIT 1";
    ResultSet rs = null;
    Statement st = null;

    try {
        if (conect == null || conect.isClosed()) {
            conect = con.getConnection();
        }

        st = conect.createStatement();
        rs = st.executeQuery(sql);

        if (rs.next()) {
            String articulo = rs.getString("articulo");
            int totalCantidad = rs.getInt("total_cantidad");
            JOptionPane.showMessageDialog(null, "Tipo de artículo menos vendido: " + articulo + " con " + totalCantidad + " unidades.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al calcular el tipo de artículo menos vendido: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + ex.getMessage());
        }
    }
}

private void calcularPromedioVentas() {
    String sql = "SELECT AVG(precio * cantidad) AS promedio_ventas FROM ventas";
    ResultSet rs = null;
    Statement st = null;

    try {
        if (conect == null || conect.isClosed()) {
            conect = con.getConnection();
        }

        st = conect.createStatement();
        rs = st.executeQuery(sql);

        if (rs.next()) {
            double promedioVentas = rs.getDouble("promedio_ventas");
            JOptionPane.showMessageDialog(null, "Promedio de ventas: " + String.format("%.2f", promedioVentas));
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al calcular el promedio de ventas: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + ex.getMessage());
        }
    }
}


  private void calcularMontoFacturado() {
    String sql = "SELECT precio, cantidad FROM ventas";
    ResultSet rs = null;
    Statement st = null;
    double totalMonto = 0;

    try {
        // Verificar la conexión
        if (conect == null || conect.isClosed()) {
            conect = con.getConnection(); // Reconectar si es necesario
        }

        st = conect.createStatement();
        rs = st.executeQuery(sql);

        // Calcular el monto total
        while (rs.next()) {
            double precio = rs.getDouble("precio");
            int cantidad = rs.getInt("cantidad");
            totalMonto += precio * cantidad;
        }

        // Actualizar el campo txtmonto
        txtmonto.setText(String.format("%.2f", totalMonto)); // Formatea el monto a dos decimales

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al calcular el monto facturado: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + ex.getMessage());
        }
    }
}
  
private void cargarVentas() {
        String sql = "SELECT * FROM ventas";
        ResultSet rs = null;
        Statement st = null;

        try {
            // Utiliza la conexión ya establecida
            if (conect == null || conect.isClosed()) {
                // Si 'conect' no está disponible, maneja el error adecuadamente
                conect = con.getConnection(); // Reconnect if needed
            }

            st = conect.createStatement();
            rs = st.executeQuery(sql);

            // Limpiar el modelo de la tabla antes de agregar nuevos datos
            modelVentas.setRowCount(0);

            // Recorrer los resultados y agregar filas al modelo
            while (rs.next()) {
                Object[] rowData = new Object[5];
                rowData[0] = rs.getInt("id");
                rowData[1] = rs.getString("articulo");
                rowData[2] = rs.getDouble("precio");
                rowData[3] = rs.getInt("cantidad");
                rowData[4] = rs.getTimestamp("fecha");

                modelVentas.addRow(rowData);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar ventas: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + ex.getMessage());
            }
        }
    }
    
    // Método para consultar los datos del artículo en veterinaria
    private void ConsultarArticuloEnVeterinaria(String articulo) {
        String sql = "SELECT precio, cantidad FROM veterinaria WHERE articulo = ?";
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            // Verificar la conexión
            if (conect == null || conect.isClosed()) {
                conect = con.getConnection(); // Reconnect if needed
            }

            ps = conect.prepareStatement(sql);
            ps.setString(1, articulo);
            rs = ps.executeQuery();

            if (rs.next()) {
                // Artículo encontrado
                double precioArticulo = rs.getDouble("precio");
                int cantidadDisponible = rs.getInt("cantidad");

                // Mostrar datos en los campos de texto
                txtPrecio.setText(String.valueOf(precioArticulo));
                txtCantidadDisponible.setText(String.valueOf(cantidadDisponible));
            } else {
                // Artículo no encontrado
                JOptionPane.showMessageDialog(null, "El artículo '" + articulo + "' no se encontró en la base de datos.");
                txtPrecio.setText("");
                txtCantidadDisponible.setText("");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + ex.getMessage());
            }
        }
    }

    // Método para procesar una venta
    private void procesarVenta() {
        String articulo = txtArticulo.getText();
        int cantidadVendida;

        try {
            cantidadVendida = Integer.parseInt(txtCantidad.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida.");
            return;
        }

        // Consultar el artículo en la base de datos
        ConsultarArticuloEnVeterinaria(articulo);

        // Verificar la cantidad disponible
        int cantidadDisponible;
        try {
            cantidadDisponible = Integer.parseInt(txtCantidadDisponible.getText());
        } catch (NumberFormatException e) {
            cantidadDisponible = 0;
        }

        double precioArticulo;
        try {
            precioArticulo = Double.parseDouble(txtPrecio.getText());
        } catch (NumberFormatException e) {
            precioArticulo = 0;
        }

        if (cantidadDisponible >= cantidadVendida) {
            // Registrar la venta
            registrarVenta(articulo, cantidadVendida, precioArticulo);

            // Actualizar la tabla de ventas
            cargarVentas();

            // Limpiar los campos
            txtArticulo.setText("");
            txtCantidad.setText("");
            txtPrecio.setText("");
            txtCantidadDisponible.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente cantidad disponible para vender.");
        }
    }
    
    private void registrarVenta(String articulo, int cantidadVendida, double precioArticulo) {
        String sqlUpdate = "UPDATE veterinaria SET cantidad = cantidad - ? WHERE articulo = ?";
        String sqlInsert = "INSERT INTO ventas (articulo, precio, cantidad, fecha) VALUES (?, ?, ?, ?)";
        PreparedStatement psUpdate = null;
        PreparedStatement psInsert = null;

        try {
            // Obtener la conexión
            conect = con.getConnection();

            // Actualizar la cantidad en veterinaria
            psUpdate = conect.prepareStatement(sqlUpdate);
            psUpdate.setInt(1, cantidadVendida);
            psUpdate.setString(2, articulo);
            int rowsAffected = psUpdate.executeUpdate();

            if (rowsAffected > 0) {
                // Insertar la venta en la tabla de ventas
                psInsert = conect.prepareStatement(sqlInsert);
                psInsert.setString(1, articulo);
                psInsert.setDouble(2, precioArticulo);
                psInsert.setInt(3, cantidadVendida);
                psInsert.setDate(4, new java.sql.Date(System.currentTimeMillis())); // Fecha actual
                psInsert.executeUpdate();

                JOptionPane.showMessageDialog(null, "Venta registrada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la cantidad. Verifique el artículo y la cantidad.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar la venta: " + e.getMessage());
        } finally {
            try {
                if (psUpdate != null) psUpdate.close();
                if (psInsert != null) psInsert.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + ex.getMessage());
            }
        }
    }




    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JTable Table;
    private javax.swing.JButton btnventa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadDisponible;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtmonto;
    // End of variables declaration//GEN-END:variables
}
