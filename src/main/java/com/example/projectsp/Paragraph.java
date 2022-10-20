package com.example.projectsp;

public class Paragraph implements Element {
    private String text;


    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraful "+text);
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
}
