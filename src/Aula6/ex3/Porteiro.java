package Aula6.ex3;

import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class Porteiro extends Thread {
    private Semaphore semaphore;

    public Porteiro(){
        semaphore = new Semaphore(10);
    }

    public void trabalhar() throws InterruptedException {
        semaphore.acquire();
        sleep(20000);
    }
    public void deixarSair(){
        semaphore.release();
    }
}
