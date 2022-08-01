package Aula5.ex3;

public class Glutao extends Thread {
    private int id;
    private int ultimoId = 0;
    private Mesa mesa;

    public Glutao(Mesa mesa) {
        this.mesa = mesa;
        id = ultimoId++;
    }

    public int getGlutaoId() {
        return id;
    }

    @Override
    public void run() {

    }
}
