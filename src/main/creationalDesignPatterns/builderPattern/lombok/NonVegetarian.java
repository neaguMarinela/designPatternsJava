package main.creationalDesignPatterns.builderPattern.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
@Builder
@ToString
public class NonVegetarian {
    private final String name;
}
