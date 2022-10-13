package lotr;

import kicks.HobbitKick;

public class Hobbit extends lotr.Character {
    HobbitKick local_kick = new HobbitKick();

    public Hobbit() {
        super(3, 0);
    }

    @Override
    public void kick(Character c) {
        local_kick.kick(c);
    }
}
