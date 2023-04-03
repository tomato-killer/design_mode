package pattern.template;

public class ConcreateClass_Cabbage extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("调味料：辣椒");
    }
}
