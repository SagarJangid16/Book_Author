package com.example.Book_Author;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository repository;
    public void addBook(Book book){
        repository.addBook(book);
    }

    public void addAuthor(Author author){
        repository.addAuthor(author);
    }

    public int findMaxPagesBook(){
        return repository.findMaxPagesBook();
    }

    public String highestNofPagesByAuthor(){
        return repository.highestNofPagesByAuthor();
    }

    public void updateBook(String name, int pages){
        repository.updateBook(name, pages);
    }
}
