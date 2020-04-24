package ComparableEx;

import java.util.Arrays;

class Person implements Comparable {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 객체 배열의 객체들 중 나이를 기준으로 정렬
	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		return this.age - p.age; // 오름차순
		// return p.age - this.age; // 내림차순
	}

	// 객체 배열의 객체들 중 이름의 길이를 기준으로 정렬
//	@Override
//	public int compareTo(Object o) {
//		Person p = (Person) o;
//	 	return this.name.length() - p.name.length();   // 오름차순
//		return p.name.length() - this.name.length();   // 내림차순
//	}

	// 객체 배열의 객체들 중 이름을 기준으로 정렬
//	@Override
//	public int compareTo(Object o) {
//		Person p = (Person) o;
//		return this.name.compareTo(p.name); // 사전 순
//		return p.name.compareTo(this.name); // 사전 반대 순
//	}

	@Override
	public String toString() {
		return "이름 : " + name + "  나이 : " + age + "  이름길이 : " + (name.length() - 2);
	}

}

public class ComparableTest {
	public static void main(String[] args) {
		Person[] person = new Person[5];
		person[0] = new Person("choi-min-jung", 41);
		person[1] = new Person("kim-jin-soo", 32);
		person[2] = new Person("lee-mi-ra", 14);
		person[3] = new Person("park-ji-sung", 50);
		person[4] = new Person("jung-ji-won", 22);

		for (Person p : person) {
			System.out.println(p);
		}

		Arrays.sort(person);
		System.out.println();
		System.out.println("나이를 기준으로 오름차순 정렬 후");
		for (Person p : person) {
			System.out.println(p);
		}

		int index = Arrays.binarySearch(person, new Person("~~~", 22));
		System.out.println(index);
		System.out.println(person[index]);
	}
}
