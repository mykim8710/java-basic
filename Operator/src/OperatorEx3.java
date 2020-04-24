import java.util.Scanner ;
public class OperatorEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int age ;	
		String gender ;

		System.out.println("Input your Age") ;
		age = scanner.nextInt();
		System.out.println("Input your Gender(M or F)") ;
		gender = scanner.next();		

			if(age > 0 && age < 10) {
				if(gender.equalsIgnoreCase("M")) {
				System.out.println("Your age : Infants" +" / Your gender : Male") ;
				}
				else if(gender.equalsIgnoreCase("F")) {
				System.out.println("Your age : Infants" +" / Your gender : Female") ;
				}
			}
			
			else if(age >= 10 && age < 20) {
				if(gender.equalsIgnoreCase("M")) {
				System.out.println("Your age : in 10s" +" / Your gender : Male") ;
				}
				else if(gender.equalsIgnoreCase("F")) {
				System.out.println("Your age : in 10s" +" / Your gender : Female") ;
				}		
			}
			
			else if(age >= 20 && age < 30) {
				if(gender.equalsIgnoreCase("M")) {
				System.out.println("Your age : in 20s" +" / Your gender : Male") ;
				}
				else if(gender.equalsIgnoreCase("F")) {
				System.out.println("Your age : in 20s" +" / Your gender : Female") ;
				}		
			}
			
			else if(age >= 30 && age < 40) {
				if(gender.equalsIgnoreCase("M")) {
				System.out.println("Your age : in 30s" +" / Your gender : Male") ;
				}
				else if(gender.equalsIgnoreCase("F")) {
				System.out.println("Your age : in 30s" +" / Your gender : Female") ;
				}		
			}
			
			else if(age >= 40 && age < 50) {
				if(gender.equalsIgnoreCase("M")) {
				System.out.println("Your age : in 40s" +" / Your gender : Male") ;
				}
				else if(gender.equalsIgnoreCase("F")) {
				System.out.println("Your age : in 40s" +" / Your gender : Female") ;
				}		
			}
			
			else if(age >= 50 && age < 60) {
				if(gender.equalsIgnoreCase("M")) {
				System.out.println("Your age : in 50s" +" / Your gender : Male") ;
				}
				else if(gender.equalsIgnoreCase("F")) {
				System.out.println("Your age : in 50s" +" / Your gender : Female") ;
				}		
			}
			
			else if(age >= 60 && age < 70) {
				if(gender.equalsIgnoreCase("M")) {
				System.out.println("Your age : in 60s" +" / Your gender : Male") ;
				}
				else if(gender.equalsIgnoreCase("F")) {
				System.out.println("Your age : in 60s" +" / Your gender : Female") ;
				}		
			}
			
			else if(age >= 70) {
				if(gender.equalsIgnoreCase("M")) {
				System.out.println("Your age : more than 70s" +" / Your gender : Male") ;
				}
				else if(gender.equalsIgnoreCase("F")) {
				System.out.println("Your age : more than 70s" +" / Your gender : Female") ;
				}
			}
	}
}
