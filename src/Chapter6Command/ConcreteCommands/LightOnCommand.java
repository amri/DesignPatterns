package Chapter6Command.ConcreteCommands;

import Chapter6Command.Command.Command;
import Chapter6Command.Receiver.Light;

/**
 * Created by amri on 13/8/14.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
