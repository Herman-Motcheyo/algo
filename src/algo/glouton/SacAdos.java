package algo.glouton;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

import utils.Objets;

public class SacAdos {
	
	private double capacite;
	private Objets[] obj ;
	public SacAdos(double capacite, Objets[] obj) {
		super();
		this.capacite = capacite;
		this.obj = obj;
	}
	public double getCapacite() {
		return capacite;
	}
	public void setCapacite(double capacite) {
		this.capacite = capacite;
	}
	public Objets[] getObj() {
		return obj;
	}
	public void setObj(Objets[] obj) {
		this.obj = obj;
	} 
	
	public HashSet<Objets> sacADosEntier() {
		HashSet<Objets> s = new HashSet<Objets>(); 
		double w = 0;
		@SuppressWarnings("unused")
		double valeur = 0;
		Arrays.sort(this.obj , new Comparator<Objets>() {

			@Override
			public int compare(Objets a, Objets b) {
				if (a.getValeur() >b.getValeur() ) {
					return 1;
				}else if(a.getValeur() < b.getValeur() ) {
					return -1;
				}
				return 0;
			}
			
		});
		 for (int i = 0; i < obj.length; i++) {
			if (w + this.obj[i].getPoids() <= this.capacite) {
				s.add(this.obj[i]);
				w +=  this.obj[i].getPoids() ;
				valeur += this.obj[i].getValeur();
			}
		}
		 return s;
		
	}
	
	public HashSet<Objets> sacADosFractionnaire() {
		HashSet<Objets> s = new HashSet<Objets>(); 
		double w = 0;
		@SuppressWarnings("unused")
		double valeur = 0;
		int i = 0;
		Arrays.sort(this.obj , new Comparator<Objets>() {

			@Override
			public int compare(Objets a, Objets b) {
				if (a.getValeur() >b.getValeur() ) {
					return 1;
				}else if(a.getValeur() < b.getValeur() ) {
					return -1;
				}
				return 0;
			}
			
		});
		 while (this.capacite -w > 0) {
			 if (w + this.obj[i].getPoids() <= this.capacite) {
					s.add(this.obj[i]);
					w +=  this.obj[i].getPoids() ;
					valeur += this.obj[i].getValeur();
				}else {
					 w = w + (this.capacite - w )/this.obj[i].getPoids();
					 valeur = valeur + (this.capacite - w)*this.obj[i].getValeur() /this.obj[i].getPoids() ;
					 Objets o  = new Objets( (this.capacite - w) / this.obj[i].getPoids(), this.obj[i].getValeur());
					 s.add(o );
				}
			 i++;
		}

		 return s;
		
	}

}
