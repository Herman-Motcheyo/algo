package algo.ml.kmeans;

import java.util.ArrayList;
import java.util.HashSet;

import utils.Conversion;

public class Kmeans {
	
   private ArrayList<Cluster> T ;
   private int k ;
   
   public Kmeans(int k) {
		 T = new ArrayList<Cluster>(k);
		 this.k = k;
}
   
	public ArrayList<Cluster> initialise(int n) {
		for (int i = 0; i < this.k; i++) {
			T.add(new Cluster(n));
		}
		
		return T ;
	}

    public double euclidienneDistance(Cluster C , double[] c ) throws Exception{

    if (C.getTab().size() != c.length) {
		throw new Exception("Les centres doivent avoir le meme nombre");
	}
     double sum = 0;
	 for (int i = 0; i < c.length; i++) {
		 sum += Math.pow(2,(c[i]- C.getTab().get(i)));
	 }
	 return Math.sqrt(sum);
	}
    
    public ArrayList<Double> updateCenter(ArrayList<Double>oldCenter ,  ArrayList<Double>data ) {
    	if (oldCenter.size() != data.size()) {
			return null;
		}
    	ArrayList<Double> newCenter = new ArrayList<Double>();
    	for (int i = 0; i < data.size(); i++) {
			newCenter.add((oldCenter.get(i) + data.get(i))/2) ;
		}
    	return newCenter;
    }
    
    public void KmeansAlgorith( int n , double [][] data) throws Exception {
    	 double dis_min,dist;
    	 int index =0 ;
    	 ArrayList<Cluster> ck = initialise(n); //on initialise les centres
    	 ArrayList<HashSet<Cluster>> gk = new ArrayList<HashSet<Cluster>>(this.k);
    	 
    	 for (int i = 0; i < this.k; i++) {
			gk.add(i, new HashSet<Cluster>());
		}

    	 
    	for (int i = 0; i < data.length; i++) {
    		  dis_min = 100000;
    		for (int j = 0; j < k; j++) {
    			dist   = euclidienneDistance(T.get(j), data[i]);
    			if (dist < dis_min ) {
					dis_min = dist;
					index = j;
				}

			}
       	 ArrayList <Double> ctmp = Conversion.arrayToArrayList(data[i]);
         gk.get(index).add( new Cluster(ctmp));
         ArrayList<Double> newcentroid =  updateCenter(T.get(index).getTab(), Conversion.arrayToArrayList(data[i]));
    	 T.set(index, new Cluster(newcentroid));

		}
    	System.out.println(gk);
    }
	//initialisation du nombre de groupe
    public void printCluster(ArrayList<HashSet<Double>> gk) {
    	
    }
}
