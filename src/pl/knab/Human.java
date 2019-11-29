package pl.knab;

public class Human implements Greetable {

    protected String firstName;
    protected String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void greet() {
        System.out.println("Hi " + firstName);
    }
}
