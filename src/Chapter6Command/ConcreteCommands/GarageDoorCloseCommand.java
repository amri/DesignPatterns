package Chapter6Command.ConcreteCommands;

import Chapter6Command.Command.Command;
import Chapter6Command.Receiver.GarageDoor;

/**
 * Created by amri on 13/8/14.
 */
public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
