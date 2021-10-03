import java.util.*;

public class Main {
    public static void main(String[] args) {
       /* ArrayList<Integer> arr = new ArrayList();
        arr.add(300);
        arr.add(520);
        arr.add(10);

        Iterator<Integer> iterator = arr.iterator();

        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
        }
        */

       /* Map<String, Integer> map = new HashMap<>();
        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 300);
        map.put("D", 400);
        map.put("D", 5000);

        for (Map.Entry<String, Integer> tmp : map.entrySet()) {
            System.out.println(tmp.getKey() + "-" + tmp.getValue());
        }*/


        Animal a = new Animal("A", 10,40, 10000 );
        Animal z = new Animal("Z", 320,60, 20000 );
        Animal v = new Animal("V", 120,10, 4000 );
        Animal[] animals = {a , z , v};

        Arrays.sort(animals, (o1, o2) -> o1.price -o2.price);

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

    }
}
