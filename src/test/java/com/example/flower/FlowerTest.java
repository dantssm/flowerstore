package com.example.flower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }
    
    @Test
    public void testFlowerPackConstructorAndGetters() {
        Flower flower = new Flower(FlowerColor.YELLOW, FlowerType.CAMOMILLE, 5.0, 10.0);
        FlowerPack pack = new FlowerPack(flower, 3);
        
        assertEquals(5.0, pack.getFlower().getPrice());
        assertEquals(3, pack.getAmount());
    }

    @Test
    public void testFlowerPackPriceCalculation() {
        Flower flower = new Flower(FlowerColor.WHITE, FlowerType.ROSE, 8.0, 12.0);
        FlowerPack pack = new FlowerPack(flower, 4);
        
        assertEquals(32.0, pack.getPrice());  // 8.0 * 4
    }
    @Test
    public void testAddFlowerPack() {
        FlowerBucket bucket = new FlowerBucket();
        Flower flower = new Flower(FlowerColor.RED, FlowerType.TULIP, 6.0, 10.0);
        FlowerPack pack = new FlowerPack(flower, 5);
        
        bucket.addFlowerPack(pack);
        assertEquals(1, bucket.getFlowerPacks().size());
    }

    @Test
    public void testTotalPriceCalculation() {
        Flower flower = new Flower();
        flower.setPrice(100);
        flower.setFlowerType(FlowerType.ROSE);

        FlowerBucket flowerBucket = new FlowerBucket();

        FlowerPack flowerPack = new FlowerPack(flower, 5);
        flowerBucket.addFlowerPack(flowerPack);

        FlowerPack flowerPack2 = new FlowerPack(flower, 10);
        flowerBucket.addFlowerPack(flowerPack2);

        assertEquals(1500, flowerBucket.getPrice());

        flower.setPrice(10);

        assertEquals(1500, flowerBucket.getPrice());
    }
        @Test
    public void testStoreSearch() {
        Store store = new Store();

        // Prepare first flower bucket
        Flower flower1 = new Flower(FlowerColor.RED, FlowerType.ROSE, 15.0, 10.0);
        FlowerPack pack1 = new FlowerPack(flower1, 3);
        FlowerBucket bucket1 = new FlowerBucket();
        bucket1.addFlowerPack(pack1);

        // Prepare second flower bucket
        Flower flower2 = new Flower(FlowerColor.WHITE, FlowerType.TULIP, 8.0, 12.0);
        FlowerPack pack2 = new FlowerPack(flower2, 4);
        FlowerBucket bucket2 = new FlowerBucket();
        bucket2.addFlowerPack(pack2);

        // Add buckets to store
        store.getFlowerBuckets().add(bucket1);
        store.getFlowerBuckets().add(bucket2);

        // Search for white tulips
        List<Flower> result = store.search(FlowerType.TULIP, FlowerColor.WHITE);
        assertEquals(1, result.size());
    }
}

