package GUIBasics;

import javax.swing.*;

public class Test extends javax.swing.JFrame{
    public Test(){
        add(new javax.swing.JButton("OK"));
    }
    public static void main(String[] args){
        javax.swing.JFrame frame = new Test();
        frame.setSize(100, 200);
        frame.setVisible(true);
    }
}
