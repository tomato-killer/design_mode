package pattern.template;

public class ConcreateClass_Caixin extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("调味料：蒜蓉");
    }
}
