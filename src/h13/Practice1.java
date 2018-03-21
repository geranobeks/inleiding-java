package h13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Practice1 extends Applet {
    private String text="";
    Color[] colors={Color.blue, Color.red, Color.green, Color.yellow, Color.white};
    String[] kleuren={"blue", "red", "green", "yellow", "white"};
    Button[] knop = new Button[5];

    public void init(){

        for(int teller=0; teller <5; teller++){
            knop[teller]= new Button(""+kleuren[teller]);
            add(knop[teller]);
            knop[teller].addActionListener(new classListener());
            knop[teller].setBackground(colors[teller]);
        }
    }
    class classListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Button knop = (Button) e.getSource();
            setBackground(knop.getBackground());
            text = knop.getLabel();
        }
    }
    public void paint(Graphics g){
        g.drawString(text, getWidth()/2-10, getHeight()/2);

    }

}
