package com.example.projectsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjectSpApplication {

    public static void main(String[] args) {

            Image image = new Image("C:\\Users\\raybo\\Pictures\\pexels-joão-cabral-3299386.jpg");
            image.print();


    }


    }


