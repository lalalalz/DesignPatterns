package Command.after;

public class App {

    public static void main(String[] args) {
//        Button button = new Button(new LightOnCommand(new Light()));
        Button button = new Button(new LightOffCommand(new Light()));

        button.press();
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
