package ArraysEx;

import java.util.Arrays;

class INum {
	private int num;

	public INum(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof INum)) {
			return false;
		} else {
			INum i = (INum) obj;
			return this.num == i.num;
		}

	}

}

public class EqualsEx {
	public static void main(String[] args) {
		INum[] arr1 = new INum[3];
		INum[] arr2 = new INum[3];

		arr1[0] = new INum(1);
		arr1[1] = new INum(2);
		arr1[2] = new INum(3);

		arr2[0] = new INum(1);
		arr2[1] = new INum(2);
		arr2[2] = new INum(3);

		System.out.println(Arrays.equals(arr1, arr2));
	}
}
