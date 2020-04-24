package TestExample;

class TV {
	private int size;

	// ����������
	public TV(int size) {
		this.size = size;
	}

	int getSize() {
		return size;
	}

}

class ColorTV extends TV {
	private int color;

	// ����������
	public ColorTV(int size, int color) {
		// superClass(TV Class) ������ ȣ��
		super(size);
		this.color = color;
	}

	int getColor() {
		return color;
	}

	public void printProperty() {
		System.out.println(super.getSize() + "��ġ " + getColor() + "�÷�");
	}

}

public class TvTest {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

}
