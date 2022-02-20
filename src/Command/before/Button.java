package Command.before;


// Invoker
public class Button {

    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        light.on();
//        light.off();
    }
}
