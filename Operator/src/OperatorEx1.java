import java.util.Scanner ;
public class OperatorEx1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;

		int inputA, inputB, inputC ;
		double deterMinant, root, x1, x2 ;

		System.out.println("Quadratic equation") ;
		System.out.println("0 = Ax^2 + Bx + C") ;

		System.out.println("Input A") ;
		inputA = scanner.nextInt() ;
		System.out.println("Input B") ;
		inputB = scanner.nextInt() ;
		System.out.println("Input C") ;
		inputC = scanner.nextInt() ;

		deterMinant = inputB * inputB - 4 * inputA * inputC ;
		root = Math.sqrt(deterMinant) ;

			if(deterMinant > 0) {
			x1 = (-inputB + root) / (2 * inputA) ;
			x2 = (-inputB - root) / (2 * inputA) ;
			System.out.println("real root, x = " +x1 +" or" +x2) ;
			}

			else if(deterMinant == 0) {
			x1 = (-inputB + root) / (2 * inputA) ;
			System.out.println("muliple root, x = " +x1) ;
			}
			
			else if(deterMinant < 0) {
			System.out.println("imaginary root, x = nothing") ;
			}
		
	}
}
