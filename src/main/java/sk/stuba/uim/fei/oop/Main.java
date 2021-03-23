package sk.stuba.uim.fei.oop;

import javax.swing.*;

public class Main {
    public static void main(String []args){
        var okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300,300);

        var panel = new JPanel();
        okno.add(panel);

        var label = new JLabel("Hello world");
        panel.add(label);

        for(int i=0;i<10;i++){
            panel.add(new JLabel(""+i));
        }
    }
}
