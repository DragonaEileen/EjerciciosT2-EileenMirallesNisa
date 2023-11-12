package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {
	
	/** De forma similar a la actividad 4, realiza un programa que calcule el mínimo común múltiplo de dos 
	 * números dados. En este caso, habrá que partir del máximo de los dos e ir incrementando hasta 
	 * encontrar el primer número que sea múltiplo de los dos números. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 10, 12	| Salida Esperada: 60			| Salida Obtenida: 12
	 * 		Error: operador && en vez de ||
	 * Entrada: 10, 12	| Salida Esperada: 60			| Salida Obtenida: 60
	 * Entrada: -3, -9	| Salida Esperada: Reintroduce	| Salida Obtenida: Reintroduce
	 * Fin Pruebas
	 */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos los dos numeros introducidos 
		 * Luego una variable en la que guardaremos el número mayor*/
		long inputA = 0;
		long inputB = 0;
		long greater;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Vamos a calcular el minimo comun multiplo dados dos numeros. Introduce dichos numeros");
		
		//InputA
		do {
			
			try {
		
				System.out.print("Introduce número A: ");
				inputA = sc.nextLong();
		
			}catch(InputMismatchException e) {
				
				System.err.println("Dato introducido erróneo");
				sc.next();
				
			}//Fin TRY-CATCH
		
		}while(inputA < 1);
		
		//InputB
		do {
			
			try {
				
		System.out.print("Introduce número B: ");
		inputB = sc.nextLong();
		
			}catch(InputMismatchException e) {
		
		System.err.println("Dato introducido erróneo");
		sc.next();
		
			}//Fin TRY-CATCH

		}while(inputB < 1);

		
		/* Algoritmo */
		/* Vamos a hacer lo mismo que en el ejercicio anterior 
		 * Ternario para elegir el mayor;
		 * Bucle FOR para conseguir el minimo comun multiplo*/
		greater = inputA > inputB ? inputA : inputB;
		
		while(greater % inputA != 0 || greater % inputB != 0) {
			
			greater = greater + 1;
			
		}//Fin While
		
		/* Syso de Respuesta */
		System.out.println("El minimo común múltiplo es " + greater);
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
