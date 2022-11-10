package com.example.projectsp;

import com.example.projectsp.models.Paragraph;

public interface AlignStrategy {

    void render(Paragraph paragraph , int numberOfCharPerLine);
}
