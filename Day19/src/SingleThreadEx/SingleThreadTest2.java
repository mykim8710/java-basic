package SingleThreadEx;

import javax.swing.JOptionPane;

public class SingleThreadTest2 {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + str + "입니다.");

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}
}
