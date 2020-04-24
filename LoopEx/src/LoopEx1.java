import java.util.Scanner;
class LoopEx1 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String star = "*";
	System.out.println("horizontal");	
	int horizontal = scanner.nextInt();
	System.out.println("vertical");	
	int vertical = scanner.nextInt();
 
		for(int i = 1 ; i <= vertical ; i++) {				
			
			for(int j = 1 ; j <= horizontal ; j++) {
				System.out.print(star);
			}
		
			System.out.println();
		}
	}
}
