package com.example.projectsp.models;



import com.example.projectsp.Element;

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
