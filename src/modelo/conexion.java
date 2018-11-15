/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gerson Lopez
 */
public class conexion {
    
    private final String base="academia";
    private final String user="root";

    
    private final String password="Contraseña123.";
    private final String URL = "jdbc:mysql://localhost:3306/" + base + "?autoReconnect=true&useSSL=false";

    private Connection con=null;
    
    public Connection getConexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(URL, user, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
