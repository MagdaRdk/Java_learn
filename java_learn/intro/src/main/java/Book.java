public class Book {

    private String author;
    private String title;

    public static  Book of(String author, String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        return  book;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book book1 = Book.of("John Doe", "The Great Adventure");
        System.out.println("Autor: " + book1.getAuthor());
        System.out.println("Tytuł: " + book1.getTitle());

        Book book2 = Book.of("Jane Smith", "Coding Basics");
        System.out.println("Autor: " + book2.getAuthor());
        System.out.println("Tytuł: " + book2.getTitle());
    }
}
