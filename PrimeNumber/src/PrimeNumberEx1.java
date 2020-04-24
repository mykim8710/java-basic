import java.util.Scanner;
class PrimeNumberEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input start number(>1)");
		int startNumber = sc.nextInt();
		System.out.println("Input end number");		
		int endNumber = sc.nextInt();
		System.out.println();		

		int count = 0;
		boolean isPrime;

		for(int i = startNumber ; i <= endNumber ; i++) {
			isPrime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime == true) {
				System.out.println(i +" is Prime Number");
				count++;		
			}
		}
		
		System.out.println("Number of Prime Number = " +count);
	}
}