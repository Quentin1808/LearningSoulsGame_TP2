package lsg.characters;

public class Hero extends Character {

    public Hero() {
        this("Gregooninator");
    }

    public Hero(String name) {
        super(name);
        this.setLife(100);
        this.setStamina(50);
        this.setMaxLife(100);
        this.setMaxStamina(50);

    }


    // 6)La visibilité optimale est protected car elle permet d'accéder à la méthode depuis le même package

    // 7)La visibilité optimale est public car il n'y a qu'elle qu'y permet d'accéder à la méthode
}
