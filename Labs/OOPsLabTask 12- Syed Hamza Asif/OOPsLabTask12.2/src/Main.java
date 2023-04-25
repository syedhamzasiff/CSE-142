public class Main {
    public static void main(String[] args) {
        Librarian lib = new Librarian("hamza", "12345");
        Library.addLibrarian(lib);

        User user = new User("asif", "13567");

        lib.addUser(user);
        Book book1 = new Book("book1", "author1", "sci-fi", "left");
        Book book2 = new Book("book2", "author2", "sci-fi", "right");
        Book book3 = new Book("book3", "author2", "sci-fi", "middle");
        Book book4 = new Book("book4", "author3", "sci-fi", "right");

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);

        user.checkoutBook("book1");
        user.checkoutBook("book2");
        user.checkoutBook("book3");
        user.checkoutBook("book4");
        user.returnBook(book4);
        user.checkoutBook("book4");

        Library.generateReport();

    }
}