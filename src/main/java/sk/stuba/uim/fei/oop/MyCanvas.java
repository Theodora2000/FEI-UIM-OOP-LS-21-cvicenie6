package sk.stuba.uim.fei.oop;

import java.awt.*;

public class MyCanvas extends Canvas {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(100,150,100,100);
        g.setColor(Color.red);
        g.fillPolygon(new int[]{100,200,150},new int[]{150,150,75},3);

        g.setColor(Color.white);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                g.fillRect(110+45*i,160+45*j,35,35);
            }
        }
    }
}
