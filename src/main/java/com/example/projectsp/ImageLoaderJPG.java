package com.example.projectsp;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoaderJPG implements ImageLoader {
    @Override
    public BufferedImage load(String url) {
        try {
            return ImageIO.read(new File(url));
        }
        catch(IOException e)
        {
            return null;
        }
    }
}
