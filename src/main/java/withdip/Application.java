package withdip;

public class Application {

    public static void main(String[] args) {
        BookRepositoryImpl bookRepositoryImpl = new BookRepositoryImpl();

        BookService bookService = new BookService(bookRepositoryImpl);
        bookService.createBook();
    }
}
