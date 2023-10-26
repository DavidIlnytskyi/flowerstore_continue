package com.example.demo;

class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Delivered via postal service.");
    }
}