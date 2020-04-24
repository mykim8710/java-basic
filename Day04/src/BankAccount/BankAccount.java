package BankAccount;

class BankAccount {			// 클래스 BankAccount -> BankAccount를 만들기 위한 설계도
	// 인수턴스 변수 : iv(instance variable) : BankAccount의 속성
	int balance = 0; 	
		
	// 인스턴스 메서드 : 인스턴트 변수를 이용: BankAccount의 기능들 -> 입금, 출금, 잔액확인등
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return amount;
	}
	
	public int checkMyBalance() {
		System.out.println("잔액 : " +balance);
		return balance;
	}
}
