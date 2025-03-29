package Lab6.task5;

public class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        this(title, "Unknown");
    }

    public void getInfo() {
        System.out.println("Назва: " + title + "\nАвтор: " + author);
    }
}
