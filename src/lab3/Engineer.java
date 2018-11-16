package lab3;

public class Engineer extends Person{

    public Engineer(String name) {
        super(name, 150, 10);
    }

    @Override
    public String getSpellName() {
        return super.spellName = "supply armor";
    }

    public void spell(){

        System.out.println(Engineer.class.getSimpleName() +" "+ super.name + " use spell : " + getSpellName());
    }

}

