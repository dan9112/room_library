package ru.test.my_tests.user_classes;

public class Book extends Entertainment {
    private String[] author;

    public Book(String name, String[] genre, String[] author) {
        super(name, genre);
        this.author = author;
    }

    public Book(String name, String[] genre, String description, String[] author) {
        super(name, genre, description);
        this.author = author;
    }

    //методы для получения полей класса
    public String[] getAuthor() {
        return author;
    }
}
