//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        // Concrete Commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn OFF
        remote.setCommand(lightOff);
        remote.pressButton();

    }
}