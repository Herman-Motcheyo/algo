package algo.boucle;

public class Operation_sur_boucle {
	
	
	public  double [] Fusion_deux_tab(double A[],double[]B) {
		
		/*
		 * cette methode fusionne deux tableaux triés
		 * les tableaux doivent etre trié ai préalable. 
		 * 
		 **/
        int n=A.length;
        int m =B.length;
        double C[] =new double[m+n];
        int i=0,j=0,k=0;
        
           
           while (i<=n-1 && j<= m-1) {
                if (A[i]>B[j]) {
                    C[k]=B[j];
                    j++;
                    k++;
                }
                else{
                    C[k]=A[i];
                    i++;
                    k++;
                }
           }
           while (i<=n-1) {
               C[k]=A[i];
               i++;
               k++;
           }
           while (j<=m-1) {
              C[k]=B[j];
              j++;
              k++;
          }
          return C;
	  }
	
	public Object Max_tableau(double tableau[]) {
		int j,i;
		i=0; j=tableau.length-1;
		while (i<j) {
			if(tableau[i]<=tableau[j]) {
				i++;
			}
			else {
				j--;
			}
		}
		return tableau[i];
	}
	
public double[] Segmentation(double tableau[]) {
		
		int n = tableau.length;
		int i,j;
		double pivot,tmp;
		i=0;
		j=n-1;
		pivot=tableau[j];
		while(i != j) {
			if(tableau[i]< pivot) {
				i++;
			}
			else if(tableau[j]> pivot) {
				j--;
			}
			else {
				tmp=tableau[i];
				tableau[i]=tableau[j];
				tableau [j]=tmp;
			}
		}
		tmp=tableau[i];
		tableau[i]=pivot;
		pivot=tmp;
		
		return tableau;
	}

public int PGCD(int a,int b) {
	if( a >0 && b==0) {
		return a;
		}
		else {
			int p=PGCD(b,a%b);	
			return p;
		}
}
}
