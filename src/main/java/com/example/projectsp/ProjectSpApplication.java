package com.example.projectsp;


import com.example.projectsp.models.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectSpApplication {

    public static void main(String[] args) {


        ToCVisitor visitor = new ToCVisitor();
        Book book = new Book("Cartea junglei");
        Section cap1 = new Section("Cap1");
        Paragraph par1 = new Paragraph("Paragraph1");
        Paragraph par2 = new Paragraph("Paragraph2");
        Paragraph par3 = new Paragraph("Paragraph3");
        cap1.add(par1);
        cap1.add(par2);
        cap1.add(par3);
        book.add(cap1);
        Section cap2 = new Section("Cap2");
        Paragraph par4 = new Paragraph("Paragraph4");
        Paragraph par5 = new Paragraph("Paragraph5");
        Paragraph par6 = new Paragraph("Paragraph6");
        cap2.add(par4);
        cap2.add(par5);
        cap2.add(par6);
        book.add(cap2);
        book.addAuthor(new Author("author"));
        Section cap3 = new Section("cap3");
        book.add(cap3);
        book.accept(visitor);
        book.add(visitor.getTableOfContents());
        book.print();





    }


    }


