package h14;

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Practice2 extends Applet{

    private boolean checkBoolean = false;
    private int arraysLengthCombined;
    private String deckArray[];

    private String kleurArray[] =
            {"Schoppen", "Klaver", "Ruiten", "Harten"};

    private String getalArray[] =
            {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};


    private String speler1Array[];
    private String speler2Array[];
    private String speler3Array[];
    private String speler4Array[];

    public void init(){
        setSize(500, 400);
        checkBoolean = true;
        int teller1 = 0, teller2 = 0;

        speler1Array = new String[13];
        speler2Array = new String[speler1Array.length];
        speler3Array = new String[speler1Array.length];
        speler4Array = new String[speler1Array.length];
        arraysLengthCombined = speler1Array.length + speler2Array.length + speler3Array.length + speler4Array.length;
        deckArray = new String[arraysLengthCombined];

        for (int i = 0; i < arraysLengthCombined; i++) {
            if (teller1 == kleurArray.length) {
                teller1 = 0;
                teller2++;
            }
            deckArray[i] = (kleurArray[teller1] + " " + getalArray[teller2]);
            teller1++;
        }

        for (int i = 0; i < speler1Array.length; i++) {
            speler1Array[i] = deelKaart();
            speler2Array[i] = deelKaart();
            speler3Array[i] = deelKaart();
            speler4Array[i] = deelKaart();
        }

    }


    public void paint(Graphics g) {
        int player1X = 50, player2X = 150, player3X = 250, player4X = 350, playerY = 65;

        if (checkBoolean) {
            for (int i = 0; i < speler1Array.length; i++) {
                if (i == 0) {
                    g.drawString("Speler 1 heeft ", player1X, playerY);
                    g.drawString("Speler 2 heeft ", player2X, playerY);
                    g.drawString("Speler 3 heeft ", player3X, playerY);
                    g.drawString("Speler 4 heeft ", player4X, playerY);
                    playerY += 30;
                }
                g.drawString("" + speler1Array[i], player1X, playerY);
                g.drawString("" + speler2Array[i], player2X, playerY);
                g.drawString("" + speler3Array[i], player3X, playerY);
                g.drawString("" + speler4Array[i], player4X, playerY);
                playerY += 30;
            }
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deckArray.length);
        String kaart = deckArray[random];


        String[] hulpLijst = new String[deckArray.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deckArray.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deckArray[i];
                hulpindex++;
            }
        }
        deckArray = hulpLijst;
        return kaart;
    }
}







