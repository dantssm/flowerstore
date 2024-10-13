package com.example.flower;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
@Getter
public class Store {

    private List<FlowerBucket> flowerBuckets;

    public Store() {
        this.flowerBuckets = new ArrayList<>();
    }
    public List<Flower> search(FlowerType flowerType, FlowerColor flowerColor) {
        List<Flower> match = new ArrayList<>();

        for (FlowerBucket bucket : flowerBuckets) {
            for (FlowerPack pack : bucket.getFlowerPacks()) {
                Flower flower = pack.getFlower();
                if (flower.getFlowerType() == flowerType && flower.getColor().equals(flowerColor.getCode())) {
                    match.add(flower);
                }
            }
        }
        return match;
    }
}
