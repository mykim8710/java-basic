import java.util.Scanner;
class PrimeNumberEx2 {
	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);

	int startNumber, endNumber;                      
	System.out.println("Input Start Number(>1)");
	startNumber = sc.nextInt();	
	System.out.println("Input End Number");
	endNumber = sc.nextInt();              			             // 확인하고 싶은 정수의 범위를 입력

	int[] primeNumbers = new int[endNumber];                     // 정수형 값을 담을수 있는 1d Array (판별될 소수들을 담기위한 배열)
	int count = 0;                                               // 배열의 시작점(0) 및 판별된 소수의 개수를 카운트하기위한 시작
	boolean isPrime ;                                            // 어떤수가 소수인지 아닌지 판별하기 위한 논리형변수

		for(int i = startNumber; i <= endNumber; i++) {          //  정수형 i :소수인지 아닌지 판별당하는 당사자, 그러므로 i는 위에 입력한  startNumber, endNumber까지 변하면서 소수인지 아닌지 확인해봄
			isPrime = true;
	
			for(int j = 0 ; j < count ; j++) {                   // 정수형 j : 배열 primeNumbers index의 번호, primeNumbers[0], primeNumbers[1]……….. 
				if(i % primeNumbers[j] == 0) {                   // i가 소수인지 아닌 판별하는 식 
				isPrime = false;
				break;
				}
			}

			if(isPrime) {
				System.out.println(i +" is Prime Number");
				primeNumbers[count] = i;                          // 배열 primeNumbers[해당 카운트]에 해당 소수 i가 저장
				count++;				                          // i가 소수라면 count++로서 소수의 개수가 카운트 되며 또한 배열 primeNumbers의 다음 index번호가 부여된다.
			}
		}
	
	System.out.println("Number of Prime Number : " +count);	

	}
}
