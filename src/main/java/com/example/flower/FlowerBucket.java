package com.example.flower;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class FlowerBucket {

    private List<FlowerPack> flowerPacks;

    public FlowerBucket(){
        this.flowerPacks = new ArrayList<>();
    }
    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).getAmount() * 
            flowerPacks.get(i).getFlower().getPrice();
        }

        return price;
    }
}
