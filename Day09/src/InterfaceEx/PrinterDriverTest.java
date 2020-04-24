package InterfaceEx;

interface Printable2 {
	public abstract void print(String doc);
	default void printCMYK(String doc) {
		System.out.println("Color ver");
		System.out.println(doc);
	}
}

//class Prn909Drv implements Printable2 {
//
//	@Override
//	public void print(String doc) {
//		System.out.println("Black & White ver");
//		System.out.println(doc);
//	}
//
//	@Override
//	public void printCMYK(String doc) {
//
//	}
//
//}

class SSPrinterDriver implements Printable2 {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung Printer");
		System.out.println(doc);
	}
}

class LGPrinterDriver implements Printable2 {
	@Override
	public void print(String doc) {
		System.out.println("From LG Printer");
		System.out.println(doc);
	}
}

public class PrinterDriverTest {
	public static void main(String[] args) {
		String doc = "This is a report about history";

		Printable2 p = new SSPrinterDriver();
		p.print(doc);
		p.printCMYK(doc);
		System.out.println();

		p = new LGPrinterDriver();
		p.print(doc);
		p.printCMYK(doc);
		System.out.println();

//		Prn909Drv p2 = new Prn909Drv();
//		p2.print(doc);
//		p2.printCMYK(doc);

	}

}
