package lab3;

import java.util.Scanner;

public class Menu {
    int choose;
    Scanner in = new Scanner(System.in);

    public void drawMainMenu(){
        System.out.println("Hello, welcome to the strategy game.\n Choose your hero:\n");
        System.out.println("1) "+ Medic.class.getSimpleName());
        System.out.println("2) "+ Soldier.class.getSimpleName());
        System.out.println("3) "+ Engineer.class.getSimpleName());
        System.out.println("0) Exit from the game.");
        System.out.println("Press button with number your choice.");

    }
    public int chooseMainMenu(){

        return choose = in.nextInt();

    }
    public void drawPersonMenu() {

        System.out.println("do you wanna use your class spell?");
        System.out.println("1)yes");
        System.out.println("2)no, return to menu");

    }
    public int choosePersonMenu(){

        return choose = in.nextInt();

    }


}
