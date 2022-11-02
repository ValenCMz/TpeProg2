package matrices;
import java.util.Random;
public class parcial1{
	static final int MAXF = 5;
	static final int MAXC = 20;
	static final int MAXVALOR = 9;
	static final int MINVALOR =1;
	static final double PROBABILIDAD = 0.4;
	public static void main(String[]args){
		int [][] mat = new int [MAXF][MAXC];
		agregar_promedio_al_medio_mat(mat);
	}

	public static void agregar_promedio_al_medio_mat(int[][]mat){
		
		for(int fila = 0; fila<MAXF;fila++){
			agregar_promedio_al_medio_arr(mat[fila]);
			}		
	}

	public static void agregar_promedio_al_medio_arr(int[]arr){
	int inicio = 0;
	int fin = -1;
	int cant = 0;
	int promedio =0;
	int tamanio = 0;
	while(inicio<MAXC){
				inicio = obtener_inicio(arr, fin + 1);
				fin = obtener_fin(arr, inicio);
				cant = buscar_cant_pares_en_secuencias(arr, inicio, fin);
				if((cant%2==0)||(buscar_numero_seis(arr, inicio, fin))){
					promedio = obtener_promedio(arr, inicio, fin);
					tamanio = fin-inicio +1;
					corrimiento_der(arr, tamanio/2);
					arr[tamanio/2] = promedio;
					inicio = obtener_inicio(arr, fin + 1);
				}
			}
		}
	
	public static int obtener_inicio(int [ ] arr, int pos) {
        while ((pos < MAXC) && (arr[pos] == 0)) {
            pos++;
        }
        return pos;
    }

    public static int obtener_fin(int [ ] arr, int pos) {
        while ((pos < MAXC) && (arr[pos] != 0)) {
            pos++;
        }
        return pos - 1;
    }

	public static void corrimiento_der(int[]arr, int pos){
		int i = MAXC-1;
		while(i>pos) {
			arr[i] = arr[i-1];
			i--;
		}
	}

	public static int obtener_promedio(int[]arr, int inicio, int fin){
		int suma=0;
		int tamanio = fin - inicio + 1;
		int promedio = 0;
		for(int i = inicio;i<MAXC;i++){
			suma += arr[i];
		}
		promedio = suma/tamanio;
		return promedio;
	}

	public static boolean buscar_numero_seis(int[]arr, int inicio, int fin){
		boolean existe = false;
			for(int i = inicio;i<=fin;i++) {
				if(arr[i]==6) {
					existe = true;
				}
			}
		return existe;
	}

	public static int buscar_cant_pares_en_secuencias(int[]arr, int inicio, int fin){
		int cont=0;
		for(int i=inicio;i<=fin;i++){
			if(arr[i]%2==0){
				cont++;
			}
		}
		return cont;
	}
	
	
	   public static void cargar_matriz_secuencias_int(int [][] mat) {
	        for (int fila = 0; fila < MAXF; fila++) {
	            cargar_arreglo_secuencias_int(mat[fila]);
	        }
	        System.out.println(" ");
	    }

	    public static void cargar_arreglo_secuencias_int(int [ ] arr) {
	        Random r = new Random();
	        arr[0] = 0;
	        arr[MAXC - 1] = 0;
	        for (int pos = 1; pos < MAXC - 1; pos++) {
	            if (r.nextDouble() > PROBABILIDAD) {
	                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
	            } else {
	                arr[pos] = 0;
	            }
	        }
	    }

	    public static void imprimir_matriz_int(int [][] mat) {
	        for (int fila = 0; fila < MAXF; fila++) {
	            imprimir_arreglo_int(mat[fila]);
	        }
	    }

	    public static void imprimir_arreglo_int(int [] arr) {
	        for (int pos = 0; pos < MAXC; pos++) {
	            System.out.print("[" + arr[pos] + "]");
	        }
	        System.out.println("");
	    }
	}