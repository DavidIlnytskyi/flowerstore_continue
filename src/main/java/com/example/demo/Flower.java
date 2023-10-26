package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower{
    private String name;
    private int price;
    private FlowerColor color;

    public String getColor(){
        return color.getColor();
    }
    Flower(String name, int price, FlowerColor color){
        this.price = price;
        this.color = color;
        this.name = name;
    }
}