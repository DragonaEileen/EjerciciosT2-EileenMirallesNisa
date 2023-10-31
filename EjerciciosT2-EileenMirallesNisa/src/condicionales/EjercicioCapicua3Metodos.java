package condicionales;

import java.util.Scanner;

public class EjercicioCapicua3Metodos {
	
	/** Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
	 * La aplicación tendrá que indicar si el número introducido es capicúa. Un número es 
	 * capicúa si se lee igual de izquierda a derecha que de derecha a izquierda. **/
	
	/* Pruebas mínimas a realizar: TODAS */
	/* Creamos una array con todos los números del 0 al 9999 y hacemos un bucle que vaya dandole a la 
	 * aplicación cada número */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos la variable en la que se guardará el número introducido por el usuario;
		 * luego una variable para guardar si el usuario quiere hacer prueba o probar la app;
		 * y una variable temporal, y el reverser. Estas dos últimas sirven para el método 
		 * fácil */
		long input;
		String res;
		int resto;
		int primero;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		/* Pedimos al Usuario si quiere realizar pruebas (introducirá P), o quiere utilizar la aplicación
		 * (introducirá A). En caso de que quiera Pruebas le conduciremos a un bucle que "introducirá" en
		 * la aplicación todos los datos del array. */
		
		//Do while Para comprobar si el dato introducido es correcto
		do {
		
		System.out.println("¿Pruebas(P) o App(A)?");
		res = sc.next();
		
		}while(!res.equals("P") && !res.equals("A"));
		
		//If App o Pruebas
		if(res.equals("A")) {
			
			/* Algoritmo */
			/* Método 1 */
			/* El problema se resuelve de diferentes maneras dependiendo de las cifras 
			 * que tenga el número: si tiene 1 no es un numero válido, porque no puede ser
			 * capicúa; si tiene 2 cifras, entonces será divisible entre 11 (22, 33, 
			 * 44 ... 99); si tiene tres cifras cogemos el modulo de 10 del número y 
			 * obtenemos la última cifra, y luego dividimos entre 100 y truncamos para 
			 * obtener la primera cifra; y si tiene 4 cifras pues utilizamos el mismo 
			 * método que antes, pero haciendo el modulo de 100 */
			
			/* Expansión */
			/* Método 2 */
			/* ¿Qué pasa si intentamos ir más allá de 4 cifras? Yo creo que con un bucle
			 * se podría, pero claro tendría que ser un bucle infinito, o de la longitud
			 * de un long (9,223,372,036,854,775,807)*/
			
			/* Método 3 */
			/* Hemos encontrado un método en stack overflow para solucionar esto: se basa 
			 * en ir desglosando y reversando el número mediante una formula matematica */
			
			/* Elegimos un método */
			
			System.out.println("Elige un método para realizar este ejercicio (1, 2 o 3):");
			res = sc.next();
			
			//If para elegir método

				/* Syso de Explicación */
				System.out.println("El primer Método es el explicado en pizarra, y se limíta"
						+ " a recoger números en los límites dados. Según el número de cifras"
						+ " del input, habrá diferentes submétodos, explicados en los casos."
						+ " La base de este método es utilizar el modulo de 10 en caso de que"
						+ " el input tenga 3 cifras, y de 100 en caso de que tenga 4.");
				
				//Comprobamos que los números estén dentro del rango proporcionado con un do-while.
				do {
					
					System.out.print("Introduce un número: ");
					input = sc.nextLong();
					
				}while(input > 9999 || input < 0);
				
				//Comprobamos cuantas cifras tiene
				if(input < 10) {		//Si tiene 1 cifra
					
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
					
				}else{		//Si tiene 4 cifras
					
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
				
				}//Fin If
			
		}else if (res.equals("P")) {
			
			
			
		}//Fin If
		
		
	}

}
