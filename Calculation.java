package FunWithProgramming;
@FunctionalInterface
interface CalculationTwo
{
	int add(int a, int b);
}



public class Calculation {

	public static void main(String[] args) {
		
		CalculationTwo c_Two = (a,b) -> a+b; // call lambda expression
		 
		int number1 = 8;
		int number2 = 7;
		
		
		int sum  = c_Two.add(number1, number2);
		System.out.println("Sum Of" + number1 + "and" + number2+ "is:" + sum); 
		
		
		
		
		
		

	}

}
