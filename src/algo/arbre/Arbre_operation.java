package algo.arbre;


public class Arbre_operation {

	Arbre racine;
	
	public Arbre_operation() {
		racine=null;
	}
	
	public Arbre_operation(Arbre racine) {                                                                                  
		this.racine=racine;
		
	}
	
	public void Affiche_resultat(Arbre p) {
		System.out.print(p.info +"   " );
	}
	
	
	public void Parcours_prefixe(Arbre noeud) {
		
		if (noeud==null)return;
		
		Affiche_resultat(noeud);
		Parcours_prefixe(noeud.fils_gauche);
		Parcours_prefixe(noeud.fils_droit);
			
	}
	public void Parcours_infixe(Arbre noeud) {
		
			if (noeud==null) return;
		
		Parcours_infixe(noeud.fils_gauche);
		Affiche_resultat(noeud);
		Parcours_infixe(noeud.fils_droit);
	}
	
	public void Parcours_postfixe(Arbre noeud){
		
		if (noeud==null) return;
		
		Parcours_postfixe(noeud.fils_gauche );
		Parcours_postfixe(noeud.fils_droit);
		Affiche_resultat(noeud);
	}
	
	public int profondeur(Arbre p) {
		if (p == null) {
			return 0;
		}else {
			return (1+profondeur(p.fils_gauche)+ profondeur(p.fils_droit));
		}
	
	}
	
	/*
	public int nb_noeud(Arbre A) {
		if (A==null) {
			return 0;
		}else if (feuille(A)) {
			return 1;
		}else {
			return (nb_noeud(A.fils_gauche)+ nb_noeud(A.fils_droit));
		}
	}*/
	
}

