package aceptaelreto;

import java.util.Scanner;
import java.util.ArrayList;

public class NanaPapaMama {
	
	/** Entrada: El programa debe aceptar una serie de palabras, cada una en una línea, con longitudes de 
	 * entre 1 y 200 letras. Contendrán únicamente letras del alfabeto inglés, en mayúscula o minúscula, 
	 * sin espacios ni ningún otro separador.
	 * 
	 *  Salida: Para cada cadena, el programa escribirá la longitud de la subcadena más corta posible que 
	 * puede usarse para crear la palabra original repitiéndola varias veces, ignorando las diferencias 
	 * entre mayúsculas y minúsculas. **/

	public static void main(String[] args) {
		
		/** Diseño: para este problema, voy a guardar las cadenas introducidas en una array para que se puedan
		 * introducir varias al mismo tiempo, con un bucle. En cada introducción solo voy a dejar que la cadena 
		 * introducida sea válida si cumple con los requisitos apuntados en la sección de "Entrada".
		 * Para comprobar cada cuanto se repite la palabra original para formar la cadena, voy a apuntar el primer
		 * index, el 0, y voy a ir contando hasta que se repita este carácter. Entonces voy a ver si los siguientes
		 * carácteres son iguales a los anteriores entre los dos carácteres repetidos. 
		 * Si es el caso, ya tenemos de que index a que index se repiten.
		 * Si NO es el caso, que siga contando hasta que encuentre donde se repite la siguiente vez, y procederá
		 * a realizar la misma operación, así encadenandose hasta o que llegue al final, o encuentre que se repiten
		 * los caractéres. **/

		/** Declaración de Variables **/
			//Cadena que leera el programa
		String input = "";
			//Array multidimensional para introducir varias cadenas y su contador auxiliar
		ArrayList<String> inputArrayList = new ArrayList<String>();
			//POSIBLE_DELETE Cadena auxiliar
		String aux;
		
		/** Iniciamos Scanner **/
		Scanner sc = new Scanner(System.in);
		
		/** Empieza la Magia **/
			//Pedimos Datos con un syso
		System.out.println("Introduce una cadena por linea."
				+ " Escribe '-1' para finalizar antes del máximo");
		
			//Bucle while para guardar los cadenas y bucle do-while para comparar que son correctas
		while(!input.equals("-1")) {
			
			do {
				
				//Lectura de la cadena
				input = sc.next();
				
				//Guardamos la cadena en la arraylist si no es "-1"
				if(!input.equals("-1")) {
					
					inputArrayList.add(input);
					
				}//Fin excluding -1
				
			}while(input.length() < 1 || input.length() > 200);

		}//Fin de Obtener la ArrayList

		/*//Test//
		for(int i = 0; i < inputArrayList.size(); i++) {
			
			System.out.println(inputArrayList.get(i));
			
		}
		//\Test//*/
		
		
		
		
		
	}//Fin main

}
