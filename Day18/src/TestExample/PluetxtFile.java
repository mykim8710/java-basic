package TestExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PluetxtFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int itr = 0;
		ArrayList<String> arr = new ArrayList<String>();

		System.out.print("합칠 텍스트 파일의 개수를 입력하세요 >> ");
		int plusCount = sc.nextInt();
		sc.nextLine();

		int temp = plusCount;
		while (itr < plusCount) {
			System.out.print("파일명 입력 >> ");
			String fileName = sc.nextLine();

			try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
				String str;
				while (true) {
					str = br.readLine();
					if (str == null) {
						break;
					}
					arr.add(str);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println(fileName + " 파일이 입력되었습니다. 남은 입력횟수 : " + (temp - 1));
			
			itr++;
			temp--;
		}

		System.out.println();
		System.out.print("합친 파일명 입력 >> ");
		String plusFileName = sc.nextLine();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(plusFileName))) {
			for (String s : arr) {
				bw.write(s, 0, s.length());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(plusFileName + "이 완성되었습니다.");

	}
}
