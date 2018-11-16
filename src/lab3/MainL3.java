package lab3;

import java.io.IOException;
import java.util.Scanner;

public class MainL3 {
    public static void main(String[]args) throws IOException {

        Scanner in = new Scanner(System.in);
        Menu menu = new Menu();
        String name = "";


        for(int bool = 0;bool!=1;) {
            menu.drawMainMenu();
            switch (menu.chooseMainMenu()) {

                case 1:

                    System.out.println("You chose Medic. Add his name: ");
                    name = in.nextLine();
                    Person medic = new Medic(name);
                    System.out.println(name + " have stats: " + "health = " + medic.getHealth() + ", attack = " + medic.getAttack() + ", your spell: " + medic.getSpellName());
                    menu.drawPersonMenu();

                    if(menu.choosePersonMenu() == 1){
                        medic.spell();
                        System.out.println("Push any button to return to the menu.");
                        char ch = (char) System.in.read();
                    }else break;
                    break;

                case 2:

                    System.out.println("You chose Soldier. Add his name: ");
                    name = in.nextLine();
                    Person soldier = new Soldier(name);
                    System.out.println(name + " have stats: " + "health = " + soldier.getHealth() + ", attack = " + soldier.getAttack() + ", your spell: " + soldier.getSpellName());
                    menu.drawPersonMenu();

                    if(menu.choosePersonMenu() == 1) {
                        soldier.spell();
                        System.out.println("Push any button to return to the menu.");
                        char ch = (char) System.in.read();
                    }else break;
                    break;

                case 3:

                    System.out.println("You chose Engineer. Add his name: ");
                    name = in.nextLine();
                    Person engineer = new Engineer(name);
                    System.out.println(name + " have stats: " + "health = " + engineer.getHealth() + ", attack = " + engineer.getAttack() + ", your spell: " + engineer.getSpellName());
                    menu.drawPersonMenu();

                    if(menu.choosePersonMenu() == 1){
                        engineer.spell();
                        System.out.println("Push any button to return to the menu.");
                        char ch = (char) System.in.read();
                    }else break;
                    break;

                case 0:

                    bool =1;
                    break;

                default :
                    System.out.println("Wrong number");
            }


        }
        System.out.println("See you later!");


    }


}
