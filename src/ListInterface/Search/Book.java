package ListInterface.Search;

public class Book {
    private String title;
    private String author;
    private int yearPub;

    public Book(String title, String author, int yearPub)  {
        this.title = title;
        this.author = author;
        this.yearPub = yearPub;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPub() {
        return yearPub;
    }

    public void setYearPub(int yearPub) {
        this.yearPub = yearPub;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPub=" + yearPub +
                '}';
    }
}
