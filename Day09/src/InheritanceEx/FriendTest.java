package InheritanceEx;

class Friend {
	protected String name;
	protected String phone;

	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public void showInfo() {
		
		System.out.println("이     름 : " + name);
		System.out.println("전화번호 : " + phone);
	}

}

class CompFriend extends Friend {
	private String department;

	public CompFriend(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("부     서 : " + department);
	}

}

class UnivFriend extends Friend {
	private String major;

	public UnivFriend(String name, String phone, String major) {
		super(name, phone);
		this.major = major;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("전     공 : " + major);
	}

}

public class FriendTest {

	public static void main(String[] args) {
		Friend[] friend = new Friend[10];

		int number = 0;

		friend[number++] = new UnivFriend("Tom", "010-1234-4567", "Computer");
		friend[number++] = new UnivFriend("James", "010-5678-1234", "History");
		friend[number++] = new CompFriend("Jeff", "010-9874-1541", "R&D 1");
		friend[number++] = new CompFriend("Kim", "010-5168-5162", "Sales");

		for (int i = 0; i < number; i++) {
			friend[i].showInfo();
			System.out.println();
		}

	}

}
