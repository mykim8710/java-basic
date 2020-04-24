package ClassTest;

class Grade {
	int math;
	int science;
	int engilsh;

	Grade(int math, int science, int engilsh) {
		this.math = math;
		this.science = science;
		this.engilsh = engilsh;
	}

	double average() {
		return (math + science + engilsh) / 3.0;
	}

}
