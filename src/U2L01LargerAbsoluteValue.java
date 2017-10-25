//Ricarda Hill
//October 25, 2017
//In-class U2L01: Functions

//Write a method called largerAbsVal that takes two doubles/integers
//as parameters and returns the larger of two absolute values.
//A call of largerAbsVal(11, 2) would return 11 and a call of
//largerAbsVal(4, -5) would return 5. 

public class U2L01LargerAbsoluteValue {

	//below = signature
	public static void main(String[] args) {
		System.out.println(largerAbsVal(-5, 11.2));
		//create a new variable to return
		double answer = largerAbsVal(-21.3, 12);
		System.out.println(answer);
	
	}
	
	//larger Absolute value method
	//there do not have to be parameters
	public static double largerAbsVal(double num1, double num2) {
		double largerNum; 
		
		if (num1 < 0) {
			num1 = num1 * -1;
		}
		if (num2 < 0) {
			num2 = num2 * -1;
		}
		
		if (num1 > num2) {
			largerNum = num1;
		}else {
			largerNum = num2;
		}
		
		return largerNum;
	}

}
