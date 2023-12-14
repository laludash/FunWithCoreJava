package SangamOneJavaCode;

public class Q22 {

	public static void main(String[] args) {
		int[] numbers  = {3,8,2,5,1,4};
		
		if(numbers.length == 0)
		{
			System.out.println("Array is empty");
		}
		
		int selement = numbers[0];
		int lelement = numbers[0];
		
		for(int i = 0; i< numbers.length; i++)
		{
			if(numbers[i] < selement)
			{
				selement = numbers[i];
			}
			else if(numbers[i] > lelement)
			{
				lelement = numbers[i];
			}
		}
		
		 System.out.println("Smallest number in the array: " + selement);
	        System.out.println("Largest number in the array: " + lelement);

	}

}
