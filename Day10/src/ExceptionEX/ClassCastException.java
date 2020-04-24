package ExceptionEX;

class Board {

}

class PBoard extends Board {

}

public class ClassCastException {
	public static void main(String[] args) {
		Board b1 = new PBoard();
		PBoard b2 = (PBoard) b1;

		System.out.println("..intermediate location..");
		Board b3 = new Board();

		try {
			PBoard b4 = (PBoard) b3;
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Bye~~");

	}
}
