package bucles;

import java.util.InputMismatchException;
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
	 * Entrada: 7	| Salida Esperada: Pyramid of 7	| Salida Obtenida: Pyramid of 7	
	 * Entrada: hola| Salida Esperada: Exception	| Salida Obtenida: Exception
	 * Entrada: -3	| Salida Esperada: Reintroduce	| Salida Obtenida: Reintroduce
	 * Fin Pruebas
	 */
	
	public static void main(String[] args) {

		/* Declaracion de Variables */
		/* Declaramos la variable n que se va a introducir */
		byte inputN = 0;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Vamos a piramidarizar esto un poco.");
		
		//Altura N
		do {
			
			try {
				
				System.out.print("Introduce la altura de la piramide: ");
				inputN = sc.nextByte();
		
			}catch(InputMismatchException e) {
				
				System.err.println("Dato introducido fuera de los límites.");
				sc.next();
				
			}//Fin Try-Catch
		
		}while(inputN < 1 || inputN > 127 );
		
		/* Algoritmo */
		/* Mediante bucles FOR, uno interno para las columnas 
		 * y otro externo para las filas */
		
		/* Bucle FOR de las lineas, el numero de lineas es igual al inputN
		 * así que contamos hasta N*/
		for(byte i = 0; i < inputN; i++) {
			
			/* La altura n va a ser igual al numero de * de la base 
			 * Luego los superiores tendrían que hacer espacios primero
			 * igual a N menos el index de la linea (desde 0)*/
			
			/* Printeamos los espacios necesarios, N menos el index 
			 * de linea espacios*/
			for (int k = 0; k <= inputN-i; k++) {
				
				System.out.print(" ");
				
			}//Fin FOR --> Espacios
			
			/* Printeamos los asterisco-espacios, igual al index de linea */
			for(byte j = 0; j <= i; j++) {
				
				System.out.print("* ");
				
			}//Fin FOR --> Pyramid Line Length
			
			/* Salto de Linea */
			System.out.println("");
			
		}//Fin FOR --> Pyramid Height N
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
