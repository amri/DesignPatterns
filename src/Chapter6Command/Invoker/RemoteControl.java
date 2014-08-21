package Chapter6Command.Invoker;

import Chapter6Command.Command.Command;

/**
 * Created by amri on 13/8/14.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        undoCommand = new Command() {
            @Override
            public void execute() {

            }

            @Override
            public void undo() {

            }
        };

        for (int i = 0; i < 7; i++) {
            onCommands[i] = new Command() {
                @Override
                public void execute() {

                }

                @Override
                public void undo() {

                }
            };

            offCommands[i] = new Command() {
                @Override
                public void execute() {

                }

                @Override
                public void undo() {

                }
            };
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPressed()
    {
        undoCommand.undo();
    }
}
