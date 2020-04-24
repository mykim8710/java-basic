package Test;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class WordGeneratorTest {
	public static void main(String[] args) {
		WordGenerator game = new WordGenerator();
		game.start();

		while (true) {
			System.out.println(game.getWords());
			System.out.print(">> ");

			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine().replaceAll(" ", "");

			int index = game.getWords().indexOf(input);

			if (index != -1) {
				game.getWords().remove(index);
			}
		}
	}
}

class WordGenerator extends Thread {
	private Vector<String> words = new Vector<>();
	private String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };

	public Vector<String> getWords() {
		return words;
	}

	public void setWords(Vector<String> words) {
		this.words = words;
	}

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

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