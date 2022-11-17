package com.example.projectsp;

import com.example.projectsp.models.*;

public class ToCVisitor implements Visitor{
    private TableOfContents tableOfContents = new TableOfContents();

    private static int contor = 1;

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {
        tableOfContents.add(section, contor);
        contor++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        contor++;
    }

    @Override
    public void visitImage(Image image) {
        contor++;
    }

    @Override
    public void visitTable(Table table) {
        contor++;
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    public TableOfContents getTableOfContents(){

        return tableOfContents;

    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        contor++;
    }
}
