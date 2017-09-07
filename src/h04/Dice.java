package h04;

import java.applet.Applet;
import java.awt.*;

public class Dice extends Applet {
    public void paint(Graphics g) {
        g.setColor (new Color (255, 0, 0) );
        g.fillRoundRect(50,63,100, 100,10,10);
        g.setColor (new Color (255, 215, 0) );
        g.fillRoundRect(110, 80, 20, 20, 20, 20);
        g.fillRoundRect(70, 80, 20, 20, 20, 20);
        g.fillRoundRect( 110, 120, 20, 20, 20, 20);
        g.fillRoundRect( 70, 120, 20, 20, 20, 20);



    }
}
