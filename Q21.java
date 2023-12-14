package SangamOneJavaCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q21 {

	public static void main(String[] args) {
		
		int[] nums = {1,3,4,2,2,3};
		
		Set<Integer> set = new HashSet<Integer>();
		
		Set<Integer> duplicate  = new HashSet<Integer>();
		
		for(int num : nums)
		{
			if(!set.add(num))
			{
				duplicate.add(num);
			}
		}
		
		System.out.println("duplicate Number: "+duplicate);
		
	}

}
