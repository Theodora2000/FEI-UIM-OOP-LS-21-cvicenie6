package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    public static void main(String []args){
        new Main();

    }
    public Main(){
        var okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300,300);

        var button = new JButton("Click me!");
        okno.add(button);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hello");
    }
}
