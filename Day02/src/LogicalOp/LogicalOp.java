package LogicalOp;

public class LogicalOp {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		boolean result = true;
		
		
		result = (1 < num1) && (num1 < 100);
		System.out.println("num1�� 1���� ũ�� 100���� ���� �����ΰ�? : " +result);
		
		result = (num2%2 == 0) || (num2%3 == 0);
		System.out.println("num2�� 2�ǹ�� �Ǵ� 3�� ����ΰ�? : " +result);
		
		result = !(num1 != 0);
		System.out.println("num1�� 0�� �´°�? : " +result);
		
	}

}
