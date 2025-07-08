package quantumbookstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Quantum book store >> quantumbookstore.Book added: " + book.getTitle());
    }

    public void removeOutdatedBooks(int maxAge, int currentYear) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            int age = currentYear - book.getPublishYear();
            if (age > maxAge) {
                System.out.println("Quantum book store >> Removing outdated book: " + book.getTitle());
                iterator.remove();
            }
        }
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isAvailable()) {
                    throw new RuntimeException("Quantum book store >> quantumbookstore.Book not available for purchase.");
                }
                return book.buy(quantity, email, address);
            }
        }
        throw new RuntimeException("Quantum book store >> quantumbookstore.Book with ISBN " + isbn + " not found.");
    }

    public void listInventory() {
        System.out.println("Quantum book store >> Current quantumbookstore.Inventory:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
