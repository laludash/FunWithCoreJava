package SangamOneJavaCode;

public class StringContainDigit {

	public static void main(String[] args) {
	
		String str  = "abcd";
		String str2 = "1233456";

		if(str.matches("[0-9]+"))
		{
			 System.out.println("Str contains only digits.");
		}
		else
		{
			 System.out.println("Str does not contain only digits.");
		}
		if(str2.matches("[0-9]+"))
		{
			 System.out.println("Str2 contains only digits.");
		}
		else
		{
			 System.out.println("Str2 does not contain only digits.");
		}
		
	}

}
