package com.example.Book_Author;

public class Book {
    private String name;
    private String genre;
    private String authorName;
    private int noOfPages;

    public Book(String name, String genre, String authorName, int noOfPages) {
        this.name = name;
        this.genre = genre;
        this.authorName = authorName;
        this.noOfPages = noOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}
