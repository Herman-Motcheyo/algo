package algo.heuristie.tabou;

import java.util.LinkedList;

public class File<E> extends LinkedList<E>{
	
	private static final long serialVersionUID = 1L;
	
	private int tailleList ;
	
	public File(int taille) {
		this.tailleList = taille;
	}
	@Override
	public void push(E e) {
		super.push(e);
	}
	
	public int getTailleList() {
		return tailleList;
	}
	public void setTailleList(int tailleList) {
		this.tailleList = tailleList;
	}
	

}
