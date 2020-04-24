package TestExample;

import java.util.Scanner;

class Buyer {
	int money;
	int moneySummmary;

	Product[] cart = new Product[1];
	int cartSize = 0;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ׺���!! " + p.toString() + "�� ������ �� �����ϴ�.");
			return;
		} else {
			money -= p.price;
			add(p);
		}

	}

	void add(Product p) {
		cart[cartSize++] = p;

		if (cart.length <= cartSize) {
			Product[] newCart = new Product[cart.length * 2];
// 			�迭���� 1
			System.arraycopy(cart, 0, newCart, 0, cart.length);

// 			�迭���� 2
//			for (int i = 0; i < cart.length; i++) {
//				newCart[i] = cart[i];
//			}
			cart = newCart;
		}

	}

	void summaryBuy() {
		System.out.println();
		System.out.println("���� �����ݾ� >> " + moneySummmary);
		System.out.println();
		System.out.println("No |     ���Ÿ��        |    ���ݾ�      |   �ܾ�     ");
		System.out.println("------------------------------------------");

		int amount = 0;
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				break;
			} else {
				moneySummmary -= cart[i].price;
				amount += cart[i].price;
				System.out.printf("%s      %8s\t     %8s \t   %5s%n", i + 1, cart[i].toString(), cart[i].price, moneySummmary);
			}

		}
		System.out.println("----------------------------------------");
		System.out.println();
		System.out.println("���ݾ�  >> " + amount);
		System.out.println("��     ��  >> " + moneySummmary);

	}

}

public class BuyerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Buyer b = new Buyer();

		System.out.println("���� ������ �ݾ��� �Է��ϼ���");
		b.money = sc.nextInt();
		b.moneySummmary = b.money;
		
		b.buy(new TV());
		b.buy(new NoteBook());
		b.buy(new Radio());
		b.buy(new Table());
		b.buy(new Desk());

		b.summaryBuy();

	}
}
