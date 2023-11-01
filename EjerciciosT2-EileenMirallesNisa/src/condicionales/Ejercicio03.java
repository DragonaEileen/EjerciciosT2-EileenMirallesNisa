package condicionales;

import java.util.Scanner;

public class Ejercicio03 {
	
	/** En una granja se compra diariamente una cantidad de comida para los animales. Los animales son todos de la misma especie
	 * y sabemos que cada animal come los mismos kilos de comida de media diariamente. 
	 * Diseña un programa que solicite al usuario los valores anteriores (cantidad de comida comprada, 
	 * número de animales y kilos de comida que comen todos los animales en total), y determine si disponemos 
	 * de alimento suficiente para cada animal. En caso negativo, debe calcular cuál es la ración que corresponde a 
	 * cada uno de los animales. 
	 * Nota: Evita que la aplicación realice divisiones por cero.
	 **/

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Vamos a declarar los datos que te pide el enunciado: cantidad de comida comprada, número de animales y kilos de comida
		 * que comen los animales en total; luego una que sea la ración que corresponde a cada animal */
		double comidaComprada;
		int numAnimales;
		double comidaConsumidaTotal;
		double comidaConsumidaRacion;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y Recogida de Datos */
		System.out.println("En una granja se compra diariamente una cantidad de comida para los animales. Los animales son todos "
				+ "de la misma especie\r\n"
				+ "	y sabemos que cada animal come los mismos kilos de comida de media diariamente.");
		
		//Comida Comprada
		System.out.println("Introduce la cantidad de comida comprada: ");
		comidaComprada = sc.nextDouble();
		
		//Numero animales
		System.out.println("Introduce el número de animales: ");
		numAnimales = sc.nextInt();
		
		//Comida consumida en total
		System.out.println("Introduce la cantidad total d ecomida consumida: ");
		comidaConsumidaTotal = sc.nextDouble();
		
		/* Algoritmo */
		/* Con un IF vamos a ver si hay suficiente comida para todos los animales, y si no, 
		 * calcularemos la ración que le corresponde a cada animal */
		if (comidaComprada >= comidaConsumidaTotal) {
			
			System.out.println("Todo bien en la granja");
			
		}else{
			
			System.out.println("Uh-oh, falta comida");
			
			comidaConsumidaRacion = comidaComprada / numAnimales;
			
			System.out.println("A cada animal le toca de comer " + comidaConsumidaRacion);
			
		}//Fin IF Comida
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
