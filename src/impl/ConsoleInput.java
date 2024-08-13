package impl;

import java.util.Scanner;

import iface.GameInput;

public class ConsoleInput implements GameInput{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
