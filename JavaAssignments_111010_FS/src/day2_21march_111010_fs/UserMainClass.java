package day2_21march_111010_fs;

public class UserMainClass {
	
	static int sumOfSquaresOfEvenDigits(int a) {
		int sum=0;
		int remainder;
		while(a>0){
			remainder = a % 10;
			if(remainder % 2 == 0) {
				sum += remainder * remainder;
			}
			a = a/10;
		}
		return sum;
	}
	
	
	static int countDigits(int a) {
		int count=0;
		int remainder;
		while(a>0){
			remainder = a % 10;
			if(remainder == 7) {
				count++;
			}
			a = a/10;
		}
		return count;
	}
	
	static boolean compare(int a, int b) {
		boolean equals;
		equals = (a%10 == b%10);
		return equals;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
