package SangamOneJavaCode;

public class Q19 {

	public static void main(String[] args) {
	
		String str1 = "hello";
		String str2 = "lohel";

		if(str1.isEmpty() || str2.isEmpty() || str1.length() != str2.length())
		{
			System.out.println("String are not rotations of each other");
		}
		
		String strvalue = str1 + str1;
		if(strvalue.contains(str2))
		{
			System.out.println("Strings are rotations of each other ");
		}
		else 
		{
			System.out.println("String are not rotations ");
		}
		
		

	}

}
