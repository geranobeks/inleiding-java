package h11;

import java.applet.Applet;
import java.awt.*;

public class Practice8 extends Applet {

    public void paint(Graphics g) {
        int y =20;
        int x =20;

        for(int a = 0; a <= 100; a++)  {
            y +=10;
            x +=10;

            g.drawOval(20,20,x,y);


        }
    }
}
