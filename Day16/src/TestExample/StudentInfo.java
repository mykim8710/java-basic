package TestExample;

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
