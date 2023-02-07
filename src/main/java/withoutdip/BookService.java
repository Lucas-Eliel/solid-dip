package withoutdip;

public class BookService {

    private BookRepository bookRespository;

    public BookService(BookRepository bookRepository) {
        this.bookRespository = bookRepository;
    }

    public void createBook() {
        bookRespository.save();
    }
}
