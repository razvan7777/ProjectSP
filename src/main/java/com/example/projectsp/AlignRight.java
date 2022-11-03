package com.example.projectsp;

public class AlignRight implements AlignStrategy{





    @Override
    public void render(Paragraph paragraph, int numberOfCharPerLine) {


        for(int i=0 ; i<numberOfCharPerLine; i++)
            System.out.print("#");
        System.out.print(paragraph.getText());
        System.out.println();
    }
}
