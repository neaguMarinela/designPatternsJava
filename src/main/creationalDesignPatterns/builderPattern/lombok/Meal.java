package main.creationalDesignPatterns.builderPattern.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
@Builder
@ToString
public class Meal {
    private final Vegetarian vegFood;
    private final NonVegetarian nonVegFood;
    private final Drinks drinks;
}
