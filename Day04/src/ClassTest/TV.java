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
		System.out.println(brand + "���� ���� " + releaseYear + "���� " + size + "��ġ TV");
	}

}
