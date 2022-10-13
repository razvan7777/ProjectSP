package com.example.projectsp;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {

    private String name;
    private List<Element> elements = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String name) {
        Paragraph paragraph = new Paragraph(name);
        elements.add(paragraph);

    }


    public void createNewImage(String name) {
        Image image = new Image(name);
        elements.add(image);
    }

    public void createNewTable(String name) {
        Table table = new Table(name);
        elements.add(table);
    }

    public void print() {
        System.out.println("Subcapitol cu numele "+name);
        elements.forEach(e -> e.print());

    }
}
