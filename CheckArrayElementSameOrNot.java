package SangamOneJavaCode;

import java.util.Arrays;

public class CheckArrayElementSameOrNot {

	public static void CheckArrayElement(int array1[], int array2[])
	{
		int array3[];
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		for(int i =0 ; i <=5; i++ )
		{
			if(array1[i] == array2[i])
			{
				System.out.println("Contain Same Elements");
				
				System.out.println("Equal are:" +array1[i]);
			}
			
		}
	
	}

	public static void main(String[] args) {
	
		int array1[] = {3,5,2,5,9};
		int array2[] = {5,9,7,2,5};

	CheckArrayElement(array1, array2);
	
	
		
		
		

	}

}
