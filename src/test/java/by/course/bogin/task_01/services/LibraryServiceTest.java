package by.course.bogin.task_01.services;

import by.course.bogin.task_01.entities.Book;
import by.course.bogin.task_01.entities.Library;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
@DisplayName("Test BookService")
class LibraryServiceTest {

    @Test
    @DisplayName("adds a book to the library (addBook)")
    void addBook() {
        //given
        var book = new Book("Title", "Author", LocalDate.of(1988, 1, 1), true);
        //when
        LibraryService.addBook(book);
        //then
        assertEquals(book, Library.books.get(0), "adds a book to the library (addBook)");
    }


    @Test
    @DisplayName("returns the author's books (findBooksByAuthor)")
    void findBooksByAuthor() {
        //given
        var book = new Book("Title", "Author", LocalDate.of(1988, 1, 1), true);
        var book1 = new Book("Title1", "Author1", LocalDate.of(1988, 1, 1), true);
        var book2 = new Book("Title2", "Author2", LocalDate.of(1988, 1, 1), true);
        LibraryService.addBook(book);
        LibraryService.addBook(book1);
        LibraryService.addBook(book2);
        //when
        Book book3 = LibraryService.findBooksByAuthor("Author2").get(0);
        //then
        assertEquals(book2, book3, "author's books (findBooksByAuthor)");

    }

    // можно проверить данные на вывод в консоль при помощи ArgumentCaptor и Mock
    // не рекомендуется в руководстве по Mockito
    // другого способа не знаю нужно поискать, вопрос целесообразности

}