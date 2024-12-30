package ie.atu.cicdprojgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    private JButton button1, button2;
    public GUI(){
        super("Test");
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button1 = new JButton("Test");
        button1.addActionListener(this);

        button2 = new JButton("Test 2");
        button2.addActionListener(this);

        add(button1, BorderLayout.WEST);
        add(button2, BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Test Button");

        if(e.getSource() == button1){
            System.out.println("Button 1");
        }

        if(e.getSource() == button2){
            System.out.println("Button 2");
        }
    }
}
