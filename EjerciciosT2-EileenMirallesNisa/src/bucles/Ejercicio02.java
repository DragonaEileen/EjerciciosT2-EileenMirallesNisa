package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	
	/** Realiza un programa que nos pida un número n y nos diga cuántos números hay 
	 * entre 1 y n que sean primos. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 23, 59, 59, 1	| Salida Esperada: 0, 0, 0	| Salida Obtenida: 0, 0, 0
	 * Fin Pruebas
	 */

	public static void main(String[] args) {

		/* Declaración de variables */
		/* Declaramos la variable n, el número que se pide al usuario; 
		 * luego una variable booleana que indique si un numero es primo */
		int inputN = 0;
		boolean prime = true;
		
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
		/* Mediante un bucle FOR vamos a ir comprobando que el número sea primo */
		for(int i = 1; i <= inputN; i++) {
			
			//Comprobamos si es primo			
			for(int j = 2; j < i ; j++) {
				
				//Si no es primo
				if (i%j == 0){
					
					prime = false;
					break;
					
				}else {
					
					prime = true;
					
				}//Fin IF --> Primos
				
			}//Fin FOR --> Primos
			
			// Syso si es primo
			if (prime == true) {
				
				System.out.println(i);
				prime = false; //Reset prime
				
			}//Fin IF --> Syso Prime
			
		}//Fin FOR --> 'Til inputN
		
		/* Cierre de Scanner */
		sc.close();
		
	}//Fin Main

}
