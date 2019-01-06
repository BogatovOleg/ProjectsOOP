package lab5;

import java.io.*;
import java.util.Scanner;

public class MainL5 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int value;

        File oldFile = new File("E://files/oldFile.txt");
        File newFile = new File("E://files/newFile.txt");

        CopyFile copy = new CopyFile();
        copy.copyFileJava(oldFile,newFile);

        FileReader fr;
        BufferedReader br;

        while(true){
            fr = new FileReader("E://files/oldFile.txt");
            br = new BufferedReader(fr);
            System.out.println("Текст в файле:");
            for(int i=0;;i++) {

                String line = br.readLine();
                if (line == null) break;
                System.out.println(line);

            }

            System.out.println("\nВыберите операцию:\n1)Удалить строку\n2)Добавить строку\n3)Выйти");
            value = in.nextInt();

            if(value==3)break;
            TextRedactor red = new TextRedactor(value);

        }

    }
}
