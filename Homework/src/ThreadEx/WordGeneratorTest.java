/*[13-8] ������ �ڵ�� �ؽ�Ʈ����� Ÿ�ڿ��������ε� 
WordGenerator��� �����尡 Vector�� 2�ʸ��� �ܾ �ϳ��� �߰��ϰ�, ����ڰ� �ܾ �Է��ϸ� Vector���� ��ġ�ϴ� �ܾ �����ϵ��� �Ǿ� �ִ�. 
WordGenerator�� run( )�� �ϼ��Ͻÿ�. */

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
	String[] data = { "�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī" };

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
