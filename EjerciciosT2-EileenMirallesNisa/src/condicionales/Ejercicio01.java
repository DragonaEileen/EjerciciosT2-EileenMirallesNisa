package condicionales;

import java.util.Scanner;

public class Ejercicio01 {
	
	/** Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
	 * La aplicación tendrá que indicar si el número introducido es capicúa. Un número es 
	 * capicúa si se lee igual de izquierda a derecha que de derecha a izquierda. **/

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos la variable en la que se guardará el número introducido por el usuario;
		 * luego una variable para guardar si el usuario quiere hacer prueba o probar la app; */
		int input;
		String res;
		int resto;
		int primero;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		/* Pedimos al Usuario si quiere realizar pruebas (introducirá P), o quiere utilizar la aplicación
		 * (introducirá A). */
		
		System.out.println("¿Pruebas(P) o App(A)?");
		res = sc.next();
		
		//If App o Pruebas
		if(res.equals("A")) {
			
			/* Algoritmo */
			/* El problema se resuelve de diferentes maneras dependiendo de las cifras 
			 * que tenga el número: si tiene 1 no es un numero válido, porque no puede ser
			 * capicúa; si tiene 2 cifras, entonces será divisible entre 11 (22, 33, 
			 * 44 ... 99); si tiene tres cifras cogemos el modulo de 10 del número y 
			 * obtenemos la última cifra, y luego dividimos entre 100 y truncamos para 
			 * obtener la primera cifra; y si tiene 4 cifras pues utilizamos el mismo 
			 * método que antes, pero haciendo el modulo de 100 */
			System.out.print("Introduce un número: ");
			input = sc.nextInt();	
			
			//Comprobamos cuantas cifras tiene
			if(input < 10 && input > -1) {		//Si tiene 1 cifra
				
				System.out.println("Tú numero no puede ser capicúa, pues solo tiene una "
						+ "cifra");
				
			}else if (input < 100 && input > 9){	//Si tiene 2 cifras
				
				System.out.println("El número tiene 2 cifras, por tanto será capicúo "
						+ "si es divisible entre 11");
				if(input % 11 == 0) {
					
					System.out.println("Tu número es divisible entre 11, por tanto es "
							+ "capicúo");
					
				}else{
					
					System.out.println("Tu número no es divisible entre 11, no es capicúo");
					
				}//Fin If --> %11
				
			}else if(input < 1000 && input > 99){	//Si tiene 3 cifras
				
				System.out.println("Tu número tiene 3 cifras, vamos a desglosar "
						+ "el primer número y el último y ver si son iguales, el "
						+ "del medio nos es irrelevante.");
				
				resto = (int) (input % 10);
				primero = (int) input / 100;
				
				if( resto == primero ) {
					
					System.out.println("El primer y el último número son iguales "
							+ ", por tanto el número es capicúo.");
					
				}else{
					
					System.out.println("El primer y el último número no son iguales, "
							+ "no es capicúo.");
					
				}//Fin IF --> 3 cifras
				
			}else if(input < 10000 && input < 999){		//Si tiene 4 cifras
				
				System.out.println("El número tiene 4 cifras, vamos a ver si los "
						+ "dos primero números son iguales a los dos últimos, para "
						+ "ello utilizaremos el modulo de 100");
				
				resto = (int) (input % 100);
				primero = (int) (input /100);
				
				//Comprobamos si son iguales
				if (resto == primero) {
					
					System.out.println("Los dos últimos y los dos primeros son iguales,"
							+ " por tanto es capicúa");
					
				}else{
					
					System.out.println("Los dos primeros y los dos últimos no son iguales, "
							+ "no es capicúo.");
					
				}//Fin IF --> 4 cifras
			
			}else{
				
				System.out.println("Error, numero mayor que 9999");
				
			}//Fin If
			
		}else if (res.equals("P")) {
				
				//Pruebas
				
		}else{
			
			System.out.println("Probablemente dato introducido sea incorrecto");
			
		}//Fin If
		
		/* Cierre de Scanner */
		sc.close();
		
	}//Fin main

}
