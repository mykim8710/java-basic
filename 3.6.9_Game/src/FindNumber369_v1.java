public class FindNumber369_v1 {

	public static int find369(int number) {
		int countNumber369 = 0; // 3,6,9가 들어간 카운팅의 초기값
		while (number > 0) { // 이 루프는 number가 0보가 크면 동작한다, 즉 number가 0이 될때 루프 종료
			int temp = number % 10; // 어떤 숫자 number의 나머지 = temp를 구함

			if (temp == 3 || temp == 6 || temp == 9) { // 만약 나머지 temp가 3 또는 6 또는 9이면
				countNumber369++; // 나머지가 3 또는 6 또는 9이므로 이 수는 3,6,9가 들어간 수가 된다.
				number = number / 10; // 다음 자리의 수 구하기
			}

			else { // 만약 나머지 temp가 3 또는 6 또는 9이 아닐때 아래문장을 수행
				number = number / 10; // 다음 자리의 수 구하기
			}

		}

		return countNumber369; // 최종적으로 숫자 number에서 3,6,9의 개수를 카운트한 count를 반환
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			int count = find369(i); // 어떤수에서 상위의 find369 메소드를 이용해서 3,6,9의 개수를 파악

			System.out.format("%d ", i);

			for (int j = 0; j < count; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}

}