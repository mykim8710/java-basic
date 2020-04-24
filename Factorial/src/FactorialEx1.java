import java.util.Scanner;
public class FactorialEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("n! factorial");
		int inputA = scanner.nextInt();
		int factorial = 1;
		
		for(int i = inputA ; i > 0; i--) {
			
			factorial = factorial * i;
		}
		
		System.out.println(inputA +"! = " +factorial);
		
	}
}
