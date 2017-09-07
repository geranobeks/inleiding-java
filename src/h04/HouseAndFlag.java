package h04;

import java.applet.Applet;
import java.awt.*;

public class HouseAndFlag extends Applet{
    public void init() {
    }


    public void paint(Graphics g) {
        super.paint(g);


        setBackground(Color.black);
        g.setColor(Color.green);
        g.drawRect(130, 130, 160, 160);
        g.drawLine(130, 130, 210, 35);
        g.drawLine(210,130, 210, 35);
        g.drawLine(290, 130, 210, 35);
        g.drawRoundRect(160, 90, 35, 35, 50, 50);
        g.drawRoundRect(225, 90, 35, 35, 50, 50);
        g.drawRoundRect(150,190,50,100,10,10);
        g.drawRoundRect(180, 240, 10, 10, 50, 50);
        g.setColor(Color.lightGray);
        g.drawLine(10,290, 10,150);
        g.setColor(Color.red);
        g.fillRect(10,150,90,20);
        g.setColor(Color.white);
        g.fillRect(10,170,90,20);
        g.setColor(Color.blue);
        g.fillRect(10,190,90,20);

    }
}
