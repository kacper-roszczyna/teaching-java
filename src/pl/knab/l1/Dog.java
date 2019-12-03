package pl.knab.l1;

public class Dog implements Greetable {

    @Override
    public void greet() {
        System.out.println("Tail wagging intensifies");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
