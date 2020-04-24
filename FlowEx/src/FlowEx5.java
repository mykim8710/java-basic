import java.util.Scanner ;
public class FlowEx5 {
	public static void main(String [] args) {
	Scanner scanner =  new Scanner(System.in) ;	
	
	int grade ;

	grade = scanner.nextInt() ;
	System.out.println(grade +"grade") ;
	System.out.println() ;
		
		for(int i = 1 ; i < 10 ; i++) {
		System.out.println(grade +" x " +i +" = " +(grade * i)) ;
		}

	}
}
