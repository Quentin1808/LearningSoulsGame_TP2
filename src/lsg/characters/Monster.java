package lsg.characters;

public class Monster extends Character {

    private static int INSTANCES_COUNT = 0;

    public Monster() {
        super();
        INSTANCES_COUNT++;
        this.setName("Monster_" + INSTANCES_COUNT);
        this.setLife(10);
        this.setStamina(10);
        this.setMaxLife(10);
        this.setMaxStamina(10);

    }

    public Monster(String name) {
            super();
            this.setName(name);

    }

}
