package TextEncrypter.Encrypter;

public class Encrypter implements IEncrypter{
    StringBuilder stringBuilder = new StringBuilder();
    int key = 0x8A;

    public String Encrypt(String message) {
        for(char c : message.toCharArray()){
            stringBuilder.append((char)(c^key));
        }
        return stringBuilder.toString();
    }

    public String Decrypt(String message) {
        stringBuilder.delete(0, stringBuilder.length());

        for(char c : message.toCharArray()){
            stringBuilder.append((char)(c^key));
        }
        return stringBuilder.toString();
    }
}
