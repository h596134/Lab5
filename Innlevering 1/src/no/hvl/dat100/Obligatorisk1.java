package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Obligatorisk1 {

	public static void main(String[] args) {
		// Beregner ulik trinnskatt i forhold til bruttolønn

		String bruttoTxt = showInputDialog("Bruttolønn:");
		int bruttolønn = parseInt(bruttoTxt);
		double skattPro = 0.00;

		if (bruttolønn <= 184800)
			skattPro = 0.00;

		if (bruttolønn >= 184800 && bruttolønn <= 260100)
			skattPro = 0.017;

		if (bruttolønn >= 260100 && bruttolønn <= 651250)
			skattPro = 0.04;

		if (bruttolønn >= 651250 && bruttolønn <= 1021550)
			skattPro = 0.132;

		if (bruttolønn >= 1021550)
			skattPro = 0.162;

		double totSkatt = (int) (bruttolønn * skattPro + 0.5);

		showMessageDialog(null, "Bruttolønn: " + bruttolønn + " kr" + "\n" + "Skatt : " + skattPro * 100 + "%" + "\n"
				+ "Din skatt: " + totSkatt + " kr");

	}

}
