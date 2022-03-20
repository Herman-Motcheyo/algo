package algo.heuristie.local_search;

import java.util.Arrays;

import algo.heuristie.utils.Instance;
import algo.heuristie.utils.Map;

public class Main {
	public static void main(String[] args) {
   // Instance.printGraph(Instance.generateGraph(5, 4, 100)); 
		LocalSearch local = new LocalSearch();
		Map<Integer[], Double>sol = local.rechercheLocale(10000, Instance.generateGraph(100, 4, 100));
	    System.out.println(Arrays.toString(sol.getSol()) + "    "+ sol.getValue());
	}
}
