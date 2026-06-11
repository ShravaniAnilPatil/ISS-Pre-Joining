// Creating a Thread by implementing the Runnable interface

class MyTask implements Runnable {

    public void run() {
        System.out.println("Runnable Thread");
    }
}
public class ThreadExample2 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyTask());

        t1.start();
    }
}