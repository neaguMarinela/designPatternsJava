package main.creationalDesignPatterns.builderPattern.lombok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder;

@Getter
@Setter
//@Data
@Builder
@ToString
public class Widget {
    private final String name;
    private final int id;
}
