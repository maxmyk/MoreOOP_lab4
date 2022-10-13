package lotr;

import kicks.ElfKick;

public class Elf extends lotr.Character {
    ElfKick local_kick = new ElfKick();

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        local_kick.kick(c, this);
    }
}
