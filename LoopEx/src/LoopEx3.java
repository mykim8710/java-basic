import java.util.Scanner;
class LoopEx3 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String star = "*";
	System.out.println("Input N");
	int n = scanner.nextInt();

		for(int i = 1 ; i <= n ; i++) {
		
			for(int j = n ; j >= i ; j--) {
			System.out.print(star) ;
			}
		
		System.out.println();
		}
	}
}