package profs_13;

/**
 * Created by qwerty on 10.10.2017.
 */
public class Player implements Attack, Status {

    int healthPoints, manaPoints;
    String playerName;

    Player(int hp, int mp, String name ){
        healthPoints = hp;
        manaPoints = mp;
        playerName = name;
    }


    @Override
    public void PreFightStatus() {
        System.out.print("У игрока " + this.playerName + " есть " + this.healthPoints + " единиц здоровья");
        System.out.println(" и " + this.healthPoints + " единиц маны");
    }

    @Override
    public void HealthStatus() {
        System.out.println(this.healthPoints);
    }

    @Override
    public void ManaStatus() {
        System.out.println(this.manaPoints);
    }

    @Override
    public void fireStyle() {
        System.out.println("Fireball");
        manaPoints -= 100;
    }

    @Override
    public void waterStyle() {
        System.out.println("Water bullets");
        manaPoints -= 30;
    }

    @Override
    public void windStyle() {
        System.out.println("Wind Shuriken");
        manaPoints -= 70;
    }

    @Override
    public void lightStyle() {
        System.out.println("Lighting blade");
        manaPoints -= 100;
    }

}
