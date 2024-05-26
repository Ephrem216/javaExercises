package GUIBasics;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("MyFrame");
        frame.setSize(400,300);
        JButton b= new JButton("OK");
        frame.add(b);
        frame.add(b);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);



        frame.add(new JLabel("First name"));
        frame.add(new JTextField(8));
        frame.add(new JLabel("MI"));
        frame.add(new JTextField(1));
        frame.add(new JLabel("Last name"));
        frame.add(new JTextField(8), BorderLayout.CENTER);

        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        //frame.add(new JButton("CENTER"), BorderLayout.CENTER);


        frame.setVisible(true);
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER,50,10));
//
        frame.setLayout(new BorderLayout(5,5));
    }
}
