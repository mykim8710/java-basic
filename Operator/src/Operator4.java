import java.util.Scanner ;
public class Operator4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;

		System.out.println("����, ����, �� ������ �غ��ô� !!!") ;
		System.out.println("����(1), ����(2), ��(3)�߿� ������") ;
		
		int user = sc.nextInt() ;
		int com = (int)(Math.random() * 3 + 1) ;

		System.out.println("����� " +user) ;
		System.out.println("��ǻ�ʹ� " +com) ;

			if(user - com == 1 || user - com == -2) {
			System.out.println("����� �̰���ϴ�!!") ;
			}
			else if(user - com == -1 || user - com == 2) {
			System.out.println("����� �����ϴ�!!") ;
			}
			else if(user == com) {
			System.out.println("�����ϴ�!!") ;
			}

	}
}
