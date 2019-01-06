package lab5;

import java.io.*;
import java.util.Scanner;

public class TextRedactor {

    Scanner in = new Scanner(System.in);

    int valueF;
    File oldFile = new File("E://files/oldFile.txt");
    File newFile = new File("E://files/newFile.txt");
    FileWriter fw;
    BufferedWriter bw;
    FileReader fr;
    BufferedReader br;

    public TextRedactor(int numberOperation) throws IOException {

        fr = new FileReader(oldFile);
        br = new BufferedReader(fr);

        fw = new FileWriter(newFile);
        bw = new BufferedWriter(fw);

        switch (numberOperation){

            case 1:
                deleteLine();
                break;
            case 2:
                addLine();
                break;

            default:break;
        }
    }

    public void deleteLine() throws IOException {

        int numberLine;

        System.out.println("Введите номер строки для удаления:");
        numberLine = in.nextInt();

        for(int i=0;;i++){

                String line = br.readLine();
                if (line == null) break;
                if(i==numberLine-1){


                }else{
                    bw.write(line);
                    bw.flush();

                    System.out.println(line);
                    bw.write("\r\n");
                }
        }

        System.out.println("Сохранить изменения?\n1)да\n2)нет");
        valueF = in.nextInt();
        if(valueF==1)saveFile();

    }

    public void addLine() throws IOException {

        int numberLine;

        System.out.println("Введите строку для добавления:");
        String adderLine=in.nextLine();
        System.out.println("Введите номер строки для добавления:");
        numberLine = in.nextInt();
        for(int i=0;;i++){

            String line = br.readLine();


            if(i==numberLine-1){

                bw.write(adderLine);
                System.out.println(adderLine);
                bw.flush();
                bw.write("\r\n");
            }
            if (line == null) break;
            bw.write(line);
            System.out.println(line);
            bw.flush();
            bw.write("\r\n");


        }

        System.out.println("Сохранить изменения?\n1)да\n2)нет");
        valueF = in.nextInt();
        if(valueF==1)saveFile();
    }

    public void saveFile() throws IOException {

        fr = new FileReader("E://files/newFile.txt");
        br = new BufferedReader(fr);

        fw = new FileWriter("E://files/oldFile.txt");
        bw = new BufferedWriter(fw);

        for(int i=0;;i++){

            String line = br.readLine();
            if (line == null) break;

                bw.write(line);
                bw.flush();

                bw.write("\r\n");
            }

        }


}

