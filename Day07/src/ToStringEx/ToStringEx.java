package ToStringEx;

class Box {
	private String conts;

	Box(String conts) {
		this.conts = conts;
	}

	public String toString() {
		return conts;
	}

}

public class ToStringEx {
  
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb);

		Box box = new Box("Camera");
		System.out.println(box.toString());
		System.out.println(box);

	}

}
