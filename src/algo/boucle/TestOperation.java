package algo.boucle;

import algo.tri.Tri;

public class TestOperation {
	
	public static void main(String[] args) {
		Tri tr = new Tri();
		Operation_sur_boucle op =new Operation_sur_boucle();
	
	    double t[] = {15,78,21,98,23,82,0.32,12,7,14};
	    double [] h = {1,4,5,6,7,8,9,10};
	    double []tab = tr.Tribulle(t);
	   
	 double[] c =op.Fusion_deux_tab(h, tab);
		
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i]+"\t");
			}
	 
	/*	for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}*/
		
	/*double [] tx= (double[]) op.Segmentation(t);
		for (int i = 0; i < tx.length; i++) {
			System.out.print(tx[i]+"\t");
		}*/
	   // System.out.println(op.Max_tableau(t));
	    
	}

 
    
	
}
