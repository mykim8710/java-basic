import java.util.Scanner ;
public class OperatorEx5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;

		System.out.println("�ֹε�Ϲ�ȣ(XXXXXX-XXXXXXX)�� �Է��Ͻÿ�") ;
		String idNumber = scanner.next() ;
		char gender = idNumber.charAt(7);

			if(gender == '1') {
			System.out.println("����� �����̸�, 2000�� ���� ������Դϴ�.") ;  
			}
			else if(gender == '2') {
			System.out.println("����� �����̸�, 2000�� ���� ������Դϴ�.") ;  
			}
			else if(gender == '3') {
			System.out.println("����� �����̸�, 2000�� ���� ������Դϴ�.") ;  
			}
			else if(gender == '4') {
			System.out.println("����� �����̸�, 2000�� ���� ������Դϴ�.") ;  
			}

	}
}
