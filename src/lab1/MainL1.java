package lab1;

import java.util.Scanner;

public class MainL1 {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String st1 = in.nextLine();
        int size1 = st1.length();

        System.out.print("Введите вторую строку: ");
        String st2 = in.nextLine();
        int size2 = st2.length();

        System.out.print("Введите третью строку: ");
        String st3 = in.nextLine();
        int size3 = st2.length();

        if(st1.length()==st2.length()&&st1.length()==st3.length())
            System.out.print("Все строки одинаковые.");

        else if(st1.length()<=st2.length()&&st1.length()<=st3.length()){

            if(st1.length()==st2.length())
                System.out.print("Строка 1 и 2 : "+st1+", "+st2+" - Меньше других строк.");

            else if(st1.length()==st3.length())
                System.out.print("Строка 1 и 3 : "+st1+", "+st3+" - Меньше других строк.");

            else System.out.print("Строка 1:"+st1+" - Меньше других строк.");

        }else if(st2.length()<=st1.length()&&st2.length()<=st3.length()){

            if(st2.length()==st3.length())
                System.out.print("Строка 2 и 3 : "+st2+", "+st3+" - Меньше других строк.");

            else System.out.print("Строка 2:"+st2+" - Меньше других строк.");

        }else if(st3.length()<=st2.length()&&st3.length()<=st1.length()){

            System.out.print("Строка 3:"+st3+" - Меньше других строк.");

        }


    }

}
