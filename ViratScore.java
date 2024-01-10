package javastream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ViratScore {

	public static void main(String[] args) {
		
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(18);
		li1.add(15);
		li1.add(74);
		li1.add(88);
		li1.add(79);
		li1.add(19);
		li1.add(20);
		li1.add(29);
		li1.add(126);
		li1.add(12);
		li1.add(22);
		li1.add(28);
		List<Integer> list1 = li1.stream().filter(num -> num >= 100).collect(Collectors.toList());
		List<Integer> list2  = li1.stream().filter(num -> num >=50 && num < 100).collect(Collectors.toList());
		System.out.println("100s: "+list1);
		System.out.println("50s: "+list2);
		
		
		
		
		
		
		
		
	}

}
