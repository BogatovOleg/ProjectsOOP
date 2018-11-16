package lab3;

public class Soldier extends Person {

    public Soldier(String name) {
        super(name, 120, 20);
    }

    @Override
    public String getSpellName() {
        return super.spellName = "ammo supply";
    }

    public void spell() {

        System.out.println(Soldier.class.getSimpleName() + " " + super.name + " use spell : " + getSpellName());
    }
}
