package h11;

import java.applet.Applet;
import java.awt.*;

public class Practice5 extends Applet{


    public void paint(Graphics g) {
        int y =20;
        int x =20;

        for(int a = 0; a <= 5; a++)  {
            y +=20;
            x +=20;

            g.drawRect(x,y,20,20);


        }
    }
}
