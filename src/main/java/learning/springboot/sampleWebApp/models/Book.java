package learning.springboot.sampleWebApp.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;
    private String publisher;

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors = new HashSet<Author>();

    public Book(){

    }

    public Book(String title,String isbn, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Book(String title,String isbn, String publisher,Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        if(id == null){
            return super.hashCode();
        }else {
            return id.hashCode();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(id == null || obj.getClass().getName() != this.getClass().getName()){
            return super.equals(obj);
        }else {
            return this.id == ((Book)obj).id;
        }
    }
}
