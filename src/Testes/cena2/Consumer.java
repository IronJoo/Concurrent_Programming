package Testes.cena2;

public class Consumer extends Thread{
    private Producer producer;

    public Consumer(Producer producer){
        this.producer = producer;
    }

    @Override
    public void run() {
        try {
            while (true){
                String consumed = producer.consume();
                System.out.println("Consumer just consumed " + consumed + " and notified Producer.");
            }
        } catch (InterruptedException e) {
        }
    }
}
