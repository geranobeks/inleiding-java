package h03;

import java.applet.Applet;


import java.awt.*;
public class Improve extends Applet {

    public void init() {
    }

    public void paint (Graphics g) {
    setBackground (Color.blue);
    g.setColor(Color.yellow);
    g.drawRect(20, 20, 100, 50);
    g.fillRect(20, 80, 100, 50);
    g.drawRoundRect( 20, 150,50, 50, 10, 10);
    g.drawOval(150,20, 101, 101);
    g.setColor(Color.green);
    g.fillOval ( 150, 20, 100, 100);
    }

}
