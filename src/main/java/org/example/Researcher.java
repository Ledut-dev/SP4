package org.example;

public class Researcher extends Role{


    Researcher(String name, int specialResource) {
        super(name, specialResource);


    }

    @Override
    public void useRoleCard() {
        //Ability: can get an extra clue regarding the disease. If funding==0, researcher loses ability.
        //Every ekstra clue costs funding.

    }

    @Override
    void decreaseSpecialResource(int loss) {
        this.specialResource = specialResource-loss;
    }

    public int getFunding() {
        return this.specialResource;
    }





}
