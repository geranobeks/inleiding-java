package h14;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class h14PracticalAssignment extends Applet{

        private int luciferAantal, playerAantal;
        private boolean firstTurnBoolean, turnBoolean;
        private String statusString, turnString, winnerString;
        private TextField tekstVeld = new TextField("", 4);
        private Image luciferImage;


        public void init() {
            super.init();

            URL luciferURL = h14PracticalAssignment.class.getResource("/images/");
            luciferImage = getImage(luciferURL, "lucifer.jpg");
            luciferAantal = 23;

            statusString = "Er zijn " + luciferAantal + " lucifers over.";

            add(tekstVeld);
            tekstVeld.addActionListener(new TekstVeldActionListener());

            Button resetButton = new Button("Reset");
            add(resetButton);
            resetButton.addActionListener(new ResetButtonActionListener());

            setSize(600, 400);
        }


        public void paint(Graphics g) {
            super.paint(g);

            int x = 0, y = 50;

            //Tekent de lucifers op scherm
            g.drawString("" + statusString, 300, 325);
            if (firstTurnBoolean) {
                g.drawString("" + turnString, 300, 350);
            }
            for (int i = 0; i < luciferAantal; i++) {
                g.drawImage(luciferImage, x, y, this);
                x += luciferImage.getWidth(this);
                if (x >= 500) {
                    x = 0;
                    y += luciferImage.getHeight(this);
                }
            }
            if (luciferAantal <= 0) {
                winningPlayerUitwerking();
                g.drawString("" + winnerString, 300, 375);
            }

        }

        private void playerTurnUitwerking() {
            playerAantal = Integer.parseInt(tekstVeld.getText());
            if (playerAantal >= 1 && playerAantal <= 3) {
                luciferAantal = luciferAantal - playerAantal;
                statusString = "Er zijn " + luciferAantal + " lucifers over.";
                turnBoolean = true;
            } else {
                statusString = "Dit is geen geldige invoer!";
            }
        }

        private void computerTurnUitwerking() {
            int computerAantal = 0;
            //Bepaalt hoeveel lucifers er worden weggehaalt
            if (luciferAantal >= 1) {
                switch (luciferAantal) {
                    case 1:
                    case 2:
                    case 9:
                    case 15:
                    case 17:
                    case 18:
                    case 22:
                        computerAantal = 1;
                        break;
                    case 3:
                    case 6:
                    case 8:
                    case 10:
                    case 12:
                    case 14:
                    case 16:
                    case 19:
                        computerAantal = 2;
                        break;
                    case 4:
                    case 7:
                    case 11:
                    case 13:
                    case 20:
                        computerAantal = 3;
                        break;
                    default:
                        computerAantal = (int) (Math.random() * 3) + 1;
                        break;
                }
                luciferAantal = luciferAantal - computerAantal;
                firstTurnBoolean = true;
                turnBoolean = false;
            }
            statusString = "Er zijn " + luciferAantal + " lucifers over.";
            turnString = "De computer heeft " + computerAantal + " weggehaalt";
        }

        private void winningPlayerUitwerking() {
            if (!turnBoolean) {
                winnerString = "Je hebt gewonnen!";
            } else {
                winnerString = "Je hebt verloren!";
            }
        }

        private class TekstVeldActionListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                if (luciferAantal >= 1) {
                    playerTurnUitwerking();
                }
                if (playerAantal >= 1 && playerAantal <= 3) {
                    computerTurnUitwerking();
                }
                repaint();
            }
        }

        private class ResetButtonActionListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                luciferAantal = 23;
                firstTurnBoolean = false;
                statusString = "Er zijn " + luciferAantal + " lucifers over.";
                repaint();
            }
        }
    }
}
