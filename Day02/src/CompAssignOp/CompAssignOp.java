package CompAssignOp;

public class CompAssignOp {
	public static void main(String[] args) {
		short num =10 ;
		num = (short)(num + 77L);			// 명시적 형변환
		int rate = 3;
		rate = (int)(rate * 3.5);		// 명시적 형변환
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L;		// 형변환 필요없음 : 컴파일러가 알아서 형변환 함
		rate = 3;
		rate *= 3.5;		// 형변환 필요없음 : 컴파일러가 알아서 형변환 함
		System.out.println(num);
		System.out.println(rate);
				
	}
}
