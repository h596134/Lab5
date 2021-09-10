package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Obligatorisk2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			

			String poengTxt = showInputDialog("Poengsum:");

			int poengsum = parseInt(poengTxt);

			String karakter = "Feil";
			{
			if (poengsum < 0 || poengsum > 100)
				karakter = "Feilmelding: Velg en gyldig poengsum (0-100)";
		}
			if (poengsum >= 0 && poengsum <= 39)
				karakter = "Karakter: F";
			{
			if (poengsum >= 40 && poengsum <= 49)
				karakter = "Karakter: E";
			}
			if (poengsum >= 50 && poengsum <= 59)
				karakter = "Karakter: D";
			{
			if (poengsum >= 60 && poengsum <= 79)
				karakter = "Karakter: C";
			}
			if (poengsum >= 80 && poengsum <= 89)
				karakter = "Karakter: B";
			{
			if (poengsum >= 90 && poengsum <= 100)
				karakter = "Karakter: A";
			}
			showMessageDialog(null, karakter);
			System.out.println(karakter);
			
		}

	}

}
