package algo.tri;

public class Tri {
	
	

    public double[] Tribulle(double tab[]) {
  /*
   * this method takes in parameter an array  object and return
   * quick array object */

        double temp;
        int k;
        for (k = tab.length -1; k >= 0; k--) {
            for (int i = 0; i < k; i++) {
                if (tab[i + 1] < tab[i]) {
        // on compare chaque element successif puis on echange
                    temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i +1] = temp;
                }
            }
        }
        return tab;
    }
    
    public double[] Triinsertion(double[] tab) {
		  
    	/* this method takes in parameter an array  object and return
    			   * quick array object */
        int i,k;
        double j;
        for ( k = 0; k < tab.length; k++) {
            j=tab[k];
            i=k-1;
            /* on decale les elements pour faire l'insertion*/
            
            while (i>=0 && j<tab[i]) {
                tab[i+1]=tab[i];
                i--;
            }
            /* on fait l'insertion proprement dite*/
            tab[i+1]=j;
        }
      return tab;
  }
    
    private int segmentation(double tab[],int debut,int fin) {
    	
        //cette methode a pour but de mettre le pivot a sa bonne position
        int i,j;
        double temp,pivot;
        pivot=tab[fin-1];
        i=debut;
        j=fin;
         while (i != j) {
             if (tab[i] < pivot) {
                 i++;
             }else if (tab[j] > pivot) {
                 j--;
             }else{
                 temp=tab[i];
                 tab[i]=tab[j];
                 tab[j]=temp;
                 
             }
         }
                 temp=tab[i];
                 tab[i]=pivot;
                 pivot=temp;

               return i;  //on retourne l'indice du pivot
     }
    
  
   public  double[] tri_rapide(double t[],int debut ,int fin) {
	   
        int place_pivot; //cette methode recursive  est le tri rapide
        if(debut < fin){
            place_pivot=segmentation(t,debut, fin);
            tri_rapide(t,debut, place_pivot-1);
            tri_rapide(t,place_pivot+1, fin);
        }
      
        return t;
    }
	 
		
	    public double[] Triselection(double tab[]) {


	        int i, k, max;
	        double temp;

	        for (k = tab.length - 1; k >= 0; k--) {
	            max = 0;

	            for (i = 0; i <= k; i++) {
	                if (tab[i] > tab[max]) {
	                    max = i; //selection de la position du maximun 
	                }
	            }
	            temp = tab[k];
	            tab[k] = tab[max];
	            tab[max] = temp;
	            //on met le max à sa bonne position par échange
	        }
	        return tab;
	    }
}
