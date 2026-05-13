package org.example;

public abstract class Role {

    protected String name;
    protected int specialResource;

    Role (String name, int specialResource){
        this.name=name;
        this.specialResource=specialResource;

    }

    abstract public void useRoleCard();

    abstract void decreaseSpecialResource(int loss);






}
