package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tile extends JPanel implements ActionListener {

    private Random random;
    private List<GameLostListener> listeners;

    public Tile(){
        super();
        var button = new JButton();
        this.add(button);
        button.addActionListener(this);
        button.setSize(30,30);

        random = new Random();
        listeners = new ArrayList<>();
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(random.nextInt(5)==0){
            this.listeners.forEach(listener -> listener.gameLost());
        }
        this.removeAll();
        this.repaint();
    }

    public void addGameLostListener(GameLostListener listener){
        this.listeners.add(listener);
    }
}
