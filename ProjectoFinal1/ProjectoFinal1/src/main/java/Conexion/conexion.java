package Conexion;

import java.sql.*;

public class conexion {
    Connection con;

    public conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/veterinaria", "root", "");
            System.out.println("Conexion Extiosa");

        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos");

        }
    }

    public Connection getConnection() {
        return con;
    }
}
