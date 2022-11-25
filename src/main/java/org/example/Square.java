package org.example;

import org.example.draw.Drawable;

//Class extending the interface
public class Square implements Drawable {
    @Override
    public void mark() {
        System.out.println("Mark method from Square !!");
    }

    @Override
    public void text() {
        Drawable.super.text();
        System.out.println("Text method from Square !!");
    }
}
