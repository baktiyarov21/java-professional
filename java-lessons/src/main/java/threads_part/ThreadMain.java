package threads_part;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> System.out.println("dfssssssssssssssssssssss"));
        executorService.execute(() -> System.out.println("fdhbfhd"));
        executorService.execute(() -> System.out.println("fdjkfnsdjkfn"));


        /*List<Integer> list = new ArrayList<>();
        CountDownLatch count = new CountDownLatch(2);
        Object monitor = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        Thread.sleep(100);
                        synchronized (monitor) {
                            list.add(i);
                        }
                    }
                    count.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        Thread.sleep(100);
                        synchronized (monitor) {
                            list.add(i);
                        }
                    }
                    count.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        try {
            count.await();
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
        for (
                int numbers : list) {
            System.out.println(numbers);
        }
*/
    }
}
