package kicks;

import lotr.Character;

import java.util.Random;

public class NobleKick implements NormalKick {
    public static Random rnd = new Random();

    public void kick(lotr.Character a, lotr.Character i) {
        a.setHp(a.getHp() - rnd.nextInt(i.getPower()));
    }

    @Override
    public void kick(Character a) {
        System.out.println("NobleKick is used incorrectly!");
    }
}
