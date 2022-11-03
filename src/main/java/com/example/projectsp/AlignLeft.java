package com.example.projectsp;

public class AlignLeft implements AlignStrategy {






    @Override
    public void render(Paragraph paragraph, int numberOfCharPerLine) {
        System.out.print(paragraph.getText());
        for(int i=0 ; i<numberOfCharPerLine; i++)
        System.out.print("#");
        System.out.println();

    }
}
