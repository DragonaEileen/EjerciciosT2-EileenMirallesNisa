package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
	
	/** Realiza un programa que nos diga si un número introducido por teclado es capicúa o no. 
	 * El número debe ser mayor o igual que 0. **/

	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 0	| Salida Esperada: Capi	| Salida Obtenida: Capi
	 * Entrada: 121	| Salida Esperada: Capi	| Salida Obtenida: No Capi	
	 * 		Error: Tontería
	 * Entrada: 121	| Salida Esperada: Capi	| Salida Obtenida: Capi
	 * Entrada: hola| Salida Esperada: Error| Salida Obtenida: Error
	 * Fin Pruebas
	 */
	
	public static void main(String[] args) {


		/* Declaración de Variables */
		/* Declaramos una variable donde guardamos el número, otra para modificarlo; una variable que guardará el número al reves; y una auxiliar */
		long input = 0;
		long inputMod = 0;
		long reverse = 0;
		long aux = 0;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Informacion y Recogida de Datos */
		System.out.println("Dado el enunciado del problema, la entrada es de un número y la salida "
				+ "es si el número es capicúa");
		
		//input
		do {
			
			try {
			
				System.out.print("Introduce dicho número: ");
				input = sc.nextLong();
				
			} catch (InputMismatchException e) {

				System.err.println("Dato erróneo");
				sc.next();
			
			}//Fin Try-Catch
			
		}while(input < 0);

		/* Algoritmo */
		/* Mediante un bucle do-while vamos a modular el número, ir reduciendolo una cifra, 
		 * y guardandolo cifra a cifra en un reverso*/
		inputMod = input;
		
		do {
			
			aux = inputMod % 10;
			inputMod = inputMod / 10;
			reverse = reverse*10 + aux;
			
		}while(inputMod >= 1);

		
		/* Syso de Respuesta */
		if (reverse == input) {
			
			System.out.println("Es capicúa");
		
		}else{
			
			System.out.println("No es capicua");
			
		}//Fin IF Capicua
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
