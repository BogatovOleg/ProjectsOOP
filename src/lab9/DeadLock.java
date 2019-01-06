package lab9;

public class DeadLock implements Runnable{
    A a = new A();
    B b = new B();

    DeadLock(){

        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this,"Соперник-поток");
        t.start();
        a.foo(b);
        System.out.println("Назад в главный поток");
    }

    public void run(){

        b.bar(a);
        System.out.println("Назад в другой поток");
    }
}
