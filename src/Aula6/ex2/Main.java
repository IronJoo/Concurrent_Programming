package Aula6.ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of cores = " + cores);

        TestaServidor servidor1 = new TestaServidor("upskill.pt");
        TestaServidor servidor2 = new TestaServidor("java.upskill.pt");
        TestaServidor servidor3 = new TestaServidor("iscte.pt");
        TestaServidor servidor4 = new TestaServidor("upskill.iscte.pt");

        Runnable tarefa1 = new Tarefa(servidor1);
        Thread t1 = new Thread(tarefa1);

        Runnable tarefa2 = new Tarefa(servidor2);
        Thread t2 = new Thread(tarefa2);

        Runnable tarefa3 = new Tarefa(servidor3);
        Thread t3 = new Thread(tarefa3);

        Runnable tarefa4 = new Tarefa(servidor4);
        Thread t4 = new Thread(tarefa4);

        ExecutorService threadPool = Executors.newFixedThreadPool(1);
        threadPool.submit(t1);
        threadPool.submit(t2);
        threadPool.submit(t3);
        threadPool.submit(t4);

        threadPool.shutdown();
    }
}
