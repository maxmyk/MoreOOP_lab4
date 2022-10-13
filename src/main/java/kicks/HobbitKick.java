package kicks;

public class HobbitKick implements NormalKick {

    @Override
    public void kick(lotr.Character a) {
        System.out.println("Oh no, I don't want to hurt you!");
    }
}
