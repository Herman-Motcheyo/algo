package algo.listechaine;



public class LinkedList {

	Noeud pointeur_de_tete;
	
	//pour moi le pointeur de tete est consideré comme la tete de la liste
	public void insert(Object info){
		
		Noeud noeud = new Noeud();
		noeud.info = info;
		noeud.suivant = null;
		
	
		if(pointeur_de_tete==null){
			
			pointeur_de_tete = noeud;
		}
		else{
			
			Noeud n = pointeur_de_tete;
			
			while(n.suivant != null){
				
				n = n.suivant;
			}
			n.suivant =  noeud;
		}
		
	}
	public void Insert_en_tete(Object element)
	{
       Noeud N = new Noeud();
		N.info = element;
		N.suivant = null;
	    N.suivant= pointeur_de_tete;
		pointeur_de_tete = N;
	}
	
	public void Insertion_en_position_k(int k ,Object element){
		
		Noeud n = new Noeud();
		n.info = element;
		n.suivant = null;
		
		/*ici je veux inserer un element en position k je teste d'abord si c,est en position 0
		 * et si c,est le cas je fais une insertion en tete
		 * sinon
		 * je crai un nouveau noeud parceque une liste chainé est un ensemble de 
		 * noeud chainé et comme ici on a pas de pointeur
		 *  chaque class est une reference vers d'autre class */
		
		if(k == 0){
			
			Insert_en_tete(element);
		}
		else{
			
		Noeud d = pointeur_de_tete;
		
		for(int i=0;i<k-1;i++)
		{
			d = d.suivant;
		}
		n.suivant = d.suivant;
		d.suivant = n;
		}
	}
	
	
	public void Suppression(int k)
	{
		if(k==0)
		{
			pointeur_de_tete = pointeur_de_tete.suivant;
		}
		else
		{
			Noeud E = pointeur_de_tete;
	        Noeud U = null;
			for(int i=0;i<k-1;i++){
				
				E = E.suivant;
		 	}
			U = E.suivant;
			E.suivant = U.suivant;
			
			U = null;
		}
	}
	
	/*pour la suppression des doublons  je teste si la tete est vide
	 * dans ce cas je ne retourne rien et j'arrete le programme
	 * si ce n'est pas vide  je crai un noeud dans lequel j'affecte le pointeur 
	 * de tete
	 * ensuite l'objectif est de parcourir la liste si le prochain element
	 * est egale au precedent je saute cet element et je pointe vers ce qui suit le prochain
	 * */ 
	
	public void Supp_doublon() {
		if (pointeur_de_tete == null) {
			return ;
		}
		
		Noeud  noeud = pointeur_de_tete;
		while (noeud.suivant != null && noeud != null) {
			 if (noeud.info == noeud.suivant.info ) {
				 noeud.suivant= noeud.suivant.suivant;
			}else {
				noeud = noeud.suivant;
			}
			
		}
		
		
	}
	
	public boolean Recherche(Object element) {
		
		int compteur=0;
		boolean trouver = false;
		
		if (pointeur_de_tete.info == element ) {
			trouver =true;
			 System.out.println("Trouvé en position"+ compteur);
		}else {
			Noeud N=pointeur_de_tete;
			while (!trouver && N.suivant != null ) {
				compteur++;
				if (N.info == element ) {
					trouver = true;
					System.out.println("Trouver en position "+ compteur);
				}else {
					N=N.suivant;
				}
			}
		}
		return trouver;
	}
	
 public void Recherche_element(int k) {
	 boolean trouver =false;
	 int compteur=0;
	 Object element ;
	
	Noeud N = pointeur_de_tete;
	 if (k==compteur) {
		 System.out.println(N.info);
	//	return  N.info;
	}else {
		while (N.suivant != null && !trouver ) {
			
			if (k==compteur) {
				trouver = true;
				element = N.info;
				System.out.println(element);
			//	return  element;
			}
			else {
			
				N=N.suivant;
				compteur++;
	
			}
		}
	
	}
	 
}
 public Object get(int k) {
		if (k == 0) {
			return pointeur_de_tete.info;
		} else {
			Noeud node = pointeur_de_tete;
			for (int i = 0; i < k - 1; i++) {
				node = node.suivant;
			}
			return node.suivant.info;
		}

	}
      
	public void Affiche() throws NullPointerException
	{
		Noeud  noeud = pointeur_de_tete;
		if (pointeur_de_tete == null) {
			System.out.println("null");
		}else {
		
		while(noeud.suivant !=null)
		{
			System.out.println(noeud.info +"\t");
			noeud = noeud.suivant;
		}
		System.out.println(noeud.info);
	}
	}
	 public int LengthList() {
			
			Noeud n=pointeur_de_tete;
			int compteur=1;
			
			if (n == null) {
				
				return compteur-1;
				
			}else {
				
			while (n.suivant != null) {
				compteur ++;
				n=n.suivant;
			}
			}
			
			return compteur;
		}


}
