package com.dom;

public class Player extends Character {
   int leveling;
   
   public Player(String name, int health,int poinAttack, int leveling) {
      super(name, health, poinAttack);
   }

   public void levelUp(){
      leveling += 100;
      System.out.println(name + "takut tambah dewasa aku banh!!!");
   }

   public void defends(String name){
      System.out.println(name + "ngindar coyy");  
  }

}