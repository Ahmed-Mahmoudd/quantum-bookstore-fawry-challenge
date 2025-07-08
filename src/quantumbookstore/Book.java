package quantumbookstore;

public abstract class Book {
    protected String isbn;
    protected String title;
    protected int publishYear;
    protected double price;
    protected String author;

    public Book(String isbn, String title, int publishYear, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract boolean isAvailable();

    public abstract double buy(int quantity, String email, String address);

    @Override
    public String toString() {
        return "Quantum book store >> " +
                "ISBN: " + isbn +
                ", Title: " + title +
                ", Author: " + author +
                ", Year: " + publishYear +
                ", Price: " + price;
    }
}
