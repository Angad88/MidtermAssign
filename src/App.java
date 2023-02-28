import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Books.Books;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nLibrary System:");
        List<Books> allBooksList = new ArrayList<>();
        String userInput1 = "none";
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\nShow = Show all Books\nAdd = Add a new book to records\n");
            System.out.println("Type your option below:");
            userInput1 = in.nextLine();
            System.out.println("");
            switch (userInput1.toLowerCase()) {
                case "show":
                    System.out.println("Book list: \n");
                    bookArrayDetails(allBooksList);
                    break;
                case "add":       
                    Books addBook = new Books();
                    addBook = addNewBook();     
                    allBooksList.add(addBook);
                    break;
                default:
                    System.out.println("Please choose the following options below, I don't know what '" + userInput1 + "' means.\n");
                    break;
            }
        }
    }


    public static void bookArrayDetails(List<Books> allBooksList) {
        int count = 0;
        for (Books books: allBooksList) {
            count += 1;
            System.out.println("-------- |Book " + count + "|--------");
            books.bookInformation();
            System.out.println("");
        }
    }

    public static Books addNewBook() {
        Scanner inD = new Scanner(System.in);
        String bookName = "";
        String author = "";
        String genre = "";
        String date = "";

        System.out.println("Name of Book: ");
        bookName = inD.nextLine();
        System.out.println("Author: ");
        author = inD.nextLine();
        System.out.println("Genre: ");
        genre = inD.nextLine();
        System.out.println("Released date of Book (YEAR-MONTH-DAY, Example: 2023-02-27): ");
        date = inD.nextLine();

        Books bookAdd = new Books(bookName, author, genre, date);
        return bookAdd;

    }
}
