/* �л��̸�, ����, �й�, ������ ����� ���� �л���ü�� ArrayList�� ����
input : �л� ��ü�� ����� scanner�� �̿��ؼ� ������ ���� �޴´� : ','�� �����ڷ� ������ �Է¹޴´�.

	�л���ü 1 : Ȳ����,����� ,1,4.1
	�л���ü 2 : ���繮,�ȵ���̵�,2,3.9
	�л���ü 3 : �賲��,������,3,3.5
	�л���ü 4 : ������,������,4,4.25
	 
output :
1. �л� ��ü�� ���� ArrayList�� ��ü�� ���
2. �л��̸��� �Է��ϸ� �ش� �л��� ������ ���, ���࿡ ArrayList�� ���� �л��̸��� �Է��ߴٸ� "name  �л��� ��Ͽ� �����ϴ�." �� ���   */

package ArrayListEx;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student {
	private String name;
	private String major;
	private int studentId;
	private double avgGradePoint;

	// getter, setter �޼���(private)
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
		return "�̸� : " + name + "\n" + "�а� : " + major + "\n" + "�й� : " + studentId + "\n" + "���� : " + avgGradePoint;
	}
}

public class StudentInfo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();

		System.out.print("�л����� �Է��ϼ��� >> ");
		int count = scanner.nextInt();
		scanner.nextLine();

		System.out.println("�л��̸�, �а�, �й�, ������ �Է��ϼ���");
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
			System.out.print("Ȯ�� �� �л��� �̸��� �Է��ϼ���(0 : ����) >> ");
			String name = scanner.next();

			if (name.equals("0")) {
				System.out.println("�����մϴ�.");
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
				System.out.println(name + " �л��� ��Ͽ� �����ϴ�.");
			}
		}
		scanner.close();
	}
}
