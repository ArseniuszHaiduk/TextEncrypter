package TextEncrypter.Config;

import TextEncrypter.ConsoleManager.IConsole;
import TextEncrypter.Encrypter.IEncrypter;
import TextEncrypter.UserInteractor.UserInteractor;

public class Config {
    public Config(IEncrypter encrypter, IConsole console){
        new UserInteractor(encrypter, console).Interact();
    }
}
