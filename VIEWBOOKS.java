/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.database.management.system;






import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.ActionEvent;
import java.awt.event.*; 

public class VIEWBOOKS extends JFrame implements ActionListener{
    
    JTable table;
    
    
 VIEWBOOKS()
 {
 getContentPane().setBackground(Color.WHITE);
 getContentPane().setForeground(Color.BLACK);
 
 setLayout(null);

 
         JLabel heading = new JLabel("BOOKS");
        heading.setBounds(300, 20, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);
        


         
 
 
 table = new JTable();
 
 
 try {
     
     Conn c = new Conn();
     ResultSet rs = c.s.executeQuery("select *from Books");
     table.setModel(DbUtils.resultSetToTableModel(rs));
 }
 catch (Exception e) {
            e.printStackTrace();
        }
JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(10, 100, 880, 550); // Adjusted bounds to fit the table bette
        add(jsp);
   
        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);
 }
public void actionPerformed(ActionEvent ae) {
  
   { new VIEWBOOKS();}
        // This method can remain empty since you don't intend to handle any actions here
    }



    public static void main(String[] args) {
   
        new VIEWBOOKS();
       
    }
}
