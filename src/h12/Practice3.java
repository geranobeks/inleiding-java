package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.TextField;

public class Practice3  extends Applet{

    TextField[] tekstvelden;
    Button knop;

    @Override
    public void init(){
        tekstvelden = new TextField[5];
        knop= new Button("Ok");

        for( int i = 0; i < tekstvelden.length; i++){
            TextField tf = new TextField(5);
            tekstvelden[i] = tf;
            add(tf);
        }
        knop.addActionListener(new KnopListener());
        add(knop);
    }


    public class KnopListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            int[] inputGetallen = new int[5];
            for (int i = 0; i < inputGetallen.length; i++) {
                String in = tekstvelden[i].getText();
                int inInt = Integer.parseInt(in);
                inputGetallen[i] = inInt;
            }
            Arrays.sort(inputGetallen);
            for(int i = 0; i< inputGetallen.length; i++) {
                tekstvelden[i].setText(String.valueOf(inputGetallen[i]));
            }
        }
    }
}
