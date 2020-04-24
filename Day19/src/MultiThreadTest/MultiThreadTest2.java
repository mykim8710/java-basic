package MultiThreadTest;

import javax.swing.JOptionPane;

class MyThread3 extends Thread {
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {

			}
		}
	}
}

public class MultiThreadTest2 {
	public static void main(String[] args) {
		MyThread3 thr3 = new MyThread3();
		thr3.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");

	}
}
