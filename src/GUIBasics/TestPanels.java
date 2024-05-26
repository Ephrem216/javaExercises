package GUIBasics;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TestPanels extends JFrame {
    public TestPanels(){
        JPanel panel2 = new JPanel();
        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(3,4));
        for(int i = 1; i <=9; i++){
            JButton b = new JButton(""+i);
            b.setBackground(new Color(250,200,0));
            b.setForeground(Color.BLUE);
            b.setFont(new Font("serif",Font.ITALIC,18));
            panel4.add(b);
        }
        JButton b1 = new JButton("0");
        b1.setBackground(new Color(250,200,0));
        b1.setForeground(Color.BLUE);
        b1.setFont(new Font("serif",Font.ITALIC,18));
        panel4.add(b1);
        JButton b2 = new JButton("Start");
        b2.setBackground(new Color(250,200,0));
        b2.setForeground(Color.BLUE);
        b2.setFont(new Font("courier",Font.ITALIC,18));
        panel4.add(b2);
        JButton b3 = new JButton("Stop");
        b3.setBackground(new Color(250,200,0));
        b3.setForeground(Color.BLUE);
        b3.setFont(new Font("serif",Font.ITALIC,18));
        panel4.add(b3);
//        panel4.add(new JButton("0"));
//        panel4.add(new JButton("Start"));
//        panel4.add(new JButton("Stop"));
        panel2.setLayout(new BorderLayout());
        JTextField text = new JTextField("Time to be displayed here");
        text.setFont(new Font("MonoSpaced",Font.BOLD,16));
        text.setBackground(new Color(45,128,128));
        text.setForeground(Color.white);
        panel2.add(text,BorderLayout.NORTH);
        panel2.add(panel4);
        JButton btn = new JButton("Food to be placed here");
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("SansSerif",Font.BOLD,21));
        add(btn);
        add(panel2,BorderLayout.EAST);
    }

    public static void main(String[] args){
        JFrame frame = new TestPanels();
        frame.setTitle("The front view of a Microwave Oven");
        frame.setSize(400,250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontFamilyNames = e.getAvailableFontFamilyNames();
        for(int i = 0; i < fontFamilyNames.length; i++)
            System.out.println(fontFamilyNames[i]);
//        ArrayList<String> s = new ArrayList<>(List.of(fontFamilyNames));
//        System.out.println(s);
    }
}
