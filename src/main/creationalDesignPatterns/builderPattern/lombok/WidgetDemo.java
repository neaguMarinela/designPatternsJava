package main.creationalDesignPatterns.builderPattern.lombok;

public class WidgetDemo {
    public static void main(String[] args) {
        Widget testWidget = Widget.builder()
                .name("foo")
                .id(1)
                .build();

        System.out.println(testWidget);
    }
}
