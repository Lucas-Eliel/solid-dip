package withdip;

public class BookRepositoryImpl implements BookRepository {

    @Override
    public void save() {
        System.out.println("Saving the book");
    }
}
