package algo.heuristie.utils;

public class Instance {

	public static double[][] generateGraph(int n , int min_value , int max_value){
		double d[][] = new double[n][n];
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				d[i][j] = (i == j)? 0 : ((max_value - min_value) * Math.random() + min_value) ;
			}
		}
		return d;
	}
	public  static void printGraph( double[][] d) {
		for (int i = 0; i <d.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < d.length; j++) {
				System.out.print(d[i][j] +"          ");
			}
		}
	}
	
}
