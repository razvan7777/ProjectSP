package com.example.projectsp;

import com.example.projectsp.models.*;

public interface Visitor {


   public void visitBook(Book book);
   public void visitSection(Section section);
   public void visitParagraph(Paragraph paragraph);
   public void visitImage(Image image);
   public void visitTable(Table table);
   public void visitTableOfContents(TableOfContents tableOfContents);
   public void visitImageProxy(ImageProxy imageProxy);

}
