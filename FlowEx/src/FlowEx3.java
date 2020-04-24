import java.util.Scanner ;
public class FlowEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int countNumber ;

		System.out.println("Input Count number") ;
		countNumber = scanner.nextInt() ;

		System.out.println("Let's start countdown!!") ;

			for(int i = countNumber ; i >= 0 ; i--) {		
				System.out.println(i) ;
			}
		
		System.out.println("Game over!!") ;
		
	}
}
