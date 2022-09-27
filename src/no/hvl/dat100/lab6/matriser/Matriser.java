package no.hvl.dat100.lab6.matriser;

public class Matriser {
	public static void main(String[] args) {
		int [][] matriseTab = { {1,2,3},{4,5,6}, {7,8,9} };
	
	//a)Bruke metoden skrivUt til å skrive ut en todimensjonelltabell 
	//ved bruk av utvidet forløkke
		System.out.print("{");
		skrivUt(matriseTab);
		System.out.print("}");
		
	//c) bruke metode fra c for å skrive ut en ny matrise som er multiplisert med oppgitt tall:
		System.out.println(skaler(2, matriseTab));
	
	//d) bruke metode fra d for å sjekk eom to matrise ved parameterne a og b er like:
		int[][]a= {{1,2,3},{3,2,1}};
		int[][]b= {{1,2,3},{3,2,1}};
		System.out.println(erLik(a,b));
}
	public static void skrivUt(int[][] matrise) {
		
		for (int [] i: matrise) 
		for (int j: i) {
			
			System.out.print(j + ",");
			
			
		}
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

/*	// b)
	public static String tilStreng(int[][] matrise) {
		String[] a = {"1 2 3 \n 4 5 6 \n 7 8 9 \n"};
		int [][]matriseTab2 = { {1,2,3}, {4,5,6}, {7,8,9} };
		for(int i=0; i<matrise.length; i++) {
			if (matrise[i] == matriseTab2[i]) 
			{
		return a;
			}
		}
		
	
		
		
	
		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}
*/
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][]nyMatrise=new int[matrise.length][];
		for(int i=0; i<matrise.length; i++) {
			nyMatrise[i] = matrise[i*tall];
		}
		return nyMatrise;
		// TODO
		//throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	//d)
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		boolean erLik = true;
		
		for(int i=0; i<mat1.length; i++)
		for(int j=0; j<mat2.length; j++){
			if (mat1[i] == mat2[j]){
			erLik = false;
			}
		}
		return erLik;
			
		// TODO
	/*	throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	*/
	}
}

