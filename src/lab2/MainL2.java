package lab2;

public class MainL2 {
    public static void main(String[]args){
        int size = 8;
        PasswordGenerator passGen = new PasswordGenerator();
        String pass = passGen.getPass(size);
        System.out.format("generated pass is %s\n", pass);
    }

}

