/* 도시 이름, 위도, 경도 정보를 가진 Location 클래스를 작성하고, 
      도시 이름을 'key'로 하는 HashMap<String, Location> 컬렉션을 만들고, 
      사용자로부터 입력 받아 저장하라. 그리고 도시 이름으로 검색하는 프로그램을 작성하라.  
----------------------------------------
input : 도시, 경도, 위도를 ,로 구분하여 입력하세요
>>
Seoul, 37-56N, 126-58E
LA, 33-56N, 118-24W
Madrid, 40-27N, 03-33W
Geneve, 46-15N, 06-08E
Budapest, 47-26N, 19-11E
Praha, 50-01N, 14-27E
-------------------------------------------------
output1 : 전체 HashMap 출력
>>
Seoul 37-56N 126-58E
LA 33-56N 118-24W
Madrid 40-27N 03-33W
Geneve 46-15N 06-08E
BUDAPEST 47-26N 19-11E
PRAHA 50-01N 14-27E
------------------------------------------------
output2 :도시이름을 key값으로 검색기능
도시 이름 >> 피리
피리는 없습니다.
도시 이름 >> 파리
파리 2 48
도시 이름 >> 그만                           */

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
		return "도 시 : " + cityName + "\n" + "위 도 : " + latitude + "\n" + "경 도 : " + longitude;
	}

}

public class LocationTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Location> map = new HashMap<String, Location>();
		String cityInfo;

		while (true) {
			try {
				System.out.println("도시명, 위도, 경도를 입력하세요(Q:입력종료)");
				cityInfo = sc.nextLine();
				if (cityInfo.equalsIgnoreCase("q")) {
					System.out.println("입력을 종료합니다.");
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
				System.out.println("유효하지 않은 값을 입력하셨습니다. 다시 입력해주세요");
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
			System.out.print("확인 할 도시이름을 입력하세요(Q:종료) >> ");

			String name = sc.nextLine();

			if (name.equalsIgnoreCase("q")) {
				System.out.println("종료합니다.");
				break;
			} else if (map.get(name.replaceAll(" ", "").toUpperCase()) != null) {
				System.out.println();
				System.out.println(map.get(name.replaceAll(" ", "").toUpperCase()));
				System.out.println();
			} else {
				System.out.println(name + "은 목록에 없는 도시입니다.");
				System.out.println();
			}
		}
		sc.close();
	}
}
