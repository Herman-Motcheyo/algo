package algo.heuristie.local_search;

import java.util.Arrays;

import algo.heuristie.utils.Fonction;
import algo.heuristie.utils.Map;

public class LocalSearch {


	public Integer[] improve(Integer[] sk, double d[][]) {
		double s_current = Fonction.fctObjectif(sk, d);

		for (int i = 0; i < sk.length-1; i++) {
			Integer[] S_tmp = Arrays.copyOf(sk, sk.length);
			S_tmp[i] = sk[i + 1];
			S_tmp[i + 1] = sk[i];
			if (s_current < Fonction.fctObjectif(S_tmp, d)) {
				return S_tmp;
			}
		}
		return sk;
	}

	public Integer[] generateInitialeSolution(double m_cout[][]) {
		Integer[] S0 = new Integer[m_cout.length ];

		for (int j = 0; j < m_cout.length; j++) {
			S0[j] = j + 1;
		}
		return S0;
	}

	public Map<Integer [], Double> rechercheLocale(int nbIter, double m_cout[][]) {
		int k = 0;
		Integer[] sk = generateInitialeSolution(m_cout);
		while (k < nbIter) {
			sk = improve(sk, m_cout);
			k += 1;
		}
		return new Map<Integer [], Double>(sk, Fonction.fctObjectif(sk , m_cout));
	}
	
}
