package SangamOneJavaCode;

public class CheckVowel {
	
	public static void main(String[] args) {
		
		String str  = "abcde";
		String[] array  = new String[5];
		
		//String str2  = "aeiou";
	
		
		for(int i = 0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
			{
				System.out.println(ch + "- >Vowel");
			}
			else
			{
				System.out.println(ch +" ->Not Vowel");
			}
		}
		
		
		
		
		
	}

}
