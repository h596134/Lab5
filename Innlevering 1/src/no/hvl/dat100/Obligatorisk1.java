package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Obligatorisk1 {

	public static void main(String[] args) {
		// Beregner ulik trinnskatt i forhold til bruttol�nn

		String bruttoTxt = showInputDialog("Bruttol�nn:");
		int bruttol�nn = parseInt(bruttoTxt);
		double skattPro = 0.00;

		if (bruttol�nn <= 184800)
			skattPro = 0.00;

		if (bruttol�nn >= 184800 && bruttol�nn <= 260100)
			skattPro = 0.017;

		if (bruttol�nn >= 260100 && bruttol�nn <= 651250)
			skattPro = 0.04;

		if (bruttol�nn >= 651250 && bruttol�nn <= 1021550)
			skattPro = 0.132;

		if (bruttol�nn >= 1021550)
			skattPro = 0.162;

		double totSkatt = (int) (bruttol�nn * skattPro + 0.5);

		showMessageDialog(null, "Bruttol�nn: " + bruttol�nn + " kr" + "\n" + "Skatt : " + skattPro * 100 + "%" + "\n"
				+ "Din skatt: " + totSkatt + " kr");

	}

}
