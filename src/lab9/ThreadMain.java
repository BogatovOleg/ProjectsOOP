package lab9;

public class ThreadMain {

    //Thread t = Thread. currentThread();

    ThreadMain(){

        NewThread nt1 = new NewThread("Один");
        NewThread nt2 = new NewThread("Два");
        NewThread nt3 = new NewThread("Три");

        System.out.println("Пoтoк Один запущен: " + nt1 .nt.isAlive());
        System.out.println( "Пoтoк Два запущен: " + nt2 .nt.isAlive());
        System.out.println( "Пoтoк Три запущен: " + nt3.nt.isAlive());
        try {

            System.out.println("Ожидание завершения потоков.");
            nt1.nt.join();
            nt2.nt.join();
            nt3.nt.join();
            //System.out. println("Главный поток: "+n);
            //Thread.sleep (10000) ;

        }
        catch (InterruptedException е){

            System.out. println( "Глaвный поток исполнения прерван");
        }
        System.out.println("Пoтoк Один запущен: " + nt1 .nt.isAlive());
        System.out.println( "Пoтoк Два запущен: " + nt2 .nt.isAlive());
        System.out.println( "Пoтoк Три запущен: " + nt3.nt.isAlive());
        System.out. println( "Глaвный поток исполнения завершен");

    }
}
