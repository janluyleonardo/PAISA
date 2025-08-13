
package Jframes;

import java.awt.BorderLayout;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.sql.Connection;

public class main {
public static void main(String[] args) {
    Empleado1 window=new Empleado1();
    window.setTitle("DEPORTES NACIONALES S.A");
    window.setVisible(true); 
Coneccion cn = new Coneccion();
Connection c = cn.conexion();
}
}