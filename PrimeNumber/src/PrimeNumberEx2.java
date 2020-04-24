import java.util.Scanner;
class PrimeNumberEx2 {
	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);

	int startNumber, endNumber;                      
	System.out.println("Input Start Number(>1)");
	startNumber = sc.nextInt();	
	System.out.println("Input End Number");
	endNumber = sc.nextInt();              			             // Ȯ���ϰ� ���� ������ ������ �Է�

	int[] primeNumbers = new int[endNumber];                     // ������ ���� ������ �ִ� 1d Array (�Ǻ��� �Ҽ����� ������� �迭)
	int count = 0;                                               // �迭�� ������(0) �� �Ǻ��� �Ҽ��� ������ ī��Ʈ�ϱ����� ����
	boolean isPrime ;                                            // ����� �Ҽ����� �ƴ��� �Ǻ��ϱ� ���� ��������

		for(int i = startNumber; i <= endNumber; i++) {          //  ������ i :�Ҽ����� �ƴ��� �Ǻ����ϴ� �����, �׷��Ƿ� i�� ���� �Է���  startNumber, endNumber���� ���ϸ鼭 �Ҽ����� �ƴ��� Ȯ���غ�
			isPrime = true;
	
			for(int j = 0 ; j < count ; j++) {                   // ������ j : �迭 primeNumbers index�� ��ȣ, primeNumbers[0], primeNumbers[1]������.. 
				if(i % primeNumbers[j] == 0) {                   // i�� �Ҽ����� �ƴ� �Ǻ��ϴ� �� 
				isPrime = false;
				break;
				}
			}

			if(isPrime) {
				System.out.println(i +" is Prime Number");
				primeNumbers[count] = i;                          // �迭 primeNumbers[�ش� ī��Ʈ]�� �ش� �Ҽ� i�� ����
				count++;				                          // i�� �Ҽ���� count++�μ� �Ҽ��� ������ ī��Ʈ �Ǹ� ���� �迭 primeNumbers�� ���� index��ȣ�� �ο��ȴ�.
			}
		}
	
	System.out.println("Number of Prime Number : " +count);	

	}
}
