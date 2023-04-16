package pattern.visitor;

public class Client {

    public static void main(String[] args) {
        Home home = new Home();

        home.add(new Cat());
        home.add(new Dog());

        Owner owner = new Owner();
        home.action(owner);
        SomeOne someOne = new SomeOne();
        home.action(someOne);
    }
}