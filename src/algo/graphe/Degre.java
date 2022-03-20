package algo.graphe;

public class Degre {
	 public static void main(String[] args) {
		 int m[][] = { 
					{ 0, 1, 0, 1 , 0},
					{ 1, 0, 1, 1 , 0},
					{ 0, 1, 0, 1 , 0},
					{ 1, 1, 1, 0 , 1},
					{ 0, 0, 0, 1 , 0} };
		 int d[] = new int[5];
		 int sum  = 0;
		 for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				sum  = sum +m[i][j];
			}
			d[i] = sum;
			sum = 0;
		}
		 
		 for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}

}
