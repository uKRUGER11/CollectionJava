package ListInterface.Search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> booksList;

    public BookCatalog() {
        this.booksList = new ArrayList<>();
    }

    public void addBook(String title, String author, int yearPub) {
        booksList.add(new Book(title, author, yearPub));
    }

    public List<Book> findByAuthor(String author) {
        List<Book> booksPerAuthor = new ArrayList<>();
        if (!booksList.isEmpty()) {
            for (Book b : booksList) {
                if (b.getAuthor().equalsIgnoreCase(author)) {
                    booksPerAuthor.add(b);

                }
            }
        }
        return booksPerAuthor;
    }

    public List<Book> findByYearsRange(int initialYear, int finalYear) {
        List<Book> booksPerYearsRange = new ArrayList<>();
        if (!booksList.isEmpty()) {
            for (Book b : booksList) {
                if (b.getYearPub() >= initialYear && b.getYearPub() <= finalYear) {
                    booksPerYearsRange.add(b);
                }
            }
        }
        return booksPerYearsRange;
    }

    public Book findByTitle(String title) {
        Book bookPerTitle = null;

        if (!booksList.isEmpty()) {
            for (Book b : booksList) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    bookPerTitle = b;
                    break;
                }
            }
        }
        return bookPerTitle;
    }
}
