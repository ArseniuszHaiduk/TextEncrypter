package TextEncrypter.Config;

import TextEncrypter.ConsoleManager.Console;
import TextEncrypter.Encrypter.Encrypter;
import TextEncrypter.UserInteractor.UserInteractor;

public class Config {
    public Config(Encrypter encrypter, Console console){
        new UserInteractor(encrypter, console).Interact();
    }
}
