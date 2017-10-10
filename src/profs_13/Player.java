package profs_13;

/**
 * Created by qwerty on 10.10.2017.
 */
public class Player implements Attack, Status {

    int healthPoints, manaPoints, damage;
    String playerName;

    Player(int hp, int mp, String name ){
        healthPoints = hp;
        manaPoints = mp;
        playerName = name;
    }


    @Override
    public void PreFightStatus() {
        System.out.print("У игрока " + this.playerName + " есть " + this.healthPoints + " единиц здоровья");
        System.out.println(" и " + this.manaPoints + " единиц маны");
    }

    @Override
    public void HealthStatus() {
        System.out.println(playerName + " остается " + this.healthPoints + " единиц здоровья");
    }

    @Override
    public int ManaStatus() {
        System.out.println(playerName + " остается " + this.healthPoints + " единиц маны");
        return manaPoints;
    }

    @Override
    public int fireStyle(int healthPoints, String name2) {
        System.out.println("Fireball");
        manaPoints -= 100;
        damage = 250;
        healthPoints -= damage;
        System.out.print(playerName + " наносит " + damage + " урона. ");
        System.out.println(name2 + " получает " + damage + " урона");
        return healthPoints;
    }

    @Override
    public int waterStyle(int healthPoints, String name2) {
        System.out.println("Water bullets");
        manaPoints -= 30;
        damage = 50;
        healthPoints -= damage;
        System.out.print(playerName + " наносит " + damage + " урона. ");
        System.out.println(name2 + " получает " + damage + " урона");
        return healthPoints;
    }

    @Override
    public void windStyle() {
        System.out.println("Wind Shuriken");
        manaPoints -= 70;
        damage = 150;
    }

    @Override
    public void lightStyle() {
        System.out.println("Lighting blade");
        manaPoints -= 100;
        damage = 250;
    }

}
