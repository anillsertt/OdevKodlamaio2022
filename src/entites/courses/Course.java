package entites.courses;

public class Course {
    private int id;
    private String courseName;
    private double price;
    private int progress;
    private int categoryId;

    public Course() {
    }

    public Course(int id, String courseName, double price, int progress, int categoryId) {
        this.id = id;
        this.courseName = courseName;
        this.price = price;
        this.progress = progress;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
