package org.example.draw;

//Interface Drawable
public interface Drawable {
    void mark();
    default void text(){
        System.out.println("Default text from interface drawable !!");
    }
}
