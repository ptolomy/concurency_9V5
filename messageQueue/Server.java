package messageQueue;

public class Server {

    public static void main(String args[]){
        //multiple producers and consumers can be created here
        //this doesn't appear to cause any real issues.
        //adding a second consumer actually makes the multiple producer run smoother
        //with more reliable message stream.
        //delays seem to occur and the buffer size message is the indictor to those where the wait
        //seems to be taking place.
        MessageQueue messageQueue = new MessageQueue();
        Producer producer = new Producer(messageQueue);
        Consumer consumer = new Consumer(messageQueue);

        //Producer producer2 = new Producer(messageQueue);
        //Producer producer3 = new Producer(messageQueue);
        //Consumer consumer2 = new Consumer(messageQueue);

        producer.start();
        consumer.start();

        //producer2.start();
        //producer3.start();
        //consumer2.start();
    }


//    public Server(){
//        int[] buffer = new int[0];
//        MessageQueue mailBox = new MessageQueue(buffer);
//
//        Producer producerThread = new Producer(mailBox);
//        Consumer consumerThread = new Consumer(mailBox);
//
//        producerThread.start();
//        consumerThread.start();
//
//    }



}
