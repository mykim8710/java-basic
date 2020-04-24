public class StringToInt {
	
	public static Integer parseInt(String str) throws Exception {
		if (str == null)
		throw new NullPointerException();
	        
		str.trim();
		if(str.isEmpty())
		throw new NumberFormatException("Invalid number format");
	        
		int number = 0;      
		for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
			
			if (!Character.isDigit(ch)) {
			throw new NumberFormatException("Invalid number format");
			} 
	            
			else {
			number = number * 10 + (ch - '0');
		    }
		}
	        
		return number;
	}
	
	
	public static void main(String[] args) throws Exception {
		int a = parseInt("11");
		System.out.println(a);
	}

}
