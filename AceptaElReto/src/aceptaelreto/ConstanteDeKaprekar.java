package aceptaelreto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ConstanteDeKaprekar {
	
	/*Comprueba en cuantas iteraciones de la rutina de Kaprekar se llega a la constante de Kaprekar*/

	public static void main(String[] args) {
	
		//Variable Declaration
			//Constante de Kaprekar
		final int[] KAPREKAR_ARRAY = {6, 1, 7, 4};
		final String KAPREKAR_STRING = "6174";
			//Number of numbers you gonna do
		int times;
			//Array times
		String[] timesArray;
			//En raw se guarda el numero en una String
		String raw;
			//En num se guardará el array numérico en integers
		int[] num;
			//Counter de iteraciones
		int counter = 0;
			//Boolean Repdigitquestion
		boolean repdigitQuestion = false;
			//Multidimensional array
		int[][] bothArrays = {{},{}};

		
		//Scannercito
		Scanner sc = new Scanner(System.in);
		
		//Syso y data collection
			//Do while to check if the number contains 4 digits or less
		
		//System.out.println("How many numbers: ");
		times = sc.nextInt();
		
		timesArray = new String[times];
		
		for(int i = 0; i < times; i++) {
			
			do {
				
				System.out.println("Gimme num of 4 digits (add the left zeroes): ");
				timesArray[i] = sc.next();
				
				}while(timesArray[i].length() != 4);
			
		}// Fin for times Array
		
		for(int q = 0; q < timesArray.length; q++) {
		
			raw = timesArray[q];
			
			//Algorithm
			//Pasar de String a int[]

		    num = new int[raw.length()];	//Creamos un array de longitud 4
		    
		    /*It's not the integer value you expect it to be but is in fact the ASCII value of the char. 
		     * So you need to subtract the ASCII value of zero to get the integer value you're expecting.*/
		    
		    for (int i = 0; i < raw.length(); i++){

		        num[i] = raw.charAt(i) - '0';	
		        
		    }	//No hace falta pasarlo a integer (En mi caso si si quiero hacer pruebas)
		    
		    /*//Test//
		    for (int i : num) {
		        System.out.println(i);
		    }
		    //\Test//*/
		    
		    /*Now we have an array with the integers, now we gotta check if the number fills the requisites*/
		    //If the raw is equal to the Kaprekar number, then directly the counter turns to 0
		    if(raw.equals(KAPREKAR_STRING)) {
		    	
		    	counter = 0;

		    //If the raw is a repdigit, then it turns to 8	
		    }else {
		    	
		    	//To do that we compare every number with their companions in the following for and if
		    	for (int f = 0; f < raw.length(); f++) {
		    		
		    		if (raw.charAt(0) != raw.charAt(f) || raw.charAt(1) != raw.charAt(f) || raw.charAt(2) != raw.charAt(f) || raw.charAt(3) != raw.charAt(f)) {
		    			
		    			repdigitQuestion = false;
		    			
		    		}else{
		    			
		    			repdigitQuestion = true;
		    			
		    		}//End if Geting RepdigitAnswer
		    		
		    	}//End for Getting Repdigit Answer	
		    	
		    	//If it's repdigit or not we procceed in different ways
		    	if(repdigitQuestion == true) {
		    		
		    		//So it's a repdigit
		    		counter = 8;
		    		
		    	}else if (repdigitQuestion == false ){

		    		//So it's not a repdigit
	    			//We gonna do the sequence of Kaprekar. We call for the method of orderingArrays to have both arrays ordered
			    	//This for
			    	//while(num != KAPREKAR_ARRAY) {
			    	while(!Arrays.equals(num, KAPREKAR_ARRAY)) {	
			    	
			    		//We order the arrays and compact them into one multidimensional array
			    		bothArrays = orderingArrays(num);
			    		
			    		//Then we change num by the new num after doing the kaprekar sequence
			    		num = kaprekarSequence(bothArrays);
			    		
			    		//Counter
			    		counter = counter + 1;
			    		
			    	}//Fin Kaprekar loop
	    			
		    	}//Fin if Repdigitquestion
		    	
		    }//End If
		    
		    System.out.println("counter: " + counter);
		    
		    //We restart the counter, so it doesn't go adding up every iteration
		    counter = 0;
			
		}//End for
		
	}//Fin main
	
	//The following method will order the arrays in both orders. It returns a multidimensional array, at index 0 the Ordered and at index 1 the Reversed
	static int[][] orderingArrays(int[] num) {
	
		//Variable declaration
			//Ordered array
		int[] numOrdered;
			//Reverse Order array
		int[] numReversed;
			//Multidimensional array
		int[][] bothArrays = {{},{}};
		
		//First we order the array of nums
		Arrays.sort(num);
		numOrdered = num;
		
		//Now the reverse. The Reverse method we are gonna use is putting it in another array in reversed order
		numReversed = new int[num.length];	//Creamos un array de longitud 4
		for (int e = 0; e < num.length; e++ ){
			
			numReversed[3-e] = numOrdered[e];
			
		}//Fin Reversing
		
		//Finally we compress the two arrays in one multidimensional array to return only one object.
		bothArrays[0] = numOrdered;
		bothArrays[1] = numReversed;
		return bothArrays;
		
	}//Fin Ordering Arrays
	
	//Metodo para transformar de nuevo una int array to String to int para futuras operaciones
	static int arrayToStringToInt(int[] num) {
		
		//Auxiliary variable to save the final int
		int aux;
		
		//StringBuilder, for appending characters to a String
		StringBuilder strNum = new StringBuilder();
		
		//appending to a String
		for (int number : num) {
			
		     strNum.append(number);
		     
		}//Fin Appender
		
		//We cast it to int
		aux =  Integer.parseInt(strNum.toString());
		
		//And we return the int
		return aux;
		
	}//Fin arrayToStringToInt
	
	
	//Metodo que le pasas la array multidimensional y te los pasa a integers y te devuelve la resta de los numeros ordenados
	static int[] kaprekarSequence(int[][] bothArrays) {
		
		//Variable declaration
			//Numero ordenado entero
		int numOrderedInt;
			//Numero Reversed entero
		int numReversedInt;
			//Numero final
		int number;
			//Array numero final
		int[] num;
			//String numero final
		String strNum;
		
		//Pasar de array a int
		numOrderedInt = arrayToStringToInt(bothArrays[0]);
		numReversedInt = arrayToStringToInt(bothArrays[1]);
		
		//Resta simple
		number = numReversedInt - numOrderedInt;
		
		//Now back to array going through String
		strNum = String.valueOf(number);	//String
		
		num = new int[strNum.length()];		//Array creation
		
		//Filling the array with string values
		for (int i = 0; i < strNum.length(); i++){

		        num[i] = strNum.charAt(i) - '0';	
		        
		}
		
		//Returning array
		return num;
		
	}//Fin kaprekar sequence

}
