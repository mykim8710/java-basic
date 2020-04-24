/* 사용자로부터 두 개의 파일 이름을 입력받고 두 파일의 내용을 비교하여 
 * 같으면 "파일이 같습니다." 다르면 "파일이 서로 다릅니다." 를
 * 출력하는 프로그램을 작성하라
 * 비교대상인 파일은 아스키, 바이너리 파일 모두를 포함      */

package TestExample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class CompareFile {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		boolean isEqual = true;

		// 아스키, 바이너리 파일 모두를 대상으로 하기위해 InputStream을 사용(아스키파일(문자열)인 경우 Reader / Writer 사용)
		try (BufferedInputStream in1 = new BufferedInputStream(new FileInputStream("Eclipse Jee 2019-09"));
				BufferedInputStream in2 = new BufferedInputStream(new FileInputStream("Eclipse Jee 2019-09 - 복사본"))) {

			int data1, data2;
			
			// int available()메서드 : 현재 읽을 수 있는 바이트 수를 얻는다
			if (in1.available() != in2.available()) {	
				isEqual = false;
				System.out.println("파일 사이즈가 다릅니다.");
				System.out.println();
			} else {
				// 두 파일의 사이즈가 같다면
				isEqual = true;

				while (true) {
					data1 = in1.read();
					data2 = in2.read();

					if (data1 == -1 && data2 == -1) {
						break;
					}

					if (data1 != data2) {
						isEqual = false;
					}
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		if (isEqual == false) {
			System.out.println("두 파일은 다릅니다.");
		} else {
			System.out.println("두 파일이 같습니다.");
		}

		long endTime = System.currentTimeMillis();
		System.out.println("실행시간 : " + (endTime - startTime) / 1000.0 + "초");

	}
}
