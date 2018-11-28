package lab6;

public class MyThread extends Thread {

    private String name;
    private boolean isRunning=true;

    public MyThread(String  name){
        this.name=name;
    }

    public void setRunning(boolean state){

        isRunning = state;
    }
    public void run() {
        while (isRunning==true) {
           Log.toConsole(this.name);
        }
    }

}
//[2108-17-11, hh:mm::ss::msms]