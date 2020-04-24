import java.util.Scanner;
class LoopEx4 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String star = "*";
	String whiteSpace = " ";

	System.out.println("Input N");
	int n = scanner.nextInt();


		for(int i = 1; i <= n ; i++) {

			for(int j = n-1 ; j >= i ; j--) {
				System.out.print(whiteSpace);
			}
			
			for(int k = 1 ; k <= i ; k++) {
				System.out.print(star);
			}

		System.out.println();
		}
	}
}