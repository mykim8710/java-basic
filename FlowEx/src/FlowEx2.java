import java.util.Scanner ;
public class FlowEx2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in) ;

	int startNumber, endNumber ;
	System.out.println("Input Start Number") ;
	startNumber = scanner.nextInt() ;
	System.out.println("Input End Number") ;
	endNumber = scanner.nextInt() ;

		for(int i = startNumber ; i <= endNumber ; i++) {
			String even = " is even Number" ;
			String odd = " is odd Number" ;
			String result = (i%2==0) ? even : odd ;
			System.out.println(+i +result) ;
		}
	}
}
