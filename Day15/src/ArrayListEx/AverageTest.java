package ArrayListEx;

import java.util.ArrayList;
import java.util.Scanner;

interface IAverage {
	void printAvg();
}

class Average implements IAverage {

	ArrayList<String> score;
	ArrayList<Double> scoreNumber;

	Scanner sc = new Scanner(System.in);

	@Override
	public void printAvg() {
		score = new ArrayList<String>();

		System.out.print("학점을 입력하세요 >> ");
		for (int i = 1; i <= 6; i++) {
			score.add(sc.next());
		}

		System.out.println("학점분포 : " + convertScore(score));

		double sum = 0.0;
		for (double d : convertScore(score)) {
			sum += d;
		}

		System.out.println("평균 : " + sum / convertScore(score).size());
		sc.close();
	}

	public ArrayList<Double> convertScore(ArrayList<String> score) {
		scoreNumber = new ArrayList<>();
		for (int i = 0; i < score.size(); i++) {
			switch (score.get(i).toUpperCase()) {
			case "A":
				scoreNumber.add(4.0);
				break;
			case "B":
				scoreNumber.add(3.0);
				break;
			case "C":
				scoreNumber.add(2.0);
				break;
			case "D":
				scoreNumber.add(1.0);
				break;
			case "F":
				scoreNumber.add(0.0);
				break;
			}
		}
		return scoreNumber;
	}

}

public class AverageTest {
	public static void main(String[] args) {
		IAverage avg = new Average();
		avg.printAvg();
	}
}
