package algo.tri;

public class TestTri {

	public static void main(String[] args) {
		Tri tr =new Tri();
		   double t[] = {15,78,21,98,23,82,32,12,7,14};
              double[] tab1={15,1,8,107,4,27,14,2};
              double []x = tr.tri_rapide(t, 0, t.length-1);
              
              
       	   System.out.println( "Tri rapide");
		   for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+"\t");
		}
        
	/*	   double tab[]= tr.Tribulle(t);
		   double tabb[]= tr.Triinsertion(tab1);
		   double ta[]= tr.Triselection(t);
		   
		   System.out.println( "Tri bulle");
		   for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]+"\t");
		}
		   
		   System.out.println( "Tri insertion");
		   for (int i = 0; i < tab1.length; i++) {
			System.out.print(tab1[i]+"\t");
		}
		  
		   
		   System.out.println( "Tri selection");
		   for (int i = 0; i < ta.length; i++) {
			System.out.print(ta[i]+"\t");
		}*/

	}

}
