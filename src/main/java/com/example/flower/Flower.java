/**
 * Represents a flower with color, type, price, and sepal length.
 */
package com.example.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter@NoArgsConstructor@AllArgsConstructor
public class Flower {

    /**
     * Color of the flower.
     */
    private FlowerColor color;

    /**
     * Type of the flower.
     */
    private FlowerType flowerType;

    /**
     * Price of the flower.
     */
    private double price;

    /**
     * Length of the flower's sepal.
     */
    private double sepalLength;

    /**
     * Creates a copy of an existing flower.
     *
     * @param flower the flower to copy
     */
    public Flower(Flower flower) {
        this.color = flower.color;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }
    
    /**
     * Gets the color code of the flower.
     *
     * @return the color code
     */
    public String getColor() {
        return color.getCode();
    }
}
