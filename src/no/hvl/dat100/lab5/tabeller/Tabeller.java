package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static void main(String[] args) {

		int[] tabell = { 42, 67, 89, };

		System.out.println(tilStreng(tabell));
		skrivUt(tabell);
		System.out.println(summer(tabell));

		int tall = 67;

		boolean svar = finnesTall(tabell, tall);

		String tekst = "";
		if (svar == false) {
			tekst = "Nei";
		} else {
			tekst = "Ja ";
		}

		System.out.println("Finnes tall: " + tekst);

		String postall = "" + posisjonTall(tabell, tall);

		System.out.println(
				"Tallet har posisjon " + postall + "  \n negativ verdi betyr at tallet ikke er tilstede i tabellen ");

		System.out.println("Tabell reversert:  " + tilStreng(reverser(tabell)));

		System.out.println("Er sortert:  " + erSortert(tabell));

		System.out.println("Sett sammen to tabeller metode; " + tilStreng(settSammen(tabell, reverser(tabell))));

	}

	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {

			System.out.println(tabell[i]);

		}

		// TODO
		// throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// int[] tabell = new int[tabel.length];

		String s = "";

		for (int i = 0; i < tabell.length - 1; i++) {

			s += tabell[i] + ",";

		}

		s += tabell[tabell.length - 1];
		String s2 = "[" + s + "]";
		return s2;

		// TODO
		// throw new UnsupportedOperationException("tilStreng ikke implementert");

	}

	// c)
	public static int summer(int[] tabell) { // for løkke

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {

			sum += tabell[i];

		}
		return sum;

		// throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean b = false;

		for (int value : tabell) {

			if (tall == value) {
				b = true;
			}

		}
		return b;

		// TODO
		// throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {

			if (tall == tabell[i]) {

				return i;

			}

		}
		return -1;

		// TODO
		// throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] ret = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {

			ret[tabell.length - i - 1] = tabell[i];

		}

		return ret;

		// TODO
		// throw new UnsupportedOperationException("reverser ikke implementert");

	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int v = tabell[0];
		for (int i = 1; i < tabell.length; i++) {

			if (v > tabell[i]) {

				return false;
			}
			v = tabell[i];
		}
		return true;

		// TODO
		// throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] ret = new int[tabell1.length + tabell2.length];
		int i = 0;

		while (i < tabell1.length) {
			ret[i] = tabell1[i];
			i++;
		}

		for (; i < ret.length; i++) {
			ret[i] = tabell2[i - tabell1.length];
		}

		return ret;

		// TODO
		// throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
