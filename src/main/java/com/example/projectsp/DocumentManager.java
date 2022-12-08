package com.example.projectsp;

import com.example.projectsp.models.Book;

public class DocumentManager {

    static private DocumentManager instance = new DocumentManager();
    private Book book;


    private DocumentManager(){



    }

    static public DocumentManager getInstance(){

        return instance;

    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book){

        this.book = book;

    }
}
