package MethodEx;

public class MethodEx2 {
	public static void main(String[] args) {
		double height = 178.5;
		hiEveryone(12, 135.5);
		hiEveryone(23, height);
		byEveryone();
	}

	// �Ű������� 2���� �޼���
	public static void hiEveryone(int age, double height) {
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("�� Ű�� " + height + "cm �Դϴ�.");
	}
	
	// �Ű������� ���� �޼���
	public static void byEveryone() {
		System.out.println("������ �˰ڽ��ϴ�.");
	}

}
