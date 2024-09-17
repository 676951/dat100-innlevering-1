package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;
;
public class O3 {

	
	public static long  beregnFakultet(int n) {
		long fakultet = 1;
		for (int i=1; i<=n; i++) {
			fakultet *= i;
		}
		return fakultet;

}
	public static void main(String[] args) {
	
		
		String heltallTxt = showInputDialog("Skriv inn et heltall");
        int n = Integer.parseInt(heltallTxt);
    
            if (n < 0) {
                showMessageDialog(null, "Tallet er ugyldig");
            } else {
            	long fakultet = beregnFakultet(n);
            	JOptionPane.showMessageDialog(null, n +"! = " + fakultet);
            }

		}
	}
