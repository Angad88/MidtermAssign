package Books;

import java.util.UUID;

public class Books {

    private String bookName;
    private String author;
    private String genre;
    private String date;
    private String serialID;

    public Books() {
        this.bookName = "Book Title";
        this.author = "Author Full Name";
        this.genre = "Genre";
        this.date = "YEAR-MN-DY";
        this.serialID = UUID.randomUUID().toString();
    }

    public Books(String bookName, String author, String genre, String date) {
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
        this.date = date;
        this.serialID = UUID.randomUUID().toString();
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getDate() {
        return date;
    }

    public String getSerialID() {
        return serialID;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSerialID(String serialID) {
        this.serialID = serialID;
    }

    public void bookInformation() {
        System.out.println("Book Name: " + this.getBookName());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Genre: " + this.getGenre());
        System.out.println("Released Date: " + this.getDate());
        System.out.println("Book Serial ID: " + this.getSerialID());
    }
};