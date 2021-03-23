package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String []args){
        var okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300,300);

        okno.add(new MyCanvas());
    }
}
