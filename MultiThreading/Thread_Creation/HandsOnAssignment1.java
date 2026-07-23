class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

public class HandsOnAssignment1 {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Scooby");
        t2.setName("Shaggy");

        t1.start();
        t2.start();
    }
}