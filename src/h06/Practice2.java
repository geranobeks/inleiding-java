package h06;

import java.applet.Applet;
import java.awt.*;

public class Practice2 extends Applet {

    int uur = 60*60 ;
    int dag = 60*60*24 ;
    int jaar = 60*60*24*365;
    double jaar2 = dag*365.242199;

    public void init() {

    }

    public void paint (Graphics g) {
        g.drawString("de aantal seconden in een uur zijn: " + uur, 20,20);
        g.drawString("de aantal seconden in een dag zijn: " + dag,20, 35);
        g.drawString("de aantal seconden in een jaar zijn: " + jaar,20,50);
        g.drawString("*wetenschappelijk gezien zijn er 365,242199 dagen in een jaar",20, 70);
        g.drawString("dus daarvan ga ik ook een berekening doen", 25,85);
        g.drawString("de aantal seconden in een jaar zijn: " + jaar2,25,100);

    }
}
