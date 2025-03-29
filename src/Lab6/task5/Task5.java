package Lab6.task5;

public class Task5 {
    public static void main(String[] args) {
        Book book = new Book("Head First Java", "Кеті Сьєрра , Берт Бейтс");
        Book book1 = new Book("Джава для всіх!!!");

        System.out.println();
        book.getInfo();
        System.out.println();
        book1.getInfo();
    }
}
