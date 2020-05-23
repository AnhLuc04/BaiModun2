public class EvenThread extends  Thread {
    NumberGenerator t;
    EvenThread(NumberGenerator t){
        this.t=t;
    }
    public void run(){
        t.EvenNumber();
    }

}
