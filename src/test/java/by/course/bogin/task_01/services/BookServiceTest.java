package by.course.bogin.task_01.services;

import by.course.bogin.task_01.entities.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
@DisplayName("Test BookService")
class BookServiceTest {

//    @InjectMocks
//    BookService bookServices;    Для нестатических методов в BookService, заменил на статик инджект не нужен

    @Test
    @DisplayName("sets isAvailable to false if the book is available (borrowBook)")
    void testBorrowBook() {

        //given
        var book = new Book("Title","Author", LocalDate.of(1988,1,1), true);
        //when
        BookService.borrowBook(book);
        //then
        assertFalse(book.isAvailable(), "Book is not available (borrowBook)");
    }


    @Test
    @DisplayName("sets isAvailable to true (borrowBook)")
    void testReturnBook() {
        //given
        var book = new Book("Title","Author", LocalDate.of(1988,1,1), false);
        //when
        BookService.returnBook(book);
        //then
        assertTrue(book.isAvailable(), "Book is available (borrowBook)");
    }



    // можно проверить данные на вывод в консоль при помощи ArgumentCaptor и Mock
    // не рекомендуется в руководстве по Mockito
    // другого способа не знаю нужно поискать, вопрос целесообразности

}