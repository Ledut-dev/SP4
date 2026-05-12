package org.example;

public class Player {

    private String name;
    private Role role;
    private boolean isInfected;

    public Player(String name, Role role){
        this.name = name;
        this.role = role;
        this.isInfected = false;
    }

    public String getName() {
        return this.name;
    }

    public Role getRole() {
        return this.role;
    }

}
