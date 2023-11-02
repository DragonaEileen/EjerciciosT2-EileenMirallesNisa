package condicionales;

import java.util.Scanner;

public class Ejercicio04 {
	
	/** Escribe un programa que solicite al usuario un número entero entre 1 y 99. 
	 * El programa debe mostrarlo con letras, por ejemplo, para 56 se verá: “cincuenta y seis”. **/
	
	/* Para no tener que hacer un switch de 99 casos, vamos a dividir los numeros introducidos
	 * en decenas y centenas. Con exceptción de los numeros del diez al treinta, que tienen que ser casos aparte. */
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: -5 		| Salida Esperada: Error 			| Salida Obtenida: Error
	 * Entrada: 100 	| Salida Esperada: Error			| Salida Obtenida: Nada
	 * 		Error: Faltaba el Default del switchcase de las decenas 
	 * Entrada: 100 	| Salida Esperada: Error			| Salida Obtenida: Error 
	 * Entrada: 15 		| Salida Esperada: quince			| Salida Obtenida: quince
	 * Entrada: 22	 	| Salida Esperada: veintidos		| Salida Obtenida: veintidos
	 * Entrada: 56	 	| Salida Esperada: cincuenta y seis	| Salida Obtenida: cincuenta y seis   
	 * Fin Pruebas
	 */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos un entero donde se introducirá lo que escriba el usuario;
		 * luego una String para las decenas, otra para las unidades, y otra para los cardinales no complejos
		 * según dicta la rae. */
		int num;
		int numD = 0;
		int numU = 0;
		String decenas = "";
		String unidades = "";
		boolean simple = false;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Introduce un número entero del 1 al 99: ");
		num = sc.nextInt();
		
		/* Algoritmo */
		/* Switch TIME, pero primero dividimos en decenas y unidades */
		numD = (int) num / 10;
		numU = (int) num % 10;
		
		switch(numU) {
		
		case 0:
			
			unidades = "";
			break;
		
		case 1:
			
			unidades = "uno";
			break;
			
		case 2:
			
			unidades = "dos";
			break;
		
		case 3:
			
			unidades = "tres";
			break;
			
		case 4:
			
			unidades = "cuatro";
			break;
			
		case 5:
			
			unidades = "cinco";
			break;
			
		case 6:
			
			unidades = "seis";
			break;
			
		case 7:
			
			unidades = "siete";
			break;
			
		case 8:
			
			unidades = "ocho";
			break;
			
		case 9:
			
			unidades = "nueve";
			break;
			
		default:
			
			System.out.println("Something weird happened");
			break;
				
		}// Fin Switch Unidades
		
		switch (numD) {
		case 0:
			
			decenas = "";
			break;
		
		case 1, 2:
		
			simple = true;
			
			switch(num) {
			
			case 10:
				
				decenas = "diez";
				break;
				
			case 11:
				
				decenas = "once";
				break;
				
			case 12:
				
				decenas = "doce";
				break;
				
			case 13:
				
				decenas = "trece";
				break;
				
			case 14:
				
				decenas = "catorce";
				break;
				
			case 15:
				
				decenas = "quince";
				break;
				
			case 16, 17, 18, 19:
				
				decenas = "diec";
				break;
				
			case 20:
				
				simple = false;
				decenas = "veinte";
				break;
				
			case 21, 22, 23, 24, 25, 26, 27, 28, 29:
				
				decenas = "veint";
				break;
				
			default:
				
				System.out.println("Something weird happened");
				break;
			
			}// Fin Switch Simples
			
			break;
		
		case 3:
			
			decenas = "treinta";
			break;
			
		case 4:
			
			decenas = "cuarenta";
			break;
			
		case 5:
			
			decenas = "cincuenta";
			break;
			
		case 6:
			
			decenas = "sesenta";
			break;
			
		case 7:
			
			decenas = "setenta";
			break;
			
		case 8:
			
			decenas = "ochenta";
			break;
			
		case 9:
			
			decenas = "noventa";
			break;
			
		default:
			
			System.out.println("Something weird happened");
			break;
			
		}//Fin Switch Decenas
	
		/* Syso de Respuesta */
		/* Con un IF vamos a ver si es cardinal simple o no */
		if (simple == true) {
			
			/* Y otro IF para ver si es mayor o menor de 15 */
			if (num > 15) {
				
				System.out.println(decenas + "i" + unidades);
				
			}else{
				
				System.out.println(decenas);
				
			}//Fin IF >15
			
		}else{
			
			/* Otro IF por si solo hay decenas o unidades */
			if (numD == 0 || numU == 0) {
				
				System.out.println(decenas + unidades);
				
			}else{
				
				System.out.println(decenas + " y " + unidades);
				
			}//Fin IF num = 0
			
		}//Fin IF simple
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
