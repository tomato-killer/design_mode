package pattern.memento.white_box;

public class GameRole {

    private int vit;
    private int atk;
    private int def;

    public void initState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit, atk, def);
    }

    public void recoverState(RoleStateMemento roleStateMemento){
        this.vit = roleStateMemento.getVit();
        this.def = roleStateMemento.getDef();
        this.atk = roleStateMemento.getAtk();
    }

    public void stateDisplay(){
        System.out.println("生命力：" + vit);
        System.out.println("战斗力：" + atk);
        System.out.println("防御力：" + def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
