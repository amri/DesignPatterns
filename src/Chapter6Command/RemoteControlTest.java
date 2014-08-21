package Chapter6Command;

import Chapter6Command.Command.Command;
import Chapter6Command.ConcreteCommands.*;
import Chapter6Command.Invoker.RemoteControl;
import Chapter6Command.Invoker.SimpleRemoteControl;
import Chapter6Command.Receiver.GarageDoor;
import Chapter6Command.Receiver.Light;

/**
 * Created by amri on 13/8/14.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light firstLight = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(firstLight);
        LightOffCommand lightOffCommand = new LightOffCommand(firstLight);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(lightOffCommand);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(garageDoorCloseCommand);
        simpleRemoteControl.buttonWasPressed();

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        remoteControl.setCommand(1,garageDoorOpenCommand,garageDoorCloseCommand);

        Command[] partyOnCommand = {lightOnCommand, garageDoorOpenCommand};
        Command[] partyOffCommand = {lightOffCommand, garageDoorCloseCommand};
        MacroCommand partyOnMacroCommand = new MacroCommand(partyOnCommand);
        MacroCommand partyOffMacroCommand = new MacroCommand(partyOffCommand);

        remoteControl.setCommand(2, partyOnMacroCommand, partyOffMacroCommand);
        remoteControl.onButtonPressed(2);
        remoteControl.undoButtonPressed();
    }
}
