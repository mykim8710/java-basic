package BankAccount;

class BankAccount00 {
	public static void main(String[] args) {

		// ��ü���� : BankAccount ���赵�� ���� ������ ���� ����(��ü) ���� 
		BankAccount kim = new BankAccount();
		BankAccount lee = new BankAccount();

		// �޼��� ȣ�� : ����������.�ν��Ͻ��޼����(); // �Ű�����(5000, 3000 : amount)
		kim.deposit(5000);
		lee.deposit(3000);

		kim.withdraw(2000);
		lee.withdraw(2000);

		kim.checkMyBalance();
		lee.checkMyBalance();

	}
}
