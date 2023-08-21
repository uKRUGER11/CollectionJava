package ListInterface.Search;

public class application {
    public static void main(String[] args) {
        BookCatalog bookList = new BookCatalog();
        bookList.addBook(" DDD - Domain Driver Design", "Eric Evans", 2016);
        bookList.addBook("Clean Code", "Robert C. Martin", 2009);
        bookList.addBook("Design Patterns", "Erich Gamma, Richard Helm, e outros", 2000);
        bookList.addBook("Clean Architecture", "Robert C. Martin", 2019);
        bookList.addBook("Data Structures and Algorithms in Java", "Robert Lafore", 2017);

        System.out.println(bookList.findByAuthor("Robert C. Martin"));
        System.out.println(bookList.findByYearsRange(2000, 2016));
        System.out.println(bookList.findByTitle("Clean Code"));
    }
}
