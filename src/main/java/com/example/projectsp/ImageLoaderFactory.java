package com.example.projectsp;

import java.awt.image.BufferedImage;

public class ImageLoaderFactory {


    public static BufferedImage create(String url){

        String extension = url.substring(url.length() - 3);
        if(extension.equals("bmp"))
            return new ImageLoaderBMP().load(url);
        else if(extension.equals("jpg")){
            return new ImageLoaderJPG().load(url);


        }
        return null;



    }

}
