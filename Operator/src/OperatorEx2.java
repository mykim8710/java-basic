import java.util.Scanner ;
public class OperatorEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;

		int score ;
		System.out.println("Input your score") ;
		score = scanner.nextInt() ;

			if(90 <= score) {
			System.out.println("Your score = " +score +" Your grade = A") ;
			}
			else if(80 <= score && score < 90) {  
			System.out.println("Your score = " +score +" Your grade = B") ;
			}
			else if(70 <= score && score < 80) {  
			System.out.println("Your score = " +score +" Your grade = C") ;
			}
			else if(50 <= score && score < 70) {  
			System.out.println("Your score = " +score +" Your grade = D") ;
			}
			else if(0 <= score) {  
			System.out.println("Your score = " +score +" Your grade = F") ;
			}
	
	}
}