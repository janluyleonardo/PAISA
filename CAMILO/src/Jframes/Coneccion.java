/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author CAMILO
 */
public class Coneccion {
    Connection conectar = null;
   public Connection conexion (){
       try {
           Class.forName("com.mysql.jdbcjdbc.Driver");
           conectar=(Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1/interfaz_empleado","root","");
           JOptionPane.showMessageDialog(null, "Conectado a la BD interfaz_empleado","Senior usuario",
           JOptionPane.INFORMATION_MESSAGE);
       } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "No estas conectado a la BD interfaz_empleado" + e,"Senior usuario",
          JOptionPane.ERROR_MESSAGE);
       }
   
   return conectar;
}
}
