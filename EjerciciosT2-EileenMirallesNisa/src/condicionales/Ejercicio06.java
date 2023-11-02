package condicionales;

import java.util.Scanner;

public class Ejercicio06 {
	
	/** Realiza el “juego de la suma”, que consiste en que aparezcan dos números 
	 * aleatorios (comprendidos entre 1 y 99) y el usuario tiene que sumarlos. 
	 * La aplicación le pedirá al usuario que introduzca el resultado de la suma. 
	 * La aplicación le indicará si el resultado es correcto o no. **/
	
	/*Pruebas*/
	/* Comienzo Pruebas -->
	 * Entrada: incorrecta 	| Salida Esperada: incorrecta 	| Salida Obtenida: incorrecta
	 * Entrada: correcta 	| Salida Esperada: correcta		| Salida Obtenida: correcta 
	 * Fin Pruebas
	 */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Vamos a declarar las variables donde guardemos los números aleatorios,
		 * y otro donde se guarde el input del usuario. */
		int randomNum1 = (int) (Math.random()*100);
		int randomNum2 = (int) (Math.random()*100);
		int input;
		
		/* Apertura de Scanner */
		Scanner sc  = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		/* Informamos de que va esta aplicación y pedimos al usuario la suma edespués de enseñarle
		 * los números */
		System.out.print("Realiza la siguiente suma:\r\n"
				+ randomNum1 + " + " + randomNum2 + " = ");
		input = sc.nextInt();
				
		/* Algoritmo */
		/* Con un IF comparamos valores */
		if (input == randomNum1 + randomNum2) {
			
			System.out.println("Tu suma es correcta, ¡enhorabuena! ^_^");
			
		}else{
			
			System.out.println("Tu suma es incorrecta, lo siento >_<");
			
		}//Fin IF Suma
		
		/* Cierre de Scanner */
		sc.close();
		
	}//FIN MAIN

}
