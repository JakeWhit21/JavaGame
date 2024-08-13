import iface.GameInput;
import iface.GameOutput;
import impl.ConsoleInput;
import impl.ConsoleOutput;
import Items.Item;
import Items.Axe;

public class App {
    public static void main(String[] args) {
        GameOutput output = new ConsoleOutput();
        GameInput input = new ConsoleInput();

        // String name = input.getInput("What is your name? ");

        // output.output("Your name is " + name);

        Item axe = new Axe();

        output.output(axe.getName());
        output.output(axe.getDescription());
        output.output(Integer.toString(axe.getDamage()));
    }
}
