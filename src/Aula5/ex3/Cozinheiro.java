package Aula5.ex3;

public class Cozinheiro extends Thread{
    private int id;
    private static int ultimoId = 0;
    Mesa mesa;

    public Cozinheiro(Mesa mesa){
        id = ultimoId++;
        this.mesa = mesa;
    }

    public int getCozinheiroId() {
        return id;
    }

    @Override
    public void run() {

    }
}
