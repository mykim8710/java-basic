package TestExample;

class IPTV extends ColorTV {
	private String ip;

	// 생성자정의
	public IPTV(String ip, int size, int color) {
		// superClass(ColorTV Class) 생성자 호출
		super(size, color);
		this.ip = ip;
	}

	String getIp() {
		return ip;
	}

	// method Overriding
	public void printProperty() {
		System.out.print("나의 IPTV는 " + getIp() + " 주소의 ");
		// superClass(ColorTV Class) 메서드 호출
		super.printProperty();
	}

}

public class IPTVTest {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
