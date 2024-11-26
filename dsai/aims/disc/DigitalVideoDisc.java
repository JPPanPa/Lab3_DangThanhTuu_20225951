package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDisc = 0;
	public String getCategory() {
		return category;
	}
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
        this.title = title;
    }
	 //tiêu đề
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDisc ++;
		this.id = nbDigitalVideoDisc;
	}
	//danh mục, tiêu đề và giá thành
    public DigitalVideoDisc(String category, String director, float cost) {
		super();
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDisc ++;
		this.id = nbDigitalVideoDisc;
	}
	//đạo diễn, thể loại, tiêu đề và chi phí
    public DigitalVideoDisc(String director, String category, String title, float cost) {
    	super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDisc ++;
		this.id = nbDigitalVideoDisc;
    }

    //tất cả các thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    	super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDisc ++;
		this.id = nbDigitalVideoDisc;
    }
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " mins: " + cost ;
    }
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
	public int getId() {
		return id;
	}
	public static int getNbDigitalVideoDisc() {
		return nbDigitalVideoDisc;
	}

}