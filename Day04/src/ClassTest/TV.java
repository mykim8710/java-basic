package ClassTest;

class TV {

	String brand;
	int releaseYear;
	int size;

	TV(String brand, int releaseYear, int size) {
		this.brand = brand;
		this.releaseYear = releaseYear;
		this.size = size;
	}

	void show() {
		System.out.println(brand + "에서 만든 " + releaseYear + "년형 " + size + "인치 TV");
	}

}
