package pattern.facade;

public class SmartApplicationFacade {


    private Light light;
    private Television tv;
    private AirConditioner ac;

    public SmartApplicationFacade() {
        light = new Light();
        tv = new Television();
        ac = new AirConditioner();
    }

    public void say(String message) {
        if (message.equals("打开"))
            on();
        else if (message.equals("关闭"))
            off();
        else
            throw new RuntimeException("不支持的功能");
    }

    private void off() {
        light.off();
        tv.off();
        ac.off();
    }

    private void on() {
        light.on();
        tv.on();
        ac.on();
    }
}
