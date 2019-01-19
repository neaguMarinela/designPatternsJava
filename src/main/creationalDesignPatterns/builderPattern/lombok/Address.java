package main.creationalDesignPatterns.builderPattern.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
@Builder
@ToString
public class Address {
    @NonNull
    private final String street;
    @NonNull
    private final Integer number;
    @NonNull
    private final String city;
    @NonNull
    private final String country;
}
