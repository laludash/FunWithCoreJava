package SangamOneJavaCode;

import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		
		int array[] = {3,7,4,1,8,9,10};
		Random rob = new Random();
		int temp = 0 ;
		for(int i = 0; i<array.length;i++)
		{
			int random = rob.nextInt(array.length);
			temp = array[i];
			array[i] = array[random];
			array[random] = temp;
			
			
		}
		
		
		System.out.println("ShuffleArray: " + temp);
		
		System.out.println();

	}

}
