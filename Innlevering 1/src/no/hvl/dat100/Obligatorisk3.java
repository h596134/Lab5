package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Obligatorisk3 {

	public static void main(String[] args) {
		int n;

		String nTxt = showInputDialog("N:");
		n = parseInt(nTxt);
		if (n > 0 && n < 34) {

			showMessageDialog(null, n + "! = " + fakultet(n));
		} else {
			showMessageDialog(null, "N er bare gyldig for tall mellom 1 og 33");

		}
	}

	public static int fakultet(int maxTall) {
		int nFak = 1;
		for (int tall = 1; tall <= maxTall; tall++)
			nFak = nFak * tall;
		return nFak;
	}

}