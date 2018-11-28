package lab6;

public class Main {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread("First");
        MyThread thread2 = new MyThread("Second");


        thread1.start();
        //thread1.setRunning(false);

        thread2.start();
        //thread2.setRunning(false);
    }
}
