package TestExample;

class Person {
	private String name;
	private String idNumber;

	public Person(String name, String idNumber) {
		this.name = name;
		this.idNumber = idNumber;
	}

// Override가 아니라 그냥 아래의 기능을 하는 equals() 메서드 정의
//	public boolean equals(Person p) {
//		if (this.name == p.name && this.id == p.id) {
//			return true;
//		} else {
//			return false;
//		}
//	}

	@Override
	public boolean equals(Object obj) {
		// casting
		Person p = (Person) obj;
		if (this.name.equals(p.name) && this.idNumber.equals(p.idNumber)) {
			return true;
		} else {
			return false;
		}
	}

}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", "800123-1234567");
		Person p2 = new Person("홍길동", "800123-1234567");
		Person p3 = new Person("김철수", "901111-1520365");
		Person p4 = new Person("박영희", "851017-2105478");

//		System.out.println(p1.equals(p2));
//		System.out.println(p1.equals(p3));
//		System.out.println(p1.equals(p4));

//		System.out.println(p1 == p2);
//		System.out.println(p1.equals(p2));

//		String str1 = new String("123");
//		String str2 = new String("123");
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));

	}

}
