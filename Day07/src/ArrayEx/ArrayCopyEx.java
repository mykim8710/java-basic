package ArrayEx;

import java.util.Arrays;

public class ArrayCopyEx {
	public static void main(String[] args) {
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];

		// 배열 ar1을 7로 초기화
		Arrays.fill(ar1, 7);
		// 배열 ar1을 ar2로 부분 복사
		// System.arraycopy(원본배열, 원본배열에서 복사할 값의 index, 복사본배열, 복사한 값을 어디부터에 복사할지 지정하는
		// index, 복사할 길이)
		System.arraycopy(ar1, 0, ar2, 3, 4);

		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar2[i] + " ");
		}

	}
}
