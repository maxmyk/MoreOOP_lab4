import lotr.CharacterFactory;
import lotr.GameManager;

public class Demo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        GameManager gameman = new GameManager();
        gameman.fight(factory.createCharacter(), factory.createCharacter());
    }
}
/*class Character
  - attributes: int power, in hp
  - methods: void kick(Character c), boolean isAlive()
class lotr.Hobbit
  - attributes: int power=0, int hp=3
  - methods: void kick(Character c) { toCry() }
class Elf
   - attributes: int power=10, int hp=10
   - methods: void kick(Character c) {
                kill everybody weaker than him,
                otherwise decrease the power of character by 1
              }
class King
   - attributes: int power=from 5 to 15, int hp=from 5 to 15
   - methods: void kick(Character c) {
                decrease number of hp of the enemy by random
                number which will be in the range of his power
              }
class Knight
   - attributes: int power=from 2 to 12, int hp=from 2 to 12
   - methods: void kick(Character c) { like King }
class CharacterFactory
   - methods: Character createCharacter() {
                returns random instance of any existing character
              }
class GameManager
   - methods: void fight(Character c1, Character c2) {
                to provide fight between to characters and explain via command
                line what happens during fight, till both of
                the characters are alive
              }
How setHp should behave, when hp < 0?
What type of pattern is used in CharacterFactory?
Refactor code to remove code duplication in King and Knight
Propose a solution to separate characters and their kick strategies to allow easier creation of new characters in the future.
How did you implement createCharacter? Can we improve code and extract subclasses Character on a flight? Use reflections.
Include tests and check your solution with them.
Submit a link to a public GitHub.
*/