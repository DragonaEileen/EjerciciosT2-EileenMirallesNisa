package bucles;

import java.util.Scanner;

public class Ejercicio08 {
	
	/** Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. 
	 * La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
		El total de números introducidos, excluido el 0.
		El total de números fallados.
	 **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 0 F, 3 Correctos	| Salida Esperada: 0 F, 3 Total		| Salida Obtenida: 0 F, 3 Total
	 * Entrada: 2 F, 3 Correctos	| Salida Esperada: 2 F, 5 Total		| Salida Obtenida: 2 F, 5 Total	
	 * Entrada: hola				| Salida Esperada: Error			| Salida Obtenida: Error
	 * Fin Pruebas
	 */

	public static void main(String[] args) {

		/* Declaración de variables */
		/* Declaramos una variable que irá guardando el input y otra con el input anterior;
		 * luego dos variables contadores */
		int input = 1;
		int priorInput = -2147483648;
		int lesserCount = 0;
		int totalCount = 0;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Introduce numeros cada vez mayores y para parar introduce 0.");
		
		do {
			
			try {
				
				//input
				System.out.println("Introduce un número");
				input = sc.nextInt();
				
			} catch (Exception e) {

				System.err.println("Dato introducido erróneo");
				sc.next();
				
			}//Fin Try-Catch
			
			/* Algoritmo */
			/* Si es correcto, se suma al contador total y se pone el Input en el priorInput
			 * si no es correcto se suma uno al contador de fallos lesserCount, y al de total y se printea FALLO */
			if (input > priorInput) {
				
				totalCount = totalCount + 1;
				priorInput = input;
				
			}else if (input == 0){
				
				//Nada Aqui
				
			}else {
				
				System.err.println("Has fallado");
				lesserCount = lesserCount + 1;
				totalCount = totalCount + 1;
				
			}//Fin IF
			
		}while(input != 0);
					
		/* Syso de respuesta */
		System.out.println("Total Introducido: " + totalCount);
		System.out.println("Total Fallos: " + lesserCount);

		/* Cierre de Scanner */
		sc.close();
		
	}//Fin MAIN

}
