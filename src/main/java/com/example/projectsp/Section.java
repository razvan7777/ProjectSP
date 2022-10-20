package com.example.projectsp;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Section implements Element{

    private String title;
    private List<Element> elements = new ArrayList<>();

    public Section(String title) {
        this.title=title;
    }


    @Override
    public void print() {
        System.out.println(title);
        elements.forEach(e -> e.print());
    }

    @Override
    public void add(Element a) {
        elements.add(a);
    }

    @Override
    public void remove(Element a) {
        elements.remove(a);
    }

    @Override
    public Element get(int a) {
        return elements.get(a);
    }
}
