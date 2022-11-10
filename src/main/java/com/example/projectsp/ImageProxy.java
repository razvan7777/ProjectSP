package com.example.projectsp;

import com.example.projectsp.models.Image;

import java.awt.*;

public class ImageProxy implements Element {
    private String url;
    private Dimension dim;
    private com.example.projectsp.models.Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }


    public com.example.projectsp.models.Image loadImage(){
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}
