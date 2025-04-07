package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor color;

    public Ceiling(int heigth, PaintColor color) {
        this.height = heigth;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }
    public void create(){
        System.out.println("Ceiling has been built.");
    }
}
