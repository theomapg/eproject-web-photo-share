/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author an
 */
public class Connect {

    private Connection conn;
    
    public Connect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost:1455;databaseName=PHOTO-SHARE","sa","123456");
            
        } catch (Exception ex) {

        }
    }

    public static void main(String[] args) {
        try {
            Connect conn=new Connect();
            System.out.println(conn.getConn().getMetaData());
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConn() {
        return conn;
    }
    
    public void closeConn() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
