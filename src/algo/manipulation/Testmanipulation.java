package algo.manipulation;

import algo.manipulation.Drapeaux_vertical_horizontale.Couleurs;
import algo.manipulation.Drapeaux_vertical_horizontale.Direction;
import algo.manipulation.Drapeaux_vertical_horizontale.Sens;

public class Testmanipulation {
	
	  public static void main(String[] args) {
	        
		 Drapeaux_vertical_horizontale d =new Drapeaux_vertical_horizontale();
		    Couleurs C1,C2,C3;
		    Direction D1,D2;
		    Sens S1,S2;

		    System.out.println("\t\t----DRAPEAU 1----");
		      C1=Couleurs.vert;
		         C2=Couleurs.rouge;
		            C3=Couleurs.jaune;
		       S1=Sens.gauche_à_droite;
		       d.Affiche(C1, C2, C3, S1);


		        System.out.println("\t\t----DRAPEAU 2----");
		      C1=Couleurs.bleu;
		         C2=Couleurs.rouge;
		            C3=Couleurs.jaune;
		       S1=Sens.gauche_à_droite;
		       D1=Direction.verticale;
		       d.Affiches(C1, C2, C3, S1,D1);
		        

		        System.out.println("\t\t----DRAPEAU 3----");
		      C1=Couleurs.vert;
		         C2=Couleurs.rouge;
		            C3=Couleurs.jaune;
		       S2=Sens.haut_en_bas;
		       D2=Direction.horizontale;
		       d.Affiches(C1, C2, C3, S2,D2);
		        


		    }
}
