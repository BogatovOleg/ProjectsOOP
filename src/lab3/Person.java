package lab3;

public class Person {
    String name;
    String spellName;
    int health;
    int attack;


    public Person (String name, int health, int attack){
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public String getName(){

        return name;

    }

    public int getHealth(){

        return health;

    }

    public int getAttack(){

        return attack;

    }
    public String getSpellName(){


        return spellName;
    }

    public void spell(){

    }

}
