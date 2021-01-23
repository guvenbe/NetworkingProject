package com.guvenbe.threads;

public class ThreadWithRunnableDemo {
    public static void main(String[] args) {
        ImplementRunnable runnable1 = new ImplementRunnable(1);
        ImplementRunnable runnable2 = new ImplementRunnable(2);
        Thread thread1 = new Thread(runnable1, "Server1");
        System.out.println(thread1.getName());
        Thread thread2 = new Thread(runnable2, "Server2");
        System.out.println(thread2.getName());
        thread1.start();
        thread2.start();

        //another way
        ImplementRunnable runnable3= new ImplementRunnable(3);
        runnable3.start();
    }
}

class ImplementRunnable implements Runnable{

    private int threadIndex;
    public ImplementRunnable(int index) {
        this.threadIndex=index;
    }

    @Override
    public void run() {

        int clientNumber=1;
        while (clientNumber != 100) {
            try {
                System.out.println("Server" + threadIndex+ " sent data client: " + clientNumber);
                //static method
                Thread.sleep(10);
                clientNumber++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(){
        Thread thread = new Thread(this);
        thread.start();
    }
}