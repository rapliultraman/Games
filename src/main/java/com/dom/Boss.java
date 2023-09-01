package com.dom;

public class Boss extends Character {
    int healing;

    public Boss(String name, int health, int poinAttack, int healing){
        super(name, health, poinAttack);
        this.healing = healing;
    }

    public void nambahDarah(){
        healing += health;
        System.out.println("attack lagi dong puhh sepuhhh:D");
    }
    
}