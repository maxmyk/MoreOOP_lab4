package lotr;

import java.util.Random;

public class GameManager {
    public void fight(Character a, Character b) {
        System.out.println("Fight between " + a + " and " + b);
        Random rnd = new Random();
        if (!a.isAlive() | !b.isAlive()) {
            System.out.println("You can't fight a dead man :/");
        } else if (a.getPower() == 0 & b.getPower() == 0) {
            System.out.println("They're too weak to fight :/");
        } else {
            if (rnd.nextBoolean()) {
                System.out.println(a + " goes first");
                figter(a, b);
            } else {
                System.out.println(b + " goes first");
                figter(b, a);
            }
        }
    }

    public void figter(Character a, Character b) {
        int counter = 0;
        while (a.isAlive() && b.isAlive()) {
            if (counter % 2 == 0) {
                a.kick(b);
                if (a.getPower() == 0) {
                    System.out.println(a + " tried to kick " + b);
                } else {
                    System.out.println(a + " kicked " + b);
                }
            } else {
                b.kick(a);
                if (b.getPower() == 0) {
                    System.out.println(b + " tried to kick " + a);
                } else {
                    System.out.println(b + " kicked " + a);
                }
            }
            counter++;
        }
        if (a.getHp() > b.getHp()) {
            System.out.println(a + " won!");
        } else if (a.getHp() < b.getHp()) {
            System.out.println(b + " won!");
        } else {
            System.out.println("Draw!");
        }
        System.out.println("Fight finished in " + counter + " moves!");
    }
}
