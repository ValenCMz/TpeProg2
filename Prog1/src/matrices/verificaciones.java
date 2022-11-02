package matrices;

public class verificaciones {
	static final int MAX= 10;
	public static void main(String[] args) {
		int[]arr = {1,2,2,9,5,4,7,5,15,1};
		
		System.out.println(verificar_asc(arr));
		System.out.println(mayor_valor(arr));
	}

	
	public static boolean verificar_asc(int[]arr) {
		int inicio = 0;
		while(inicio<MAX) {
			if(arr[inicio]==3) {
				return true;
			}
			else {
				inicio++;
			}
		}
		return false;
	}
	//int[]arr = {1,2,2,6,5,4,7,5,2,1};
	public static int mayor_valor(int[]arr) {
		int pos = 0;
		int inicio = 0;
		int aux = 0;
		while(inicio<MAX) {
			if(arr[inicio]>aux) {
				aux = arr[inicio];
			}
			else {
				inicio++;
			}
		}
		
		
		return aux;
	}
}
