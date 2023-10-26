package com.example.demo;

class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Delivered via DHL.");
    }
}