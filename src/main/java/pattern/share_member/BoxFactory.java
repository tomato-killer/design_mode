package pattern.share_member;

import java.util.HashMap;

public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    private static BoxFactory factory = new BoxFactory();

    private BoxFactory() {
        map = new HashMap();
        map.put("I", new IBox());
        map.put("O", new OBox());
        map.put("L", new LBox());
    }

    public static BoxFactory getInstance(){
        return factory;
    }

    public AbstractBox getShape(String name){
        return map.get(name);
    }
}
