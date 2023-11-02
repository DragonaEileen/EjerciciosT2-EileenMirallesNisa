package condicionales;

import java.util.Scanner;

public class Ejercicio05 {
	
	/** Utiliza un operador ternario para calcular el valor absoluto de un número 
	 * que se solicita al usuario por teclado. **/

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos el input del usuario y otra variable donde guardamos el valor absoluto */
		double input;
		double absolute;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Vamos a calcular el valor absoluto de un número. Introduce dicho número: ");
		input = sc.nextDouble();
		
		/* Algoritmo */
		/* Utilizamos un operador ternario, para que en caso de que sea negativo el numero
		 * lo multiplicamos por -1 para quue sea positivo */
		absolute = input < 5 ? -1 * input : input;
		
		/* Syso de Respuesta */
		System.out.println("El valor absoluto es: " + absolute);
		
		/* Cierre de Scanner */
		sc.close();
		
	}//FIN MAIN

}
