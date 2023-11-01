package condicionales;

import java.util.Scanner;

public class Ejercicio02 {
	
	/** El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a 
	 * partir del número de la siguiente forma:
		letra = número DNI módulo 23
	 * Basándote en esta información, elige la letra a partir de la numeración de la 
	 * siguiente tabla: INSERT TABLA
	 * Diseña una aplicación en la que, dado un número de DNI, calcule la letra que 
	 * le corresponde. Observa que un número de 8 dígitos está dentro del rango del 
	 * tipo int. **/

	public static void main(String[] args) {
		
		/* Declaración de Variables */
		/* Declaramos una variable que introduzca el usuario que será el número del dni,
		 * y otra que será el resultado del modulo, y la letra */
		int dniNum;
		int modulo;
		char letra = 'a';
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		/* Explcamos de que va el problema y pedimos un número del DNI */
		System.out.println("A partir del número del DNI vamos a calcular la letra, por "
				+ "favor introduce un número del DNI: ");
		dniNum = sc.nextInt();
		
		/* Algoritmo */
		/* Como tenemos que usar un condicional, si queremos asignar un valor a una letra,
		 * vamos a utilizar un switchcase, y para obtener ese número hacemos el módulo de 23 
		 * de el dni */
		modulo = dniNum % 23;
		
		switch (modulo) {
		case 0: 
		
			letra = 'T';
			break;
		
		case 1: 
			
			letra = 'R';
			break;
		
		case 2: 
			
			letra = 'W';
			break;
		
		case 3: 
			
			letra = 'A';
			break;
		
		case 4: 
			
			letra = 'G';
			break;
		
		case 5: 
			
			letra = 'M';
			break;
		
		case 6: 
			
			letra = 'Y';
			break;
		
		case 7: 
			
			letra = 'F';
			break;
		
		case 8: 
			
			letra = 'P';
			break;
		
		case 9: 
			
			letra = 'D';
			break;
		
		case 10: 
			
			letra = 'X';
			break;
		
		case 11: 
			
			letra = 'B';
			break;
		
		case 12: 
			
			letra = 'N';
			break;
		
		case 13: 
			
			letra = 'J';
			break;
		
		case 14: 
			
			letra = 'Z';
			break;
		
		case 15: 
			
			letra = 'S';
			break;
		
		case 16: 
			
			letra = 'Q';
			break;
		
		case 17: 
			
			letra = 'V';
			break;
		
		case 18: 
			
			letra = 'H';
			break;
		
		case 19: 
			
			letra = 'L';
			break;
		
		case 20: 
			
			letra = 'C';
			break;
		
		case 21: 
			
			letra = 'K';
			break;
		
		case 22: 
			
			letra = 'E';
			break;
		
		default:
			
			System.out.println("Something went wrong");
			
		}// Fin Switch
		
		/* Syso de Respuesta */
		System.out.println("La letra correspondiente al número introducido de DNI es " + letra);
			
		/* Cierre del Scanner */
		sc.close();

	}

}
