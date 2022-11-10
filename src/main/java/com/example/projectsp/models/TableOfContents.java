package com.example.projectsp.models;


import com.example.projectsp.Element;
import com.example.projectsp.Visitor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class TableOfContents implements Element {

    private String something;


    @Override
    public void print() {
        System.out.println(something);
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
        visitor.visitTableOfContents(this);
    }
}
