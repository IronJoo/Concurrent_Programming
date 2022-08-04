package TesteModelo.ex1;

import java.util.ArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main{
    public static void main(String[] args){

        final int VALOR_MAX = 100;
        final int POOL_NUM = 4;
        ExecutorService pool = Executors.newFixedThreadPool(POOL_NUM);
        CyclicBarrier barrier = new CyclicBarrier(POOL_NUM);

        ArrayList<Prime> threadList = new ArrayList<Prime>();

        int lastNumber = VALOR_MAX/POOL_NUM;

        for (int i = 0; i < VALOR_MAX; i = i + VALOR_MAX/POOL_NUM){
            threadList.add(new Prime(i, i+lastNumber, barrier));
        }

        for (Prime thread : threadList){
            thread.start();
        }

    }
}