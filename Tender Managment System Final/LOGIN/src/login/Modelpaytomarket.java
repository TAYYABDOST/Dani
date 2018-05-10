/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Vik
 */
public class Modelpaytomarket {
    public void statusComboP(JComboBox combo)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("SELECT vendorid FROM `vendor` WHERE 1");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               combo.addItem(rs.getString(1));
               
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Course Combobox Query Not Executed Successfully ");
        }
            }
    public void statusComboP1(JComboBox combo)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("SELECT billno FROM `generate_bill` WHERE 1");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               combo.addItem(rs.getString(1));
               
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Course Combobox Query Not Executed Successfully ");
        }
            }
     public void statusComboP2(JComboBox combo)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("SELECT description FROM `get_rates` WHERE 1");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               combo.addItem(rs.getString(1));
               
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Course Combobox Query Not Executed Successfully ");
        }
            }
}
