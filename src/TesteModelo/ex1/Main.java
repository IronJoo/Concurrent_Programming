package TesteModelo.ex1;

import java.util.ArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main{
    public static void main(String[] args){ //falta terminar, ver resolucao

        final int VALOR_MAX = 100;
        final int POOL_NUM = 4;
        ExecutorService pool = Executors.newFixedThreadPool(POOL_NUM);
        CyclicBarrier barrier = new CyclicBarrier(POOL_NUM);

        ArrayList<Prime> threadList = new ArrayList<Prime>();

        int lastNumber = VALOR_MAX/POOL_NUM;

        for (int i = 0; i < VALOR_MAX; i = i + VALOR_MAX/POOL_NUM){
            Prime prime = new Prime(i, i+lastNumber, barrier);
            threadList.add(prime);
            pool.submit(prime);
        }

        pool.shutdown();

        //for (Prime task : )

    }
}