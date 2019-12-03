package pl.knab.l2;

import pl.knab.l1.Dog;
import pl.knab.l1.Greetable;
import pl.knab.l1.Human;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {
        // Collections

        Dog brutus = new Dog();
        Human jerry = new Human("Jerry", "Buckheimer");

        List<Greetable> greetableList = Arrays.asList(brutus, jerry, jerry, jerry);
        greetableList.forEach(Greetable::greet);

        /////////////
        System.out.println("Sets!");
        Set<Greetable> greetableSet = new HashSet<>(greetableList);
        greetableSet.forEach(Greetable::greet);

        ///////////
        System.out.println("Map!");
        Map<String, Human> humans = Stream.of(
                new Human("Peter", "Parker"),
                new Human("Legolas", "Greenleaf"),
                new Human("Capitan", "Marvel"),
                new Human("", "")
        )
                .filter(human -> !human.getFullName().isEmpty())
                .collect(Collectors.toMap(
                        Human::getFullName,
                        human -> human
                ));

        List<String> fullNames = Arrays.asList(
                new Human("Peter", "Parker"),
                new Human("Legolas", "Greenleaf"),
                new Human("Capitan", "Marvel"),
                new Human("", "")
        )
                .stream()
                .filter(human -> !human.getLastName().isEmpty())
                .map(human -> human.getFullName())
                .collect(Collectors.toList());


    }
}