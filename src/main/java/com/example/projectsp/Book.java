package com.example.projectsp;



import java.util.ArrayList;
import java.util.List;

public class Book {

    private String name;
    private List<String> paragraphs = new ArrayList<>();
    private List<String> images = new ArrayList<>();
    private List<String> tables= new ArrayList<>();


    public Book(String name) {
        this.name = name;
    }

    public void createNewParagraph(String paragraph) {
        paragraphs.add(paragraph);
    }

    public void createNewImage(String image) {
        images.add(image);
    }

    public void createNewTable(String table) {
        tables.add(table);
    }

    public void print() {
        System.out.println("The title of the book is "+name +" that contains " + paragraphs +" and images " +images + " and tables "+tables );
    }
}
