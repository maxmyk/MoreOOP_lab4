package lotr;

public class Character {
    private int hp;
    private int power;

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    public void setHp(int i) {
        this.hp = Math.max(i, 0);
    }

    public int getHp() {
        return this.hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public boolean isAlive() {
        return this.getHp() > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{hp=" + hp +
                ", power=" + power +
                '}';
    }

    public void kick(Character c) {
//        this.hp -= c.getPower();
    }
}
