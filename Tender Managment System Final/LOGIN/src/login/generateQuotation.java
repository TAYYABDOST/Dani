package login;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vik
 */
public class generateQuotation extends javax.swing.JFrame {
   Connection con;
    PreparedStatement ps;
    ResultSet rs;
   Image ic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\apex\\Desktop\\LATEST ISE PROJECT\\Capture.PNG");
       

    public generateQuotation() {
        initComponents();
        this.setIconImage(ic);
        this.setLocationRelativeTo(null);
        statusCombo(qid);
        LPRCombo(jComboBox_LPR_Number);
    }
    public void statusCombo(JComboBox combo)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("SELECT `quotationno` FROM `generate_quotation`");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               combo.addItem(rs.getString(1));
               
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "QUOTATION Combobox Query Not Executed Successfully ");
        }
            
            }
    public void LPRCombo(JComboBox combo)
            {
             Connection con = ModelLogin.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement("SELECT `lprno` FROM `tender`");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               combo.addItem(rs.getString(1));
               
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "QUOTATION Combobox Query Not Executed Successfully ");
        }
            
            }
    public void R()
    {
      Connection con = ModelLogin.getConnection();
        try {
            ps = con.prepareStatement("SELECT `price`, `quantity` FROM `get_rates` where'"+NSN_Number.getText()+"'");
            rs = ps.executeQuery();
            while(rs.next())
            {
             price.setText(rs.getString("price"));
             Quantity.setText(rs.getString("quantity"));
            }
        } catch (Exception e) {
              System.out.println("Query Error : "+e);
        }
    }
    public void Q()
    {
     Connection con = ModelLogin.getConnection();
        try {
            ps = con.prepareStatement("SELECT `date`, `referenceno`, `patternno`, `ntnno`, `description`, `delivery`, `validity`, `lprno`, `itconfirmed` FROM `generate_quotation` WHERE `quotationno` = ?");
            ps.setString(1, (String) qid.getSelectedItem());
            rs = ps.executeQuery();
            while (rs.next()) {
                Reference_Number.setText(rs.getString("referenceno"));
                Date.setText(rs.getString("date"));
                NSN_Number.setText(rs.getString("patternno"));
                NTN_Number.setText(rs.getString("ntnno"));
                Description.setText(rs.getString("description"));
                Delivery.setText(rs.getString("delivery"));
                Validity.setText(rs.getString("validity"));
                LPR_Number.setText(rs.getString("lprno"));
                itc.setText(rs.getString("itconfirmed"));
              }
        
            
        }         
       
         catch (Exception e) {
             System.out.println("Error : "+e);
        }
    }
//    
//  
//     String s1 = "IndianOcean";
//
//     String s2 = s1;                     // extracting all characters
//     System.out.println(s2);             // prints IndianOcean
//
//     String s3 = s1.substring(6);
//     System.out.println(s3);             // prints Ocean
//
//     String s4 = s1.substring(2, 8);     // extracting few characters
//     System.out.println(s4);             // prints dianOc
//
//		                         // one example to separate all the Web server names
//
//     String names[] = { "www.yahoo.com",  "www.gmail.com",  "www.rediff.com",  "www.arkut.com" };
//     System.out.println("\nFollowing are the Web server names");
//
//     for(int i = 0; i < names.length; i++)
//     {
//        int a = names[i].indexOf('.');    
//        int b = names[i].lastIndexOf('.');
//        String str = names[i].substring(a+1, b);
//        System.out.print(str+"\t");           
//     }   
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        qid = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Reference_Number = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        LPR_Number = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Made = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Deno = new javax.swing.JTextField();
        Delivery = new javax.swing.JTextField();
        Validity = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        itc = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        Date = new javax.swing.JTextField();
        NSN_Number = new javax.swing.JTextField();
        Generate_Quotation = new javax.swing.JButton();
        Description = new javax.swing.JTextField();
        NTN_Number = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox_LPR_Number = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("A.D & COMPANY");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 20, 300, 60);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("QUOTATION");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 70, 250, 50);

        qid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Quotation No...." }));
        qid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qidMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                qidMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                qidMousePressed(evt);
            }
        });
        qid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qidActionPerformed(evt);
            }
        });
        qid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qidKeyPressed(evt);
            }
        });
        jPanel1.add(qid);
        qid.setBounds(190, 130, 230, 20);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("QUOTATION NUMBER");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 130, 120, 20);

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("REFERENCE NUMBER");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 210, 120, 20);

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("DATED");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 290, 120, 20);

        Reference_Number.setEditable(false);
        Reference_Number.setBackground(new java.awt.Color(51, 51, 51));
        Reference_Number.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Reference_Number.setForeground(new java.awt.Color(255, 255, 255));
        Reference_Number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Reference_Number.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Reference_Number.setOpaque(false);
        Reference_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reference_NumberActionPerformed(evt);
            }
        });
        Reference_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Reference_NumberKeyTyped(evt);
            }
        });
        jPanel1.add(Reference_Number);
        Reference_Number.setBounds(190, 210, 230, 20);

        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("LPR NUMBER");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel21);
        jLabel21.setBounds(40, 170, 120, 20);

        LPR_Number.setEditable(false);
        LPR_Number.setBackground(new java.awt.Color(51, 51, 51));
        LPR_Number.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        LPR_Number.setForeground(new java.awt.Color(255, 255, 255));
        LPR_Number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LPR_Number.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        LPR_Number.setOpaque(false);
        LPR_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LPR_NumberActionPerformed(evt);
            }
        });
        LPR_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LPR_NumberKeyTyped(evt);
            }
        });
        jPanel1.add(LPR_Number);
        LPR_Number.setBounds(190, 170, 230, 20);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("UNIT PRICE WITH GST");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(450, 170, 140, 20);

        price.setEditable(false);
        price.setBackground(new java.awt.Color(51, 51, 51));
        price.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        price.setOpaque(false);
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });
        jPanel1.add(price);
        price.setBounds(630, 170, 190, 20);

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("MADE");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel16);
        jLabel16.setBounds(450, 130, 140, 20);

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("DEMINATION");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel17);
        jLabel17.setBounds(450, 250, 140, 20);

        Made.setEditable(false);
        Made.setBackground(new java.awt.Color(51, 51, 51));
        Made.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Made.setForeground(new java.awt.Color(255, 255, 255));
        Made.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Made.setText("LOCAL");
        Made.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Made.setOpaque(false);
        Made.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MadeActionPerformed(evt);
            }
        });
        Made.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MadeKeyTyped(evt);
            }
        });
        jPanel1.add(Made);
        Made.setBounds(630, 130, 190, 20);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("QUANTITY");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(450, 210, 140, 20);

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("VALIDITY");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel18);
        jLabel18.setBounds(450, 330, 140, 20);

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("DELIVERY");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel19);
        jLabel19.setBounds(450, 290, 140, 20);

        Deno.setEditable(false);
        Deno.setBackground(new java.awt.Color(51, 51, 51));
        Deno.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Deno.setForeground(new java.awt.Color(255, 255, 255));
        Deno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Deno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Deno.setOpaque(false);
        Deno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenoActionPerformed(evt);
            }
        });
        Deno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DenoKeyTyped(evt);
            }
        });
        jPanel1.add(Deno);
        Deno.setBounds(630, 250, 190, 20);

        Delivery.setEditable(false);
        Delivery.setBackground(new java.awt.Color(51, 51, 51));
        Delivery.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Delivery.setForeground(new java.awt.Color(255, 255, 255));
        Delivery.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Delivery.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Delivery.setOpaque(false);
        Delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveryActionPerformed(evt);
            }
        });
        Delivery.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DeliveryKeyTyped(evt);
            }
        });
        jPanel1.add(Delivery);
        Delivery.setBounds(630, 290, 190, 20);

        Validity.setEditable(false);
        Validity.setBackground(new java.awt.Color(51, 51, 51));
        Validity.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Validity.setForeground(new java.awt.Color(255, 255, 255));
        Validity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Validity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Validity.setOpaque(false);
        Validity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidityActionPerformed(evt);
            }
        });
        jPanel1.add(Validity);
        Validity.setBounds(630, 330, 190, 20);

        Quantity.setEditable(false);
        Quantity.setBackground(new java.awt.Color(51, 51, 51));
        Quantity.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Quantity.setForeground(new java.awt.Color(255, 255, 255));
        Quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Quantity.setOpaque(false);
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });
        Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuantityKeyTyped(evt);
            }
        });
        jPanel1.add(Quantity);
        Quantity.setBounds(630, 210, 190, 20);

        itc.setEditable(false);
        itc.setBackground(new java.awt.Color(51, 51, 51));
        itc.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        itc.setForeground(new java.awt.Color(255, 255, 255));
        itc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        itc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        itc.setOpaque(false);
        itc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itcActionPerformed(evt);
            }
        });
        jPanel1.add(itc);
        itc.setBounds(630, 370, 190, 20);

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("IT CONFIRMED");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel20);
        jLabel20.setBounds(450, 370, 140, 20);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("NTN NUMBER");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 250, 120, 20);

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("DESCRIPTION");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(40, 370, 120, 20);

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("NSN NUMBER");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel15);
        jLabel15.setBounds(40, 330, 120, 20);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/close-cross-circular-interface-button (2).png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(800, 0, 30, 30);

        Date.setEditable(false);
        Date.setBackground(new java.awt.Color(51, 51, 51));
        Date.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Date.setOpaque(false);
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        Date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DateKeyTyped(evt);
            }
        });
        jPanel1.add(Date);
        Date.setBounds(190, 290, 230, 20);

        NSN_Number.setEditable(false);
        NSN_Number.setBackground(new java.awt.Color(51, 51, 51));
        NSN_Number.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        NSN_Number.setForeground(new java.awt.Color(255, 255, 255));
        NSN_Number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NSN_Number.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        NSN_Number.setOpaque(false);
        NSN_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NSN_NumberActionPerformed(evt);
            }
        });
        NSN_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NSN_NumberKeyTyped(evt);
            }
        });
        jPanel1.add(NSN_Number);
        NSN_Number.setBounds(190, 330, 230, 20);

        Generate_Quotation.setBackground(new java.awt.Color(102, 102, 102));
        Generate_Quotation.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Generate_Quotation.setText("Generate Quotation");
        Generate_Quotation.setBorder(null);
        Generate_Quotation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generate_QuotationActionPerformed(evt);
            }
        });
        jPanel1.add(Generate_Quotation);
        Generate_Quotation.setBounds(650, 410, 170, 20);

        Description.setBackground(new java.awt.Color(51, 51, 51));
        Description.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Description.setForeground(new java.awt.Color(255, 255, 255));
        Description.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Description.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Description.setOpaque(false);
        Description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionActionPerformed(evt);
            }
        });
        jPanel1.add(Description);
        Description.setBounds(190, 370, 230, 20);

        NTN_Number.setEditable(false);
        NTN_Number.setBackground(new java.awt.Color(51, 51, 51));
        NTN_Number.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        NTN_Number.setForeground(new java.awt.Color(255, 255, 255));
        NTN_Number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NTN_Number.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        NTN_Number.setOpaque(false);
        NTN_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NTN_NumberActionPerformed(evt);
            }
        });
        NTN_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NTN_NumberKeyTyped(evt);
            }
        });
        jPanel1.add(NTN_Number);
        NTN_Number.setBounds(190, 250, 230, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/black_background_lines_scratches_69440_1366x768.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 840, 450);

        jLabel22.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("LPR NUMBER");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel22);
        jLabel22.setBounds(40, 10, 150, 20);

        jComboBox_LPR_Number.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox_LPR_Number.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jComboBox_LPR_Number.setForeground(new java.awt.Color(153, 153, 153));
        jComboBox_LPR_Number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        jComboBox_LPR_Number.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox_LPR_Number.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox_LPR_Number.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jComboBox_LPR_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_LPR_NumberActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_LPR_Number);
        jComboBox_LPR_Number.setBounds(210, 10, 150, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Reference_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reference_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Reference_NumberActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        HOMEPAGE hp = new HOMEPAGE();
     hp.setVisible(true);
     dispose();
     hp.setLocationRelativeTo(null); 
     setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void NSN_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NSN_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NSN_NumberActionPerformed

    private void DescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionActionPerformed

    private void NTN_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NTN_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NTN_NumberActionPerformed

    private void Reference_NumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Reference_NumberKeyTyped
        if(Character.isDigit(evt.getKeyChar()))
       {
              evt.consume();
       }
    }//GEN-LAST:event_Reference_NumberKeyTyped

    private void NTN_NumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NTN_NumberKeyTyped
        if(Character.isDigit(evt.getKeyChar()))
       {
              evt.consume();
       }
    }//GEN-LAST:event_NTN_NumberKeyTyped

    private void DateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DateKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
       {
              evt.consume();
       }
    }//GEN-LAST:event_DateKeyTyped

    private void NSN_NumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NSN_NumberKeyTyped
//        if(Character.isDigit(evt.getKeyChar()))
//       {
//              evt.consume();
//       }
    }//GEN-LAST:event_NSN_NumberKeyTyped

    private void Generate_QuotationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generate_QuotationActionPerformed

       if(Reference_Number.getText().equals("") || Date.getText().equals("") ||     NSN_Number.getText().equals("")
                ||   NTN_Number.getText().equals("") ||   Description.getText().equals("")
             ||   Delivery.getText().equals("") ||   Validity.getText().equals("") || LPR_Number.getText().equals("") ||  itc.getText().equals("")
              )
        {
            JOptionPane.showMessageDialog(null, "Please Select the Quotation number");
        }
        else
        {
       String nameOfFile = "Quotation no "+qid.getSelectedItem().toString()+"";     
       XWPFDocument document = new XWPFDocument();
       XWPFParagraph paragraph = document.createParagraph();
       XWPFRun run =paragraph.createRun();
       run.addBreak();
       run.addBreak();
       run.setText("Ref No: "+Reference_Number.getText());
       run.setBold(true);
       run.setFontSize(11);
       //run.addBreak();
       //paragraph.setIndentationHanging(4);
//       run.setTextPosition(25);
       XWPFParagraph paragraph1 = document.createParagraph();
       XWPFRun run1 =paragraph1.createRun();
       run1.setText("STN # 3277876131686"+"                                                                                                                    NTN # 7332121-1");
       run1.setBold(true);
       run1.setFontSize(11);
       //run1.addBreak();
       XWPFParagraph paragraph2 = document.createParagraph();
       XWPFRun run2 =paragraph2.createRun();
       run2.setText("                                        QUOTATION FOR LRP");
       run2.setBold(true);
       run2.setFontSize(18);
       //run2.addBreak();
       XWPFParagraph paragraph3 = document.createParagraph();
       XWPFRun run3 =paragraph3.createRun();
       run3.setText("                                             LPR No: "+LPR_Number.getText()+"          Dated: "+Date.getText());
       run3.setBold(true);
       run3.setFontSize(11);
//       run3.setUnderline(UnderlinePatterns.SINGLE);
       //run3.addBreak();
       XWPFParagraph paragraph4 = document.createParagraph();
       XWPFRun run4 =paragraph4.createRun();
       run4.setText("1. NSN/Pattern No                                                                           : "+NSN_Number.getText());
       run4.addBreak();
       XWPFParagraph paragraph5 = document.createParagraph();
       XWPFRun run5 =paragraph5.createRun();
       run5.setText("2. Description                                                                                    : " +Description.getText());
       run5.addBreak();
       XWPFParagraph paragraph6 = document.createParagraph();
       XWPFRun run6 =paragraph6.createRun();
       run6.setText("3. Made                                                                                              : " +Made.getText());
       run6.addBreak();
       XWPFParagraph paragraph7 = document.createParagraph();
       XWPFRun run7 =paragraph7.createRun();
       run7.setText("4. Unit Price With GST                                                                     : Rs. " +price.getText()+"/-");
       run7.addBreak();
       XWPFParagraph paragraph8 = document.createParagraph();
       XWPFRun run8 =paragraph8.createRun();
       run8.setText("5. Quantity                                                                                         : " +Quantity.getText());
       run8.addBreak();
       XWPFParagraph paragraph9 = document.createParagraph();
       XWPFRun run9 =paragraph9.createRun();
       run9.setText("6. Demination                                                                                    : " +Deno.getText());
       run9.addBreak();
       XWPFParagraph paragraph10 = document.createParagraph();
       XWPFRun run10 =paragraph10.createRun();
       run10.setText("7. Delivery                                                                                          : " +Delivery.getText());
       run10.addBreak();
       XWPFParagraph paragraph11 = document.createParagraph();
       XWPFRun run11 =paragraph11.createRun();
       run11.setText("8. Validity                                                                                           : " +Validity.getText());
       run11.addBreak();
       XWPFParagraph paragraph12 = document.createParagraph();
       XWPFRun run12 =paragraph12.createRun();
       run12.setText("9. IT Confirmed                                                                                 : " +itc.getText());
       run12.addBreak();
       run12.addBreak();
       run12.addBreak();
       run12.addBreak();
       run12.addBreak();
       run12.addBreak();
       //run12.addBreak();
       XWPFParagraph paragraph13 = document.createParagraph();
       XWPFRun run13 =paragraph13.createRun();
       run13.setText("                                                                                                                                          Best Regards                ");
       run13.addBreak();
       run13.addBreak();
       run13.setFontSize(11);
       XWPFParagraph paragraph14 = document.createParagraph();
       XWPFRun run14 =paragraph14.createRun();
       run14.setText("                                                                                                                                           A.D & COMPANY                ");
       paragraph14.setAlignment(ParagraphAlignment.RIGHT);
       run14.setBold(true);
       run14.setFontSize(18);
//       paragraph.setIndentationHanging(250);
       try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\apex\\Desktop\\"+nameOfFile+".docx");
            document.write(output);
            output.close();
            JOptionPane.showMessageDialog(null, "Quotation generated successfully.....");
            qid.setSelectedIndex(0);
            Reference_Number.setText("");
            Date.setText("");
            NSN_Number.setText("");
            NTN_Number.setText("");
            Description.setText("");
            Delivery.setText("");
            Validity.setText("");
            LPR_Number.setText("");
            itc.setText(""); 
       
       
       
       } catch (Exception e) {
            System.out.println(e);
        } 
//       Reference_Number.getText().equals("");
//       Date.getText().equals("");
//       NSN_Number.getText().equals("");
//       NTN_Number.getText().equals("");
//       Description.getText().equals("");
//       Delivery.getText().equals("");
//       Validity.getText().equals("");
//       LPR_Number.getText().equals("");
//       itc.getText().equals("");
        
        
        } 
     
    }//GEN-LAST:event_Generate_QuotationActionPerformed

    private void qidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qidActionPerformed
        
        
        Connection con = ModelLogin.getConnection();
        try {
            ps = con.prepareStatement("SELECT `date`, `referenceno`, `nsnno`, `ntnno`, `description`, `delivery`, `validity`, `lprno`, `itconfirmed` FROM `generate_quotation` WHERE `quotationno` = ?");
            ps.setString(1, (String) qid.getSelectedItem());
            rs = ps.executeQuery();
            while (rs.next()) {
                Reference_Number.setText(rs.getString("referenceno"));
                Date.setText(rs.getString("date"));
                NSN_Number.setText(rs.getString("nsnno"));
                NTN_Number.setText(rs.getString("ntnno"));
                Description.setText(rs.getString("description"));
                Delivery.setText(rs.getString("delivery"));
                Validity.setText(rs.getString("validity"));
                LPR_Number.setText(rs.getString("lprno"));
                itc.setText(rs.getString("itconfirmed"));
            }
         
         }
         catch (Exception e) {
             System.out.println("Error : "+e);
        }
        
         
           jComboBox_LPR_Number.setSelectedItem(LPR_Number.getText());
        
    }//GEN-LAST:event_qidActionPerformed

    private void MadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MadeActionPerformed

    private void MadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MadeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_MadeKeyTyped

    private void DenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenoActionPerformed

    private void DenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DenoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_DenoKeyTyped

    private void DeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeliveryActionPerformed

    private void DeliveryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeliveryKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_DeliveryKeyTyped

    private void ValidityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValidityActionPerformed

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void QuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityKeyTyped

    private void itcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itcActionPerformed

    private void LPR_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LPR_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LPR_NumberActionPerformed

    private void LPR_NumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LPR_NumberKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_LPR_NumberKeyTyped

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_priceKeyTyped

    private void qidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qidKeyPressed
//        Connection con = ModelLogin.getConnection();
//        try {
//            ps = con.prepareStatement("SELECT `price`, `quantity` FROM `get_rates` where'"+NSN_Number.getText()+"'");
//            rs = ps.executeQuery();
//            while(rs.next())
//            {
//             price.setText(rs.getString("price"));
//             Quantity.setText(rs.getString("quantity"));
//            }
//        } catch (Exception e) {
//              System.out.println("Query Error : "+e);
//        }
    }//GEN-LAST:event_qidKeyPressed

    private void qidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qidMousePressed
        
    }//GEN-LAST:event_qidMousePressed

    private void qidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qidMouseEntered
        
    }//GEN-LAST:event_qidMouseEntered

    private void qidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qidMouseClicked
      
    }//GEN-LAST:event_qidMouseClicked

    private void jComboBox_LPR_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_LPR_NumberActionPerformed
        Connection con = ModelLogin.getConnection();

        try {
            ps = con.prepareStatement("SELECT quantity,deno FROM `tender` WHERE `lprno` =?");
            ps.setString(1, (String) jComboBox_LPR_Number.getSelectedItem());
            rs = ps.executeQuery();
            while (rs.next()) {

                Deno.setText(rs.getString("deno"));
                Quantity.setText(rs.getString("Quantity"));
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ps = con.prepareStatement("SELECT `price` FROM `get_rates` where `lprno` =?");
            ps.setString(1, (String) jComboBox_LPR_Number.getSelectedItem());
            rs = ps.executeQuery();
            while(rs.next())
            {
             price.setText(rs.getString("price"));
             }
            
        } catch (Exception e) {
              System.out.println("Query Error : "+e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_LPR_NumberActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(generateQuotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(generateQuotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(generateQuotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(generateQuotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generateQuotation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Delivery;
    private javax.swing.JTextField Deno;
    private javax.swing.JTextField Description;
    private javax.swing.JButton Generate_Quotation;
    private javax.swing.JTextField LPR_Number;
    private javax.swing.JTextField Made;
    private javax.swing.JTextField NSN_Number;
    private javax.swing.JTextField NTN_Number;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField Reference_Number;
    private javax.swing.JTextField Validity;
    private javax.swing.JTextField itc;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox_LPR_Number;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> qid;
    // End of variables declaration//GEN-END:variables
}
