package TesteModelo.ex2;

import java.util.Random;

public class Escavadora extends Thread{
    Balanca balanca;

    public Escavadora(Balanca balanca){
        this.balanca = balanca;
    }

    public void run(){
        while(true) {
            try {
                Random random = new Random();
                double pedaco = random.nextDouble(1.0);
                System.out.println("A escavadora encontrou " + pedaco + " kg de ouro");
                balanca.put(pedaco);
            } catch (InterruptedException e){
            }
        }
    }
}