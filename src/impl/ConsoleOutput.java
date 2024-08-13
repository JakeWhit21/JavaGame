package impl;

import iface.GameOutput;

public class ConsoleOutput implements GameOutput {
    @Override
    public void output(String text) {
        System.out.println(text);
    }
}
