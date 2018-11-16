package lab2;

public class PasswordGenerator {
    public String getPass(int size) {
        String pass = "";
        for (int i = 0; i < size; ++i) {
            char ch = (char) randomRange ('A','Z');
            pass += Character.toString(ch);
        }
        return pass;
    }

    private int randomRange(int min,int max) {
        int rand = (int) (Math.random() *1000);
        int value = min + rand % (max - min + 1);
        return value;
    }
}
