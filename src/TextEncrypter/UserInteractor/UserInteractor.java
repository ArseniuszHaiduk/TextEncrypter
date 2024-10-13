package TextEncrypter.UserInteractor;
import TextEncrypter.ConsoleManager.IConsole;
import TextEncrypter.Encrypter.IEncrypter;

public class UserInteractor implements IUserInteractor{
    IEncrypter encrypter;
    IConsole console;

    public UserInteractor(IEncrypter encrytper, IConsole console){
        this.encrypter = encrytper;
        this.console = console;
    }

    public void Interact(){
        try {
            console.WriteLine("Encrypter 1.0:\n1)Encrypt\n2)Decrypt\nType 'Encrypt', for example.");
            switch(Options.OptionsEnum.valueOf(console.ReadLine())){
                case Options.OptionsEnum.Encrypt:
                    console.WriteLine("Message for Encryption:");
                    console.WriteLine("Encrypted data:\n" + encrypter.Encrypt(console.ReadLine()));
                    break;
                case Options.OptionsEnum.Decrypt:
                    console.WriteLine("Message for Decryption:");
                    console.WriteLine("Decrypted data:\n" + encrypter.Decrypt(console.ReadLine()));
                    break;
            }
        }
        catch(IllegalArgumentException exception){
            console.WriteLine("Incorrect Input!\nQuitting...");
        }
    }
}
