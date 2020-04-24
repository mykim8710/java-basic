package CostructorOverloading;

class Person {
	private int regiNum;
	private int passNum;

	Person(int regNum, int passNum) {
		this.regiNum = regNum;
		this.passNum = passNum;
	}

	Person(int regiNum) {
		this(regiNum, 0);
	}

	void showPersonalInfo() {
		System.out.println(regiNum + " " + passNum);
	}
}

public class PersonTest {

	public static void main(String[] args) {
		// regiNum, passNum �Ѵ��ִ� ����� ������ ���� �ν��Ͻ� ����
		Person kim = new Person(335577, 112233);
		kim.showPersonalInfo();
		System.out.println(kim);

		// passNum�� ���� ����� ������ ���� �ν��Ͻ� ����
		Person park = new Person(775544);
		park.showPersonalInfo();
		System.out.println(park);
	}

}
