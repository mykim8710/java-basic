package RandomEx;

import java.util.Random;
import java.util.Scanner;
	
class RockPaperScissorsGame {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	String[] rps = { "Rock", "Paper", "Scissors" };
	int comSelect = 0;
	String temp;
	
	public String comSelect() {
		comSelect = r.nextInt(3);
		return rps[comSelect];
	}

	public String userSelect() {
		do {
			System.out.print("Select : Rock(R) | Paper(P) | Scissors(S) >> ");
			temp = sc.next();
		} while (!(temp.equalsIgnoreCase("R") || temp.equalsIgnoreCase("P") || temp.equalsIgnoreCase("S")));

		String userSelect = null;
		switch (temp.toUpperCase()) {
		case "R":
			userSelect = "Rock";
			break;
		case "P":
			userSelect = "Paper";
			break;
		case "S":
			userSelect = "Scissors";
			break;
		}
		return userSelect;
	}

	public void getResult(String user, String com) {

		if (user == "Rock" && com == "Rock") {
			System.out.println("Draw ~~");
		} else if (user == "Rock" && com == "Paper") {
			System.out.println("You lose (-.-);");
		} else if (user == "Rock" && com == "Scissors") {
			System.out.println("You Win (^.^)v");
		} else if (user == "Scissors" && com == "Scissors") {
			System.out.println("Draw ~~");
		} else if (user == "Scissors" && com == "Paper") {
			System.out.println("You Win (^.^)v");
		} else if (user == "Scissors" && com == "Rock") {
			System.out.println("You lose (-.-);");
		} else if (user == "Paper" && com == "Paper") {
			System.out.println("Draw ~~");
		} else if (user == "Paper" && com == "Rock") {
			System.out.println("You Win (^.^)v");
		} else if (user == "Paper" && com == "Scissors") {
			System.out.println("You lose (-.-);");
		}

	}
}

public class RockPaperScissorsGameTest {	
	public static void main(String[] args) {

		System.out.println("------------------------------------------");
		System.out.println("   [Let's play Rock Paper Scissors~!!]");
		System.out.println("------------------------------------------");
		System.out.println();

		RockPaperScissorsGame g1 = new RockPaperScissorsGame();

		String user = g1.userSelect();
		String com = g1.comSelect();

		System.out.println();
		System.out.println("User : " + user);
		System.out.println("Com : " + com);
		System.out.println();
		g1.getResult(user, com);

	}
}
