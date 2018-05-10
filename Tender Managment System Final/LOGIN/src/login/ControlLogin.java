/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class ControlLogin extends LOGIN{
     static String uid,upas;
    public void Login(String ui,String up){
                ModelLogin ml = new ModelLogin();

        this.uid=ui;
        this.upas=upas;
        
        if(ui.equals(""))
        {   
            JOptionPane.showMessageDialog(this,"Please Enter Your Username");
            setVisible(true);
        
        }
        else if(up.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please Enter Your Password");
            setVisible(true);
        }
        else
        {
            Connection con = ModelLogin.getConnection();
            PreparedStatement ps;
            try {
                ps = con.prepareStatement("SELECT * FROM login WHERE UserID = ? AND password = ?");
                ps.setString(1,uid);
                ps.setString(2,String.valueOf(up));
                ResultSet rs = ps.executeQuery();
                
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(this, "Congratulations! You Have Sucessfully Connected");
                    HOMEPAGE hp = new HOMEPAGE();
                    hp.setVisible(true);
                    hp.setLocationRelativeTo(null);
setVisible(false);        
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Invalid Username/Password Combination");
                }
            } catch (SQLException ex) {
            }
        }
        setVisible(true);
    }
        
        
    
    public static void main(String args[]){
        ControlLogin cl = new ControlLogin();
        cl.Login(uid, upas);
    }
}
