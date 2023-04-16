package pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Home {

    private List<Animal> list = new ArrayList();

    public void add(Animal animal){
        list.add(animal);
    }

    public void action(Person person){
        for (Animal animal : list) {
            animal.accept(person);
        }
    }
}
