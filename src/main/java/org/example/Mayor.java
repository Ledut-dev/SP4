package org.example;

public class Mayor extends Role{

    Mayor(String name, int specialResource) {
        super(name, specialResource);
    }

    @Override
    public void useRoleCard() {
        //Abilities: Can make decisions affecting the local society.
        // This will affect the public approval. If public approval==0,
        // the politician loses their political role, and thereby the ability to make societal decisions.

    }

    @Override
    void decreaseSpecialResource(int disapproval) {
        this.specialResource=specialResource-disapproval;
    }




}
