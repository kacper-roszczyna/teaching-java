package pl.knab.l1;

public class Engineer extends Human {

    public Engineer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public static Engineer fromFullName(String fullName) {
        return new Engineer(fullName.split(" ")[0],
                fullName.split(" ")[1]);
    }

    @Override
    public void greet() {
        System.out.println("Hi, I am an engineer. My name is " + firstName);
    }
}
