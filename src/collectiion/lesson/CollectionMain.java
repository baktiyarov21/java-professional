package collectiion.lesson;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.*;


public class CollectionMain {
    public static void main(String[] args) {
        /*Queue<Integer> q = new PriorityQueue<>(2, (o1, o2) -> o1 - o2);
        q.offer(1);
        q.offer(3);
        System.out.println(q);
        q.offer(2);
        q.offer(4);
        System.out.println(q);
        System.out.println("------------------");
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);*/
      /*  Deque<String> d = new ArrayDeque<>();
        d.addFirst("Россия");
        d.addFirst("Китай");
        System.out.println("Last" + d.getLast());
        System.out.println("First" + d.getFirst());
        */

        /*NavigableSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);
        set.remove(4);
        System.out.println(set.ceiling(4));
        System.out.println("------------");
        NavigableSet<Integer> set1 = set.headSet(3, true);
        System.out.println(set1);*/

        /*HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");

        for (Map.Entry<Integer, String> tmp : map.entrySet()) {
            System.out.println(tmp.getKey() + " - " + tmp.getValue());
        }

*/
        String source = "                      Hello,how    ";
        System.out.println(source.trim());


        Integer a = 1; // Strong Reference Garbage Collector не имеет право его убирать
        SoftReference<Integer> softReference = new SoftReference<>(a); // soft reference, Garbage Collector удалите его в том случае, если будет нужна память
        a = null;
        WeakReference<Integer> weakReference = new WeakReference<>(a); // weak reference, удаляется сразу
        PhantomReference<Integer> phantomReference = new PhantomReference<>(a,new ReferenceQueue<>());//





    }
}
