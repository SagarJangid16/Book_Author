package com.example.Book_Author;


import org.springframework.stereotype.Repository;
import java.util.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

@Repository
public class BookRepository {
    Map<String, Book> dbBook = new HashMap<>();
    Map<String, Author> dbAuthor = new HashMap<>();

    Map<String, List<Book>> dbPair = new HashMap<>(); // author , list of books

    public void addBook(Book book){
        if(!dbBook.containsKey(book.getName()))
            dbBook.put(book.getName(), book);
    }

    public void addAuthor(Author author){
        if(!dbAuthor.containsKey(author.getName()))
            dbAuthor.put(author.getName(), author);
    }

    public int findMaxPagesBook(){
        int variable = 0;
        for(Book book : dbBook.values()){
            if(variable < book.getNoOfPages())
                variable = book.getNoOfPages();
        }
        return variable;
    }

    public String highestNofPagesByAuthor(){
        List<Book> list = new ArrayList<>();
        int maxpages = 0;
        String author = "";
        for( list : dbPair.values()){
            for(Book book : list){
                int pages = book.getNoOfPages();
                if(pages > maxpages){
                    maxpages = pages;
                    author = book.getAuthorName();
                }
            }
        }
        return author;
    }


    public void updateBook(String name, int pages){
        if(dbBook.containsKey(name)){
            dbBook.get(name).setNoOfPages(pages);

            String author = dbBook.get(name).getAuthorName();

            List<Book> book = dbPair.get(author);
            for(Book b : book){
                if(b.getName().equals(name))
                    b.setNoOfPages(pages);
            }

//             List<Book> list = new ArrayList<>();

        }

    }
}

