package Aula4.ex2;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Ball implements Runnable {
    private int id;
    private int valor = 0;

    public Ball(int id){
        this.id = id;
    }
    @Override
    public void run() {
        for (int i = 0; i < 35; i++){
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        valor =+ new Random().nextInt(101);
        System.out.println("A bola " + id + " passou a ter o valor " + valor);
        }
    }
}
