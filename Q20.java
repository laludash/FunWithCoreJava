package SangamOneJavaCode;

public class Q20 {

	public static void main(String[] args) {
	
		int[] number  =  {1,2,3,4,5,6,7,8,10};
		
		int actualSum = 0; 
		
		int expectedSum = 10 * (10 + 1)/2;  /// n*(n+1)/2
		
		for(int i = 0; i<number.length;i++)
		{
			actualSum = actualSum+i;
		}
		
		int missingNumber  = expectedSum - actualSum;
		
		System.out.println("The missing number is " + missingNumber);
		
		
		
		
		

	}

}
