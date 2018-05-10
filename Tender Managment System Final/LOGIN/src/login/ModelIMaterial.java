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
 * @author Home
 */
public class ModelIMaterial {
    public void statusComboI(JComboBox combo)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("SELECT clientid FROM `client` WHERE 1");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               combo.addItem(rs.getString(1));
               
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Course Combobox Query Not Executed Successfully ");
        }
            
            }
    public void statusComboI1(JComboBox combo)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("SELECT lprno FROM `purchase_order` WHERE 1");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               combo.addItem(rs.getString(1));
               
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Course Combobox Query Not Executed Successfully ");
        }
            
            }
    public void statusComboI2(JComboBox combo)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("SELECT description FROM `tender` WHERE 1");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               combo.addItem(rs.getString(1));
               
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Course Combobox Query Not Executed Successfully ");
        }
            
            }
//    
}
