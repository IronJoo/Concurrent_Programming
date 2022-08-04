package Aula3.TA.ex2;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static java.lang.Thread.sleep;

public class Tarefa implements Runnable{
    Barrier barrier;

    public Tarefa(){
        barrier = new Barrier(3);
    }

    @Override
    public void run() {
        System.out.println("Uma thread iniciou.");
        Random random = new Random();
        try {
            sleep(random.nextInt(1000) + 500);
            barrier.await(); //problema aqui??
            System.out.println("A thread foi lançada");
        } catch (InterruptedException e) {
        }
    }
}
