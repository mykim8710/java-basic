public class FindNumber369_v2 {

	public static int find369(String result) { // 문자열타입으로 입력된 수에서 3,6,9의 개수파악
		int count = 0; // 3,6,9 카운팅의 초기값

		for (int j = 0; j < result.length(); j++) { // 문자열 index 0부터 문자열 길이까지 루프를 돌림
			char ch = result.charAt(j); // 문자열을 문자하나마다 나누기(0 <= string index < strinf.length)

			if (ch == '3' || ch == '6' || ch == '9') { // 문자열 내 문자 중 3,6,9가 포함되어 있다면
				count++; // 카운팅
			}
		}

		return count; // 최종적으로 문자열에 포함된 3,6,9의 개수를 카운트한 count를 반환
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			String str = Integer.toString(i); // 정수형을 문자열로 변환
			int count = find369(str); // find369 메소드를 이용하여 문자열에 포함된 3,6,9의 개수를 파악

			System.out.format("%d ", i);

			for (int j = 0; j < count; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}

}
