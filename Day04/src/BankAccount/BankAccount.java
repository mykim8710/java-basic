package BankAccount;

class BankAccount {			// Ŭ���� BankAccount -> BankAccount�� ����� ���� ���赵
	// �μ��Ͻ� ���� : iv(instance variable) : BankAccount�� �Ӽ�
	int balance = 0; 	
		
	// �ν��Ͻ� �޼��� : �ν���Ʈ ������ �̿�: BankAccount�� ��ɵ� -> �Ա�, ���, �ܾ�Ȯ�ε�
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return amount;
	}
	
	public int checkMyBalance() {
		System.out.println("�ܾ� : " +balance);
		return balance;
	}
}
