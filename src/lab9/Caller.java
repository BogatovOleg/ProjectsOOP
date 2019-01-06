package lab9;

public class Caller implements Runnable{

    String msg;
    Callme target;
    Thread tx;

    public Caller(Callme targ, String s){

        target = targ;
        msg = s;
        tx = new Thread(this);
        tx.start();

    }
    public void run(){
        synchronized (target){
            target.call(msg);
        }
    }
}
