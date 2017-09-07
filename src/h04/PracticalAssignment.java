package h04;

import java.applet.Applet;
import java.awt.*;

public class PracticalAssignment extends Applet {


    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(100,100,200,100);
        g.drawString("lijn",110,115);


        g.drawRect(100,150,100,50);
        g.drawString("rechthoek", 105, 215);

        g.setColor(Color.magenta);
        g.fillRect(250, 150, 100, 50);
        g.setColor(Color.black);
        g.drawRect(250,150,100,50);
        g.drawString("ovaal in een roze rechthoek",210,215);
        g.drawOval(250,150,99,49);

        g.drawOval(380,150,100,50);
        g.setColor(Color.magenta);
        g.fillArc(381,150,100,50,0,45);
        g.setColor(Color.black);
        g.drawString("last pizza",395, 215);

        g.drawRoundRect(100,250,100,50,20,20);
        g.drawString("smooth rechthoek",80,320);

        g.setColor(Color.magenta);
        g.fillOval(250,250,100,50);
        g.setColor(Color.black);
        g.drawOval(250,250,99,49);
        g.drawString("gevulde koek", 258, 320);

        g.drawOval(380,250,75,75);
        g.drawString("cirkel",390,345);





    }
}
