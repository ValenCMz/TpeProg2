package tpe;

import java.util.Comparator;
import java.util.Iterator;

public class Lista implements Iterable<Nodo>{

	private Nodo cabeza;
	private Comparator<Nodo> criterioOrden;
	private Nodo fin;

	public Lista(Comparator<Nodo> criterioOrden){
		this.cabeza = null;
		this.criterioOrden = criterioOrden;
	}
	
	public void addNodo(Comparable<Object> o) {
		Nodo nuevo = new Nodo(o);
		this.cabeza.next();
	}
	
	public void setFin(Nodo nodo) {
		this.fin = nodo;
	}
	
	public void setCriterioOrden(Comparator<Nodo> criterioOrden) {
		this.criterioOrden = criterioOrden;
	}

	public void setCabeza(Nodo nodo){
		
			this.cabeza = nodo;
		
	}

	public boolean estaVacia(){
		return this.cabeza == null;
	}

	@Override
	public Iterator<Nodo> iterator() {
		this.cabeza.setIterador(this.cabeza);
		return this.cabeza;
	}

}