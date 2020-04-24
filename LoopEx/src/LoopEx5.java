import java.util.Scanner;
class LoopEx5 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String star = "*";
	String whiteSpace = " ";
	
	System.out.println("Input N");
	int n = scanner.nextInt();

		for(int i = 1 ; i <= n ; i++) {

			for(int j = 1 ; j < i ; j++) {
				System.out.print(whiteSpace);
			}

			for(int k = n ; k >= i ; k--) {
				System.out.print(star);
			}

		System.out.println();

		}
	}
}