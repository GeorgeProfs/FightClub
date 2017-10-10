package profs_13;

/**
 * Created by qwerty on 11.10.2017.
 */
public class Fight extends Player implements Turns {
    Fight(int hp, int mp, String name) {
        super(hp, mp, name);
    }

    @Override
    public int turn(int hp) {

        return hp;
    }
}
