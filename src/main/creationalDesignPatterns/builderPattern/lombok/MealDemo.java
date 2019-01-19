package main.creationalDesignPatterns.builderPattern.lombok;

public class MealDemo {
    public static void main(String[] args) {

        Meal breakfast = Meal.builder()
                .drinks(Drinks.builder()
                        .hot("Tea")
                        .build())
                .vegFood(Vegetarian.builder()
                        .name("Humus")
                        .build())
                .build();

        Meal lunch = Meal.builder()
                .drinks(Drinks.builder()
                        .cold("Pepsi")
                        .build())
                .nonVegFood(NonVegetarian.builder()
                        .name("Shaorma")
                        .build())
                .build();

        Person male = Person.builder()
                .lastName("Ion")
                .firstName("Popescu")
                .address(Address.builder()
                        .city("Timisoara")
                        .country("Romania")
                        .street("Victoriei")
                        .number(2)
                        .build())
                .meal(breakfast)
                .build();

        Person female = Person.builder()
                .lastName("Maria")
                .firstName("Popescu")
                .address(Address.builder()
                        .city("Timisoara")
                        .country("Romania")
                        .street("Victoriei")
                        .number(2)
                        .build())
                .meal(lunch)
                .build();

        System.out.println("The male: " + male + " take breakfast " + breakfast);
        System.out.println("The female: " + female + " take lunch " + lunch);
        System.out.println("\nmale object: " + male);
        System.out.println("\nfemale object: " + female);
    }
}
