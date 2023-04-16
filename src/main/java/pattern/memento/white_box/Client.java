package pattern.memento.white_box;

public class Client {

    public static void main(String[] args) {



        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        System.out.println("______________________大战boss前______________________");

        RoleStateManager roleStateManager = new RoleStateManager();
        roleStateManager.setRoleStateMemento(gameRole.saveState());


        System.out.println("______________________大战boss后______________________");

        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("______________________恢复之前的状态______________________");

        gameRole.recoverState(roleStateManager.getRoleStateMemento());

        gameRole.stateDisplay();
    }
}
