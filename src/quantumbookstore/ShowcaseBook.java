package quantumbookstore;

public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int publishYear, double price, String author) {
        super(isbn, title, publishYear, price, author);
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Quantum book store >> Showcase book is not for sale.");
    }
}
