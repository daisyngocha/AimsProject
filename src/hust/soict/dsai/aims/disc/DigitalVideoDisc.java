package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {

	// Class member: dem so DVD da tao, dung chung cho moi instance
	private static int nbDigitalVideoDiscs = 0;

	// Instance members
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;

	// Constructors - tat ca deu goi ve constructor day du nen chi tang id o mot cho
	public DigitalVideoDisc(String title) {
		this(title, null, null, 0, 0f);
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		this(title, category, null, 0, cost);
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title, category, director, 0, cost);
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}

	// GETTER + SETTER
	public int getId() {
		return id;
	}

	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	// LAB3 - toString tra ve String
	@Override
	public String toString() {
		return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
	}

	// LAB3 - Kiem tra title co khop tu khoa khong (khong phan biet hoa thuong)
	public boolean isMatch(String title) {
		if (title == null || this.title == null) {
			return false;
		}
		return this.title.toLowerCase().contains(title.trim().toLowerCase());
	}
}
