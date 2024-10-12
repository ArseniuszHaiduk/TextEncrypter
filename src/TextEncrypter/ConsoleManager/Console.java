package TextEncrypter.ConsoleManager;

import java.util.Scanner;

public class Console implements IConsole{
    Scanner scanner = new Scanner(System.in);

    public void Write(String message) {
        System.out.print(message);
    }

    public void WriteLine(String message) {
        System.out.println(message);
    }

    public String ReadLine() {
        return scanner.nextLine();
    }
}
