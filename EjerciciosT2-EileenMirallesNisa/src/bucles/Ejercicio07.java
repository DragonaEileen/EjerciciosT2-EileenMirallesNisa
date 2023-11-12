package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {
	
	/** Escribe un programa que lea un número n e imprima una pirámide de números con n filas **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 1		| Salida Esperada: 1				| Salida Obtenida: 1
	 * Entrada: 5		| Salida Esperada: Hasta 5 5 5 5 5	| Salida Obtenida: Hasta 5 5 5 5 5
	 * Entrada: -3 o 25	| Salida Esperada: Reintroduce		| Salida Obtenida: Reintroduce
	 * Fin Pruebas
	 */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Dcelaramos el inputN que guardará el número introducido;
		 * luego un counter auxiliar usado más adelante */
		byte inputN = 0;
		byte auxCount = 1;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Vamos a hacer tal como lo siguiente:\r\n"
				+ "1\r\n"
				+ "121\r\n"
				+ "12321\r\n"
				+ "1234321\r\n");
		
		//inputN
		do {
			
			try {
				
				System.out.print("Introduce el numero de filas: ");
				inputN = sc.nextByte();
				
			} catch (InputMismatchException e) {
				
				System.err.println("Dato Introducido erróneo");
				sc.next();
				
			}// Fin TRY-CATCH
			
		}while(inputN < 1 || inputN > 127);
		
		/* Algoritmo */
		/* Mediante un bucle FOR para las filas tenemos otro interno para las columnas */
		/* for  i = 2 --> 1 2 1 AND for 3 --> 1 2 3 2 1 AND for 4 --> 1 2 3 4 3 2 1º */
		for(int i = 1; i <= inputN; i++) {
			
			for (int j = 1; j <= 1 + ((i-1)*2); j++) {
				
				if(j <= i) {
					System.out.print(j);
				}else {
					System.out.print(j - (auxCount*2));
					auxCount = (byte) (auxCount + 1);
				}
				
			}//Fin FOR interno
			
			//Salto de línea
			System.out.println("");
			
			//Reset auxCounter
			auxCount = 1;
			
		}//Fin FOR Externo
		
		/* Cierre de Scanner */
		sc.close();
		
	}//Fin MAIN

}
