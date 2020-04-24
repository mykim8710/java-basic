import java.util.Scanner;
public class FactorialEx2 {

	public static int factorial(int number) {
		int result = 1;
		
		for(int i = number; i > 0; i--) { 
			result =  result * i;
		}
	
		return result;
	}
		
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("n!, factorual");
		int inputN = scanner.nextInt();
		int result = factorial(inputN);
		
		System.out.println(inputN +"! = " +result);
	}

}
