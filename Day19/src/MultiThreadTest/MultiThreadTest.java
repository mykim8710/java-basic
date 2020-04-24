package MultiThreadTest;

class MyThread1 extends Thread {
	@Override
	public void run() {	// 쓰레드의 메인
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("|");
		}
	}
}

public class MultiThreadTest {
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		MyThread2 thread2 = new MyThread2();

		thread1.start();	// 쓰레드는 프로그램안에 또 다른 프로그램으로 start()메서드를 통해 쓰레드를 실행하도록 요청
		thread2.start();	// run()메서드로 하면 메서드의 호출이지 쓰레드의 생성이 아님
		// - | 가 무작위로 나옴 : 

	}
}
