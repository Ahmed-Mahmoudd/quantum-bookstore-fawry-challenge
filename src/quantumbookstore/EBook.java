package quantumbookstore;

public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int publishYear, double price, String author, String fileType) {
        super(isbn, title, publishYear, price, author);
        this.fileType = fileType;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        MailService.send(email);
        return quantity * price;
    }

    @Override
    public String toString() {
        return super.toString() + ", File Type: " + fileType;
    }
}
