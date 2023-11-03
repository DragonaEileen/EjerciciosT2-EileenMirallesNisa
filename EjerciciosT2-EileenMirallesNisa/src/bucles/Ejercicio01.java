package bucles;

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
	 * Entrada: 0 		| Salida Esperada: 0 		| Salida Obtenida: -0.0
	 * Entrada: -5 		| Salida Esperada: 5.0		| Salida Obtenida: 5.0 
	 * Entrada: 53.34 	| Salida Esperada: 53.34	| Salida Obtenida: 53.34 
	 * Fin Pruebas
	 */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos las cuatro variables que se nos piden en el enunciado */
		byte horas;
		byte minutos;
		byte segundos;
		int added;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Introduce la hora,y los segundos a añadir.");
		//Horas
		System.out.print("Horas: ");
		horas = sc.nextByte();
		//Minutos
		System.out.print("Minutos: ");
		minutos = sc.nextByte();
		//Segundos
		System.out.println("Segundos: ");
		segundos = sc.nextByte();
		//Segundos a Añadir
		System.out.println("Segundos a añadir: ");
		added = sc.nextInt();
		
		/* Algoritmo */
		
		
	}

}
