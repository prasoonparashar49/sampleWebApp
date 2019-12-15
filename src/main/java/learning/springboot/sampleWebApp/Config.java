package learning.springboot.sampleWebApp;

import learning.springboot.sampleWebApp.models.Author;
import learning.springboot.sampleWebApp.models.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Configuration
public class Config {
    private List<Author> authors;
    private List<Book> books;

    public Config() {
        Author prasoon  = new Author("Prasoon","Parashar");
        Author pankhuri = new Author("Pankhuri","Sai");
        Book   b1       = new Book("Code Complete","isbn123456","Tata Mcgrew Hills");
        authors         = new ArrayList<Author>();
        books           = new ArrayList<Book>();
        authors.add(prasoon);
        authors.add(pankhuri);
        books.add(b1);
        Set<Author> authorSet = new HashSet<Author>();
        Set<Book> bookSet     = new HashSet<Book>();//.add(b1);
        authorSet.addAll(authors);
        bookSet.addAll(this.books);
        prasoon.setBooks(bookSet);
        pankhuri.setBooks(bookSet);
        b1.setAuthors(authorSet);
    }

    @Bean
    public List<Author> authors() {
        return authors;
    }
    @Bean
    public List<Book> books() {
        return books;
    }
}
