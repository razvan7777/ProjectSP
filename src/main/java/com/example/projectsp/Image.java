package com.example.projectsp;

public class Image implements Element {

    private String imageName;


    public Image(String name) {
        this.imageName = name;
    }

    public void print() {
        System.out.println("Imaginea "+imageName);
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
