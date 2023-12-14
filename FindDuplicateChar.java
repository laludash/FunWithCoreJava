package SangamOneJavaCode;

public class FindDuplicateChar {

	public static void main(String[] args) {
	
		String str = "abcc";
		int count  = 1;
		int len = str.length();
		
		char[] chars = str.toCharArray();
		String sortString  = new String(chars);
	
		for(int i =0; i<str.length(); i++)
		{
			while(i< len -1  && sortString.charAt(i) == sortString.charAt(i+1))
			{
				if(sortString.charAt(i)  ==  sortString.charAt(i+1))
				{
			   
			   // System.out.println(" duplicate chars are  in the String  " + sortString);	
				 System.out.println("Duplicate Char: "+sortString.charAt(i));
				 count++;
					i++;
			   
				}
				
				
				
			}
			
		
			
			
			//System.out.println(" Not duplicate Char ");
			 //System.out.println("duplicate char: "+sortString.charAt(i));
		}
		
	}

}
