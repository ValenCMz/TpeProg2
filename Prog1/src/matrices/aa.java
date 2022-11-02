package matrices;

public class aa {

	public static void main(String[] args) {
		boolean suma;
		suma = obtener_suma();
		System.out.println(suma);
		if(obtener_suma()) {
			System.out.println("JAJA");
		}
		else {
			System.out.println("jojo");
		}
	}

	public static boolean obtener_suma() {
		boolean mayor = false;
		int numero1 = 5;
		int numero2 = 10;
		if(numero2>numero1) {
			mayor = true;
		}
		return mayor;
	}
}
