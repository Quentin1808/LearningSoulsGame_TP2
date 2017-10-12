package lsg.characters;
import lsg.helpers.*;
import lsg.weapons.Weapon;

public class Character {

    private String name;
    private int life;
    private int maxLife;
    private int stamina;
    private int maxStamina;
    private Dice dice;

    protected Character() {
        dice = new Dice(101);
    }

    public Character(String name) {
        this();
        this.setName(name);
    }

    public int getLife() {
        return life;
    }

    protected void setLife(int life) {
        this.life = life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    protected void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    protected void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public int getStamina() {
        return stamina;
    }

    protected void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return (this.getLife()>0);
    }

    public void printStats() {
        System.out.println(toString());
    }

    public int attackWith(Weapon weapon){

        int dmg;
        int precision;
        int degats = 0;

        if (weapon.isBroken() || this.getStamina() <= 0){
            return 0;
        }else {
            precision = this.dice.roll();

            if (precision == 0){
                dmg = weapon.getMinDamage();
            }else {
                if (precision == 100){
                    dmg = weapon.getMaxDamage();
                }else {
                    dmg = (precision / 100) * (weapon.getMaxDamage() - weapon.getMinDamage());
                    dmg = Math.round(dmg);
                    degats = (dmg);
                }
            }
            if (this.getStamina() < weapon.getStamCost()){
                degats =  (this.getStamina() / weapon.getStamCost()) * degats;
                this.setStamina(0);
            }else {
                int newS;
                newS = this.getStamina() - weapon.getStamCost();
                this.setStamina(newS);
            }
        }

        return degats;
    }

    @Override
    public String toString() {
        //return "[" + this.getClass().getName() + "]\t" + this.getName() + "\tLIFE: " + this.getLife() + "\tSTAMINA: " + this.getStamina() + "\t" + (this.isAlive()? ("(ALIVE)"):("(DEAD)"));
        String LIFE = String.format("%5d", this.getLife());
        String STAMINA = String.format("%5d", this.getStamina());

        return (String.format("%-20s %-20s LIFE:%-10s STAMINA:%-10s", ("[ " + this.getClass().getSimpleName() + " ]"), this.getName(), LIFE, STAMINA)+(this.isAlive()? ("(ALIVE)"):("(DEAD)")));
    }
}
