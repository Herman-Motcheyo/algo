package algo.arbre;

public class TestArbre {

	public static void main(String[] args) {
	
		Arbre A=new Arbre('A');
		Arbre B=new Arbre('B');
		Arbre C=new Arbre('C');
		Arbre D=new Arbre('D');
		Arbre E=new Arbre('E');
		Arbre F=new Arbre('F');
		Arbre H=new Arbre('H');
		Arbre P=new Arbre('P');
		Arbre M=new Arbre('M');
		Arbre R=new Arbre('R');
		Arbre I=new Arbre('I');
		Arbre T=new Arbre('T');
		
		
		A.fils_gauche=B;
		A.fils_droit=C;
		
		B.fils_droit=H;
		B.fils_gauche=F;
		
		C.fils_droit=E;
		C.fils_gauche=D;
		
		D.fils_droit=R;
		D.fils_gauche=I;
		
		H.fils_droit=T;
		
		F.fils_droit=M;
		F.fils_gauche=P;
		
		Arbre_operation Ab=new Arbre_operation(A);
		Ab.Parcours_prefixe(Ab.racine);
		System.out.println();
		Ab.Parcours_infixe(Ab.racine);
		System.out.println();
		Ab.Parcours_postfixe(Ab.racine);
		
		int p=Ab.profondeur(Ab.racine);
		System.out.println("la profondeur de l'arbre est "+p);

	}

}
