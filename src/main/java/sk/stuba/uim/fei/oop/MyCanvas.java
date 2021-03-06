package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MyCanvas extends Canvas {
    public boolean imageWasDrawn;
    private Image image;

    public MyCanvas() {
        super();
        this.imageWasDrawn = false;
        this.image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
        var ramGraphics = image.getGraphics();
        ramGraphics.setColor(Color.green);
        ramGraphics.fillRect(100, 150, 100, 100);
        ramGraphics.setColor(Color.red);
        ramGraphics.fillPolygon(new int[]{100, 200, 150}, new int[]{150, 150, 75}, 3);

        ramGraphics.setColor(Color.white);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ramGraphics.fillRect(110 + 45 * i, 160 + 45 * j, 35, 35);
            }
        }
    }




    public void paint(Graphics g) {
        if (!this.imageWasDrawn) {
            g.drawImage(image, 0, 0, null);
            this.imageWasDrawn=true;
        }
    }



    }

