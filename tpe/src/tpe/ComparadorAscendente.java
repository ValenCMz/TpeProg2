package tpe;

import java.util.Comparator;

public class ComparadorAscendente implements Comparator<Comparable<Object>>{

	@Override
	public int compare(Comparable<Object> o1, Comparable<Object> o2) {
		return o1.compareTo(o2);
	}

}
