package messageQueue;

import java.util.Vector;

public class MessageQueue extends Thread{

    //according to the JDK, Vector is a thread safe collection, as a result is not suitable for higher performance tasks as all of it's methods are synchronized.
    //for higher performance ArrayList is a better choice.
    //simply use the correct collection for the job.
    private Vector<String> messages = new Vector<String>();
    static final int BUFFER_SIZE = 10;

    public synchronized void putMessage() throws InterruptedException{

        while (messages.size() == BUFFER_SIZE)

            wait();

        messages.add(new java.util.Date().toString());
        System.out.println("message size :" +messages.size());
        notify();
    }

    /**
     * If remove element is removed/commented out the program continues to display the last message entry
     *
     * @return
     * @throws InterruptedException
     */
    public synchronized String getMessage() throws InterruptedException{
        notify();
        while (messages.size() == 0)
            wait();
        String message = (String)messages.firstElement();
        messages.removeElement(message);
        return message;
    }

}
