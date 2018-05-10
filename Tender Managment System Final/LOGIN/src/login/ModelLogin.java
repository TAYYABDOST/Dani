package login;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class ModelLogin {
       
    public static Connection getConnection(){
       Connection con = null; 
        try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/database","root","");
          
        
        } catch (Exception e){
          JOptionPane.showMessageDialog(null,"Not Connected");
        }
    return con;
    }
}
