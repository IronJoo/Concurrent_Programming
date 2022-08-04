package Testes.cena2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread {

    private int maxProduction = 3;
    private List<String> productionLine = new ArrayList<>();

    @Override
    public void run() {
        while (true){
            try {
                produce();
            } catch (InterruptedException e) {
            }
        }
    }
    private synchronized void produce() throws InterruptedException {
        while (productionLine.size() == maxProduction){
            wait();
            System.out.println("Production is full, so Producer is now waiting.");
        }
        String newProduction = LocalDateTime.now().toString();
        productionLine.add(newProduction);
        notify();
        System.out.println("Producer produced data and notified consumer.");
    }

    public synchronized String consume() throws InterruptedException {
        while(productionLine.isEmpty()){
            wait();
            System.out.println("There is nothing to consume, so Consumer is now waiting.");
        }
        String copy = productionLine.get(0);
        productionLine.remove(0);
        notify();
        return copy;
    }
}
