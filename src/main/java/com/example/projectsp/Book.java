package com.example.projectsp;



import java.util.ArrayList;
import java.util.List;

public class Book  extends Section{


    private Author author;

    public Book(String title) {
        super(title);

    }


    public void addAuthor(Author author) {
        this.author = author;
    }

    public void print() {
        author.print();
        super.print();

    }
    public void addContent(Element element){
        add(element);
    }
}
