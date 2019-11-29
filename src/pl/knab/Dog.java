package pl.knab;

public class Dog implements Greetable {

    @Override
    public void greet() {
        System.out.println("Tail wagging intensifies");
    }
}
