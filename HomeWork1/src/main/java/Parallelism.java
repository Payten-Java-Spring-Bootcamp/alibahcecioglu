package com.example.homework_1;

public class Parallelism {
    int sumOfWeights = widgets.parallelStream()
            .filter(b -> b.getColor() == RED)
            .mapToInt(b -> b.getWeight())
            .sum();

}
