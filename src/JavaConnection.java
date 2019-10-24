
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boss
 */

public class JavaConnection {
    
    Connection conn = null;
    public static Connection ConnecrDb() throws ClassNotFoundException,SQLException{
        try {
                Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phar","root","");
        return conn;
            
            
        }
   catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
  }
    }
    
    
    
    
    
    
    
}
