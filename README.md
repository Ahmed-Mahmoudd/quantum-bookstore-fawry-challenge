# Quantum Bookstore – Fawry Internship Challenge

This is a simple Java application that simulates an online bookstore. It was developed as part of the Fawry internship technical challenge.

The system uses basic object-oriented programming concepts like inheritance, polymorphism, and interfaces to handle different types of books.

---

## 📚 Book Types

- **PaperBook**: Has stock and can be shipped.
- **EBook**: Has a file type and can be sent via email.
- **ShowcaseBook**: Not for sale (just for display).

Each book has a title, author, ISBN, published year, and price.

---

## ✅ Features

- Add books to the inventory
- View current inventory
- Remove outdated books by publication year
- Buy books using ISBN, with checks for stock and availability
- Simulate shipping or emailing depending on book type
- Clean output with all print statements prefixed by `Quantum book store >>`

---

## 🛠️ How to Run

1. Compile the files:
```bash
javac quantumbookstore/*.java
Run the test class:

bash
Copy
Edit
java quantumbookstore.QuantumBookstoreFullTest
🧠 Notes
This project is console-based and keeps data in memory.

There is no UI or file/database storage — everything resets when the program stops.

It was written to be easily extendable if new book types are added in the future.

👨‍💻 Developed by
Ahmed Mahmoud

📧 Email: ahmed.mahmoud.sobhy03@gmail.com

💼 LinkedIn: https://linkedin.com/in/ahmed-mahmoud11

💻 GitHub: https://github.com/Ahmed-Mahmoudd
