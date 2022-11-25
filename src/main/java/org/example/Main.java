package org.example;


import org.example.draw.Drawable;

//Main method calling the methods from interface
public class Main {
    public static void main(String[] args) {

        Drawable draw = new Square();
        draw.mark();
        draw.text();
    }
}