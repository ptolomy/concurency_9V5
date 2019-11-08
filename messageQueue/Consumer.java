package messageQueue;

import java.util.Date;

public class Consumer extends Thread {
    MessageQueue messageQueue;

    public Consumer(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run(){
        try {
            while(true){
                String message = messageQueue.getMessage();

                System.out.println("Message :" + message);
                sleep(3000);
            }
        }
        catch(InterruptedException e){

        }
    }




/*    MessageQueue mbox;

    public Consumer(MessageQueue m){
        mbox = m;
    }

    @Override
    public void run(){
        while(true){
            Date message = (Date)mbox.remove();
            if (message != null){
                //message.consume;
            }
        }
    }*/

}
