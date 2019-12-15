package learning.springboot.sampleWebApp.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToMany
    private Set<Book> books = new HashSet<Book>();

    public Author(){

    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author(String firstName, String lastName,Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
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
        if(this.id == null || obj.getClass().getName() != this.getClass().getName()){
            return super.equals(obj);
        }else {
            return this.id == ((Author)obj).id;
        }
    }
}
