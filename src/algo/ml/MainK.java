package algo.ml;

import java.util.ArrayList;


public class MainK {

 
public static void main(String[] args) throws Exception {
	Cluster c= new Cluster(3);
	 System.out.println(c.getTab());
	 double t [] = {1,2,3,4,5};
	 double s[][] = { 
				{ 1, 6, 9, 0},
				{ 26, 23, 16, 19 },
				{ 39, 36, 32, 36 },
				{ 48, 44, 48, 47 },
				{ 54, 49, 64, 56 } };
	Kmeans km = new Kmeans(5);
	ArrayList<Double> test = new ArrayList<Double>();
	for (int i = 0; i < s.length; i++) {
		test.add(2.6);
	}
	//System.out.println(test);
	km.KmeansAlgorith(4, s);
	//System.out.println(km.euclidienneDistance(c, t));
}
}
