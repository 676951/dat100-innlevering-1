package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int poengsum;
            do {
                String poengsumTxt = showInputDialog("Din poengsum");
                poengsum = Integer.parseInt(poengsumTxt);

                if (poengsum < 0 || poengsum > 100) {
                    showMessageDialog(null, "Poengsum ugyldig, prøv igjen");
                }

            } while (poengsum < 0 || poengsum > 100);  

           
            if (poengsum >= 90 && poengsum <= 100) {
                showMessageDialog(null, "Du har fått karakteren A");
            } else if (poengsum >= 80 && poengsum <= 89) {
                showMessageDialog(null, "Du har fått karakteren B");
            } else if (poengsum >= 60 && poengsum <= 79) {
                showMessageDialog(null, "Du har fått karakteren C");
            } else if (poengsum >= 50 && poengsum <= 59) {
                showMessageDialog(null, "Du har fått karakteren D");
            } else if (poengsum >= 40 && poengsum <= 49) {
                showMessageDialog(null, "Du har fått karakteren E");
            } else if (poengsum >= 0 && poengsum <= 39) {
                showMessageDialog(null, "Du har fått karakteren F");
            }
        }
    }
}
