package SangamOneJavaCode;

import java.util.Scanner;

public class PrimeNumberCheck {
// question - 9
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not");
		int number = sc.nextInt();
		if(isPrime(number))
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
		
		;
		
		
		
		
		
		
	}
	public static boolean isPrime(int num)
	{
		if(num <= 1)
		{
			return false;
		}
		for(int i =2; i<=Math.sqrt(num); i++ )
		{
			if(num % 2 == 0)
			{
				return false;
			}
			
		}
		return true;
	}
	
	

}
