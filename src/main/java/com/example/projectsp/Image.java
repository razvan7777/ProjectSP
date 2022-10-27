package com.example.projectsp;

import java.util.concurrent.TimeUnit;

public class Image implements Element {

    private String url;
    private String content;


    public Image(String url) {
        url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Imaginea "+url);
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
