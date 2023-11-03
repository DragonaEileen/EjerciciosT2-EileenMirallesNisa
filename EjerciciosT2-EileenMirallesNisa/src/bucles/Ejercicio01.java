package bucles;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio01 {
	
	/** Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado:
		a) Hora
		b) Minutos
		c) Segundos
		d) Cantidad de segundos a incrementar
	 * La aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce 
	 * hora=13, minutos=59 y segundos=51, y se desea incrementar en 10 segundos, el 
	 * resultado a mostrar es 14:00:01.
	 **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 23, 59, 59, 1	| Salida Esperada: 0, 0, 0	| Salida Obtenida: 0, 0, 0
	 * Entrada: 0, 0, 30, 5 	| Salida Esperada: 0, 0, 35	| Salida Obtenida: 0, 0, 0
	 * 		Error: Faltaba comprobar que los numeros llegaban a su limite para 
	 * 			cambiarlos a 0
	 * Entrada: 0, 0, 30, 5 	| Salida Esperada: 0, 0, 35	| Salida Obtenida: 0, 0, 35
	 * Entrada: 0, 0, 0, 3600 	| Salida Esperada: 1, 0, 0	| Salida Obtenida: 1, 0, 0
	 * Entrada: 0, 0, 0, 86401	| Salida Esperada: 0, 0, 1	| Salida Obtenida: 0, 0, 1
	 * Fin Pruebas
	 */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos las cuatro variables que se nos piden en el enunciado */
		byte horas = -1;
		byte minutos = -1;
		byte segundos = -1;
		int added;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Introduce la hora,y los segundos a añadir.");
		
		/* Usamos Bucles Do-While para que se introduzcan valores válidos */
		//Horas
		do {
			
			System.out.print("Horas: ");
			horas = sc.nextByte();
			
		}while(horas < 0 || horas >= 24);
		
		//Minutos
		do {
			
			System.out.print("Minutos: ");
			minutos = sc.nextByte();
			
		}while(minutos < 0 || minutos >= 60);
			
		//Segundos
		do {
			
			try {
				
				System.out.print("Segundos: ");
				segundos = sc.nextByte();
				
			} catch (InputMismatchException e) {
				
				System.err.println("El dato Introducido no tiene sentido");
				sc.next();
				
			}//Fin TRY-CATCH	
			
		}while(segundos < 0 || segundos >= 60);
			
		//Segundos a Añadir
		System.out.println("Segundos a añadir: ");
		added = sc.nextInt();
		
		/* Algoritmo */
		/* Mediante un bucle vamos a ir sumando los segundos, hasta que tengamos que 
		 * cambiar los minutos o las horas. */
		while (added > 0) {	//Adding Proccess
			
			while (horas < 24 && added > 0) {	//Horas
			
				while (minutos <= 59 && added > 0) {	//Minutos
				
					while(segundos <= 59 && added > 0) {	//Segundos
						
						segundos = (byte) (segundos + 1);
						
						added = added - 1;
						
					}//Fin WHILE --> Segundos
					
					if (segundos == 60) {
						
						segundos = 0;
						
						minutos = (byte) (minutos +1);
						
					}//Fin IF --> 60 segundos

				}//Fin WHILE --> Minutos
				
				if (minutos == 60) {
				
					minutos = 0;
					
					horas = (byte) (horas + 1);
					
				}//Fin IF --> 60 minutos
				
			}//Fin WHILE --> Horas
			
			if(horas == 24) {
				
				horas = 0;
				
			}//Fin IF --> 24 Horas
			
		}//Fin WHILE --> Adding Proccess
		
		/* Syso de Respuesta */
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
