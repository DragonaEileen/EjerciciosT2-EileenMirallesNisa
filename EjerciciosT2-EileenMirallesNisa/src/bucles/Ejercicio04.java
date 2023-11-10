package bucles;

import java.util.Scanner;

public class Ejercicio04 {
	
	/** Para dos números dados, a y b, es posible calcular el máximo 
	 * común divisor (el número más grande que divide a ambos) 
	 * mediante un algoritmo ineficiente pero sencillo: desde el 
	 * menor de a y b, ir buscando, de forma decreciente (-1), el 
	 * primer número que divide a ambos simultáneamente. Teniendo en 
	 * cuenta lo que se acaba de explicar, realiza un programa que 
	 * calcule el máximo común divisor de dos números. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 800, 80	| Salida Esperada: 80	| Salida Obtenida: 80
	 * Entrada: 48, 60	| Salida Esperada: 12	| Salida Obtenida: 12
	 * Entrada: -3	| Salida Esperada: Reintroduce	| Salida Obtenida: Reintroduce
	 * Fin Pruebas
	 */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos los dos números a introducir y una variable
		 * donde pondremos el menor */
		long inputA;
		long inputB;
		long lesser;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in); 
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Dados dos números A y B, vamos a calcular su máximo"
				+ "común divisor mediante el algoritmo del enunciado.");
		
		//Número A
		System.out.print("Introduce el número A: ");
		inputA = sc.nextLong();
		
		//Número B
		System.out.print("Introduce el número B: ");
		inputB = sc.nextLong();
		
		/* Algoritmo */
		/* Desde el menor de a y b, ir buscando, de forma decreciente
		 * (-1), el primer número que divide a ambos simultáneamente, 
		 * es decir, mediante un bucle, ir decreciendo desde el menor
		 * y comprobando SI es diviible entre ambos números */
		/* Primero comprobamos cual es el menor
		 * Con un ternario, si es menor A que B, lesser será la A, y si
		 * NO es menor, O son iguales, será B. Da igual que sean iguales
		 * porque como empezaría a comprobar el B, dividiría los dos 
		 * números */
		/* Mediante el bucle FOR descendemos desde lesser */
		for(lesser = inputA < inputB ? inputA : inputB; lesser > 0; lesser-- ) {
			
			if (inputA % lesser == 0 && inputB % lesser == 0) {
				
				System.out.println("El maximo comun divisor es " + lesser);
				break;
				
			}//Fin IF
			
		}//Fin FOR
		
	}

}
