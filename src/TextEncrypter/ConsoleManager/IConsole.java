package TextEncrypter.ConsoleManager;

public interface IConsole {
    public void Write(String message);

    public void WriteLine(String message);

    public String ReadLine();
}
