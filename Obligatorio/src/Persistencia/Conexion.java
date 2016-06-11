/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.DriverManager;
import java.sql.Connection; 

/**
 *
 * @author Álvaro
 */
public class Conexion {
    public static Connection con;

    public static Connection AbrirConexion() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/Obligatorio", "root", "1234");
            return con;
        } catch (Exception ex) {
            throw new Exception(ex);
        }
    }
}
