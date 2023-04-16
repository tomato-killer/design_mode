package pattern.memento.black_box;

import pattern.memento.white_box.RoleStateMemento;

public class RoleStateManager {

    private Memento memento;

    public Memento getRoleStateMemento() {
        return memento;
    }

    public void setRoleStateMemento(Memento memento) {
        this.memento = memento;
    }
}