package day3_22march_111010_FS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserMainCode {

	static int getSumOfIntersection(int m, int n, int[] a, int [] b) {
		int sum=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(a[i]==b[j]) {
					sum+=a[i];
					b[j]=0;
					break;
				}
			}
		}
		return sum;
	}
	
	static int getBigDiff(int[] a,int n) {
		if(n<1)
			return a[0];
		int min=a[0],max=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max)
				max = a[i];
			if(a[i]<min)
				min = a[i];
		}
		return max-min;
	}
	
	static int validateNumber (String phone) {
		if(Pattern.matches("\\d{3}-\\d{3}-\\d{4}", phone)) 
			return 1;
		return -1;
	}
	
	static int validatePassword (String password) {
		if(Pattern.matches("^(?=.*[@#$])(?=.*[0-9]).{6,20}$", password)) 
			return 1;
		return -1;
	}
	
	static int calculateElectricityBill (int previousInput, int currentInput,int cost) {
		return (currentInput-previousInput)*cost;		
	}	
}
