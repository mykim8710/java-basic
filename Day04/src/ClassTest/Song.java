package ClassTest;

class Song {
	int year;
	String country;
	String artist;
	String title;

	Song() {

	}

	Song(int year, String country, String artist, String title) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}

	void show() {
		System.out.println("������ : " + year + "�� " + country + " ������ " + artist + "�� �θ� " + title);
	}

}
