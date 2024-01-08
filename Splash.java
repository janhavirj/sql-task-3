
package library.database.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // Import ActionListener

public class Splash extends JFrame implements ActionListener {
    Splash() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("LIBRARY MANAGEMENT SYSTEM");
        heading.setBounds(100, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/1st image.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1170, 650, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1170, 650);
        add(image);

        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBackground(Color.WHITE);
        clickhere.setForeground(Color.BLACK);
        clickhere.setBounds(485, 300, 200, 60);
        clickhere.addActionListener(this); // Add ActionListener to the button
        image.add(clickhere);

        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);
    }

    // Implement the actionPerformed method from ActionListener
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Splash();
    }
}

