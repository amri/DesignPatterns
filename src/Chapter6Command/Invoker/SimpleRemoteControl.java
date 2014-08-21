package Chapter6Command.Invoker;

import Chapter6Command.Command.Command;

/**
 * Created by amri on 13/8/14.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl()
    {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
