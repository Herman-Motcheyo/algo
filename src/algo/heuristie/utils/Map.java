package algo.heuristie.utils;

public class Map<T, V> {
	T sol;
	V value;

	public Map(T exp1, V exp2) {
		this.sol = exp1;
		this.value = exp2;
	}

	public T getSol() {
		return sol;
	}

	public void setSol(T sol) {
		this.sol = sol;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
}
