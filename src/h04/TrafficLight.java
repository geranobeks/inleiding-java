package h04;

import java.applet.Applet;
import java.awt.*;


public class TrafficLight extends Applet {
    public void paint (Graphics g) {

        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRoundRect(50, 60,50,120, 10,10);
        g.setColor (new Color (255, 0, 0) );
        g.fillOval(59,65,30,30);
        g.setColor (new Color (255, 255, 0) );
        g.fillOval(59, 105, 30, 30);
        g.setColor (new Color (0, 255, 0) );
        g.fillOval(59, 145, 30, 30);

    }
}
