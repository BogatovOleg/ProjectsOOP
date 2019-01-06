package lab9;

public class NewThread implements Runnable {
    String name;
    Thread nt;
    boolean suspendFlag;

    NewThread (String threadName) {
        name = threadName;
        nt = new Thread (this,name);
        System.out.println("Новый поток создан:"+ nt );
        suspendFlag = false;
        nt.start();
    }

    @Override
    public void run() {
        try {
            for(int i = 15;i>0;i--){

                System.out. println(name+": "+i);
                Thread.sleep (200) ;
                synchronized (this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out. println(name+ " прерван");
        }
        System.out.println(name+ " завершен");
    }
    synchronized void mysuspend(){
        suspendFlag=true;
    }
    synchronized void myresume(){
        suspendFlag=false;
        notify();
    }
}
