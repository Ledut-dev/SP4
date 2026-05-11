package org.example;

public class InvestegativeJournalist extends Role{

    InvestegativeJournalist (String name, int specialResource) {
        super(name, specialResource);
    }

    @Override
    public void useRoleCard() {
        //Ability: can expose possible outbreaks and inform your next move.
        // (Exposes next scenario highlight)

    }

    @Override
    void decreaseSpecialResource(int loss) {

    }
}
