package InstanceofEx;

interface Printable {
	void printLine(String str);
}

class SimplePrinter implements Printable {

	@Override
	public void printLine(String str) {
		System.out.println(str);
	}

}

class MultiPrinter extends SimplePrinter {

	@Override
	public void printLine(String str) {
		super.printLine("start of MultiPrinter");
		super.printLine(str);
		super.printLine("end of MultiPrinter");
	}
}

public class PrinterTest {
	public static void main(String[] args) {
		Printable prn1 = new SimplePrinter();
		Printable prn2 = new MultiPrinter();
		
		if(prn1 instanceof Printable) {
			prn1.printLine("This is a SimplePrinter");
			System.out.println();
		}
		
		if(prn2 instanceof Printable) {
			prn2.printLine("This is a MultiPrinter");
		}
		
		
	}
}
