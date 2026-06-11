
// Synchronisation in Java
class Counter {

    int count = 0;

    public void increment() {
        count++;
    }
}

public class Synchronisation{

    public static void main(String[] args) throws Exception {

        Counter c = new Counter();
        // Two threads incrementing the same counter
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 1000; i++) {
                c.increment();
            }
        });
       // Start both threads
        t1.start();
        t2.start();
      // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Count = " + c.count);
    }
}