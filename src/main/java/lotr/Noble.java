package lotr;

import kicks.HobbitKick;
import kicks.NobleKick;

import java.util.Random;

public abstract class Noble extends lotr.Character {
    public static Random rnd = new Random();
    NobleKick local_kick = new NobleKick();

    public Noble(int min, int max) {
        super(rnd.nextInt(max) + min, rnd.nextInt(max) + min);
    }

    @Override
    public void kick(Character c) {
        local_kick.kick(c, this);
    }
}
