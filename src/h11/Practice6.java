package h11;

import java.applet.Applet;
import java.awt.*;

public class Practice6 extends Applet {

    public void paint(Graphics g) {

        int straal = 100, breedte = 300, hoogte = 300;
        do {
            int x = breedte / 2 - straal;
            int y = hoogte / 2 - straal;
            g.drawOval(x, y, 2 * straal, 2 * straal);
            straal -= 20;
        } while (straal > 2);

    }
}

