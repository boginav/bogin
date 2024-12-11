package by.course.bogin.task_01.entities;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("BookTest")
public class BookTest {

    @Test
    @DisplayName("CreateBookWithArgumentsAuthorAndTitle")
    public void whenCreateBookWithArgumentsAuthorAndTitle() {
        //given
        Book book = new Book("Title","Author");
        //then
        assertEquals("Ttle", book.title(), "test book  title (whenCreateBookWithArgumentsAuthorAndTitle)");
        assertEquals("Author", book.author(), "test book author (whenCreateBookWithArgumentsAuthorAndTitle)");
        assertNull(book.publicationDate(), "test book publicationDate (whenCreateBookWithArgumentsAuthorAndTitle)");
        assertFalse(book.isAvailable(), "test book isAvailable (whenCreateBookWithArgumentsAuthorAndTitle)");
    }

//    @Test
//    @DisplayName("CreateBookWithoutArguments")
//    public void whenCreateBookWithoutArguments() {
//        //given
//        Book book = new Book();
//        //then
//        assertNull(book.title(), "test book  title (whenCreateBookWithoutArguments)");
//        assertNull(book.author(), "test book author (whenCreateBookWithArgumentsAuthorAndTitle)");
//        assertNull(book.publicationDate(), "test book publication date (whenCreateBookWithoutArguments)");
//        assertTrue(book.isAvailable(), "test book isAvailable (whenCreateBookWithoutArguments)");
//    }

    @Test
    @DisplayName("CreateBookWithArguments")
    public void whenCreateBookWithArguments() {
        //given
        Book book = new Book("Title","Author", LocalDate.of(1988,1,1), true);
        //then
        assertEquals("Title", book.title(), "test book  title (whenCreateBookWithArguments)");
        assertEquals("Author", book.author(), "test book author (whenCreateBookWithArguments)");
        assertEquals(LocalDate.of(1988,1,1), book.publicationDate(), "test book publication date (whenCreateBookWithArguments)");
        assertTrue(book.isAvailable(), "test book available (whenCreateBookWithArguments)");
    }

    @Test
    @DisplayName("Change book info")
    public void whenChangeBook() {

        //given
        Book book = new Book("Title","Author", LocalDate.of(1988,1,1), true);

        //when
        book.title("My title")
                .author("Bogin Alexandr")
                .publicationDate(LocalDate.now())
                .isAvailable(false)
                ;

        //then
        assertEquals("My title", book.title(), "test book  title (constructor with arguments author and title)");
        assertEquals("Bogin Alexandr", book.author(), "test book author (whenCreateBookWithArgumentsAuthorAndTitle)");
        assertEquals(LocalDate.now(), book.publicationDate(), "test book publication date (constructor with arguments author and title)");
        assertFalse(book.isAvailable(), "test book isAvailable (constructor with arguments author and title)");
    }

}
