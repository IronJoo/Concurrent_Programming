package Testes.cena3;

public class RunTillReturn extends Thread {
    private boolean running = true;
    @Override
    public void run() {
        while(running){
            System.out.println("I am running!");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void shutdown(){
        running = false;
        System.out.println("You have successfully stopped the thread.");
    }
}
