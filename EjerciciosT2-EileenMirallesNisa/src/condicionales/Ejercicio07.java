package condicionales;

import java.util.Scanner;

public class Ejercicio07 {

	/** Dada una hora por teclado, (horas, minutos y segundos) realiza un 
	 * algoritmo que muestre la hora después de incrementarle un segundo. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 0, 0, 0 	| Salida Esperada: 0º 0' 1'' 	| Salida Obtenida: 0º 0' 1''
	 * Entrada: -5, 0, 0 	| Salida Esperada: Error		| Salida Obtenida: -5º 0' 1''
	 * 		Error: IF de validez construido mal
	 * Entrada: -5, 0, 0 	| Salida Esperada: Error		| Salida Obtenida: Error, -5º 0' 0''
	 * 		Error: syso colocado mal
	 * Entrada: -5, 0, 0 	| Salida Esperada: Error		| Salida Obtenida: Error
	 * Entrada: 0, 60, 0 	| Salida Esperada: Error		| Salida Obtenida: Error
	 * Entrada: 0, 0, 60 	| Salida Esperada: Error		| Salida Obtenida: Error
	 * Entrada: 0, 0, 59 	| Salida Esperada: 0º 1' 0''	| Salida Obtenida: 0º 1' 0''
	 * Entrada: 0, 59, 59 	| Salida Esperada: 1º 0' 0''	| Salida Obtenida: 1º 0' 0''
	 * Fin Pruebas
	 */
	
	public static void main(String[] args) {
	
		/* Declaración de Variables */
		/* Vamos a declarar una variable para cada dato: horas, minutos y segundos */
		int horas;
		int minutos;
		int segundos;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Vamos a añadir un segundo a la hora.");
		
		//Horas
		System.out.println("Introduce Horas: ");
		horas = sc.nextInt();
		
		//Minutos
		System.out.println("Introduce Minutos: ");
		minutos = sc.nextInt();
		
		//Segundos
		System.out.println("Introduce Segundos: ");
		segundos = sc.nextInt();
		
		/* Algoritmo */
		/* Si los segundos son menores que 59, sumamos sin problema, pero si es 
		 * 59 y tenemos que sumar 1, tenemos que cambiar minutos y segundos, 
		 * igual si minutos es 59 con las horas. Aunque aunque primero comprobamos si son
		 * valores válidos */
		if( minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59 || horas < 0) {
			
			System.out.println("Error");
			
		}else{
		
			if(segundos < 59) {
				
				segundos = segundos + 1;
				
			}else{
				
				if(minutos < 59) {
					
					minutos = minutos + 1;
					
					segundos = 0;
					
				}else{
					
					horas = horas + 1;
					 
					minutos = 0;
					
					segundos = 0;
					
				}//Fin IF --> 59 minutos
				
			}//End IF --> 59 segundos
			
			/* Syso de Respuesta */
			System.out.println(horas + "º " + minutos + "' " + segundos + "''");
			
		}//Fin IF --> Datos Validos

		
		/* Cierre de Scanner */
		sc.close();
		
	}//FIN MAIN

}
