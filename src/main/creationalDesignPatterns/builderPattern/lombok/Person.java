package main.creationalDesignPatterns.builderPattern.lombok;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder;

@Getter
@Setter
//@Data
@Builder
@ToString
public class Person {
    @NonNull
    private final String lastName;
    @NonNull
    private final String firstName;
    @NonNull
    private final Address address;

    private final Meal meal;
}
