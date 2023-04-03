package pattern.order;

import java.util.ArrayList;
import java.util.List;

public class Waitor {

    private List<Command> commands = new ArrayList();

    public void setCommands(Command command) {
        commands.add(command);
    }

    public void orderUp(){
        System.out.println("服务员提交订单");

        for (Command command : commands) {
            if (command != null)
                command.execute();
        }
    }
}
