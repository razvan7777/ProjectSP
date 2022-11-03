package com.example.projectsp;

public class AlignCenter implements AlignStrategy {


    @Override
    public void render(Paragraph paragraph, int numberOfCharPerLine) {

        for(int i=0 ; i<numberOfCharPerLine/2; i++)
            System.out.print("#");
        System.out.print(paragraph.getText());
        for(int i=0 ; i<numberOfCharPerLine/2; i++)
            System.out.print("#");
        System.out.println();
    }
}
