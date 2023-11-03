package condicionales;

import java.util.Scanner;

public class Ejercicio08 {
	
	/** Determinar el precio de un billete de tren, conociendo la distancia a recorrer, 
	 * y sabiendo que si el número de días de estancia es superior a 7 y la distancia 
	 * superior a 800 km el billete tiene una reducción del 30%. El precio por kilómetro 
	 * es de 2,5€. La distancia a recorrer y el número de días de estancia los debes 
	 * solicitar al usuario por teclado. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada: 8, 0  	| Salida Esperada: Error	| Salida Obtenida: Error
	 * Entrada: -1, 3	| Salida Esperada: Error	| Salida Obtenida: Error
	 * Entrada: 2, 100	| Salida Esperada: 250		| Salida Obtenida: 250
	 * Entrada: 8, 900	| Salida Esperada: 675		| Salida Obtenida: 675
	 * Fin Pruebas
	 */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos primero tres constantes: el descuento y los dias y km a partir de 
		 * los que se aplica; tras esto otra constante que indica el precio por km;
		 * luego declaramos las variables que mantendran los datos introducidos por teclado
		 * y una variable donde se guardará el precio final*/
		//Constantes
		final float DISCOUNT = 30f;
		final byte DIAS_DISCOUNT = 7;
		final float KM_DISCOUNT = 800f;
		final float PRECIO_KM = 2.5f;
		
		//Variables de Input
		byte diasEstancia;
		float kmRecorridos;
		float precioFinal;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("Bienvenido a TransTRAINS S.A. Elige un los días de estancia y "
				+ "los km a recorrer. Ten en cuenta que más de " + DIAS_DISCOUNT + " días, "
						+ "y más de " + KM_DISCOUNT + " km recorridos aplica un descuento "
								+ "de " + DISCOUNT + "%");
		
		//Días de Estancia
		System.out.print("Introduce los días de estancia: ");
		diasEstancia = sc.nextByte();
		
		//Km Recorridos
		System.out.print("Introduce los km a recorrer: ");
		kmRecorridos = sc.nextFloat();
		
		/* Algoritmo */
		/* Primero comprobamos que los datos introducidos son válidos, luego comprobaremos
		 * si se aplica el descuento, y finalmente calcularemos el precio */
		/* Comprobación de Validez */
		if (diasEstancia < 0 || kmRecorridos <= 0) {
			
			System.out.println("Los datos introducidos no tienen sentido.");
			
		}else{
			
			/* Comprobación de Descuento */
			if ( diasEstancia > DIAS_DISCOUNT && kmRecorridos > KM_DISCOUNT) {
				
				precioFinal = (DISCOUNT/100) * (kmRecorridos * PRECIO_KM);
				
			}else{
				
				precioFinal = kmRecorridos * PRECIO_KM;
				
			}//Fin IF --> Descuento
			
			/* Syso de Respuesta */
			System.out.println("El precio final es de " + precioFinal + "€");
			
		}//Fin IF --> Datos válidos
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
