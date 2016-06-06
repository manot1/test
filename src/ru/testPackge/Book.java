package ru.testPackge;

/**
 * Created by olga on 06.06.2016.
 */
public class Book {
    private long id;
    private String name;

    public Book() {
    }

    public Book(long id) {

        this.id = id;
    }

    public Book(long id, String name) {
        this.id = id;
        this.name = name;

    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
