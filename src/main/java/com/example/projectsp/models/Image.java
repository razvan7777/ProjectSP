package com.example.projectsp.models;

import com.example.projectsp.Element;
import com.example.projectsp.ImageLoaderFactory;
import com.example.projectsp.Visitor;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

public class Image implements Element {

    private String url;
    private BufferedImage content;


    public Image(String url) {
        this.url = url;
        this.content = ImageLoaderFactory.create(url);
    }

    public void print() {
        JLabel picLabel = new JLabel(new ImageIcon(content));
        JPanel jPanel = new JPanel();
        jPanel.add(picLabel);
        JFrame f = new JFrame();
        f.setSize(new Dimension(content.getWidth(), content.getHeight()));
        f.add(jPanel);
        f.setVisible(true);
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
        visitor.visitImage(this);
    }
}
