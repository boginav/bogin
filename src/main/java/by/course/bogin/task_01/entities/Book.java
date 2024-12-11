package by.course.bogin.task_01.entities;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.Accessors;
import java.time.LocalDate;

/**
 * Class book with properties <b>title</b> and <b>author</b> and <b>publicationDate</b> and <b>isAvailable</b>  .
 * @autor Богинь Александр
 * @version 1.0
 */

@Accessors (fluent = true)
@Setter
@Getter
//@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"isAvailable"})  // непонятно как сравнивая книги нужно ли учитывать isAvailable
@ToString
public class Book {
    /**
     * Title of the book
     * --SETTER--
     * Change the title of the book.
     * --GETTER--
     *  Return the title of the book.
     * */
    @NotNull
    private String title;
    /**
     * Author of the book
     * --SETTER--
     * Change the name of the autor.
     * --GETTER--
     *  Return the name of the author.
     * */
    @NotNull
    private String author;
    /**
     * Year of publication of a book
     * --SETTER--
     * Change the year of publication of a book.
     * --GETTER--
     *  Return the year of publication of a book.
     * */
    private LocalDate publicationDate;
    /**
     * Availability of the book for issue (initially true)
     * --SETTER--
     * Change the availability of the book for issue.
     * --GETTER--
     *  Return the availability of the book for issue.
     * */
    @NotNull
    private boolean isAvailable;

public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.publicationDate = null;
    this.isAvailable = false;
}


}
