package ru.pflb;


public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Agatha Christie","agakristy@xmail.uk",Gender.FEMALE);
        Author author2 = new Author("Jules Verne", "julvern@xmail.fr", Gender.MALE);
        Book book1_1 = new Book("Murder on the Orient Express", author1, 257.0, 16);
        Book book1_2 = new Book("The Murder of Roger Ackroyd", author1, 222.0, 55);
        Book book2_1 = new Book("Around the World in Eighty Days",author2, 289.0, 8);
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(book1_1);
        System.out.println(book1_2);
        System.out.println(book2_1);

    }

}