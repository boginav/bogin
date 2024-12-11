package by.course.bogin.task_01.services;

import by.course.bogin.task_01.entities.Book;
import by.course.bogin.task_01.entities.Library;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Class LibraryServices to work with books in library.
 *
 * @version 1.0
 * @autor Богинь Александр
 */

@Service
public class LibraryService {

    /**
     * This method takes <code>Book...</code>
     * and adds a books to the library.
     *
     * @param books The book being added.
     */
    public static void addBooks( @NotNull Book ... books ) {
        Library.books.addAll(List.of(books));
    }
    /**
     * This method takes <code>Book</code>
     * and adds a book to the library.
     *
     * @param book The book being added.
     */
    public static void addBook(@NotNull Book book) {
        Library.books.add(book);
    }
    /**
     * This method displays information about the books which are available .
     */
    public static void printAvailableBooks() {          // я бы передавал сюда List<Book>, даже для дальнейшего варианта увеличения числа библиотек.
        List<Book> availableBooks = new ArrayList<>();

        for (Book book : Library.books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }

        System.out.println("Доступные книги:" + "\n");
        for (Book book : availableBooks) {
            System.out.println(book);
        }

        System.out.println("\n" + "========================= \n");
    }

    /**
     * This method takes name author <code>String</code>
     * and displays information about the books this author.
     *
     * @param author Takes author.
     * @return books  this author
     */
    public static List<Book> findBooksByAuthor(@NotNull String author) {
        List<Book> books = new ArrayList<Book>();
        for (Book book : Library.books) {
            if (book.author().equals(author)) {
                books.add(book);
            }
        }
        return books;
    }


}
