package com.example.projectsp;

public class Image implements Element {

    private String imageName;


    public Image(String name) {
        this.imageName = name;
    }

    public void print() {
        System.out.println("Imaginea "+imageName);
    }
}
