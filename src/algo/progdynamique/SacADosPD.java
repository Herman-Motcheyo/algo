package algo.progdynamique;

import utils.Objets;

public class SacADosPD {
	private Objets sac[];
	private double w;

	public SacADosPD(Objets tab[] ,double w) {
		this.sac = tab;
		this.w = w;
	}
	public void sacADos() {
		int n = sac.length;
		Double[][] tab =new Double[n][(int) w];
		
		for (int j = 0; j < w; j++) {
			tab[0][j] = (double) 0;
		}
		for (int i = 0; i < n; i++) {
			tab[i][0] = (double) 0;
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < w; j++) {
				double p  = tab[i][j-1] ;
				if ( sac[j].getPoids() <= j) {
					if (p <= tab[i-1][(int) (j-sac[i].getPoids())]) {
						tab[i][j] = tab[i-1][(int) (j-sac[i].getPoids())]+sac[i].getValeur();
					}
				}
			}
		}
	}
	
}
