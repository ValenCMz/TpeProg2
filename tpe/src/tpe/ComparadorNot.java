package tpe;

import java.util.Comparator;

public class ComparadorNot implements Comparator<Comparable<Object>>{

	private Comparator<Object>comp;
	
	public ComparadorNot(Comparator<Object>comp) {
		this.comp = comp;
	}

	@Override
	public int compare(Comparable<Object> o1, Comparable<Object> o2) {
		return comp.compare(o1, o2) * -1;
	}

}
