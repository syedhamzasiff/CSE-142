public class Main {
    public static void main(String[] args) {
        Author a = new Author("Hamza", "hamza@gmail.com", 'M');
        Book b = new Book("abcd", a, 150, 5);
        System.out.println("Book Details:");
        System.out.println(b.toString());
        System.out.println("Author Details:");
        System.out.println(a.toString());
    }
}