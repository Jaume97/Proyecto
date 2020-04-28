
package hundirflota;

import java.util.Random;
import java.util.Scanner;


public class HundirLaFlota {

	final static char AGUA_NO_TOCADO = '.';
	final static char AGUA = 'A';
	final static char TOCADO = 'X';

	final static int TAMANIO = 10;
	
	private static Scanner sc;

	
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		char[][] mapaUsuario = new char[TAMANIO][TAMANIO];
		char[][] mapaOrdenador = new char[TAMANIO][TAMANIO];
		
		char[][] mapaOrdenadorParaUsuario = new char[TAMANIO][TAMANIO];
			
		int puntosUsuario = 24;
		int puntosOrdenador = 24;
		
		boolean juegoTerminado = false;

		boolean tiroCorrecto = false;

		int[] tiro = new int[2];

		inicializacion(mapaUsuario, mapaOrdenador);
		inicializaMapaRegistro(mapaOrdenadorParaUsuario);

		while (!juegoTerminado) {

			System.out.println("MAPA DEL USUARIO");
			imprimirMapa(mapaUsuario);
			
			System.out.printf("PUNTOS RESTANTES DEL JUGADOR: %d\n", puntosUsuario);
			System.out.println("TURNO DEL JUGADOR");
			
			tiroCorrecto = false;
			while (!tiroCorrecto) {
				tiro = pedirCasilla();
				if (tiro[0] != -1 && tiro[1] != -1) {
					tiroCorrecto = evaluarTiro(mapaOrdenador, tiro);
					if (!tiroCorrecto)
						System.out.println("TIRO INCORRECTO");	
				} else {
					System.out.println("TIRO INCORRECTO");
				}
				
			}
			
			int puntosOrdenadorAnterior = puntosOrdenador;
			puntosOrdenador = actualizarMapa(mapaOrdenador, tiro, puntosOrdenador);
			
			char tipoTiro = (puntosOrdenadorAnterior - puntosOrdenador) > 0 ? TOCADO : AGUA; 
			actualizarMapaRegistro(mapaOrdenadorParaUsuario,tiro, tipoTiro);
			System.out.println("\nREGISTRO DEL MAPA DEL ORDENADOR");
			imprimirMapa(mapaOrdenadorParaUsuario);
			
			juegoTerminado = (puntosOrdenador == 0);
			
			
			if (!juegoTerminado) {
				
				System.out.printf("PUNTOS RESTANTES DEL ORDENADOR: %d\n\n", puntosOrdenador);
				System.out.println("TURNO DEL ORDENADOR");
				tiroCorrecto = false;
				while (!tiroCorrecto) {
					tiro = generaDisparoAleatorio();
					tiroCorrecto = evaluarTiro(mapaUsuario, tiro);
				}
			}
			puntosUsuario = actualizarMapa(mapaUsuario, tiro, puntosUsuario);		
			juegoTerminado = (puntosUsuario == 0);

		} 
				
		if (puntosOrdenador == 0) {
			System.out.println("EL VENCEDOR HA SIDO EL JUGADOR");
		} else 
			System.out.println("EL VENCEDOR HA SIDO EL ORDENADOR");

		sc.close();
	}

	
	/*
	 * Método que sirve para que el ordenador pueda hacer un disparo
	 */
	private static int[] generaDisparoAleatorio() {		
		return new int[] {aleatorio(), aleatorio()};
	}


	/*
	 * Metodo que aglutina la inicialización de ambos mapas
	 */
	public static void inicializacion(char[][] m1, char[][] m2) {
		inicializaMapa(m1);
		inicializaMapa(m2);
	}
	
	/*
	 * Método que inicializa el mapa que mostramos al usuario
	 * con las tiradas que ha hecho sobr el mapa del ordenador.
	 */
	private static void inicializaMapaRegistro(char[][] mapa) {
		for (int i = 0; i < TAMANIO; i++)
			for (int j = 0; j < TAMANIO; j++)
				mapa[i][j] = AGUA_NO_TOCADO;
		
	}

	/*
	 * Método que inicializa un mapa de juego, colocando
	 * los barcos sobre el mismo.
	 */
	private static void inicializaMapa(char[][] mapa) {

		for (int i = 0; i < TAMANIO; i++)
			for (int j = 0; j < TAMANIO; j++)
				mapa[i][j] = AGUA_NO_TOCADO;

		
		int[] barcos = { 5, 5, 3, 3, 3, 1, 1, 1, 1, 1 };

		char[] direccion = { 'V', 'H' };

		for (int b : barcos) {

			boolean colocado = false;
			while (!colocado) {
				int fila = aleatorio();
				int columna = aleatorio();
				char direcc = direccion[aleatorio() % 2];
				if (direcc == 'V') {
					if (fila + b <= (TAMANIO - 1)) {
						boolean otro = false;
						for (int i = fila; (i <= fila + b) && !otro; i++) {
							if (mapa[i][columna] != AGUA_NO_TOCADO)
								otro = true;
						}
						if (!otro) {
							for (int i = fila; i < fila + b; i++) {
								mapa[i][columna] = Integer.toString(b).charAt(0);
							}
							colocado = true;
						}
					}
				} else { 
					
					if (columna + b <= (TAMANIO - 1)) {
						boolean otro = false;
						for (int j = columna; (j <= columna + b) && !otro; j++) {
							if (mapa[fila][j] != AGUA_NO_TOCADO)
								otro = true;
						}
						if (!otro) {
							for (int j = columna; j < columna + b; j++) {
								mapa[fila][j] = Integer.toString(b).charAt(0);
							}
							colocado = true;
						}
					}
				}

			}
		}

	}

	/*
	 * Método que nos devuelve un número aleatorio
	 */
	private static int aleatorio() {
		Random r = new Random(System.currentTimeMillis());
		return r.nextInt(TAMANIO);
	}

	/*
	 * Método que imprime un mapa, con una fila y columna de encabezados
	 */
	public static void imprimirMapa(char[][] mapa) {

		char[] letras = new char[TAMANIO];
		for (int i = 0; i < TAMANIO; i++) {
			letras[i] = (char) ('A' + i);
		}
		System.out.print("    ");
		for (int i = 0; i < TAMANIO; i++) {
			System.out.print("[" + i + "] ");
		}

		System.out.println("");
		for (int i = 0; i < TAMANIO; i++) {
			System.out.print("[" + letras[i] + "]  ");
			for (int j = 0; j < TAMANIO; j++) {
				System.out.print(mapa[i][j] + "   ");
			}
			System.out.println("");
		}
	}

	/*
	 * Método mediante el cual el usuario introduce una casilla
	 */
	private static int[] pedirCasilla() {
		
		System.out.println("Introduzca la casilla (por ejemplo B4): ");
		String linea = sc.nextLine();
		linea = linea.toUpperCase();
		int[] t;

		
		if (linea.matches("^[A-Z][0-9]*$")) {

			
			char letra = linea.charAt(0);
			int fila = Character.getNumericValue(letra) - Character.getNumericValue('A');
			int columna = Integer.parseInt(linea.substring(1, linea.length()));
			if (fila >= 0 && fila < TAMANIO && columna >= 0 && columna <= TAMANIO) {
				t = new int[]{ fila, columna };
			} else
				t =  new int[] { -1, -1 };
		} else 
			t =  new int[] { -1, -1 };
		
		
		return t;

	}

	/*
	 * Método que nos permite evaluar si un tiro es CORRECTO (AGUA o TOCADO)
	 * o se trata de una casilla por la que ya hemos pasado antes.
	 */
	public static boolean evaluarTiro(char[][] mapa, int[] t) {
		int fila = t[0];
		int columna = t[1];
		return mapa[fila][columna] == AGUA_NO_TOCADO || (mapa[fila][columna] >= '1' && mapa[fila][columna] <= '5'); 
		
	}
	
	/*
	 * Método que actualiza el mapa, con un determinado tiro. 
	 * Devolvemos el número de puntos restantes.
	 */
	private static int actualizarMapa(char[][] mapa, int[] t, int puntos) {
		int fila = t[0];
		int columna = t[1];
		
		if (mapa[fila][columna] == AGUA_NO_TOCADO) {
			mapa[fila][columna] = AGUA;
			System.out.println("AGUA");
		} else {			
			mapa[fila][columna] = TOCADO;
			System.out.println("HAS ALCANZADO A ALGÚN BARCO");
			--puntos;
		}
		
		return puntos;
		
		
	}
	/*
	 * Método que actualiza el mapa de registro
	 */
	private static void actualizarMapaRegistro(char[][] mapa, int[] t, char valor) {
		int fila = t[0];
		int columna = t[1];

		mapa[fila][columna] = valor;
	}

}