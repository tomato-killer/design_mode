package pattern.facade;

public class Client {

    public static void main(String[] args) {

        SmartApplicationFacade facade = new SmartApplicationFacade();
        facade.say("打开");
        facade.say("关闭");
    }
}
