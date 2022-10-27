package com.example.projectsp;

import java.awt.*;

public class ImageProxy implements Element {
    private String url;
    private Dimension dim;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }


    public Image loadImage(){
        if (realImage ==null)
            realImage = new Image(url);
        return realImage;

    }

    @Override
    public void print() {
        loadImage();
        realImage.print();

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
