package MethodEx;

public class MethodEx1 {
	public static void main(String[] args) {
		System.out.println("���α׷��� ����");
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("���α׷��� ��");
	}
	
	// ��� -> function = �Լ� = �޼���
	public static void hiEveryone(int age) {
		System.out.println("���� ��ħ�Դϴ�.");
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
	}

}
