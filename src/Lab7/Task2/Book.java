package Lab7.Task2;

//1. Створіть клас Book з полями title, author та price.
//2. Забезпечте інкапсуляцію, зробивши ці поля приватними.
public class Book {
    private String title;
    private String author;
    private double price;

    //3. Додайте гетери та сетери (з перевіркою, що ціна не є від’ємною).
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        } else {
            System.out.println("Ціна книги не може бути відємною");
        }
    }
    //4. Напишіть метод displayInfo(), який виводить інформацію про книгу
    public void displayInfo(){
        System.out.println("Назва книги: " + getTitle() +
                "\nАвтор книги: " + getAuthor() +
                "\nЦіна книги: " + getPrice());
    }
}
