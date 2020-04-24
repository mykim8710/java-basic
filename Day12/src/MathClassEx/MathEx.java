package MathClassEx;

public class MathEx {
	public static void main(String[] args) {
		System.out.println("pie " + Math.PI);
		System.out.println("root 2 " + Math.sqrt(2));
		System.out.println();
		System.out.println("degree of pie : " + Math.toDegrees(Math.PI));
		System.out.println("degree of double pie : " + Math.toDegrees(Math.PI * 2));
		System.out.println();

		double radian45 = Math.toRadians(45);
		System.out.println("sin 45' : " + Math.sin(radian45));
		System.out.println("cos 45' : " + Math.cos(radian45));
		System.out.println("tan 45' : " + Math.tan(radian45));
		System.out.println();
		System.out.println("log 25 : " + Math.log(25));
		System.out.println("2 ^ 16 : " + Math.pow(2, 16));

	}
}
