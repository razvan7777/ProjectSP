package com.example.projectsp.models;

import com.example.projectsp.Element;
import com.example.projectsp.Visitor;

public class Table implements Element {


    private String title;


    public Table(String name) {
        this.title = name;
    }

    public void print(){
        System.out.println("Tabelul "+title);
    }

    @Override
    public void add(Element a) {

    }

    @Override
    public void remove(Element a) {

    }

    @Override
    public Element get(int a) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
