package org.example;

public class Physician extends Role{

    Physician(String name, int specialResource) {
        super(name, specialResource);
    }

    @Override
    public void useRoleCard() {
        // Ability: can once set the infection rate by -30% or 3x-10%.
        //Patient trust decreases with the rising infected population.

    }

    @Override
    void decreaseSpecialResource(int loss) {
        // if world.infectedPopulation... en form for sammenhæng
        // mellem hvor mange smittede der er og lægens troværdighed
    }
}
