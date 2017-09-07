package h04;

import java.applet.Applet;
import java.awt.*;

public class Diagram extends Applet{
    public void init() {
    }


    public void paint (Graphics g) {
        super.paint(g);

        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50,10,50,170);
        g.drawString("100",24,20);
        g.drawString("80", 32,50);
        g.drawString("60", 32, 80);
        g.drawString("40", 32, 110);
        g.drawString("20", 32, 140);
        g.drawString("0", 38, 170);
        g.drawLine(50, 170,230, 170);
        g.drawString("Valerie", 60, 185);
        g.drawString("Jeroen", 120, 185);
        g.drawString("Hans", 185, 185);
        g.setColor(Color.pink);
        g.fillRect(58,100, 45, 70);
        g.setColor(Color.green);
        g.fillRect(118, 10, 45, 160);
        g.setColor(Color.yellow);
        g.fillRect(178, 40, 45, 130);

    }
}

