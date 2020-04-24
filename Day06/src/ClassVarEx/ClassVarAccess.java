package ClassVarEx;

class AccessWay {
	static int num = 0;

	AccessWay() {
		incrCnt();
	}

	void incrCnt() {
		num++;
	}

}

public class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay aw = new AccessWay();
		
		// 외부에서 인스턴스명으로 접근 
		aw.num++;
		
		// 외부에서 클래스의 이름으로 접근
		AccessWay.num++;
		System.out.println("num = " + AccessWay.num);		
		
	}
}
