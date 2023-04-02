package pattern.share_member;

public class Client {

    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();

        AbstractBox i = factory.getShape("I");
        AbstractBox l = factory.getShape("L");
        AbstractBox o = factory.getShape("O");
        AbstractBox o1 = factory.getShape("O");
        i.display("灰色");
        l.display("绿色");
        o.display("红色");
        o1.display("黑色");


    }
}
