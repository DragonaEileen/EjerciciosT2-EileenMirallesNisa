package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rombo {

	public static void main(String[] args) {

		/* Declaracion de Variables */
		/* Declaramos la variable n que se va a introducir */
		byte inputN = 0;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Vamos a piramidarizar esto un poco.");
		
		//Altura N
		do {
			
			try {
				
				System.out.print("Introduce la altura de la piramide: ");
				inputN = sc.nextByte();
		
			}catch(InputMismatchException e) {
				
				System.err.println("Dato introducido fuera de los límites.");
				sc.next();
				
			}//Fin Try-Catch
		
		}while(inputN < 1 || inputN > 127 );
		
		inputN = (byte) (inputN / 2);
		
		/* Algoritmo */
		for(byte i = inputN; i >= -inputN; i--) {

			for (int k = 0; k < Math.abs(i); k++) {
				
				System.out.print(" ");
				
			}//Fin FOR --> Espacios
			
			/* Printeamos los asterisco-espacios, igual al index de linea */
			for(byte j = 0; j < inputN+1-Math.abs(i); j++) {
				
				System.out.print("* ");
				
			}//Fin FOR --> Pyramid Line Length
			
			/* Salto de Linea */
			System.out.println("");
			
		}//Fin FOR --> Pyramid Height N
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
