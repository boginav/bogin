package by.course.bogin.task_01.services;

import by.course.bogin.task_01.entities.Book;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

/**
 * Class BookServices to work with book.
 * @autor Богинь Александр
 * @version 1.0
 */

@Service
public class BookService {
    /**
     * This method takes a <code>Book</code>
     * and change isAvailable to false
     *
     * @param book
     *        Our book.
     */
   public static void borrowBook(@NotNull Book book) {
        book.isAvailable(false);
    }
    /**
     * This method takes a <code>Book</code>
     * and change isAvailable to true
     *
     * @param book
     *        Our book.
     */
   public static void returnBook(@NotNull Book book) {
        book.isAvailable(true);
    }
    /**
     * This method takes a <code>Book</code>
     * and displays information about the book on the screen.
     *
     * @param book
     *        Our book.
     */
  public static  void displayInfo( @NotNull Book book) {
        System.out.println(book.toString());
    }






}
