package pattern.template;

public abstract class AbstractClass {

    public void pourOil(){
        System.out.println("倒油");
    }

    public void heatOil(){
        System.out.println("热油");
    }

    public void fry(){
        System.out.println("翻炒");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();

    public final void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }
}
