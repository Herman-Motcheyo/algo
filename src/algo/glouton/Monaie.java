package algo.glouton;

import java.util.Arrays;

public class Monaie {
	
	public int[] monaie(double somme , int[] pieces) {
		Arrays.sort(pieces);
		int i=0;
		double reste = somme;
		int n;
		int [] result = new int[pieces.length];
		while(i < pieces.length && reste >0 ) {
			 n = (int) (reste / pieces[i]) ;
			 reste = reste - n*pieces[i];
			 result[i] = n;
			 i++;
		}
		return result;
	}

}
