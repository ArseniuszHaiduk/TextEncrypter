package TextEncrypter;

import TextEncrypter.Config.Config;
import TextEncrypter.ConsoleManager.Console;
import TextEncrypter.Encrypter.Encrypter;

public class Main {
    public static void main(String[] args) {
        new Config(new Encrypter(), new Console());
    }
}
