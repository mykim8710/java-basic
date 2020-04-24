package TestExample;

class TV {
	private int size;

	// 생성자정의
	public TV(int size) {
		this.size = size;
	}

	int getSize() {
		return size;
	}

}

class ColorTV extends TV {
	private int color;

	// 생성자정의
	public ColorTV(int size, int color) {
		// superClass(TV Class) 생성자 호출
		super(size);
		this.color = color;
	}

	int getColor() {
		return color;
	}

	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + getColor() + "컬러");
	}

}

public class TvTest {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

}
