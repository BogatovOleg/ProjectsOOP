package lab9;

public class PC {

    PC(){

        Q q = new Q();
        new Producer(q);
        new Consumer(q);

    }
}
