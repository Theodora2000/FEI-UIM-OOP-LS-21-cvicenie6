package sk.stuba.uim.fei.oop;

import javax.swing.*;

public class Main {
    public static void main(String []args){
        var okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300,300);
        var label = new JLabel("Hello world");
        okno.add(label);
    }
}
