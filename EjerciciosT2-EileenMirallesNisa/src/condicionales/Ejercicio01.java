package condicionales;

import java.util.Scanner;

public class Ejercicio01 {
	
	/** Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
	 * La aplicación tendrá que indicar si el número introducido es capicúa. Un número es capicúa 
	 * si se lee igual de izquierda a derecha que de derecha a izquierda. **/
	
	/* Pruebas mínimas a realizar: TODAS */
	/* Creamos una array con todos los números del 0 al 9999 y hacemos un bucle que vaya dandole a la 
	 * aplicación cada número */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos la variable en la que se guardará el número introducido por el usuario;
		 * y para las pruebas declaramos una array de tamaño 10000 */
		final int[] PRUEBAS = new int[10000];
		int input;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Relleno de la Array de Pruebas */
		/* Utilizamos un bucle for para añadir todos los numeros del 0 al 9999 en los indexes apropiados*/
		for (int i = 0; i < PRUEBAS.length; i++) {
			
			PRUEBAS[i] = i;
			
		}//Fin For
		
		/* Syso de Información y Recogida de Datos */
		/* Pedimos al Usuario si quiere realizar pruebas (introducirá -1), o quiere utilizar la aplicación
		 * (introducirá 1). En caso de que quiera Pruebas le conduciremos a un bucle que "introducirá" en
		 * la aplicación todos los datos del array. */
		
		
		
	}

}
