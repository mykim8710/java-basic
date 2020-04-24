package LogicalOp;

public class LogicalOp {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		boolean result = true;
		
		
		result = (1 < num1) && (num1 < 100);
		System.out.println("num1은 1보다 크고 100보다 작은 정수인가? : " +result);
		
		result = (num2%2 == 0) || (num2%3 == 0);
		System.out.println("num2는 2의배수 또는 3의 배수인가? : " +result);
		
		result = !(num1 != 0);
		System.out.println("num1은 0이 맞는가? : " +result);
		
	}

}
