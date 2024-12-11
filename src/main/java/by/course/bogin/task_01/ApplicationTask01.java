package by.course.bogin.task_01;

import by.course.bogin.BoginApplication;
import by.course.bogin.task_01.entities.Book;
import by.course.bogin.task_01.entities.Library;
import by.course.bogin.task_01.services.BookService;
import by.course.bogin.task_01.services.LibraryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ApplicationTask01 {

    public static void main(String[] args) {
        SpringApplication.run(BoginApplication.class, args);


        Book book1 = new Book("Title", "Author");
        Book book2 = new Book("Title1", "Author1", LocalDate.of(1988, 1, 1), true);
        Book book3 = new Book("Title8", "Author");
        Book book4 = new Book("Title7", "Author1", LocalDate.of(1988, 1, 1), true);
        // static блок с добавлением книг в классе Library заккомментировал
        // При добавлении статического блока с добавлением книг не корректно отрабатывают тесты,
        // т.к. книги добавляются в библиотеку до выполнения тестов
        LibraryService.addBook(book1);
        LibraryService.addBooks(book2, book3, book4);

        LibraryService.printAvailableBooks();
        System.out.println("---------Статус первой в списке книги меняем ------------");
        BookService.borrowBook(Library.books.get(0));
        LibraryService.printAvailableBooks();
        System.out.println("Вывод инф. по 3 книге");
        BookService.displayInfo(book3);

    }


}
