package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {
    private int quantity;
    private Flower flower;
    private int price;
    public FlowerPack(Flower flower, int quantity){
        this.quantity = quantity;
        this.flower = flower;
        this.price = flower.getPrice() * quantity;
    }
}
