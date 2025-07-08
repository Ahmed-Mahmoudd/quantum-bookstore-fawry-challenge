package quantumbookstore;

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int publishYear, double price, String author, int stock) {
        super(isbn, title, publishYear, price, author);
        this.stock = stock;
    }

    @Override
    public boolean isAvailable() {
        return stock > 0;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (stock < quantity) {
            throw new RuntimeException("Quantum book store >> Not enough stock for: " + title);
        }
        stock -= quantity;
        ShippingService.send(address);
        return quantity * price;
    }

    @Override
    public String toString() {
        return super.toString() + ", Stock: " + stock;
    }
}
