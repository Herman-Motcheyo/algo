package algo.ml;



import algo.ml.kmeans.Cluster;
import algo.ml.kmeans.Kmeans;


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
				{ 6, 49, 64, 56 } };
	Kmeans km = new Kmeans(2);
	System.out.println( km.gravityCenter(s));
	System.out.println(km.totalInertia(km.gravityCenter(s), s));

	km.KmeansAlgorith(4, s);
	//System.out.println(km.euclidienneDistance(c, t));
}
}
