package algo.ml;

import java.util.ArrayList;

public class Cluster {

	private int nb_col;
	private ArrayList<Double> tab;
	private int clusterID = 0;
   

	public Cluster(int nb_col) {
       this.nb_col = nb_col;
       this.tab = new ArrayList<Double>(nb_col);
       this.clusterID++;
	   initialise();
    }
	
	public Cluster(ArrayList<Double> tab) {
	       this.nb_col = tab.size();
	       this.tab = tab;
	       this.clusterID++;
	    }
	
	void initialise() {
		for (int i = 0; i < this.nb_col; i++) {
			tab.add(i, Math.random()*100);
		}
	}

	public ArrayList<Double> getTab() {
		return tab;
	}

	public void setTab(ArrayList<Double> tab) {
		this.tab = tab;
	}
	
	public int getClusterID() {
		return clusterID;
	}

	public void setClusterID(int clusterID) {
		this.clusterID = clusterID;
	}
	
    @Override
	public String toString() {
		return "tab=" + tab ;
	}
	
}
