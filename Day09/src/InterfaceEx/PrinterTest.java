package InterfaceEx;

interface Printable {
	public abstract void print(String doc);
}

class Printer implements Printable {
	public void print(String doc) {
		System.out.println(doc);
	}
}

public class PrinterTest {

	public static void main(String[] args) {
		Printable prn = new Printer();
		prn.print("hello");
	}

}
