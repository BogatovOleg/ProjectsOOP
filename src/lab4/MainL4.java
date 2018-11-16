package lab4;

import java.io.File;
import java.io.IOException;

public class MainL4 {

    public static void main(String[] args) throws IOException {
        File oldFile = new File("E://oldFile.txt");
        File newFile = new File("E://newFile.txt");
        CopyFile copy = new CopyFile();
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException e){

            System.out.println(e.getMessage());
        }

        long start = System.nanoTime();
        copy.copyFileJava(oldFile,newFile);
        System.out.println("Время копирования файла с помощью потоков = "+(System.nanoTime()-start));
    }
}
