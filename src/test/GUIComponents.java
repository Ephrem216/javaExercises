package test;

import javax.swing.*;
public class GUIComponents {
    public static void main(String[] args){
        JButton ok = new JButton("OK");
        JButton fuck = new JButton("FUck Off");
        JLabel label = new JLabel("What the fuck is going on?");
        JTextField text = new JTextField("Enter what is going on here...");
        JCheckBox box = new JCheckBox("Yellow");
        JCheckBox box2 = new JCheckBox("Green");
        JRadioButton radio = new JRadioButton("Bayern Munch");
        JRadioButton radio2 = new JRadioButton("PSG");
        JComboBox combo = new JComboBox(new String[]{"English","Germany","Italy","France","Spain"});
        JPanel panel = new JPanel();
        panel.add(ok);
        panel.add(fuck);
        panel.add(combo);
        panel.add(radio2);
        panel.add(radio);
        panel.add(label);
        panel.add(text);
        panel.add(box);
        panel.add(box2);
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("GUI COMPONENTS");
        frame.setSize(600, 400);
        frame.setLocation(600, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
