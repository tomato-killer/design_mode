package pattern.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());

        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

        Person person = new Person.Builder()
                .age(8)
                .name("zhangsan")
                .gender("男")
                .builder();

        System.out.println(person.toString());
    }
}
