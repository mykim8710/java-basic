public class FibonacciEx1 {

	public static void main(String[] args) {
		int f0 = 0;
		int f1 = 1;
		int f2;
		
		System.out.println("f(n+2) = f(n+1) + f(n)");
		System.out.println("f(0) : " + f0);
		System.out.println("f(1) : " + f1);
		
			for(int i = 2 ; i <= 10 ; i++) {
				f2 = f0 + f1;
				System.out.println("f(" +i +") : " + f2);
				f0 = f1;
				f1 = f2;
			}
	}
}

