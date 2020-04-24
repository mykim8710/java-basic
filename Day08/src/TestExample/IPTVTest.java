package TestExample;

class IPTV extends ColorTV {
	private String ip;

	// ����������
	public IPTV(String ip, int size, int color) {
		// superClass(ColorTV Class) ������ ȣ��
		super(size, color);
		this.ip = ip;
	}

	String getIp() {
		return ip;
	}

	// method Overriding
	public void printProperty() {
		System.out.print("���� IPTV�� " + getIp() + " �ּ��� ");
		// superClass(ColorTV Class) �޼��� ȣ��
		super.printProperty();
	}

}

public class IPTVTest {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
