import java.util.Scanner;
class LoopEx2 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String star = "*";
	int n = scanner.nextInt();
 
		for(int i = 1 ; i <= n ; i++) {				
			
			for(int j = 0 ; j < i ; j++) {
				System.out.print(star);
			}
		
			System.out.println();
		}
	}
}