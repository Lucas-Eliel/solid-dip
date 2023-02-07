package withoutdip;

public class Application {

    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();

        BookService bookService = new BookService(bookRepository);
        bookService.createBook();
    }
}
