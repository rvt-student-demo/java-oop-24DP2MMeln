package rvt;

import java.awt.*;
import java.awt.event.*;

public class Drawing extends Frame {

    
    public Drawing() {
        setVisible(true);
        setSize(300, 300);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawRect(75, 125, 50, 50);

        g.setColor(Color.RED);
        g.drawLine(75, 125, 100, 90);

        g.setColor(Color.RED);
        g.drawLine(101, 91, 125, 125);

        g.setColor(Color.YELLOW);
        g.fillOval(89, 105, 25, 10);

        g.setColor(Color.BLACK);
        g.drawRect(110, 150, 10, 25);

        g.setColor(Color.BLACK);
        g.drawRect(80, 135, 20, 20);
        

        
    }

    public static void main(String[] args) {
        new Drawing(); 
    }
}