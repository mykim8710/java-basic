package ClassInstance;

public class ClassEx {

	static int balance = 0;		// Ŭ���� ����(��������, grobal variable)

	public static void main(String[] args) {
		deposit(10000);			// �ν��Ͻ� �������� �ٷ� �޼��� ȣ�� 
		checkBalance();
		withdraw(3000);
		checkBalance();
	}
	
	public static int deposit(int amount) {			// static �޼���, Ŭ���� �޼���
		balance += amount ;		
		return balance;
	}
	
	public static int withdraw(int amount) {		// static �޼���, Ŭ���� �޼���
		balance -= amount;
		return balance;
	}
	
	public static void checkBalance() {				// static �޼���, Ŭ���� �޼���
		System.out.println("�ܾ� : " +balance);
	}

}
