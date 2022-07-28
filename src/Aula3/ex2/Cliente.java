package Aula3.ex2;

import java.util.Random;

public class Cliente extends Thread { //produtor
    private int id;
    private Transportadora transportadora;

    public Cliente(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        fazEncomenda();
    }

    private void fazEncomenda() throws InterruptedException {
        for (int i = 0; i < 50; i++){
            Encomenda encomenda = new Encomenda(i);
            Random randomNum = new Random();
            int segundos = randomNum.nextInt(3000,6000);
            sleep(segundos);
        }
    }
}