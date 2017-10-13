package lsg;

import lsg.characters.Hero;
import lsg.characters.Monster;
import lsg.weapons.Sword;
import java.util.Scanner;

public class LearningSoulsGame {

    public static void refresh(Hero h, Monster m){
        h.printStats();
        m.printStats();
    }

    public static void main(String[] args) {

       Hero Hero1 = new Hero();
       Monster Monster1 = new Monster();

       refresh(Hero1, Monster1);

       Scanner scanner = new Scanner(System.in);




       /*Monster M1 = new Monster("STUDENTATORT");
       Monster M2 = new Monster();
       Monster M3 = new Monster();

       System.out.println(Hero1.isAlive());

       Hero1.printStats();
       M1.printStats();
       M2.printStats();
       M3.printStats();*/



    }
}
