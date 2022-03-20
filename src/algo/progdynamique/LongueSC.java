package algo.progdynamique;

import java.util.ArrayList;
import java.util.HashSet;

public class LongueSC {
	
	public static int[][] longueSousSuiteCommune(String x , String y) {
		int lsc[][] = new int[x.length() +1][y.length()+1];
		String[][] remonte = new String[x.length()+1][y.length()+1];
		
		for (int i = 0; i <= x.length(); i++) 
			lsc[i][0] = 0;
		for (int j = 0; j <= y.length(); j++) 
			lsc[0][j] = 0;
		
		for (int i = 1; i <= x.length(); i++) {
			for (int j = 1; j <= y.length(); j++) {
				if (x.charAt(i-1) == y.charAt(j-1)) {
					lsc[i][j] =1+ lsc[i-1][j-1];
					remonte[i][j] = "\\";//oblique
				}else if (lsc[i-1][j]  >= lsc[i][j-1]) {
					lsc[i][j] = lsc[i-1][j] ;
					remonte[i][j] = "||";//vers le haut
				}else {
					//(lsc[i-1][j]  <lsc[i][j-1]) 
					lsc[i][j] = lsc[i][j-1];
					remonte[i][j] = "<--";//vers la gauche
				}/* else if (lsc[i-1][j]==lsc[i][j-1]){
					lsc[i][j] = lsc[i][j-1];
					remonte[i][j] = "x";//quelconque
				}*/
			}
			
		}
/*		
		for (int i = 0; i <= x.length(); i++) {
			System.out.print("\n");
			for (int j = 0; j <= y.length(); j++) {
				System.out.print(lsc[i][j]);
			}
		}
		*/
System.out.println(remonte(lsc , x,y));
		return lsc;
	}
	
	public static String imprime(String b[][] , String x, int i ,int j) {
		ArrayList<Character> a = new ArrayList<>();
		if (i==0 || j==0) {
			return "" ; 
		}else if (b[i][j] == "\\") { //on vient de la diagonale
			a.add(x.charAt(i));
			return imprime(b , x,i-1 , j-1 ) ;
		}else if (b[i][j] == "||") { //on vient du haut
			return imprime(b , x,i-1 , j ) ;
		}else {//on vient de la gauche
			return imprime(b , x,i , j-1 ) ;
		}
	}
	public static String  remonte(int[][] lcs ,  String x,String y) {
		int i = x.length() -1;
		int j = y.length()-1;
		String LSC="";
		while (i>0 && j>0) {
			if (lcs[i-1][j-1] ==lcs[i][j] && x.charAt(i)==y.charAt(j) ) {
				LSC.concat(String.valueOf(x.charAt(i)));
				i--;
				j--;
			}else if (lcs[i-1][j] >=lcs[i][j-1] ) {
				i--;
			}else{
				j--;
			}
		}
		return LSC;
	}
	
	public static void main(String[] args) {
		int[][] l = longueSousSuiteCommune("abcbdab", "bdcaba");
System.out.println(	remonte(l, "abcbdab", "bdcaba"));	
}

}
