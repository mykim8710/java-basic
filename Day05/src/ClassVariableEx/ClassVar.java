package ClassVariableEx;

class InstCnt {
	int instNum =0;
	
	InstCnt() {
		instNum++;
		System.out.println("°´Ã¼»ý¼º : " +instNum);
	}
}

public class ClassVar {
	public static void main(String[] args) {
		InstCnt cnt1 =  new InstCnt();
		InstCnt cnt2 =  new InstCnt();
		InstCnt cnt3 =  new InstCnt();
	}
}
