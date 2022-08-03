package Aula2.TA.ex4;

import java.util.LinkedList;

public class Carrinha extends Thread { //consumidor
    private int id;
    private static int lastId = 0;
    Armazem armazem;

    public Carrinha(Armazem armazem){
        this.armazem = armazem;
        id = lastId++;
    }

    @Override
    public void run() {
        LinkedList<Encomenda> encomendasCarregadas = null;
        try {
            encomendasCarregadas = armazem.carregar();
            for (int i = 0; i < 5; i++){
                System.out.println("A carrinha " + id + " carregou a encomenda " + encomendasCarregadas.get(i).getId());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
