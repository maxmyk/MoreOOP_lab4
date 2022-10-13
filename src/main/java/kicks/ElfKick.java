package kicks;

import lotr.Character;

public class ElfKick implements NormalKick {
    public void kick(Character a, Character i) {
        if (i.getPower() > a.getPower()) {
            a.setHp(0);
        } else {
            i.setPower(i.getPower() - 1);
        }
    }

    @Override
    public void kick(Character a) {
        System.out.println("ElfKick is used incorrectly!");
    }
}
