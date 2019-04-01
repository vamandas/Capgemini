package day1_20march_111010_FS;

public class NumbersAndMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This will print the statement to the output device.
		System.out.println("I will now count my chickens:"); 
		//This will divide 30 by 6 and then add it to 25 as divide has higher precedence.
		System.out.println("Hens " + (25f + 30f / 6f)); 
		//This will multiply 25 to 3 and then modulo the result by 4 and then subtract it from 100. Modulus is basically a function that returns the remainder.
		System.out.println("Roosters " + (100f - 25f * 3f % 4f)); 
		//This will print the statement to the output device.
		System.out.println("Now I will count the eggs:"); 
		//This will modulo 4 to 2 and then divide 1 by 4 and then compute the result.
		System.out.println(3f + 2f + 1f - 5f + 4f % 2f - 1f / 4f + 6f); 
		//This will print the statement to the output device.
		System.out.println("Is it true that 3 + 2 < 5 - 7?"); 
		//This will return false.
		System.out.println(3 + 2 < 5 - 7); 
		//This will print the statement and the computed value.
		System.out.println("What is 3 + 2? " + (3 + 2)); 
		//This will print the statement and the computed value.
		System.out.println("What is 5 - 7? " + (5 - 7)); 
		//This will print the statement to the output device.
		System.out.println("Oh, that's why it's false."); 
		//This will print the statement to the output device.
		System.out.println("How about some more.");  
		//This will print the statement and the computed value which is true.
		System.out.println( "Is it greater? " + ( 5 > -2 ) );  
		//This will print the statement and the computed value which is true.
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
		//This will print the statement and the computed value which is false.
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) ); 
	}

}
