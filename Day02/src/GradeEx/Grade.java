
/*성적표 출력프로그램
총점, 평균, 평점 출력 */
package GradeEx;

public class Grade {
	public static void main(String[] arg) {
		int kor = 60;
		int math = 70;
		int eng = 100;

		int total;
		double avg;
		char grade;

		total = kor + math + eng;
		avg = total / 3.0;

		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}

		System.out.println("총점 : " + total + " 평균 : " + avg + " 평점 : " + avg);

	}
}