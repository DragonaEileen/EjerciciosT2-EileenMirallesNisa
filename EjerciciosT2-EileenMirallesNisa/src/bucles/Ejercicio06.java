package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {
	
	/** Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por 
	 * pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada número 
	 * tantas veces como su valor. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 1		| Salida Esperada: 1				| Salida Obtenida: 1
	 * Entrada: 5		| Salida Esperada: Hasta 5 5 5 5 5	| Salida Obtenida: Hasta 5 5 5 5 5
	 * Entrada: -3 o 25	| Salida Esperada: Reintroduce		| Salida Obtenida: Reintroduce
	 * Fin Pruebas
	 */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos el número que se va a introducir N */
		byte inputN = 0;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Introduce un número entre 0 y 20, luego lo mostraremos por pantalla d euna manera determinada.");
		
		//inputN
		do {
			
			try {
				
				System.out.print("Introduce N: ");
				inputN = sc.nextByte();
		
			}catch(InputMismatchException e) {
				
				System.err.println("Dato introducido erróneo");
				
			}//Fin TRY-CATCH
		
		}while(inputN < 1 || inputN > 20);
		
		/* Algoritmo */
		/* Mediante dos bucles FOR vamos a imprimir los de 1 a N, i veces */
		for(byte i = 1; i <= inputN; i++ ) {
			
			for(byte j = 1; j <= i; j++) {
				
				System.out.print(i);
				
			}//Fin FOR interno
			
			//Salto de linea
			System.out.println("");
			
		}//Fin FOR externo
		
		/* Cierre de Scanner */
		sc.close();
		
	}//Fin MAIN

}
