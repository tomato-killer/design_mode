package pattern.bridge;

public class Client {


    public static void main(String[] args) {


        OperatingSystem mac = new Mac(new AviFile());

        mac.play("加勒比海盗");
    }
}
