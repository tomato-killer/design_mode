package pattern.observer;

public class Client {

    public static void main(String[] args) {

        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new User("张三"));
        subject.attach(new User("李四"));
        subject.attach(new User("王二"));

        subject.notify("hello dog");
    }
}
