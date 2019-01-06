package lab9;

public class Synch {

    Synch(){

        Callme target = new Callme();
        Caller t1= new Caller(target, "Добро пожаловать");
        Caller t2 =new Caller(target, "в синхронизированный");
        Caller t3 =new Caller (target, "мир!") ;
        try {
            t1.tx.join();
            t2.tx.join();
            t3.tx.join();

        } catch (InterruptedException e) {
            System.out. println("Прервано");
        }
    }
}

