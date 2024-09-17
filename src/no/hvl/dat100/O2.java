package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		
		double bruttoinntekt;
		String BruttoInntekttxt = showInputDialog("Skriv inn din bruttolønn");
		bruttoinntekt = Integer.parseInt(BruttoInntekttxt);
		double belop = 0;
		
		if (bruttoinntekt >= 1350001) {
            belop += (bruttoinntekt - 1350000) * 0.176;
            bruttoinntekt = 1350000;
        }
        if (bruttoinntekt >= 937901) {
            belop += (bruttoinntekt - 937900) * 0.166;
            bruttoinntekt = 937900;
        }
        if (bruttoinntekt >= 670001) {
            belop += (bruttoinntekt - 670000) * 0.136;
            bruttoinntekt = 670000;
        }
        if (bruttoinntekt >= 292851) {
            belop += (bruttoinntekt - 292850) * 0.04;
            bruttoinntekt = 292850;
        }
        if (bruttoinntekt >= 208051) {
            belop += (bruttoinntekt - 208050) * 0.017;
            
        } else if (bruttoinntekt <= 208050 && bruttoinntekt > 0) {
            showMessageDialog(null, "Du skal ikke betale trinnskatt");
            return;
        }
          
		  showMessageDialog(null, "Du skal betale " + belop + "kr i skatt");
	
	
	}
}
