package pattern.order;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private int restTabNum;

    private Map<String, Integer> foodDir = new HashMap();

    public int getRestTabNum() {
        return restTabNum;
    }

    public void setRestTabNum(int restTabNum) {
        this.restTabNum = restTabNum;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
