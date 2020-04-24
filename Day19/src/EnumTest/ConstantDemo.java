package EnumTest;

enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");

	private String color;

	public String getColor() {
		return this.color;
	}

	Fruit(String color) {
		this.color = color;
	}
}

enum Company {
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo {

	public static void main(String[] args) {
		for (Fruit f : Fruit.values()) {
			System.out.print(f + " ");
			System.out.print(f.getColor());
			System.out.println();
		}

	}
}
