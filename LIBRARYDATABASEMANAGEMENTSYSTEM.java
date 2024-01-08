/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library.database.management.system;





import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class LIBRARYDATABASEMANAGEMENTSYSTEM extends JFrame implements ActionListener{
JButton BOOKS,JOURNALS,MEDIA,PATRONS;
LIBRARYDATABASEMANAGEMENTSYSTEM()
{
    setLayout(null);
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("PHOTO/1ST.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);image.setBounds(0, 0, 1120, 630);
        add(image);

        BOOKS = new JButton ("BOOKS ");
        BOOKS.setBounds(650, 80, 150, 40);
        image.add(BOOKS);
        BOOKS.addActionListener(this);
        
        
             JOURNALS = new JButton ("JOURNALS");
      JOURNALS.setBounds(650, 140, 150, 40);
        image.add(JOURNALS);
      JOURNALS.addActionListener(this);
        
            MEDIA = new JButton ("OTHER MEDIA ");
         MEDIA.setBounds(650, 200, 150, 40);
        image.add(MEDIA);
        MEDIA.addActionListener(this);
        
        
           PATRONS = new JButton ("PATRONS ");
        PATRONS.setBounds(650, 260, 150, 40);

        image.add(PATRONS);
        PATRONS.addActionListener(this);
        
        
    setSize(1120,630);
    setVisible(true);
    setLocation(250,100);
    
            }

public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==BOOKS){
        setVisible(false);
        new VIEWBOOKS();
        
    }
    else if (ae.getSource()==JOURNALS){
     setVisible(false);
        new VIEWJOURNALS();}
    else if (ae.getSource()==MEDIA){
        new VIEWMEDIA();  
    }
     else if (ae.getSource()==PATRONS){
        new VIEWPATRONS();
        
    }
    else  {}
    }

            public static void main(String[] args)
    {
        new LIBRARYDATABASEMANAGEMENTSYSTEM();
        
    }
}