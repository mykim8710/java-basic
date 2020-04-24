import java.util.Scanner ;
public class FlowEx4 {
	public static void main(String [] args) {
	Scanner scanner =  new Scanner(System.in) ;	
	
		for(int i = 2 ; i < 10 ; i++) {
		System.out.println(i + "grade") ;

			for(int j = 1 ; j < 10 ; j++) {
			System.out.println(i +" x " +j +" = " +(i * j)) ;
			}
		
			System.out.println() ;
		
		}

	}
}
