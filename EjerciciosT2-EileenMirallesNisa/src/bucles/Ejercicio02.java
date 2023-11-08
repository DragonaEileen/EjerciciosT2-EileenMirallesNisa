package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	
	/** Realiza un programa que nos pida un número n y nos diga cuántos números hay 
	 * entre 1 y n que sean primos. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 7	| Salida Esperada: 2, 3, 5, 7	| Salida Obtenida: 2, 3, 5, 7	
	 * Entrada: hola| Salida Esperada: Exception	| Salida Obtenida: Exception
	 * Entrada: -3	| Salida Esperada: Reintroduce	| Salida Obtenida: Reintroduce
	 * Fin Pruebas
	 */

	public static void main(String[] args) {

		/* Declaración de variables */
		/* Declaramos la variable n, el número que se pide al usuario; 
		 * luego una variable booleana que indique si un numero es primo
		 * Como prueba, vamos a probar a hacer un contador de divisibles.
		 * Si es solo divisible entre 2 numeros, 1 y si mismo, entonces es primo */
		int inputN = 0;
		int counter = 0;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		/* Explicamos que vamos a hacer y recogemos el dato n */
		System.out.println("Vamos a contar todos los primos entre 1 y un número introducido.");
		
		/*Para recoger inputN, realizamos un do-while para que se obligue a introducir 
		 * un número mayor a 1, y un try-catch para manejar excepciones de InputMismatch*/
		do {
			
			try {
				
			System.out.print("Introduce el número: ");
			inputN = sc.nextInt();
			
			} catch (InputMismatchException e) {
				
				System.err.println("El dato introducido es incorrecto");
				sc.next();
				
			}//Fin Try-Catch
			
		}while(inputN <= 1);
		
		/* Algoritmo */
		/* Mediante Bucles */
		for (int i = 1; i <= inputN; i ++) {
			
			for (int j = 1; j <= i; j++) {
				
				if (i%j == 0) {
					
					counter = counter + 1;
					
				}//Fin IF --> Prime
				
			}//Fin FOR Interno
			
			if (counter == 2) {
				
				System.out.println(i);
				
			}//Fin IF Counter check
			
			counter = 0; 	//Reset counter
			
		}//Fin FOR Externo
		
		/* Cierre de Scanner */
		sc.close();
		
	}//Fin main

}
