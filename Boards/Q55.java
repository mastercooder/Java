public class Q55 {
    static class Book {
        String title;
        String author;
        String publisher;
        
        public Book(String title, String author, String publisher) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
        }
        
        public void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Publisher: " + publisher);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.");
        Book book3 = new Book("1984", "George Orwell", "Secker & Warburg");
        
        book1.display();
        book2.display();
        book3.display();
    }
}
