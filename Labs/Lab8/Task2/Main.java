public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[4];
        authors[0] = new Author("Hamza", "Hamza@gmail.com", 'M');
        authors[1] = new Author("Asif", "Asif@gmail.com", 'M');
        authors[2] = new Author("Hamza1", "Hamza1@gmail.com", 'M');
        authors[3] = new Author("Asif1", "Asif1@gmail.com", 'M');


        Book book = new Book("the greatest book", authors, 200, 5);

        System.out.println(book.toString());
        System.out.println(book.getAuthorNames());
    }
}