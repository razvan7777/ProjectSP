package com.example.projectsp;



import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private List<Chapter> chapters = new ArrayList<>();
    private Author author;


    public Book(String title) {
        this.title = title;
    }

    public int createChapter(String name){

        Chapter chapter = new Chapter(name);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }



    public void addAuthor(Author author) {
        this.author = author;
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);

    }
    public void print() {
        System.out.println("cartea cu titlul " +title + " are autorul ");
        author.print();
        System.out.println(" si capitolele: ");
        chapters.forEach( e -> e.print());
    }
}
