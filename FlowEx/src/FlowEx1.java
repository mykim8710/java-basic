import java.util.Scanner ;
public class FlowEx1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;

		int startNumber, endNumber ;
		System.out.println("Input Start Number") ;
		startNumber = scanner.nextInt() ; 
		System.out.println("Input End Number") ;
		endNumber = scanner.nextInt() ; 

			for(int i = startNumber ; i <= endNumber ; i++) {
			
				if(i % 2 == 0) {
				System.out.println(i + " is even Number") ;
				}	
				else {
				System.out.println(i + " is odd Number") ;
				}
			
			}
		
	}
}
