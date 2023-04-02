package pattern.adaptor;

public class Computer {


    public String readSD(SDCard card){
        if (card == null){
            throw new RuntimeException("sd card can not be empty");
        }
        return card.readSD();
    }
}
