package com.dom;

public class App {
    public static void main( String[] args ){
        Player hero = new Player("rapli", 100, 25, 5);
        Kroco kroco = new Kroco("Kroco", 50, 10);
        Boss boss = new Boss("Bosnya kroco", 150, 30, 20);

        hero.attack(boss);
        boss.info();
        hero.info();
    }
}
