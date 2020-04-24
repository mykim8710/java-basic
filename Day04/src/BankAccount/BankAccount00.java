package BankAccount;

class BankAccount00 {
	public static void main(String[] args) {

		// 객체생성 : BankAccount 설계도를 통해 개별의 각각 예금(객체) 생성 
		BankAccount kim = new BankAccount();
		BankAccount lee = new BankAccount();

		// 메서드 호출 : 참조변수명.인스턴스메서드명(); // 매개변수(5000, 3000 : amount)
		kim.deposit(5000);
		lee.deposit(3000);

		kim.withdraw(2000);
		lee.withdraw(2000);

		kim.checkMyBalance();
		lee.checkMyBalance();

	}
}
