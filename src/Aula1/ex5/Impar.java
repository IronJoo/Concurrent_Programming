package Aula1.ex5;

public class Impar extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 150; i = i + 2){
            System.out.println(i);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
