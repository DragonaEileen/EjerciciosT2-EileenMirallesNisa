package aceptaelreto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ConstanteDeKaprekar {
	
	/*Comprueba en cuantas iteraciones de la rutina de Kaprekar se llega a la constante de Kaprekar*/

	public static void main(String[] args) {
	
		//Variable Declaration
			//En raw se guarda el numero en una String
		String raw;
			//En num se guardará el array numérico en integers
		int[] num;
			//Counter de iteraciones
		int counter;
			//Ordered array
		int[] numOrdered;
			//Reverse Order array
		int[] numReversed;
			//Boolean Repdigitquestion
		boolean repdigitQuestion = false;
		
		//Scannercito
		Scanner sc = new Scanner(System.in);
		
		//Syso y data collection
			//Do while to check if the number contains 4 digits or less
		do {
		
		System.out.println("Gimme num of 4 digits (add the left zeroes): ");
		raw = sc.next();
		
		}while(raw.length() != 4);
		
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
	    if(raw.equals("6174")) {
	    	
	    	counter = 0;
	    	
	    	//Test//
	    	System.out.println("Inside 6174!");
	    	//\Test
	    	
	    //If the raw is a repdigit, then it turns to 8	
	    }else {
	    	
	    	//To do that we compare every number with their companions in the following for and if
	    	for (int i = 0; i < raw.length(); i++) {
	    		
	    		if (raw.charAt(0) != raw.charAt(i) || raw.charAt(1) != raw.charAt(i) || raw.charAt(2) != raw.charAt(i) || raw.charAt(3) != raw.charAt(i)) {
	    			
	    			repdigitQuestion = false;
	    			
	    			//Test//
	    	    	System.out.println("Inside Repdigit equals false!");
	    	    	//\Test
	    			
	    		}else{
	    			
	    			repdigitQuestion = true;
	    			
	    			//Test//
	    	    	System.out.println("Inside Repdigit equals true!");
	    	    	//\Test
	    			
	    		}//End if Geting RepdigitAnswer
	    		
	    	}//End for Getting Repdigit Answer	
	    	
	    	//If it's repdigit or not we procceed in different ways
	    	if(repdigitQuestion == true) {
	    		
	    		//So it's a repdigit
	    		counter = 8;
	    		
	    		//Test//
		    	System.out.println("Inside repdigitQuestion If true!!");
		    	//\Test
	    		
	    	}else if (repdigitQuestion == false ){
	    		
	    		//Test//
		    	System.out.println("Inside sequence of Kaprekar!!");
		    	//\Test
	    		
	    		//So it's not a repdigit
    			//We gonna do the sequence of Kaprekar
    				//First we order the array of nums
    			Arrays.sort(num);
    			numOrdered = num;
    			
    				//Now the reverse. The Reverse method we are gonna use is putting it in another array in reversed order
    			numReversed = new int[num.length];	//Creamos un array de longitud 4
    			
    			for (int e = 0; e < num.length; e++ ){
    				
    				numReversed[3-e] = numOrdered[e];
    				
    			}//Fin Reversing
    			
	    	}
	    	
	    }//End If
	    
	    
		
	}

}
