package com.guvenbe.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        ServerThread thread1 = new ServerThread("Server1");
        ServerThread thread2 = new ServerThread("Server2");
        //start creates a new thread and run method is executed
        //start can only be called once
        //if you call run directly it is executed in current thread
        //run can be called multiple times
        thread2.setPriority(Thread.MAX_PRIORITY); //Make thread 2 higher priority
        System.out.println(thread2.getName()+ " priority: " + thread2.getPriority());
        thread1.start();
        thread2.start();

    }
}

class ServerThread extends Thread{
    public ServerThread(String threadName) {
        this.setName(threadName);
    }

    @Override
    public void run(){
        int clientNumber=1;
        while (clientNumber != 100) {
            try {
                System.out.println(this.getName()+ " sent data client: " + clientNumber);
                //static method
                Thread.sleep(1000);
                clientNumber++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}