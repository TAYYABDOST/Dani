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
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Vik
 */
public class Modelpinfo {
    static String pnam,umeas,pquan,pcval,pctn;
    public void product(String nam,String meas,String quan){
        this.pnam=nam;
        this.umeas = meas;
        this.pquan=quan;
     Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("INSERT INTO product (name,unit,quantity) VALUES (?,?,?)");
            ps.setString(1, pnam);
            ps.setString(2, umeas);
            ps.setString(3, pquan);
            ps.execute();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Product Query Not Executed Successfully ");
        }   
    }
    public void characteristics(String val){
        this.pcval=val;
        Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("INSERT INTO characteristics (value) VALUE(?)");
            ps.setString(1, pcval);
            ps.execute(); 
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Characteristics Query Not Executed Successfully "+ex);
        }   
    }
    
    public void characteristicstype(String ctn){
        this.pctn=ctn;
        Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("INSERT INTO characteristics_type (`name`) VALUE (?)");
            ps.setString(1, pctn);
            ps.execute();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Characteristics Type Query Not Executed Successfully "+ex);
        }   
    }
    
           
            
   public void statusComboI3(JComboBox combo)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("SELECT product.Name, characteristics_type.Name , characteristics.Value  FROM product,characteristics_type,characteristics ");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               combo.addItem(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//               combo.addItem(rs.getString(2));
//               combo.addItem(rs.getString(3));
               System.out.println("ok");
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Product Name Query Not Executed Successfully ");
        }
        
    }

   public void statusComboI4(JComboBox combo)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("SELECT `value` FROM `characteristics`");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               combo.addItem(rs.getString(1));
               
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Characteristics Query Not Executed Successfully ");
        }
        
    }
   
   public void statusComboI5(JComboBox combo)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("SELECT product.name, characteristics.value, characteristics_type.name FROM `product`,`characteristics`,`characteristics_type`");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               combo.addItem(rs.getString(1));
               
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Joining Query Not Executed Successfully"+ex);
        }
        
    }
   
}