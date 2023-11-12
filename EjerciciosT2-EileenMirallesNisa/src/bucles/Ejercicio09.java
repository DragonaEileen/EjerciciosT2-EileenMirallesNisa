package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {
	
	/** Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. 
	 * El número introducido debe ser mayor que 0. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 0	| Salida Esperada: 1	| Salida Obtenida: 1
	 * Entrada: 10	| Salida Esperada: 2	| Salida Obtenida: 2	
	 * Entrada: 1256| Salida Esperada: 4	| Salida Obtenida: 4
	 * Entrada: hola| Salida Esperada: Error| Salida Obtenida: Error
	 * Fin Pruebas
	 */

	public static void main(String[] args) {
		
		/* Declaración de Variables */
		/* Declaramos un contador de dígitos y una variable donde guardamos el número */
		byte count = 0;
		long input = 0;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Informacion y Recogida de Datos */
		System.out.println("Dado el enunciado del problema, la entrada es de un número y la salida de "
				+ "el número de digitos de dicho número");
		
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
		/* Mediante un bucle do-while vamos a 9ir dividendo el número entre 10 hasta que sea menor que 1 */
		do {
			
			input = input / 10;
			count = (byte) (count + 1);
			
		}while(input >= 1);
		
		/* Syso de Respuesta */
		System.out.println("El total de digitos de tu número es de " + count);
		
		/* Cierre de Scanner */
		sc.close();
		
	}//Fin MAIN

}
