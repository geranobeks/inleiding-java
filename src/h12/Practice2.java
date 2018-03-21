package h12;

import java.applet.Applet;
import java.awt.Button;

public class Practice2 extends Applet {
    Button[] button = new Button[25];

    public void init() {
        setSize(900, 300);
        for (int teller = 0; teller < button.length; teller++) {
            button[teller] = new Button("knop nummer: " + (teller + 1));
            add(button[teller]);
        }
    }
}


