/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.database.management.system;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JTextField tfusername, tfpassword;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("USERNAME");
        lblusername.setBounds(40, 20, 100, 30);
        add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 30);
        add(tfusername);

        JLabel lblpassword = new JLabel("PASSWORD");
        lblpassword.setBounds(40, 70, 100, 30);
        add(lblpassword);

        tfpassword = new JPasswordField(); // Use JPasswordField for password input
        tfpassword.setBounds(150, 70, 150, 30);
        add(tfpassword);

        JButton login = new JButton("LOGIN");
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setBounds(150, 140, 150, 30);
        login.addActionListener(this);
        add(login);



        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            Conn c = new Conn();

            String query = "select * from login where username ='" + username + "' and password ='" + password + "'";
            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                new LIBRARYDATABASEMANAGEMENTSYSTEM ();
                // Place code here to open the main application window or perform other actions upon successful login.
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

