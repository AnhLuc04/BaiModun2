public class OddThread extends Thread{
    NumberGenerator t;
    OddThread(NumberGenerator t){
        this.t=t;
    }
    public void run(){
        t.odd();
    }
}
