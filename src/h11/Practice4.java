package h11;

import java.applet.Applet;
import java.awt.*;

public class Practice4 extends Applet {

    public void paint(Graphics g) {
        int y=10;


        for(int a=0; a <= 10; a++)  {
            y+=20;
            g.drawString(a + " x 3 = " + a * 3, 20, y);

        }


    }
}
