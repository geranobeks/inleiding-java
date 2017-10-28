package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class h11PracticalAssignment extends Applet {
    TextField tekstvak;
    Button button;
    int invoer;

    public void init() {
        tekstvak = new TextField(8);
        button = new Button("OK");
        add(tekstvak);
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                invoer = Integer.parseInt(tekstvak.getText());
                repaint();

            }
        });

    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 60;
        while (teller <= 10) {
            g.drawString("" + teller + "X" + invoer + "=" + (teller * invoer), 60, y);
            y += 20;
            teller++;

        }
    }
}
