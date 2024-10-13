package com.example;

import com.example.flower.Flower;
import com.example.flower.FlowerBucket;
import com.example.flower.FlowerPack;
import com.example.flower.FlowerType;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Flower flower = new Flower();
        flower.setPrice(100);
        flower.setFlowerType(FlowerType.ROSE);

        FlowerBucket flowerBucket = new FlowerBucket();

        FlowerPack flowerPack = new FlowerPack(flower, 5);
        flowerBucket.addFlowerPack(flowerPack);

        FlowerPack flowerPack2 = new FlowerPack(flower, 10);
        flowerBucket.addFlowerPack(flowerPack2);

        System.out.println(flowerBucket.getPrice());

        flower.setPrice(10);

        System.out.println(flowerBucket.getPrice());
        
    }
}