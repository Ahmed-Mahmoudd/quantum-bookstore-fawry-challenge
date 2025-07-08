package quantumbookstore;

public class BookTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add books
        inventory.addBook(new PaperBook("ISBN001", "Java Fundamentals", 2015, 50.0, "Ahmed Mahmoud", 10));
        inventory.addBook(new EBook("ISBN002", "Data Structures in Depth", 2018, 30.0, "Sara Adel", "PDF"));
        inventory.addBook(new ShowcaseBook("ISBN003", "Ancient Manuscripts", 1990, 0.0, "Unknown"));

        // List books
        inventory.listInventory();

        // Remove outdated books (older than 10 years)
        inventory.removeOutdatedBooks(10, 2025);

        // Try buying books
        double paid1 = inventory.buyBook("ISBN001", 2, "customer@example.com", "New Cairo");
        System.out.println("Quantum book store >> Paid amount: $" + paid1);

        double paid2 = inventory.buyBook("ISBN002", 1, "reader@example.com", "Zamalek");
        System.out.println("Quantum book store >> Paid amount: $" + paid2);

        // Try buying a showcase book (will throw)
        try {
            inventory.buyBook("ISBN003", 1, "test@example.com", "Giza");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Final inventory
        inventory.listInventory();
    }
}
