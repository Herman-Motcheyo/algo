package algo.manipulation;



public class Drapeaux_vertical_horizontale {

	 public enum Couleurs{
        vert,rouge,jaune,bleu;
    }
    public enum Direction{
        horizontale,verticale;
    }
    public enum Sens{
        gauche_à_droite,haut_en_bas;
    }
    //ces methodes affichent le resulat demandé sur le td
    
    public void Affiche(Couleurs C, Couleurs c1,Couleurs C2,Sens S) {
         System.out.println("Le Drapeaux a la couleur   "+C+" "+c1+" "+ C2+" "+" de "+S);
    }
    public void Affiches(Couleurs C, Couleurs c1,Couleurs C2,Sens S,Direction D) {
         System.out.println("Le Drapeaux a 3 bandes "+D+"  "+C+" "+c1+" "+ C2+" de "+S);
         
    }  
}
