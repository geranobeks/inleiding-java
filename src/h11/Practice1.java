package h11;

import java.applet.Applet;
import java.awt.*;

public class Practice1 extends Applet{


    public void paint(Graphics g) {
        int teller;
        int y= 20;

        for(teller=1; teller<= 10; teller++)  {
            y += 10;
          g.drawLine(20,y,60,y);
        }


    }
}
