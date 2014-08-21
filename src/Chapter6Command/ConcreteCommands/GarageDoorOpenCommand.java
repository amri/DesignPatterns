package Chapter6Command.ConcreteCommands;

import Chapter6Command.Command.Command;
import Chapter6Command.Receiver.GarageDoor;

/**
 * Created by amri on 13/8/14.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
