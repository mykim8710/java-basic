import java.util.Scanner ;
public class OperatorEx5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;

		System.out.println("주민등록번호(XXXXXX-XXXXXXX)를 입력하시오") ;
		String idNumber = scanner.next() ;
		char gender = idNumber.charAt(7);

			if(gender == '1') {
			System.out.println("당신은 남성이며, 2000년 이전 출생자입니다.") ;  
			}
			else if(gender == '2') {
			System.out.println("당신은 여성이며, 2000년 이전 출생자입니다.") ;  
			}
			else if(gender == '3') {
			System.out.println("당신은 남성이며, 2000년 이후 출생자입니다.") ;  
			}
			else if(gender == '4') {
			System.out.println("당신은 여성이며, 2000년 이후 출생자입니다.") ;  
			}

	}
}
