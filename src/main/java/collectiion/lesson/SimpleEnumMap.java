package collectiion.lesson;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class SimpleEnumMap {
    public static void main(String[] args) {
        Map<Animal, Integer> enumMap = new EnumMap<Animal, Integer>(Animal.class);
        enumMap.put(Animal.CAT , 1);
        enumMap.put(Animal.DOG, 2);

        Set set = enumMap.entrySet();

        for (Object o : set) {
            Map.Entry m = (Map.Entry)o;
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        System.out.println("--------------");


        for (Map.Entry<Animal, Integer> tmp : enumMap.entrySet()) {
            System.out.println(tmp.getKey() + " - " + tmp.getValue());
        }
    }
}

enum Animal {
    CAT, DOG, MONKEY;
}
