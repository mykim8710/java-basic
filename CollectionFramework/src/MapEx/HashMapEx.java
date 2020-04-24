package MapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static Map<String, HashMap<String, String>> phoneBook = new HashMap<>();

	public static void addGroup(String groupName) {
		if (!(phoneBook.containsKey(groupName))) {
			phoneBook.put(groupName, new HashMap<>());
		}
	}

	public static void addPhoneBook(String name, String tel) {
		addPhoneBook("기타", name, tel);
	}

	public static void addPhoneBook(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String, String> info = phoneBook.get(groupName);
		info.put(tel, name);
	}

	public static void showPhoneBook() {
		Set<String> key = phoneBook.keySet();
		for (String groupName : key) {
			int groupSize = phoneBook.get(groupName).size();
			System.out.println("= " + groupName + " [" + groupSize + "] =");

			HashMap<String, String> info = phoneBook.get(groupName);
			key = info.keySet();
			for (String tel : key) {
				System.out.println(info.get(tel) + " : " + tel);
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		HashMapEx.addPhoneBook("가족", "엄마", "010-1111-1111");
		HashMapEx.addPhoneBook("가족", "아빠", "010-2222-2222");
		HashMapEx.addPhoneBook("회사", "이부장", "010-1234-1234");
		HashMapEx.addPhoneBook("회사", "김과장", "010-4321-1234");
		HashMapEx.addPhoneBook("회사", "박대리", "010-5678-9874");
		HashMapEx.addPhoneBook("친구", "정바보", "010-7948-1134");
		HashMapEx.addPhoneBook("친구", "최바보", "010-5632-6541");
		HashMapEx.addPhoneBook("세탁소", "031-999-7899");
		HashMapEx.addPhoneBook("마 트", "031-888-1349");
		HashMapEx.showPhoneBook();

	}
}
