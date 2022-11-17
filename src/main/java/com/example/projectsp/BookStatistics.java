package com.example.projectsp;

import antlr.PreservingFileWriter;
import com.example.projectsp.ImageProxy;
import com.example.projectsp.Visitor;
import com.example.projectsp.models.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.Getter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Getter
public class BookStatistics implements Visitor {

    private int numberOfImages = 0;
    private int numberOfParagraph = 0;
    private int numberOfTables = 0;
    private String filePath ="D:\\code\\ProjectSP\\output.json" ;




    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        numberOfParagraph++;
        Gson gson = new Gson();
        try {


            FileWriter fileWriter = new FileWriter(filePath);
                    fileWriter.append(gson.toJson(paragraph));



        }
        catch(Exception e){
            System.out.println("Nu se poate face json");
        }
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
