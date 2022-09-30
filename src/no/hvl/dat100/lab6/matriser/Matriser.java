package no.hvl.dat100.lab6.matriser;

public class Matriser {
	public static void main(String[] args) {
		int [][] matriseTab = { {1,2,3},{4,5,6}, {7,8,9} };
	
	//a)Bruke metoden skrivUt til å skrive ut en todimensjonelltabell 
	//ved bruk av utvidet forløkke
		//System.out.print("{");
		skrivUt(matriseTab);
		System.out.print(" \n \n");
		
	//c) bruke metode fra c for å skrive ut en ny matrise som er multiplisert med oppgitt tall:
		
		int[][] multimatrise = skaler(2, matriseTab);
		skrivUt(multimatrise);
	
	//d) bruke metode fra d for å sjekk eom to matrise ved parameterne a og b er like:
		int[][]a= {{1,2,3},{3,2,1}};
		int[][]b= {{1,2,3},{3,2,1}};
		System.out.println(erLik(a,b));
		
	
		
		//e) speile kvadratisk matrise
		
		System.out.println("\n" + tilStreng(speile((matriseTab))));
}
	// a)
	public static void skrivUt(int[][] matrise) {
		String holdeVar = "";
		for(int[] y: matrise) {
			for(int i: y) {
				holdeVar += i + " ";
						}
				holdeVar += "\n";	
		}
				System.out.print(holdeVar);		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String holdeVar = "";
		for(int[] y: matrise) {
			for(int i: y) {
				holdeVar += i + " ";
						}
				holdeVar += "\n";	
		}
		return holdeVar;	
	}
		

	// c)
		public static int[][] skaler(int tall, int[][] matrise) {
			int[][] nyMatrise = new int[matrise.length][matrise[0].length];
				for (int i = 0; i < matrise.length; i++ ) {
					for (int y = 0; y < matrise[i].length; y++) {
						nyMatrise[i][y] = matrise[i][y]*tall;
					}
				}
				return nyMatrise;
				// TODO
				//throw new UnsupportedOperationException("skaler ikke implementert");
	}

	//d)
		public static boolean erLik(int[][] a, int[][] b) {
			//return a.equals(b); triviell løsning, ikke brukt pga. ulovlig(?)
				
			//Tester om listene er like i størrelse. 
			if (a.length != b.length) {
				return false;
				}
			else {
				for (int i = 0; i <a.length; i++) {
					if (a[i].length != b[i].length) {
						return false;
					}
					else  {
						//Tester om listene har likt innhold.
						for (int y = 0; y < a.length; y++) {
						if (a[i][y] != b[i][y]) {
							return false;
						}
					}
				}
			 } 
		 } 
		return true;
	}
			
		// e)
		public static int[][] speile(int[][] matrise) {

			// TODO
			
			int[][] speil = new int[matrise[0].length][matrise.length];
			{

				for (int i = 0; i < matrise[0].length; i++) {
					for (int ii = 0; ii < matrise.length; ii++) {

						speil[i][ii] = matrise[ii][i];

					}
				}
			}

			return speil;
		//	throw new UnsupportedOperationException("speile ikke implementert");
		
		}

		// f)
		public static int[][] multipliser(int[][] a, int[][] b) {

			// TODO
		//	throw new UnsupportedOperationException("multipliser ikke implementert");
		
		}
	}

