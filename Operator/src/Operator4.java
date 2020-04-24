import java.util.Scanner ;
public class Operator4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;

		System.out.println("가위, 바위, 보 게임을 해봅시다 !!!") ;
		System.out.println("가위(1), 바위(2), 보(3)중에 고르세요") ;
		
		int user = sc.nextInt() ;
		int com = (int)(Math.random() * 3 + 1) ;

		System.out.println("당신은 " +user) ;
		System.out.println("컴퓨터는 " +com) ;

			if(user - com == 1 || user - com == -2) {
			System.out.println("당신이 이겼습니다!!") ;
			}
			else if(user - com == -1 || user - com == 2) {
			System.out.println("당신이 졌습니다!!") ;
			}
			else if(user == com) {
			System.out.println("비겼습니다!!") ;
			}

	}
}
