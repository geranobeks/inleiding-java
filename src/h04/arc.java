package h04;


import java.applet.Applet;
import java.awt.*;

public class arc extends Applet {
    public void paint(Graphics g) {

    setBackground(Color.blue);
    g.drawOval(100,100,100,50);
    g.setColor(Color.yellow);
    g.fillArc(100,100,100,50, 0,180);
    }
}
