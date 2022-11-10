package com.example.projectsp.models;

import com.example.projectsp.AlignStrategy;
import com.example.projectsp.Element;
import com.example.projectsp.Visitor;
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {

        this.alignStrategy = alignStrategy;

    }
}
