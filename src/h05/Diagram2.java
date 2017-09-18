package h05;

import java.applet.Applet;
import java.awt.*;

public class Diagram2 extends Applet {
    int hoogteValerie;
    int hoogteJeroen;
    int hoogteHans;
    int nulpunt, yas_Valerie, yas_Jeroen, yas_Hans;

    public void init(){
        nulpunt=170;
        hoogteValerie=35;
        yas_Valerie=nulpunt-hoogteValerie*2;
        hoogteJeroen=80;
        yas_Jeroen=nulpunt-hoogteJeroen*2;
        hoogteHans=60;
        yas_Hans=nulpunt-hoogteHans*2;


}


    public void paint (Graphics g) {
        super.paint(g);

        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50,10,50,170);
        g.drawString("100",24,20);
        g.drawString("80", 32,50);
        g.drawString("60", 32, 80);
        g.drawString("40", 32, 110);
        g.drawString("20", 32, 140);
        g.drawString("0", 38, 170);
        g.drawLine(50, 170,230, 170);
        g.drawString("Valerie", 60, 185);
        g.drawString("Jeroen", 120, 185);
        g.drawString("Hans", 185, 185);
        g.setColor (new Color (173, 66, 244) );
        g.fillRect(58,yas_Valerie,45,hoogteValerie*2);
        g.setColor (new Color (30, 105, 46) );
        g.fillRect(118, yas_Jeroen, 45, hoogteJeroen*2);
        g.setColor (new Color (255, 215, 0) );
        g.fillRect(178, yas_Hans, 45, hoogteHans*2);

    }
}

