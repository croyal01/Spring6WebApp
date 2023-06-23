package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    //@OneToMany
    //@JoinTable(name = "published_book", joinColumns = @JoinColumn(name = "book_id"))

    private Long id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "publisher")



    private Set<Book> books = new HashSet<>();
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // public Set<Book> getBooks() {
    //    return books;
    //}

    // public void setBooks(Set<Book> books) {
    //     this.books = books;
    // }


}
