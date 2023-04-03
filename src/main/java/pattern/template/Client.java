package pattern.template;

public class Client {

    public static void main(String[] args) {
        ConcreateClass_Cabbage cabbage = new ConcreateClass_Cabbage();

        cabbage.cookProcess();

        ConcreateClass_Caixin caixin = new ConcreateClass_Caixin();

        caixin.cookProcess();
    }
}
