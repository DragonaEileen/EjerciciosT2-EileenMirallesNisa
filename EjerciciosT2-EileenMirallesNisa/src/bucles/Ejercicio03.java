package bucles;

import java.util.Scanner;

public class Ejercicio03 {
	
	/** Solicita al usuario un número n y dibuja un triángulo 
	 * de base y altura n. Por ejemplo para n=4 debe dibujar lo siguiente:
	   *
   	  * *
  	 * * *
 	* * * *
 	 **/

	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 7	| Salida Esperada: 2, 3, 5, 7	| Salida Obtenida: 2, 3, 5, 7	
	 * Entrada: hola| Salida Esperada: Exception	| Salida Obtenida: Exception
	 * Entrada: -3	| Salida Esperada: Reintroduce	| Salida Obtenida: Reintroduce
	 * Fin Pruebas
	 */
	
	public static void main(String[] args) {

		/* Declaracion de Variables */
		/* Declaramos la variable n que se va a introducir */
		int inputN;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Vamos a piramidarizar esto un poco.");
		
		//Altura N
		System.out.print("Introduce la altura de la piramide: ");
		inputN = sc.nextInt();
		
		/* Algoritmo */
		/* Mediante bucles FOR, uno interno para las columnas y otro externo para las filas */
		
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
