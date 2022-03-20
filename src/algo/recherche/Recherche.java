package algo.recherche;

public class Recherche {

	@SuppressWarnings("unused")
	private  double[] tab;
	
	 //recherche dichotomique version iterative
	
	 public boolean DichoIterative( double tab[] ,double val) {
	       
		 
		  /*cette methode de classe effectue la recherche sequentielle
	       *  et retourne une valeur  booleenne 
	       *  true (trouver) si on trouve l'élement
	       *   false (pas trouver) si on ne trouve pas
	       *   
	       *   this method takes two object in parameter: a table and object that you 
	       *   want to search 
	       */
	        this.tab=tab;
	        int min=0;
	        int max= tab.length -1;
	        boolean trouver=false;
	        int mediane;

	            while (min<=max && !trouver) {

	                  mediane= (min +max)/2;

	                if (val==tab[mediane]) {
	                    trouver= true;
	                  
	                }else{
	                    if (val < tab[mediane]) {
	                        max=mediane-1;
	                    }else{
	                        min=mediane +1;
	                    }
	                }
	            }
	            return trouver;
	        }
	 
	

		 public boolean Dicho_recursive( double tab[],double val,int debut,int fin) {
			 
	         //recherche dichotomique version recursive
			 
				/*cette methode prend en parametre l'element à rechercher,
				 * le debut et la fin du tableau
				 * puis retourne une variable booleenne*/
			 /*
			  * this method takes four Object in parameter 
			  * the first is a table
			  * second is a number that you want to search 
			  *  third and fourth are the first and last index of array*/
			 
			 
	        boolean trouver=false;
	        
	        if (debut>fin) {
	           return trouver;
	        }else{

	            int mediane = (debut+fin)/2;
	            if (val==tab[mediane]) {
	                trouver=true;
	            }else{
	            if (val < tab[mediane]) {
	              return  Dicho_recursive(tab, val, debut, mediane-1);
	            }else{
	               return  Dicho_recursive(tab, val, mediane+1, fin);
	            }
	        }
	    }
	        return trouver;
	}
		 
		 public Boolean Sentielle(Object tab[], Object val) {
			 
		      /*cette methode de classe effectue la recherche sequentielle
		       *  et retourne une valeur  booleenne 
		       *  
		       *  true (trouver) si on trouve l'élement
		       *   false (pas trouver) si on ne trouve pas
		       */
	    
	        tab[-1]=val;
	        int i = tab.length-1;
	        boolean trouver = false;
	        while (i>0 && !trouver) {
	            if (tab[i] == val) { 
	                trouver = true; 
	            }
	               
	            else
	                i--;
	        }
	        return trouver;
	    }
		 
		 
			public int Sequentielle(Object tab[], Object val) {
		    	/*
		    	 * This method return a integer
		    	 * 
		    	 * it returns the position of the element in array
		    	 * when we don't find element, it returns -1*/
		 /*
		  * cette methode recherche l'element et retourne :
		           si    il est present alors la methode retourne sa position 
		          *sinon   elle retourne  -1
		     **/
		        int i = 0;
		        boolean trouver = false;
		        while (i < tab.length - 1 && !trouver) {
		            if (tab[i] == val) { 
		                trouver = true;      
		            }
		               
		            else
		                i++;
		        }
		        return(trouver ? i : -1);
		    }

}
