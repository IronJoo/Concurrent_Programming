package Aula1.ex5;

public class Par extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i = i + 2){
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
