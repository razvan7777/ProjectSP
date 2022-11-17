package com.example.projectsp.models;


import com.example.projectsp.Element;
import com.example.projectsp.Visitor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class TableOfContents implements Element {

    private List<String> tableOfContents = new ArrayList<>() ;


    @Override
    public void print() {
        tableOfContents.forEach((e) -> System.out.println(e));
    }

    @Override
    public void add(Element a) {

    }

    public void add(Element a, int pageNumber){

        tableOfContents.add(a.toString()+ " ...............  pg " + pageNumber);

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
