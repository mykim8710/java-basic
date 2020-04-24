/* ���� �̸�, ����, �浵 ������ ���� Location Ŭ������ �ۼ��ϰ�, 
      ���� �̸��� 'key'�� �ϴ� HashMap<String, Location> �÷����� �����, 
      ����ڷκ��� �Է� �޾� �����϶�. �׸��� ���� �̸����� �˻��ϴ� ���α׷��� �ۼ��϶�.  
----------------------------------------
input : ����, �浵, ������ ,�� �����Ͽ� �Է��ϼ���
>>
Seoul, 37-56N, 126-58E
LA, 33-56N, 118-24W
Madrid, 40-27N, 03-33W
Geneve, 46-15N, 06-08E
Budapest, 47-26N, 19-11E
Praha, 50-01N, 14-27E
-------------------------------------------------
output1 : ��ü HashMap ���
>>
Seoul 37-56N 126-58E
LA 33-56N 118-24W
Madrid 40-27N 03-33W
Geneve 46-15N 06-08E
BUDAPEST 47-26N 19-11E
PRAHA 50-01N 14-27E
------------------------------------------------
output2 :�����̸��� key������ �˻����
���� �̸� >> �Ǹ�
�Ǹ��� �����ϴ�.
���� �̸� >> �ĸ�
�ĸ� 2 48
���� �̸� >> �׸�                           */

package HashMapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
	private String cityName;
	private String latitude;
	private String longitude;

	public Location(String cityName, String latitude, String longitude) {
		this.cityName = cityName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "�� �� : " + cityName + "\n" + "�� �� : " + latitude + "\n" + "�� �� : " + longitude;
	}

}

public class LocationTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Location> map = new HashMap<String, Location>();
		String cityInfo;

		while (true) {
			try {
				System.out.println("���ø�, ����, �浵�� �Է��ϼ���(Q:�Է�����)");
				cityInfo = sc.nextLine();
				if (cityInfo.equalsIgnoreCase("q")) {
					System.out.println("�Է��� �����մϴ�.");
					System.out.println();
					break;
				} else {
					StringTokenizer st = new StringTokenizer(cityInfo, ",");
					String cityName = st.nextToken().replaceAll(" ", "");
					String latitude = st.nextToken().replaceAll(" ", "");
					String longitude = st.nextToken().replaceAll(" ", "");
					map.put(cityName.toUpperCase(), new Location(cityName, latitude, longitude));
					System.out.println();
				}
			} catch (NoSuchElementException e) {
				System.out.println("��ȿ���� ���� ���� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				System.out.println();
				sc = new Scanner(System.in);
			}
		}

		System.out.println("---------------");
		System.out.println("     List");
		System.out.println("---------------");
		Set<String> ks = map.keySet();
		for (String s : ks) {
			System.out.println(map.get(s));
			System.out.println("---------------");
		}

		System.out.println();
		while (true) {
			System.out.print("Ȯ�� �� �����̸��� �Է��ϼ���(Q:����) >> ");

			String name = sc.nextLine();

			if (name.equalsIgnoreCase("q")) {
				System.out.println("�����մϴ�.");
				break;
			} else if (map.get(name.replaceAll(" ", "").toUpperCase()) != null) {
				System.out.println();
				System.out.println(map.get(name.replaceAll(" ", "").toUpperCase()));
				System.out.println();
			} else {
				System.out.println(name + "�� ��Ͽ� ���� �����Դϴ�.");
				System.out.println();
			}
		}
		sc.close();
	}
}
