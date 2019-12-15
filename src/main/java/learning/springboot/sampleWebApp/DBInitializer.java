package learning.springboot.sampleWebApp;

import learning.springboot.sampleWebApp.models.Author;
import learning.springboot.sampleWebApp.models.Book;
import learning.springboot.sampleWebApp.repositories.AuthorRepository;
import learning.springboot.sampleWebApp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DBInitializer implements CommandLineRunner {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private static List<Author> authors;
    private static List<Book>   books;


    @Autowired
    DBInitializer(AuthorRepository authorRepository, BookRepository bookRepository, List<Author> authors, List<Book> books) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.authors = authors;
        this.books = books;
    }

    private void initDB(){
        //code to initialize db
        //authorRepository.saveAll(authors);
        bookRepository.saveAll(books);
        authorRepository.saveAll(authors);
    }
    @Override
    public void run(String... args) throws Exception {
        initDB();
    }
}
