package by.course.bogin.task_01.entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@DisplayName("LibraryTest ")
class LibraryTest {

    @Test
    @DisplayName("AddBookInTheLibrary")
    public void whenAddBookInTheLibrary() {
        //given
        Library.books.add(new Book("Title", "Author"));
        Library.books.add(new Book("Title1", "Author1"));
        //then
        assertEquals("Title",Library.books.get(0).title(), "test book  title (AddBookInTheLibrary)");
        assertEquals("Author", Library.books.get(0).author(), "test book author (AddBookInTheLibrary)");
        assertNull(Library.books.get(0).publicationDate(), "test book publicationDate (AddBookInTheLibrary)");
        assertFalse(Library.books.get(0).isAvailable(), "test book isAvailable (AddBookInTheLibrary)");
    }

}