package javapol4;

class MyRunnable implements Runnable{

    public void run() {
        System.out.println("From MyRunnable class");
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        Runnable job = new MyRunnable();
        job.run();

        Runnable job2 = () -> {};
    }
}
