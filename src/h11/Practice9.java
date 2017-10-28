package h11;

import java.applet.Applet;
import java.awt.*;

public class Practice9 extends Applet{

    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        int breedte = 20;
        int hoogte = 20;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
    }
}
