package com.example.projectsp;

import lombok.Getter;

@Getter
public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy = null;


    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        if(alignStrategy == null)
        System.out.println("Paragraful "+text);
        else
            alignStrategy.render(this , 13);
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

    public void setAlignStrategy(AlignStrategy alignStrategy) {

        this.alignStrategy = alignStrategy;

    }
}
