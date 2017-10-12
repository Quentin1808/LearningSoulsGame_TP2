package lsg;

import lsg.characters.Hero;
import lsg.characters.Monster;

public class LearningSoulsGame {

    public static void main(String[] args) {

       Hero Hero1 = new Hero();
       Monster M1 = new Monster("STUDENTATORT");
       Monster M2 = new Monster();
       Monster M3 = new Monster();

       System.out.println(Hero1.isAlive());

       Hero1.printStats();
       M1.printStats();
       M2.printStats();
       M3.printStats();

    }
}
