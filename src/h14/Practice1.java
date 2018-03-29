package h14;

import java.awt.*;
import java.applet.*;

public class Practice1 extends Applet {
    private String kleurArray[] =
            {"Schoppen", "Klaver", "Ruiten", "Harten"};
    private String getalArray[] =
            {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};

    private String kleurString ="",  getalString ="";

    public void init(){
        kleurString = kleurArray[(int) (Math.random() * kleurArray.length)];
        getalString = getalArray[(int) (Math.random() * getalArray.length)];
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(kleurString + " " + getalString, 50, 60);

    }
}
