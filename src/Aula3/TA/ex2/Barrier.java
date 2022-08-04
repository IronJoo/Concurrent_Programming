package Aula3.TA.ex2;

public class Barrier {
    private int awaitingThreads = 0;
    private int passedThreads = 0;
    private int threadLimit;

    public Barrier(int limit){
        threadLimit = limit;
    }

    public synchronized void await() throws InterruptedException{
        awaitingThreads++;
        while(awaitingThreads < threadLimit){
            wait();
        }
        if (passedThreads == 0){
            notifyAll();
        }
        passedThreads++;
        if (passedThreads == threadLimit){
            awaitingThreads = 0;
            passedThreads = 0;
        }
    }
}
