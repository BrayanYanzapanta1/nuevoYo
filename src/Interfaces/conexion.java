/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TECNOLAP
 */
public class conexion {
    public static Connection conect;
    public Connection conectar() throws ClassNotFoundException {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect=DriverManager.getConnection("jdbc:mysql://localhost/viajesYanza", "root","");
            System.out.println("Conectado");
        } catch (SQLException ex) {
            System.out.println("No estas conectado");
            JOptionPane.showMessageDialog(null, "Sistema fuera de linea");
        }
        return conect;
    }
}
