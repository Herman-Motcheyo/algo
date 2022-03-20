package algo.heuristie.tabou;

import java.util.Arrays;
import java.util.LinkedList;

import algo.heuristie.utils.Fonction;
import algo.heuristie.utils.Map;

public class Tabou {
	
	public Tabou(int n) {
		new File<Map<Double, Double>>(n);
	}

	public LinkedList<Map<Integer[], Double>> voisinage(Integer s[], double[][] d) {
		double val = Fonction.fctObjectif(s, d);
		LinkedList<Map<Integer[], Double>> list = new LinkedList<Map<Integer[], Double>>();
		for (int i = 0; i < s.length - 1; i++) {
			Integer[] Stmp = Arrays.copyOf(s, s.length);
			Stmp[i] = s[i + 1];
			Stmp[i + 1] = s[i];
			if ( Fonction.fctObjectif(s, d) < val) {
				list.add(new Map<Integer[], Double>(Stmp, Fonction.fctObjectif(s, d)));
			}
		}
		return list;
	}
	
	public void chooseBest( LinkedList<Map<Integer[], Double>> list) {
		for (Map<Integer[], Double> map : list) {
			
		}
	}
}
