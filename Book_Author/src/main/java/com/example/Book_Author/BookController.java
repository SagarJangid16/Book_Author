package com.example.Book_Author;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService service;
    @PostMapping("/add-book")
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }

    public void addAuthor(@RequestBody Author author){
        service.addAuthor(author);
    }

    @GetMapping("/get-findMaxPagesBook")
    public int findMaxPagesBook(){
        return service.findMaxPagesBook();
    }

    @GetMapping("/get-highestNofPagesByAuthor")
    public String highestNofPagesByAuthor(){
        return service.highestNofPagesByAuthor();
    }

    // PUT the ( bookname, updated pages);
    @PutMapping("/update-updateBook")
    public void updateBook(@RequestParam("name") String name, @RequestParam("pages") int pages){
        service.updateBook(name, pages);
    }
}
