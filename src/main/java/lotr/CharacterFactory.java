package lotr;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    public Character createCharacter() {
        try {
            Random rnd = new Random();
            Reflections reflections = new Reflections(Character.class.getPackage().getName());
            Set<Class<?>> subTypes = reflections.get(SubTypes.of(Character.class).asClass());
            subTypes.remove(Noble.class);
            return (lotr.Character) subTypes.toArray(new Class[0])[rnd.nextInt(subTypes.size())
                    ].getConstructor().newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException exc) {
            throw new RuntimeException(exc);
        }
    }
}
