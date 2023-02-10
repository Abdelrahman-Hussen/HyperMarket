/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypermarket;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;


public class database {

    private Connection con ;
    
    public Connection getCon() {
        return con;
    }
    
    public database() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost\\ABDO-HUSSEIN\\SQLEXPRESS:1433;databaseName=hyperMarket", "sa", "12345");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.ERROR_MESSAGE);
            
        }   
    }
}
