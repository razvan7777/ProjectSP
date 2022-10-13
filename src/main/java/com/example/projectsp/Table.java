package com.example.projectsp;

public class Table implements Element {


    private String title;


    public Table(String name) {
        this.title = name;
    }

    public void print(){
        System.out.println("Tabelul "+title);
    }
}
