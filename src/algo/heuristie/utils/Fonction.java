package algo.heuristie.utils;

public class Fonction {
	
	public static double fctObjectif(Integer[] s_tmp, double matrice_cout[][]) {
		double somme = matrice_cout[0][s_tmp[0]] + matrice_cout[s_tmp.length - 1][0];

		for (int i = 2; i < matrice_cout.length - 2; i++) {
			somme += matrice_cout[s_tmp[i]][i + 1];
		}
		return somme;
	}
}
