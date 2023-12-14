package SangamOneJavaCode;

public class Q14 {
// question second largest number
	public static void main(String[] args) {

		int[] array = {6,8,2,4,3,1,5,7};
		int temp = 0; 
		
		for(int i=0; i<array.length; i++)
		{
			for(int j = i+1; j<array.length; j++)
			{
				temp = array[i];
				array[i] = array[j];
				array[j]  = temp;
 			}
		}
		
		System.out.println("Second largest element is -> " + temp);
		
		
		
	}

}
