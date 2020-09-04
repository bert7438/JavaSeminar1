package ru.mirea.bert7438.javasem1;

public class Book {
    private String name;
    private String author;
    private int pages;
    private String genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book(String name, String author, int pages, String genre) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.genre = "unknown";
    }

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
        this.author = "Unknown Author";
        this.genre = "unknown";
    }

    public String toString(){
        return "Book " + name + ", Author - " + author + ", number of pages:" + pages + ", Genre: " + genre;
    }
}
