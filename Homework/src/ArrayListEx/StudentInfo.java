/* 학생이름, 전공, 학번, 평점을 멤버로 갖는 학생객체를 ArrayList에 저장
input : 학생 객체별 멤버는 scanner를 이용해서 다음과 같이 받는다 : ','를 구분자로 통으로 입력받는다.

	학생객체 1 : 황기태,모바일 ,1,4.1
	학생객체 2 : 이재문,안드로이드,2,3.9
	학생객체 3 : 김남윤,웹공학,3,3.5
	학생객체 4 : 최찬미,빅데이터,4,4.25
	 
output :
1. 학생 객체를 담은 ArrayList에 전체를 출력
2. 학생이름을 입력하면 해당 학생의 정보를 출력, 만약에 ArrayList에 없는 학생이름을 입력했다면 "name  학생은 목록에 없습니다." 로 출력   */

package ArrayListEx;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student {
	private String name;
	private String major;
	private int studentId;
	private double avgGradePoint;

	// getter, setter 메서드(private)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public double getAvgGradePoint() {
		return avgGradePoint;
	}

	public void setAvgGradePoint(double avgGradePoint) {
		this.avgGradePoint = avgGradePoint;
	}

	Student(String name, String major, int studentId, double avgGradePoint) {
		this.name = name;
		this.major = major;
		this.studentId = studentId;
		this.avgGradePoint = avgGradePoint;
	}

	@Override
	public String toString() {
		return "이름 : " + name + "\n" + "학과 : " + major + "\n" + "학번 : " + studentId + "\n" + "평점 : " + avgGradePoint;
	}
}

public class StudentInfo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();

		System.out.print("학생수를 입력하세요 >> ");
		int count = scanner.nextInt();
		scanner.nextLine();

		System.out.println("학생이름, 학과, 학번, 평점을 입력하세요");
		for (int i = 0; i < count; i++) {
			String info = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(info, ",");

			String name = st.nextToken();
			String major = st.nextToken();
			int studentId = Integer.parseInt(st.nextToken());
			double avgGradePoint = Double.parseDouble(st.nextToken());

			studentList.add(new Student(name, major, studentId, avgGradePoint));
		}

		System.out.println("-----------------");
		for (Student s : studentList) {
			System.out.println(s);
			System.out.println("-----------------");
		}

		System.out.println();
		while (true) {
			System.out.print("확인 할 학생의 이름을 입력하세요(0 : 종료) >> ");
			String name = scanner.next();

			if (name.equals("0")) {
				System.out.println("종료합니다.");
				break;
			}

			System.out.println();
			boolean isFind = false;
			for (int i = 0; i < studentList.size(); i++) {
				Student temp = studentList.get(i);
				if (name.equals(temp.getName())) {
					isFind = true;
					System.out.println("-----------------");
					System.out.println(temp);
					System.out.println("-----------------");
					System.out.println();
					break;
				} else {
					continue;
				}
			}

			if (isFind == false) {
				System.out.println(name + " 학생은 목록에 없습니다.");
			}
		}
		scanner.close();
	}
}
