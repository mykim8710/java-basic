package CompAssignOp;

public class CompAssignOp {
	public static void main(String[] args) {
		short num =10 ;
		num = (short)(num + 77L);			// ����� ����ȯ
		int rate = 3;
		rate = (int)(rate * 3.5);		// ����� ����ȯ
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L;		// ����ȯ �ʿ���� : �����Ϸ��� �˾Ƽ� ����ȯ ��
		rate = 3;
		rate *= 3.5;		// ����ȯ �ʿ���� : �����Ϸ��� �˾Ƽ� ����ȯ ��
		System.out.println(num);
		System.out.println(rate);
				
	}
}
