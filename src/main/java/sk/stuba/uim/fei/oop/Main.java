package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String []args){
        var okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300,300);

        var panel = new JPanel();
        okno.add(panel);

        var panelLayout = new GridLayout(4,4);
        panel.setLayout(panelLayout);

        var label = new JLabel("Hello world");
        panel.add(label);


        var panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,2));
        for(int i=0;i<4;i++){
            panel2.add(new Label("p"+i));
        }
        for(int i=0;i<12;i++){
            if(i==8){
                panel.add(panel2);
            }
            panel.add(new JLabel(""+i));
        }
    }
}
