package messageQueue;

import java.util.Vector;

public class Producer extends Thread {





    MessageQueue messageQueue;

    public Producer(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run(){
        try{
            while(true){
                messageQueue.putMessage();


                sleep(2000);
            }
        }
        catch(InterruptedException e){
        }
    }






//    private final MessageQueue mbox;
//    MessageQueue mBox;
//
//    public Producer(MessageQueue m){
//        mbox = m;
//    }
//
//    @Override
//    public void run(){
//        while (true){
//            Date message = new Date();
//            System.out.println(message);
//            mbox.enter(message);
//
//            //mbox.send(message);
//        }
//    }
}
