package com.dom;

public class Character {
    String name;
    int health;
    int poinAttack;


    public Character(String name, int health, int poinAttack){
        this.health = health;
        this.name = name;
        this.poinAttack = poinAttack;
    }

    public void minusPoin(int damage){
        health -= damage;
        System.out.println(name + " menyerang " + damage); 
    }

    public void attack(Character target){
        System.out.println(name + " attack ");
        target.minusPoin(poinAttack);
    }

    public void info(){
        System.out.println("Nama: " + name);
        System.out.println("Health: " + health);
        System.out.println("Poin Attack: " + poinAttack);
    }
}