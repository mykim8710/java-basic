package MethodEx;

public class MethodEx2 {
	public static void main(String[] args) {
		double height = 178.5;
		hiEveryone(12, 135.5);
		hiEveryone(23, height);
		byEveryone();
	}

	// 매개변수가 2개인 메서드
	public static void hiEveryone(int age, double height) {
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("제 키는 " + height + "cm 입니다.");
	}
	
	// 매개변수가 없는 메서드
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}

}
