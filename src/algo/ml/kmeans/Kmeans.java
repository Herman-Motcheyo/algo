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
    
    public double mean(ArrayList<Double> attribute) {
  	  double sum  = 0;
  	  for (int i = 0; i < attribute.size(); i++) 
  		  sum += attribute.get(i);
  	  return sum/ attribute.size() ;
    }

    
//this method is use to show to give gravity center of a set data
    
    // array_name.length // row
    // array_name[0].length // col
	public ArrayList<Double> gravityCenter(double [][] data ){
		
		ArrayList<Double> gravity = new ArrayList<Double>();
		ArrayList<Double> tmp = new ArrayList<Double>();
		for (int i = 0; i < data[0].length; i++) {
			for (int j = 0; j < data.length; j++) {
			tmp.add(data[j][i]);
			}
			gravity.add(mean(tmp));
			tmp.clear();
		}
		return gravity;
 	}
    
	public double totalInertia(ArrayList<Double>gravity , double [][] data) throws Exception {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += euclidienneDistance(new Cluster(gravity), data[i]) ;
		}
		return sum ;
	}
	
	public double intraclassInertia(ArrayList<HashSet<Cluster>>  cluster , ArrayList<Double> gravity) throws Exception {
		double sum = 0,Wi = 0;
		for (int i = 0; i < cluster.size(); i++) {
			if (cluster.get(i).size() != 0) {
				Wi = 1.0 / cluster.get(i).size();
				for (Cluster cl : cluster.get(i)) {
					sum +=Wi * euclidienneDistance(cl, Conversion.arrayListToArray(gravity)); 
				
				}
			}
		}
		return sum;
	}
	
    public void KmeansAlgorith( int n , double [][] data) throws Exception {
    	
    	int index =0; 
    	double dis_min,dist;
    	double seuil = 0;
    	double intraClassI = 0;
        ArrayList<Cluster> ck = initialise(n); //on initialise les centres
	    ArrayList<HashSet<Cluster>> gk = new ArrayList<HashSet<Cluster>>(this.k);
	   
    	 
    	 for (int i = 0; i < this.k; i++) {
			gk.add(i, new HashSet<Cluster>());
		}
        double totalInertia = totalInertia(gravityCenter(data), data);

    	 do {
			
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
    	totalInertia = intraclassInertia(gk , gravityCenter(data)) ;
    	//System.out.println(gk);
    	System.out.println(intraclassInertia(gk , gravityCenter(data))+" ok ok ");
     
    	 }while(totalInertia - intraClassI < seuil );
    	 
    	}
	//initialisation du nombre de groupe
    public void printCluster(ArrayList<HashSet<Double>> gk) {
    	
    }
}
