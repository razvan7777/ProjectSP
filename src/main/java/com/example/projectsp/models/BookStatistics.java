package com.example.projectsp.models;

import com.example.projectsp.ImageProxy;
import com.example.projectsp.Visitor;


public class BookStatistics implements Visitor {

    private int numberOfImages = 0;
    private int numberOfParagraph = 0;
    private int numberOfTables = 0;


    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        numberOfParagraph++;
    }

    @Override
    public void visitImage(Image image) {
        numberOfImages++;
    }

    @Override
    public void visitTable(Table table) {
        numberOfTables++;
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
         numberOfImages++;
    }

    public void printStatistics() {

        System.out.println("Number of Images: " + numberOfImages);
        System.out.println("Number of Tables: " + numberOfTables);
        System.out.println("Number of Paragraphs: "+ numberOfParagraph);
    }
}
