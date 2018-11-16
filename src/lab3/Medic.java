package lab3;

public class Medic extends Person {

    public Medic(String name) {
        super(name, 100, 5);
    }

    @Override
    public String getSpellName() {
        return super.spellName = "healing";
    }

    public void spell(){

        System.out.println(Medic.class.getSimpleName() +" "+ super.name + " use spell : " + getSpellName());

    }
}
