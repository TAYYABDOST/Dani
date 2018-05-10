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
public class ModelCO {
    public void statusComboo(JComboBox combo)
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
     public void statusComboo1(JComboBox combo1)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT lprno FROM `generate_quotation` WHERE 1");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                combo1.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Course Combobox Query Not Executed Successfully ");
        }
        
            }
     public void statusComboo2(JComboBox combo1)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("SELECT description FROM `get_rates` WHERE 1");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               combo1.addItem(rs.getString(1));
               
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Course Combobox Query Not Executed Successfully ");
        }
            }

   
   
}
