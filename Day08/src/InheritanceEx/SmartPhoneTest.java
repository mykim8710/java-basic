package InheritanceEx;

class MobilePhone {
	protected String number;

	public MobilePhone(String number) {
		this.number = number;
	}

	public void answer() {
		System.out.println("Hi~ from " + number);
	}

}

class SmartPhone extends MobilePhone {
	private String androidVer;

	public SmartPhone(String number, String androidVer) {
		super(number);
		this.androidVer = androidVer;
	}

	public void playApp() {
		System.out.println("App is running in : " + androidVer);
	}

}

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-7112-9109", "Android 10");
		phone.answer();
		phone.playApp();
		System.out.println();
		
		// UpCasting, Polymorphism(´ÙÇü¼º)
		MobilePhone phone2 = new SmartPhone("010-1234-1234", "Android 9");
		phone2.answer();
		// DownCasting
		SmartPhone phone3 = (SmartPhone) phone2; 
		phone3.playApp();

	}

}
