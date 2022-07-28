package Aula3.ex2;

public class Transportadora extends Thread { //recurso partilhado
    private Encomenda encomenda1;
    private Encomenda encomenda2;
    private Encomenda encomenda3;

    @Override
    public void run() {
        envia();
    }

    private void envia() {
    }
}
