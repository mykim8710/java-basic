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
		
		// �ܺο��� �ν��Ͻ������� ���� 
		aw.num++;
		
		// �ܺο��� Ŭ������ �̸����� ����
		AccessWay.num++;
		System.out.println("num = " + AccessWay.num);		
		
	}
}
