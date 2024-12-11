package by.course.bogin.task_01.entities;

import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class Library with synchronized collections .
 * @autor Богинь Александр
 * @version 1.0
 */

 // для одной библиотеки или несколько библиотек с книгами будет использоваться?
// например добавить идентификатор библиотек (адрес, название, и т.д.)

@ToString
public class Library {
    /**
     * List of books in the library.
     * */
    public static List<Book> books = Collections.synchronizedList(new ArrayList<>());

//    static {
//        books.add(new Book("Title10", "Author10", LocalDate.of(1988, 1, 1), true));
//        books.add(new Book("Title11", "Author11", LocalDate.of(1988, 1, 1), false));
//        books.add(new Book("Title12", "Author12"));
//        books.add(new Book("Title13", "Author13"));
//
//
//    }


}
