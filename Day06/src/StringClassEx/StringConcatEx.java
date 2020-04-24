package StringClassEx;

public class StringConcatEx {
	public static void main(String[] args) {
		String str1 = "Milk";
		String str2 = "Coffee";
		String str3 = str1.concat(str2);
		String str4 = "Fresh".concat(str3);

		System.out.println(str3);
		System.out.println(str4);
		String str5 = "Fresh " + "Milk " + "Coffee";
		System.out.println(str5);

		String str = "0123456789";
		System.out.println(str.substring(2, 4));

		String a = "A";
		String b = "b";
		int abc = a.compareTo(b);
		System.out.println(abc);

		double e = 2.546165156;
		String ert = String.valueOf(e);
		System.out.println(ert);
		
		System.out.println(""+true);
		
		
	}
}
