package org.example.draw;

public interface Drawable {
    void mark();
    default void text(){
        System.out.println("Default text from interface drawable !!");
    }
}
