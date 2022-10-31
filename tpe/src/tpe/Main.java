package tpe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		Nodo n1 = new Nodo("1");
		Nodo n2 = new Nodo("2");
		Nodo n3 = new Nodo("3");
		Nodo n4 = new Nodo("4");
		
		//TODO add en Lista
		n1.setSiguiente(n2);
		n2.setSiguiente(n3);
		n3.setSiguiente(n4);
		
		Comparator compAsc = new ComparadorAscendente();
		Lista lista = new Lista(compAsc);
		lista.setCabeza(n1);
		lista.setFin(n4);
		
		for(Nodo as: lista) {
			System.out.println(as);
		}
	    

		Iterator<Nodo> iterator2 = lista.iterator();
	    
	    while (iterator2.hasNext()) {
            Nodo element = iterator2.next();
            System.out.println(element);
        }

	}

}
