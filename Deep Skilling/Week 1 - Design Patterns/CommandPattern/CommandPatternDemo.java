public class CommandPatternDemo {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightsOn = new LightOnCommand(livingRoomLight);
        Command lightsOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        // Turn light ON
        remote.setCommand(lightsOn);
        remote.pressButton();

        // Turn light OFF
        remote.setCommand(lightsOff);
        remote.pressButton();
    }
}
