package no.hvl.dat100;

public class OppgaveG1 {

	public static void main(String[] args) {
		int[] tabell = { 1, 3, 4, 7, 9, 10 };

		tabell[2] = 7;
		int i = 0;
		for (i = 0; i < tabell.length; i++)

			System.out.println(tabell[i]);
		System.out.println(data);
	}

	public void skrivUt(int[] tab) {
		System.out.println("------------");

		for (int[] rad : data) {

			for (int v : rad) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
		System.out.println("------------");
	}

private static int[][] data = {
		{ 1, 3, 4, 7, 9, 10 }};	
}
