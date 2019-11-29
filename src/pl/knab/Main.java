package pl.knab;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        int minimalNumberOfPlayers = 7;

        int numberOfTeamPlayers = 6;

        if (minimalNumberOfPlayers > numberOfTeamPlayers) {
            System.out.println("STOP THE GAME");
        } else {
            System.out.println("CONTINUE PLEASE");
        }

        boolean isGameContinued = minimalNumberOfPlayers > numberOfTeamPlayers ?
                false : true;

        switch (numberOfTeamPlayers) {
            case 10:
                System.out.println("Someone got kicked");
                break;
            default:
                System.out.println("Something else happened");
                break;
        }

        // loops

        List<Integer> numbers = Arrays.asList(1, 2, 4, 7, 83, 22);
        for (Integer number : numbers) {
            String msg = number % 2 == 0 ? "EVEN" : "ODD";
            System.out.println(msg);
        }

        numbers.forEach(number -> {
            String msg = number % 2 == 0 ? "EVEN" : "ODD";
            System.out.println(msg);
        });


        Dog azor = new Dog();
        Human jerry = new Human("Jerry", "Springer");
        Engineer kacper = Engineer.fromFullName("Kacper Roszczyna");
        Greetable custom = new Greetable() {
            @Override
            public void greet() {
                System.out.println("What?!");
            }
        };

        List<Greetable> greeters = Arrays.asList(azor, jerry, kacper);

        System.out.println("///////////////////////////////////");

        greeters.forEach(greetable -> greetable.greet());





















        //////////////////

        Function<String, Integer> letterCounter = String::length;

        BiFunction<Integer, Integer, Integer> adder = (integer, integer2) -> integer + integer2;

        addX(5).apply(8);

    }

    static Function<Integer, Integer> addX(Integer x) {
        return new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return x + integer;
            }
        };
    }

}
