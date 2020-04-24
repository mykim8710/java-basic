import java.util.Scanner;
public class FactorialEx3 {

	public static int factorial(int number) {
		if(number == 1)
			return 1;		
		else
			return number * factorial(number-1);
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("n! factorial");
		int inputN = scanner.nextInt();
		int result =  factorial(inputN);
		
		System.out.println(inputN +"! = " +result);
	}

}
