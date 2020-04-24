package TestExample;

class Business implements Cloneable {
	private String company;
	private String work;

	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}

	public void showBusinessInfo() {
		System.out.println("회   사: " + company);
		System.out.println("업   무: " + work);
	}	

	public Business clone() throws CloneNotSupportedException {
		Business copy = (Business) super.clone();
		return copy;
	}
}

//===========================================================================

class PersonalInfo extends Business {
	String name;
	int age;	

	public PersonalInfo(String name, int age, String company, String work) {
		super(company, work);
		this.name = name;
		this.age = age;
	}

	public void showPersonalInfo() {
		System.out.println("이   름: " + name);
		System.out.println("나   이: " + age);
		super.showBusinessInfo();
	}
	
	public PersonalInfo clone() throws CloneNotSupportedException {
		PersonalInfo copy = (PersonalInfo) super.clone();
		return copy;
	}

}

//===========================================================================

public class DeepCopyTest {
	public static void main(String[] args) {
		try {
			PersonalInfo org = new PersonalInfo("James", 22, "SimpleSound", "encoding");
			PersonalInfo cpy = org.clone();

			org.showPersonalInfo();
			cpy.showPersonalInfo();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}