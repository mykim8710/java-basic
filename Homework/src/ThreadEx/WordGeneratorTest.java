/*[13-8] 다음의 코드는 텍스트기반의 타자연습게임인데 
WordGenerator라는 쓰레드가 Vector에 2초마다 단어를 하나씩 추가하고, 사용자가 단어를 입력하면 Vector에서 일치하는 단어를 삭제하도록 되어 있다. 
WordGenerator의 run( )을 완성하시오. */

package ThreadEx;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class WordGeneratorTest {

	public static void main(String[] args) {
		WordGenerator game = new WordGenerator();
		game.start();

		while (true) {
			System.out.println(game.words);
			System.out.print(">>");

			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine().replaceAll(" ", "");

			int index = game.words.indexOf(input);

			if (index != -1) {
				game.words.remove(index);
			}
		}
	}
}

class WordGenerator extends Thread {
	Vector<String> words = new Vector<>();
	String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };

	public void run() {
		while (true) {
			Random r = new Random();
			int index = r.nextInt(data.length);
			words.add(data[index]);
			try {
				sleep(2000);
			} catch (Exception e) {
			}
		}

	}
}
