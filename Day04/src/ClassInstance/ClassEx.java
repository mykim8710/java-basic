package ClassInstance;

public class ClassEx {

	static int balance = 0;		// 클래스 변수(전역변수, grobal variable)

	public static void main(String[] args) {
		deposit(10000);			// 인스턴스 생성없이 바로 메서드 호출 
		checkBalance();
		withdraw(3000);
		checkBalance();
	}
	
	public static int deposit(int amount) {			// static 메서드, 클래스 메서드
		balance += amount ;		
		return balance;
	}
	
	public static int withdraw(int amount) {		// static 메서드, 클래스 메서드
		balance -= amount;
		return balance;
	}
	
	public static void checkBalance() {				// static 메서드, 클래스 메서드
		System.out.println("잔액 : " +balance);
	}

}
