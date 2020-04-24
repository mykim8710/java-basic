import java.util.*;
public class stringHexToIntDecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("16진수를 입력");
		String hex = scanner.next();
		hex = hex.replaceAll(" ", "");
		
		int decimal = Integer.parseInt(hex, 16);
		System.out.println("10진수 : " +decimal);	
	}
}