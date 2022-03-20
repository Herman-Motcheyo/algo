package algo.recherche;

public class Testrecherche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Recherche rech =new Recherche();
    
    String tab[]= {"java","c++","python","c","Visual Basic" };
       int b=rech.Sequentielle(tab, "c");
      System.out.println(b);
       
       double t[] = {11,5,7,8,9,15,78,97,100};
     boolean p=  rech.Dicho_recursive(t, 15, 0, t.length);
     System.out.println(p);
   
	}

}
