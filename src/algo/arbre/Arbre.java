package algo.arbre;

public class Arbre {

	Object info;
	Arbre fils_gauche;
	Arbre fils_droit;
	
	public Arbre(char info) {
		this.info=info;
		fils_gauche=null;
		fils_droit=null;
	}
}
